public class Superman extends Superbohater {

    private boolean latanie;
    public Superman(int punktyZycia,int sila, int zrecznosc,int wytrzymalosc,boolean latanie) {
        super(punktyZycia, sila, zrecznosc, wytrzymalosc);
        this.latanie=latanie;
    }
        public void latam(){
            if(latanie){
                System.out.println("Super moc latanie");
            }
            else{
                System.out.println("nie latam");
            }
        }

    }

