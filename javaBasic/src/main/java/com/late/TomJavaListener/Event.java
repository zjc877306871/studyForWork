package com.late.TomJavaListener;/**
 * Created by user on 2019/4/23.
 */

/**
 * @ClassName Event
 * @Description 事件
 * @Autor user
 * @Date 2019/4/23 14:53
 * @Version 1.0
 **/
public class Event {

    private TomPerson person;

    public TomPerson getPerson() {
        return person;
    }

    public void setPerson(TomPerson person) {
        this.person = person;
    }

    public Event(TomPerson person) {
        this.person = person;
    }
}
