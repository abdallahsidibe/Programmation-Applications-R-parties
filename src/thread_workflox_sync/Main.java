package thread_workflow_sync;

public class Main {

	public static void main(String[] args) {
		JobController AB = new JobController();
		JobController BD = new JobController();
		JobController BC = new JobController();
		JobController DE = new JobController();
		JobController CE = new JobController();
		JobController EF = new JobController();
		JobController EG = new JobController();

		P1 service1 = new P1(AB, BD, DE, EF);
		P2 service2 = new P2(AB, BD, BC, EF, EG, DE, CE);
		P3 service3 = new P3(BC, EG, CE);

		
		service1.start();
		service2.start();
		service3.start();
		
		/*
		
		JobController AB, BD, 
		
		 */

	}

}
