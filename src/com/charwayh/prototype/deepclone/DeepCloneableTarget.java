package com.charwayh.prototype.deepclone;

import java.io.*;

/**
 * @author charwayH
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    /**
     * 构造器
     * @param cloneName
     * @param cloneClass
     */
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 因为该类的属性都是String，因此我们使用默认的clone方法即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
