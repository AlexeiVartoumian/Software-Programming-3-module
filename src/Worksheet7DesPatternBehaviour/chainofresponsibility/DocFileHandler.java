package Worksheet7DesPatternBehaviour.chainofresponsibility;

public class DocFileHandler implements Handler {
    private Handler nextone;
    private String name;
  public DocFileHandler(String doc_handler) {
    this.name = doc_handler;
  }

  @Override
  public void setHandler(Handler handler) {
        this.nextone = handler;
  }

  @Override
  public void process(File file) {

      if(file.getFileType().equalsIgnoreCase("doc")){
          System.out.println("Process and saving doc file... by Doc Handler");
          System.out.println("Buffering text char by char");
      }else{
          System.out.println("Doc Handler forwards request to Excel Handler");
          nextone.process(file);
      }
  }

  @Override
  public String getHandlerName() {
    return name;
  }
}
