package Worksheet8DesPatternBehaviour.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("For MYSQL...");

        //whole point of template pattern is to swap
        //db types in and depending on specific algo
        //i.e connection type and files for processing
        ConnectionTemplate template = new MySqLCSVCon();
        template.run();
        System.out.println("For Oracle...");
        template = new OracleTxtCon();
        template.run();

    }
}
