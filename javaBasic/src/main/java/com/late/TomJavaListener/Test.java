package com.late.TomJavaListener;/**
 * Created by user on 2019/4/23.
 */

/**
 * @ClassName Test
 * @Description TODO
 * @Autor user
 * @Date 2019/4/23 15:38
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        TomPerson person = new TomPerson();
        person.registListen();
        person.read();
        person.run();
    }
}
