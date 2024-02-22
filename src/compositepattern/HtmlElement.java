package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends HtmlTag {
  private String tagName;
  private String startTag;

  private String tagBody;
  private String endTag;
  private List<HtmlTag> childElements= new ArrayList<HtmlTag>();
  public HtmlElement(String s) {
    super();
  }

  @Override
  public String getTagName() {
    return null;
  }

  @Override
  public void setStartTag(String tag) {
    this.startTag = tag;
  }

  @Override
  public void setEndTag(String tag) {
    this.endTag = tag;
  }

  @Override
  public void generateHtml() {
    System.out.print(this.startTag);
    if(this.tagBody!= null){
      System.out.print(this.tagBody);
    }
    System.out.println(this.endTag);
    for (HtmlTag childElement : childElements) {
      childElement.generateHtml();
    }

  }
  @Override
  public void addChildTag(HtmlTag htmlTag){

    childElements.add(htmlTag);
  }

  @Override
  public void setTagBody(String tagBody){
    this.tagBody = tagBody;
  }
}
