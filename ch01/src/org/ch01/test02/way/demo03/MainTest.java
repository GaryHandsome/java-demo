package org.ch01.test02.way.demo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        // 第三：实例化 Callable 对象
        MyCallable mc = new MyCallable();

        // 第四：创建FutureTask对象
        FutureTask futureTask = new FutureTask(mc);

        // 第五：创建线程对象
        Thread t = new Thread(futureTask) ;

        // 第六：启动线程
        t.start();

        // 第七：获取数据 - 注意： 主线程阻塞，同步等待 task 执行完毕的结果
        Object data = futureTask.get();
        System.out.println(data);

        System.out.println("主线程结束....");

    }
}
