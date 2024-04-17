package Worksheet8DesPatternBehaviour.chainofresponsibility;

public class ImageFileHandler implements Handler {

    private Handler nextone;
    private String name;
  public ImageFileHandler(String image_handler) {
      this.name =image_handler;
  }

  @Override
  public void setHandler(Handler handler) {
        this.nextone = handler;
  }

  @Override
  public void process(File file) {

      if (file.getFileType().equalsIgnoreCase("Image")){
          System.out.println("Rasterising Image because I like the word Rasterising! ");
      }else{
          nextone.process(file);
      }
  }

  @Override
  public String getHandlerName() {
    return name;
  }
}
