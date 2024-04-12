package Exam2022.Q2;

public class GuiButton implements  Button{


    @Override
    public void render() {
        System.out.println("desktop");
    }

    @Override
    public void click() {
        System.out.println("Gui button clicked");
    }
}
