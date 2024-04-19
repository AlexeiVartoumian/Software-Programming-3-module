package DependencyPrac.step5;

import DependencyPrac.step1.ServiceA;

public class ServeBImple1 implements ServeB1 {

    @Inject
    private ServeA1 serveA1;
    public String jobB(){
        return "jobB()";
    }

    @Override
    public void setServeA1(ServeA1 serviceA1){
        this.serveA1 = serviceA1;
    }
}
