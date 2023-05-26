package com.charwayh.adpater.classadapter;

/**
 * @author charwayH
 */
public class Voltage220V {

    /**
     * 输出220的电压
     * @return
     */
    public int output200V(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
