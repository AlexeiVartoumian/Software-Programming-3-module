package DependencyPrac.step1;

public class ServiceA {

    private ServiceB serviceB;

    public ServiceA(ServiceB b){
        this.serviceB = serviceB;
    }
    public static String jobA(){
        return "jobA(" + ServiceB.jobB() + ")";
    }
}
