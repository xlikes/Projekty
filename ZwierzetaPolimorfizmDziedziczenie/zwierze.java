package Zwierzeta;

public class zwierze {

    private String nazwa;
    private int waga;
    private int szybkosc;

    public zwierze(){
        nazwa = "Domyslna";
        waga = 0;
        szybkosc = 0;
    }

    public zwierze(String nazwa, int waga, int szybkosc){
        this.nazwa = nazwa;
        this.waga = waga;
        this.szybkosc = szybkosc;
    }

    public String getNazwa(){
        return nazwa;
    }

    public int getWaga(){
        return waga;
    }

    public int getSzybkosc(){
        return szybkosc;
    }

    public void odglos(){}

}
