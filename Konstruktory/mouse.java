package Konstruktory;

public class mouse {
    private String nazwa;
    private int dlugosc;
    private int waga;

    public mouse() {
        nazwa = "Mickey";
        dlugosc = 3;
        waga = 4;
    }

    public mouse(String nazwa,int dlugosc, int waga){
        this.nazwa = nazwa;
        this.dlugosc=dlugosc;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }


    public int getDlugosc() {
        return dlugosc;
    }


    public int getWaga() {
        return waga;
    }
}


