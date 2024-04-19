package DependencyPrac.step6;

@Service
public class ServeBImple2 implements ServeB2 {

    @Inject
    private ServeA2 serveA1;
    public String jobB(){
        return "jobB()";
    }

    @Override
    public void setServeA1(ServeA2 serviceA1){
        this.serveA1 = serviceA1;
    }
}
