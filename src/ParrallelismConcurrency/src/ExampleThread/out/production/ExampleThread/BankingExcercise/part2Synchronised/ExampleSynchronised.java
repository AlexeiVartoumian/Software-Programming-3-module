package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread.BankingExcercise.part2Synchronised;

public class ExampleSynchronised {

    public synchronized void method(){
        //method body is locked before and afterwards
    }

    //replicating synchronized mechanism without synchronised
//    public void methodTwo(){
//
//        this.intrinsicLock.lock();
//        try{
//
//        }finally{
//            this.intrincsicLock.unlock();
//        }
//    }
    //syncrhonized can be used on code blocks in side methods as well, content not important
    public void methodThree(){
       Integer p = 1;
       synchronized (p){
           System.out.println(p);
       }
    }

    //Monitors Creds to hansen and Hoare! only one thread be executin

}
