package cz.uhk.zlomekws.model;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    public void zkratit() {
        int nsd = findNSD(citatel, jmenovatel);
        citatel /= nsd;
        jmenovatel /= nsd;
    }

    private int findNSD(int a, int b) {
        if (a<b) {
            int c = a;
            a = b;
            b = c;
        }
        int zb;
        do {
            zb  = a % b;
            a = b;
            b = zb;
        } while (zb != 0);

        return a;
    }

    public Zlomek soucet(Zlomek b) {
        Zlomek res = new Zlomek(
                citatel*b.jmenovatel + b.citatel*jmenovatel,
                jmenovatel*b.jmenovatel
        );
        res.zkratit();
        return res;
    }
}
