package Worksheet8DesPatternBehaviour.chainofresponsibility;

public class VideoFileHandler implements Handler {

    private Handler nextone;
    private String name;
  public VideoFileHandler(String video_handler) {
  }

  @Override
  public void setHandler(Handler handler) {
        this.nextone = handler;
  }

  @Override
  public void process(File file) {

      if (file.getFileType().equalsIgnoreCase("Video")){
          System.out.println("Transcoding! not sure what that means but its some video processing stuff");
          System.out.println("Process and saving video file... by Video Handler");
      }else{
          System.out.println("Video Handler forwards request to Image Handle");
          nextone.process(file);
      }
  }

  @Override
  public String getHandlerName() {
    return null;
  }
}
