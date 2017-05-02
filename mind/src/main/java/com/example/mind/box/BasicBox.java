package com.example.mind.box;

/**
 * Created by walle on 2017/5/2.
 */

public abstract class BasicBox {
    public interface BoxStatus{
        String active = "active";
        String normal = "normal";
        String moveing="moveing";
        String transform="transform";
    }
    protected    boolean activeAble=true;
    abstract public void disActive();
    abstract public void active();
    abstract public void contactPoint();
    abstract public ContactPoint[] getContactPoint();

}
