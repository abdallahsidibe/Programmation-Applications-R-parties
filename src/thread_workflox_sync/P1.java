package thread_workflow_sync;

private class P1 extends Thread {

	/**
	 * public class P1 implements Runnabble{} Dans les deux cas, il faut impl�mente
	 * la m�thode run() Un controller ne notifie q'un seul On utilise un controller
	 * par d�pendance
	 */

	/**
	 * jobDone : reveille un seul 
	 * isJobDone : S'assurr que la tache est faite
	 */

	private JobController AB;
	private JobController BD;
	private JobController DE;
	private JobController EF;

	public P1(JobController c1, JobController c2, JobController c3, JobController c4) {
		this.AB = c1;
		this.BD = c2;
		this.DE = c3;
		this.EF = c4;
	}

	@Override
	public void run() {
		A();// la tache A est en cours d'ex�cution
		AB.jobDone();// signale que la tache A est faite
		BD.isJobDone(); // on s'assure que B est fait avant de faire le D
		D(); // la tache D est en cours d'ex�cution
		DE.jobDone();
		EF.isJobDone();
		F();
	}

	public void A() {
		System.out.println("Tache A");
	}

	public void D() {
		System.out.println("Tache D");
	}

	public void F() {
		System.out.println("Tache F");
	}
}
