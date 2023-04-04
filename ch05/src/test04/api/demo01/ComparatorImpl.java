package test04.api.demo01;

import java.util.Comparator;

/**
 * 整型数组中各元素的比较算法
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class ComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
