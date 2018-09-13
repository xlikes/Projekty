public class Hulk extends Superbohater {

    private boolean skok;
    public Hulk(int punktyZycia,int sila, int zrecznosc, int wytrzymalosc,boolean skok) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.skok = skok;
    }
    public void superSkok(){
        if(skok){
            System.out.println("Super skoooook");
        }
        }
    }

