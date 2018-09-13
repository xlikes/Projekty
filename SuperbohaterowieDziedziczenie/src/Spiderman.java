public class Spiderman extends Superbohater {

    private boolean strzal;
    public Spiderman(int punktyZycia,int sila,int zrecznosc,int wytrzymalosc,boolean strzal){
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.strzal=strzal;

    }

    public void strzelajSiecia(){
        if(strzal){
            System.out.println("Wystrzelono siec");
        }
        else{
            System.out.println("czekam i sie nudze");
        }
    }
}
