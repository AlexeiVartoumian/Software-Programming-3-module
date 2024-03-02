package worksheet10.src.DiningPhilsophers;


public class Philsopher implements Runnable{

    Waiter waiter;
    int id;
    public Philsopher(Waiter waiter ,int id){
        this.id = id;
        this.waiter = waiter;
    }
    public void think() throws InterruptedException {
        int time = (int) (Math.random() * 5000);
        Thread.sleep(time);
    }
    @Override
    public void run(){

        while(true){

            try {
                waiter.getForks(id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            waiter.releaseForks(id);
            try {
                think();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
