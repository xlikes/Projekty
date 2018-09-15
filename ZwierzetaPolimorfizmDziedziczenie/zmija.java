package ZwierzetaPolimorfizmDziedziczenie;

public class zmija extends zwierze{

    public zmija(boolean odglos){
        this.odglos=odglos;
    }

    private boolean odglos;
    public zmija(String nazwa, int waga, int szybkosc, boolean odglos){
        super(nazwa,waga,szybkosc);
        this.odglos=odglos;
    }
    public void odglos(){
        if(odglos){
            System.out.println("SSSssss");
        }
    }

}
