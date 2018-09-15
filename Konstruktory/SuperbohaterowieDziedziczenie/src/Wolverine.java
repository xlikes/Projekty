public class Wolverine extends Superbohater{
    private boolean pazury;
    public Wolverine(int punktyZycia, int sila,int zrecznosc,int wytrzymalosc,boolean pazury){
        super(punktyZycia,sila,zrecznosc,wytrzymalosc);
        this.pazury=pazury;
    }

    public void mocPazury(){
        if(pazury){
            System.out.println("Pazury do walki");
        }
        else{
            System.out.println("cicho mrau");
        }
    }
}
