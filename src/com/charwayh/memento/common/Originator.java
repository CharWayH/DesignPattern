package com.charwayh.memento.common;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.memento.common
 * @date:2023/5/30
 * 原始对象
 */
public class Originator {
    /**
     * 状态信息
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento(){
        return new Memento(state);
    }

    /**
     * 通过备忘录对象，恢复状态
     */
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
