public class IronMan extends Superbohater {
    private boolean plecak;

    public IronMan(int punktyZycia, int sila, int zrecznosc, int wytrzymalosc, boolean plecak){
        super(punktyZycia,sila,zrecznosc,wytrzymalosc);
        this.plecak=plecak;
    }

    public void odrzutowyPlecak(){
        if(plecak){
            System.out.println("Odrzutowy plecak działą");
        }
        else{
            System.out.println("Plecak nie dziala");
        }
    }

}
