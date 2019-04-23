package com.late.TomJavaListener;/**
 * Created by user on 2019/4/23.
 */

/**
 * @ClassName TomPersonListener
 * @Description TODO
 * @Autor user
 * @Date 2019/4/23 15:09
 * @Version 1.0
 **/
public class TomPersonListener implements Listener {
    @Override
    public void runListen(Event event) {
        TomPerson person = event.getPerson();
        person.doListen();

    }

    @Override
    public void readListen(Event event) {
        TomPerson person = event.getPerson();
        person.doListen();
    }
}
