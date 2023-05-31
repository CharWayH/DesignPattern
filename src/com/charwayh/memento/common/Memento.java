package com.charwayh.memento.common;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.memento.common
 * @date:2023/5/30
 * 备忘录类
 */
public class Memento {
    /**
     * 状态信息
     */
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
