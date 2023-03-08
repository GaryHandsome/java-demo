package org.ch00.test08;

/**
 * 防盗门
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public class FangDaoMen extends Men implements IFangDao{
    @Override
    public void open() {
        System.out.println("防盗门开");
    }

    @Override
    public void close() {
        System.out.println("防盗门开");
    }

    /**
     * 响铃-报警
     */
    @Override
    public void baoJing() {
        System.out.println("响铃-报警-WiWu WiWu..");
    }
}
