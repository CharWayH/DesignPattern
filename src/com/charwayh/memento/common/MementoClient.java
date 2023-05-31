package com.charwayh.memento.common;

import com.charwayh.memento.common.Caretaker;
import com.charwayh.memento.common.Originator;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.observer.common
 * @date:2023/5/30
 */
public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1#");
        // 保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2#");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3#");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是=" + originator.getState());
        // 希望恢复到状态1
        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("当前的状态是=" + originator.getState());
    }
}
