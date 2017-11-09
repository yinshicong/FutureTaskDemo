import java.util.concurrent.Callable;

/**
 * Created by Max on 2017/10/20.
 */
public class MyCall implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("=========");
        return "return value 123";
    }


}
