public class Superbohater {

    private int punktyZycia;
    private int sila;
    private int zrecznosc;
    private int wytrzymalosc;

    public Superbohater(){};

    public Superbohater(int punktyZycia,int sila,int zrecznosc,int wytrzymalosc){
        this.punktyZycia = punktyZycia;
        this.sila = sila;
        this.zrecznosc = zrecznosc;
        this.wytrzymalosc=wytrzymalosc;
    }

    public int getpunktyZycia(){
        return punktyZycia;
    }

    public void setpunktyZycia( int punktyZycia){
        this.punktyZycia = punktyZycia;
    }

    public int getsila(){
        return sila;
    }

    public void setsila( int sila){
        this.sila=sila;
    }

    public int getzrecznosc(){
        return zrecznosc;
    }

    public void setzrecznosc(int zrecznosc){
        this.zrecznosc=zrecznosc;
    }

    public int getwytrzymalosc(){
        return wytrzymalosc;
    }

    public void setwytrzymalosc( int wytrzymalosc){
        this.wytrzymalosc=wytrzymalosc;
    }



}
