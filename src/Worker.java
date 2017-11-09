/**
 * Created by Max on 2017/10/21.
 */
public class Worker extends Thread {

    private int i = 0;

    @Override
    public void run() {

        while(i==0){
            i++;
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"  run...");
        }

    }
}
