package org.alangiovannipolardev.simple.factory;

import org.alangiovannipolardev.simple.factory.Knife;
import org.alangiovannipolardev.simple.factory.KnifeFactory;

public class KnifeStore {
    private KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife;
        knife = knifeFactory.createKnife(knifeType);
        knife.polish();
        knife.sharpen();
        knife.pack();
        return knife;
    }




}
