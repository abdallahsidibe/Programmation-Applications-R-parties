package thread_workflow_sync;

private class P3 extends Thread {

	private JobController BC;
	private JobController CE;
	private JobController EG;

	public P3(JobController c1, JobController c2, JobController c3) {
		this.BC = c1;
		this.EG = c2;
		this.CE = c3;
	}

	@Override
	public void run() {
		BC.isJobDone();
		C();
		CE.jobDone();
		EG.isJobDone();
		G();
	}

	public void C() {
		System.out.println("Tache C");
	}

	public void G() {
		System.out.println("Tache G");
	}
}
