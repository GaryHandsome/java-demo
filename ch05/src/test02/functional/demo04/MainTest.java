package test02.functional.demo04;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        SonInterfaceTest st = new SonInterfaceTest() {} ;

        st.defaultMethod();

        FatherInterfaceTest01.staticMethod();
        FatherInterfaceTest02.staticMethod();

    }
}
