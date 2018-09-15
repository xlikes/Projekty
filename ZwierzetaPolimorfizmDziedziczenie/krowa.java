package Zwierzeta;

public class krowa extends zwierze{

    public krowa(boolean odglos){
        this.odglos=odglos;
    }
    private boolean odglos;
    public krowa(String nazwa,int waga, int szybkosc, boolean odglos){
        super(nazwa,waga,szybkosc);
        this.odglos=odglos;
    }

    public void odglos(){
        if(odglos){
            System.out.println("Muuuuuuu");
        }
    }
}
