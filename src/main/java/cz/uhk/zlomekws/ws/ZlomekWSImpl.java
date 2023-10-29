package cz.uhk.zlomekws.ws;

import cz.uhk.zlomekws.model.Zlomek;

public class ZlomekWSImpl implements ZlomekWS {
    @Override
    public Zlomek add(Zlomek a, Zlomek b) {
        return a.soucet(b);
    }

}
