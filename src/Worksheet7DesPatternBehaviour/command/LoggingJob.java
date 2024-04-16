package Worksheet7DesPatternBehaviour.command;

public class LoggingJob implements Job {

    private  Logging logging;
  @Override
  public void run() {

      System.out.println("Job ID" + Thread.currentThread().getId() + "Logging Job executing");

      if(logging != null){
          logging.log();
      }
      try{
          Thread.sleep(1000);
      }catch(InterruptedException e){
          Thread.currentThread().interrupt();
      }
  }

  public void setLogging(Logging logging) {
    this.logging= logging;
  }
}
