package test01.inner.demo04;

/**
 * 接口用法四：接口作为方法返回值的使用
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest04 {
    public static void main(String[] args) {
        TestClass tc = new TestClass();

        IJieKou ijk1 = tc.message1();
        IJieKou ijk2 = tc.message2();

        System.out.println(ijk1.sayHello("张三"));
        System.out.println(ijk2.sayHello("张三"));


        /**
         * 总结：接口的使用有以下两种用法，分别为：
         *  传统用法 - 必须预告定义好相关的实现类
         *  匿名内部类实现 - 直接 new 接口的同时，使用匿名内部类实现接口，只有一次，用完就丢
         *
         * 接口使用的位置有以下三种情况：
         *  接口 对象 = new 接口名称(){
         *      // 实现接口的方法
         *  }
         *
         *
         *  xxx.方法名(new 接口名称(){
         *      // 实现接口的方法
         *  }) ;
         *
         *  访问修饰符 接口名称 方法名称() {
         *      return new 接口名称() {
         *          // 实现接口的方法
         *      }
         *  }
         *
         *
         */
    }
}
