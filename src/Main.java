import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        //new Thread(FutureTask<V> implement RunnableFuture<V> extends Runnable,Future<V>);
//        FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println(1);
//                return "!";
//            }
//        });
//
//
//        try {
//            new Thread(futureTask).start();
//            String s = futureTask.get();
//            System.out.println(s);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        Executors.newCachedThreadPool();

//        FutureTask<String> future = new FutureTask<String>(new MyCall());
//        Thread thread = new Thread(future);
//        thread.start();
//        System.out.println(future.get());
//        System.out.println(future.get());

//        InterruptThread interruptThread = new InterruptThread();
//        Thread thread = new Thread(interruptThread);
//        thread.start();
//        Thread.sleep(1500);
//        thread.interrupt();
//        System.out.println("over");

        //等待队列最大任务数为50
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<Runnable>(50);
        //核心线程数：5   最大线程数：15    多余线程存活时间：2秒
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,15,2,TimeUnit.SECONDS,arrayBlockingQueue);
//        threadPoolExecutor.prestartAllCoreThreads();
        System.out.println("池中的当前线程数 :" + threadPoolExecutor.getPoolSize());

        //创建56个任务。
        for(int i = 0 ; i < 65; i ++){
            threadPoolExecutor.execute(new Worker());
        }
        System.out.println("==================over===============");

        ArrayBlockingQueue<Runnable> blockingQueue = (ArrayBlockingQueue)threadPoolExecutor.getQueue();


        System.out.println("池中的当前线程数 :" + threadPoolExecutor.getPoolSize());
        System.out.println("曾经同时位于池中的最大线程数 :" + threadPoolExecutor.getLargestPoolSize());
        System.out.println("等待队列中的任务数:" + blockingQueue.size());



        long l = 100L;
        double d = 1.1D;

        switch (d){
            case 1.1D:
                break;
        }



    }
}
