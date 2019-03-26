package classLoad.loadOrder;/**
 * Created by user on 2019/3/25.
 */

/**
 * @ClassName Leaf
 * @Description TODO
 * @Autor user
 * @Date 2019/3/25 17:20
 * @Version 1.0
 **/
public class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        //通过super调用父类中有一个字符串参数的构造器
        super("Java初始化顺序演示");
        System.out.println("执行Leaf的构造器");
    }

    /**
     * 测试类加载过程的初始化会调用staic代码块
     * @param args
     */
    public static void main(String[] args) {

    }
}
