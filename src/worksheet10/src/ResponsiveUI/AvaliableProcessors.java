package worksheet10.src.ResponsiveUI;

public class AvaliableProcessors {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
