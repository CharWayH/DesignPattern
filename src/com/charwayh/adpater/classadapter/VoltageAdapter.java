package com.charwayh.adpater.classadapter;

/**
 * @author charwayH
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        // 获取到220V电压
        int srcV = output200V();
        // 转成5V
        int dstV = srcV / 44;
        return dstV;
    }
}
