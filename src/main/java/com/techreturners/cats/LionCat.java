package com.techreturners.cats;

public class LionCat extends AbstractCat {
    public LionCat() {
        super(false,true, 1100);
    }

    public String eat(){
        return "Roar!!!!";
    }
}
