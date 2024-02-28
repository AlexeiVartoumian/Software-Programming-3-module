package worksheet09DesignPatterns.src.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ReportGeneratorProxy implements ReportGenerator{
    private final String remoteUrl;

    public ReportGeneratorProxy(String remoteUrl){
        this.remoteUrl = remoteUrl;
    }

    @Override
    public String generateDailyReport() throws RemoteException {
        try{
            ReportGenerator reportGenerator  = (ReportGenerator) Naming.lookup(remoteUrl);

            return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            throw new RemoteException("error accesing remote generator");
        }

    }
}
