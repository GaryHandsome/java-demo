package org.ch01.test00.g;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class CaiJiUtil {

    private Thread caiJiThread ;

    public CaiJiUtil() {

    }

    public CaiJiUtil(Thread caiJiThread) {
        this.caiJiThread = caiJiThread ;
    }

    /**
     * 开始采集数据
     */
    public void start() {
        caiJiThread.start();
    }

    /**
     * 停止采集数据
     */
    public void stop() {
        caiJiThread.interrupt();
    }
}
