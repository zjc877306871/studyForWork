package concurrentProgramming.threadPool.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 2018/9/18.
 */
public class UseScheduledThreadPoolExecutor {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        ScheduledExceptionHandle ss = new ScheduledExceptionHandle("2");
        service.scheduleAtFixedRate(new Thread(ss),0,2, TimeUnit.SECONDS);


    }
}
