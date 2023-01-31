package com.techreturners.cats;

public class DomesticCat extends AbstractCat {
    public DomesticCat() {
        super(false,false, 23);
    }

    public String eat() {

        if(Math.random() > 0.5) {
            return "Purrrrrrr";
        } else  {
            return "It will do I suppose";
        }
   }
}
