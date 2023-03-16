package org.ch01.test02.way.demo04;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 第三：工具类Executors创建线程池并返回ExecutorService对象
        ExecutorService executorService = Executors.newFixedThreadPool(10) ;

        // 第四：创建Future对象
        Future future = executorService.submit(new MyCallable());

        // 第五：获取计算结果 - 调用方法的线程进入阻塞状态，直到获取结果
        Integer data = (Integer) future.get();
        System.out.println("计算结果为："+data);

        System.out.println("主线程结束");

        // 第六：停止服务
        executorService.shutdownNow() ;

    }
}
