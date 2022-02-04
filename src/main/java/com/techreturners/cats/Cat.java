package com.techreturners.cats;

public abstract class Cat implements Cats {

    private boolean isAsleep= false;
    private int averageHeight;
    private String setting;
    private String eatResult;

    public Cat( String eatResult){
        this.eatResult = eatResult;
    }
    public Cat(int averageHeight, String eatResult){
        this.averageHeight = averageHeight;
        this.eatResult = eatResult;
    }
    public Cat(int averageHeight, String setting, String eatResult){
        this.averageHeight = averageHeight;
        this.setting = setting;
        this.eatResult = eatResult;
    }

    public String eat(){ return eatResult;}

    public  int getAverageHeight(){
        return averageHeight;
    };

    public String getSetting(){
        return setting;
    }
    public void setSetting(String setting){
        this.setting = setting;
    }

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


}
