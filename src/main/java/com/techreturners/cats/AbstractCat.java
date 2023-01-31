package com.techreturners.cats;

abstract class AbstractCat implements Cat {

    private boolean isAsleep;
    private boolean isWild;
    private int averageHeight;

    public AbstractCat(boolean isAsleep, boolean isWild, int averageHeight) {
        this.isAsleep = isAsleep;
        this.isWild = isWild;
        this.averageHeight = averageHeight;
    }

    public void goToSleep(){
        isAsleep = true;
    }
    public void wakeUp(){
        isAsleep = false;
    }
    public boolean isAsleep(){
        return isAsleep;
    }
    public void run(){}

    public int getAverageHeight() {
        return averageHeight;
    }
    public String getSetting(){
        if(isWild){
            return "wild";
        } else {
            return "domestic";
        }
    }
}