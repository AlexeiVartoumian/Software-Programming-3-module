package Worksheet7DesPatternBehaviour.chainofresponsibility;

public class ExcelFileHandler implements Handler {

    private Handler nextone;
    private String name;
  public ExcelFileHandler(String excel_handler) {
    this.name = excel_handler;
  }

  @Override
  public void setHandler(Handler handler) {
        this.nextone = handler;
  }

  @Override
  public void process(File file) {

      if(file.getFileType().equalsIgnoreCase("excel")){
          System.out.println("Extracting tabular data for for next pipeline");
      }else{
          nextone.process(file);
      }
  }

  @Override
  public String getHandlerName() {
    return null;
  }
}
