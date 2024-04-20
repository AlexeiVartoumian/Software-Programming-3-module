package ExamPrac3.Take2.Q5;

public class Logger implements Runnable{
    String msg;
    public Logger(String msg){
        this.msg = msg;
    }
    public void run(){
        System.out.println(msg);
    }
}
