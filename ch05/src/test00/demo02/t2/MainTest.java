package test00.demo02.t2;



/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args){
        // 方法二：匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++) {
                    System.out.println("好好学习，天天向上");
                }
            }
        };


        new Thread(runnable).start();
    }
}
