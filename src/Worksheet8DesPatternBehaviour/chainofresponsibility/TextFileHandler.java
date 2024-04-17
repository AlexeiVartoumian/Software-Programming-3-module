package Worksheet8DesPatternBehaviour.chainofresponsibility;

public class TextFileHandler implements Handler {

    private Handler nextone;
    private String name;
  public TextFileHandler(String text_handler) {
  }

  @Override
  public void setHandler(Handler handler) {
      this.nextone = handler;
  }

  @Override
  public void process(File file) {

      if( file.getFileType().equalsIgnoreCase("text") || file.getFileType().equalsIgnoreCase("bat")){
          System.out.println("converting the text into a something else");
      }
      else{
          System.out.println("Text Handler forwards request to Doc Handler");
          nextone.process(file);
      }
  }

  @Override
  public String getHandlerName() {
    return name;
  }
}
