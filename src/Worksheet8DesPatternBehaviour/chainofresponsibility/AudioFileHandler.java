package Worksheet8DesPatternBehaviour.chainofresponsibility;

public class AudioFileHandler implements Handler {
    private Handler nextone;

    private String name;
  public AudioFileHandler(String audio_handler) {

      this.name = audio_handler;
  }

  @Override
  public void setHandler(Handler handler) {
        this.nextone = handler;
  }

  @Override
  public void process(File file) {

      if( file.getFileType().equalsIgnoreCase("audio") ){
          System.out.println("Nice sound to process");
          System.out.println("Process and saving audio file... by Audio Handle");
      }else{
          System.out.println("Audio Handler forwards request to Video Handler");
          nextone.process(file);
      }
  }

  @Override
  public String getHandlerName() {
    return name;
  }
}
