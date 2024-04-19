package DependencyPrac.step6;

@Service
public class ServeAImple2 implements ServeA2 {

    @Inject
    private ServeB2 serveB1;

    public ServeAImple2(ServeB2 serveB){
        this.serveB1 = serveB;
    }
    public String serveA(){

        return "JobA(" + serveB1.jobB() + ")";

    }
    @Override
    public void setServeB1(ServeB2 serveB1){
        this.serveB1 = serveB1;
    }
}
