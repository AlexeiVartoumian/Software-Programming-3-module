package Worksheet7DesPatternBehaviour.command;

public class FileIOJob implements Job {
    private FileIO fileIO;
  @Override
  public void run() {
      System.out.println("Job ID: " + Thread.currentThread().getId() + " Executing FILEIO!");

      if(fileIO != null){
          fileIO.Fileops();
      }

      try{
          Thread.sleep(1000);
      }catch(InterruptedException e){
          Thread.currentThread().interrupt();
      }

  }

  public void setFileIO(FileIO fileIO) {
    this.fileIO = fileIO;
  }
}
