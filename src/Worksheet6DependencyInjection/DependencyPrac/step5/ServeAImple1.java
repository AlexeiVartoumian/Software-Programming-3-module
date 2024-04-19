package DependencyPrac.step5;

public class ServeAImple1 implements ServeA1 {

    @Inject
    private ServeB1 serveB1;

    public ServeAImple1(ServeB1 serveB){
        this.serveB1 = serveB;
    }
    public String serveA(){

        return "JobA(" + serveB1.jobB() + ")";

    }
    @Override
    public void setServeB1(ServeB1 serveB1){
        this.serveB1 = serveB1;
    }
}
