package test00.demo07;

/**
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        Student stu = new Student("Zing",18) ;

        if(stu!=null ) {
            if(stu.getName()==null) {
                System.out.println("匿名");
            } else {
                System.out.println(stu.getName().toLowerCase());
            }
        }
    }
}
