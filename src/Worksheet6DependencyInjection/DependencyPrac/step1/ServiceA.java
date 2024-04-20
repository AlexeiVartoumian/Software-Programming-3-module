package DependencyPrac.step1;

public class ServiceA {

    private DependencyPrac.step1.ServiceB serviceB;

    public ServiceA(DependencyPrac.step1.ServiceB b){
        this.serviceB = serviceB;
    }
    public static String jobA(){
        return "jobA(" + ServiceB.jobB() + ")";
    }
}
