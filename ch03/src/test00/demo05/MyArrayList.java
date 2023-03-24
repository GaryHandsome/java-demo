package test00.demo05;

/**
 * 模拟 ArrayList - ArrayList 本质上是对 数组进行封装
 *
 * @Date 2023-03-24
 * @Author zqx
 */
public class MyArrayList<E> {
    /**
     * 集合的初始容量 - 常量
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 集合封装的数组 - 真正意义存储数据的空间
     */
    private Object[] elementData;

    /**
     * 集合实际存储元素的大小 - 数组实际的长度
     */
    private int size;

    /**
     * 默认构造方法 - 实例化 elementData 数组，并指定默认的长度
     */
    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 重载构造方法 - 初始化指定容量的数组
     *
     * @param initCapacity
     */
    public MyArrayList(int initCapacity) {
        this.elementData = new Object[initCapacity];
    }


    /**
     * 1、动态扩容 - 原来长度 * 2
     */
    private void newCapacity() {
        if (size == elementData.length) {
            // 1.创建新的数组
            Object[] newArr = new Object[elementData.length * 2];

            // 2.复制原数组的内容
            System.arraycopy(elementData, 0, newArr, 0, elementData.length);

            // 3.覆盖原数组
            elementData = newArr;
        }
    }

    /**
     * 2、add(): 添加元素
     *
     * @param e 添加的元素
     * @return 是否成功
     */
    public boolean add(E e) {

        // 1）扩容
        newCapacity();

        // 2）添加
        this.elementData[size++] = e;

        // 3）返回结果
        return true;
    }

    /**
     * 3、remove(): 删除元素 - 根据下标索引删除
     *
     * @param delIndex
     * @return
     */
    public boolean remove(int delIndex) {
        // 1）验证索引的合法性
        checkIndex(delIndex);
        // 2）把删除元素后面所有的元素往前移
        System.arraycopy(elementData, delIndex + 1, elementData, delIndex, elementData.length - delIndex - 1);
        // 3）实际大小减1
        size--;
        // 4）把最后一个元素设置为空
        elementData[size] = null;
        // 5）返回结果
        return true;
    }

    private void checkIndex(int delIndex) {
        if (delIndex < 0 || delIndex > size) {
            // 在实际开发中，需要程序自定义异常
            throw new RuntimeException("删除的索引越界，索引为:" + delIndex);
        }
    }

    /**
     * 4、size(): 返回集合元素的实际个数
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * 5、set(): 给集合某个下标设置元素
     *
     * @param index
     * @param element
     * @return
     */
    public E set(int index, E element) {
        // 1）验证索引合法性
        checkIndex(index);

        // 2）获取修改之前的元素
        E oldElement = (E) this.elementData[index];

        // 3）修改操作
        this.elementData[index] = element;

        // 4）返回修改之前的元素
        return oldElement;
    }

    /**
     * 6、get(): 获取集合下标对应的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        // 1）验证索引合法性
        checkIndex(index);

        // 2）返回结果 - 向下转换
        return (E) this.elementData[index];
    }

    /**
     * 7、isEmpty()：判断集合是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return this.size == 0;
    }


    /**
     * 8、重写toString方法，返回类似这样的结果：[AA,BB,CC,DD]
     *
     * @return
     */
    @Override
    public String toString() {

        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
}
