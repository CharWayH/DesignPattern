package com.charwayh.memento.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.memento.common
 * @date:2023/5/30
 * 持有备忘录对象
 */
public class Caretaker {
    /**
     * 只保存一次状态
     */
    private Memento memento;

    /**
     * 集合中有很多备忘录对象
     */
    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * 多个originator对象保存多个memento
     */
    private HashMap<String, ArrayList<Memento>>  oriMementoMap;





    public void add(Memento memento){
        mementoList.add(memento);
    }

    /**
     * 获取第index个Originator的备忘录对象(即保存状态)
     * @param index
     */
    public Memento getMemento(int index){
        return mementoList.get(index);
    }

}
