package worksheet09.src.proxy.remote;

public class ReportGeneratorClient {


		public static void main(String[] args) {
			new ReportGeneratorClient().generateReport();
		}

		public void generateReport(){
			try {
//				ReportGenerator reportGenerator =
//					(ReportGenerator)Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
//				System.out.println(reportGenerator.generateDailyReport());
			ReportGenerator reportGeneratorProxy = new ReportGeneratorProxy("rmi://127.0.0.1/PizzaCoRemoteGenerator");
				System.out.println(reportGeneratorProxy.generateDailyReport());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}