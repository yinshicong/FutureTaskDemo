/**
 * Created by Max on 2017/10/21.
 */
public class InterruptThread implements Runnable {

    @Override
    public synchronized void run() {
        boolean flag = true;
        int i = 0;
        while(flag){
            System.out.println(i++);
        }
    }

}
