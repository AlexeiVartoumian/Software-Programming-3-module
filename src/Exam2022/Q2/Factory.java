package Exam2022.Q2;

public class Factory {

    public static Button produce(String type){

        return switch (type){
            case "web" ->  new WebButton();
            case "gui" -> new GuiButton();

            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
