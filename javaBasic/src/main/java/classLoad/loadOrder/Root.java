package classLoad.loadOrder;/**
 * Created by user on 2019/3/25.
 */

/**
 * @ClassName Demo
 * @Description TODO
 * @Autor user
 * @Date 2019/3/25 17:13
 * @Version 1.0
 **/
public class Root {

        static{
            System.out.println("Root的静态初始化块");
        }
        {
            System.out.println("Root的普通初始化块");
        }
        public Root()
        {
            System.out.println("Root的无参数的构造器");
        }
    }


