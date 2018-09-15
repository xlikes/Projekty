public class Batman extends Superbohater {

    private boolean batmobil;

    public Batman(int punktyZycia,int sila,int zrecznosc, int wytrzymalosc,boolean batmobil) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.batmobil = batmobil;
    }

        public void uzyjBatmobilu() {
            if (batmobil) {
                System.out.println("Batmobil dziala");
            } else {
                System.out.println("Batmobil nie dziala");
            }
        }

}
