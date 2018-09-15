package Zwierzeta;

public class lew extends zwierze{

    private boolean odglos;

    public lew(boolean odglos){
        this.odglos=odglos;
    }

    public lew(String nazwa,int waga, int szybkosc,boolean odglos){
        super(nazwa,waga,szybkosc);
        this.odglos=odglos;
    }

    public void odglos(){
        if(odglos){
            System.out.println("Wrauuu");
        }
        else{
            System.out.println("miau miau");
        }
    }
}
