package DependencyPrac.step2;

import DependencyPrac.step1.ServiceA;

public class ServeAImple implements ServeA{

    private final ServeB serveB;

    public ServeAImple(ServeB serveB){
        this.serveB = serveB;
    }
    public String serveA(){

        return "JobA(" + serveB.jobB() + ")";

    }
}
