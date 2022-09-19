package thread_workflow_sync;

private class P2 extends Thread {
	/**
	 * C'est mieux de le faire en private
	 public class P2 extends Thread 
	 */
	private JobController AB;
	private JobController BD;
	private JobController BC;
	private JobController EF;
	private JobController EG;
	private JobController DE;
	private JobController CE;

	public P2(JobController AB, JobController BD, JobController BC, JobController EF, JobController EG,
			JobController DE, JobController CE) {
		this.AB = AB;
		this.BD = BD;
		this.BC = BC;
		this.EF = EF;
		this.EG = EG;
		this.DE = DE;
		this.CE = CE;
	}

	@Override
	public void run() {
		AB.isJobDone();
		B();
		BD.jobDone();
		BC.jobDone();
		X();
		CE.isJobDone();
		DE.isJobDone();
		E();
		EF.jobDone();
		EG.jobDone();
	}

	public void B() {
		System.out.println("Tache B");
	}

	public void X() {
		System.out.println("Tache X");
	}

	public void E() {
		System.out.println("Tache E");
	}

}
