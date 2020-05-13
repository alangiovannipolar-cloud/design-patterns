package org.alangiovannipolardev;

public class KnifeFactory {

    public Knife createKnife(String knifeType) {
        Knife knife = null;

        if (knifeType=="bread") {
            knife = new KnifeBread();
        } else if (knifeType=="meat") {
            knife = new KnifeMeat();
        }

        return knife;
    }
}
