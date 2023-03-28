package test00.demo02;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
public class JiSuanUtil {
    public static int getSum(@MaxData(1000) int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i ;
        }

        return sum;
    }
}
