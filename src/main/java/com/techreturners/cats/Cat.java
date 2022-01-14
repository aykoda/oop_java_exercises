package com.techreturners.cats;

public abstract class Cat implements ICat{

    private boolean isAsleep= false;

    public abstract String eat();

    public boolean  isAsleep(){
        //false by default
        return isAsleep;
    };

    public void goToSleep(){
        //"Cat should be snoozing"
        isAsleep = true;
    };

    public  void  wakeUp(){
        //"Cat should be awake now"
        isAsleep = false;
    };

    public  int getAverageHeight(){
        return 0;
    };

    public String getSetting(){
        return "";
    }
}
