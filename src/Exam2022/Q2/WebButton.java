package Exam2022.Q2;

public class WebButton implements  Button{

    @Override
    public void render() {
        System.out.println("webs");
    }

    @Override
    public void click() {
        System.out.println("web button clicked");
    }
}
