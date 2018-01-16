package com.bt.corejava;

/**
 * Created by 611005913 on 12/18/2017.
 */
public class Child extends Parent implements EmployeeBase{

     public static final int count;

     static{
         count=1;
     }

     public Child(){
         //count=1;
     }
    public int calculateBehaviour(int i) {

        return 1;
    }

    @Override
    public void read() {

    }
}
