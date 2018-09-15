package Zwierzeta;

public class zwierzetaAkcja {

public static void main(String args[]){
    sprawdzZwierze s = new sprawdzZwierze();

    zwierze[] zwierzeTab = new zwierze[3];
    zwierzeTab[0]=new lew("lew",82,5,true);
    zwierzeTab[1]=new krowa("krowa",120,1,true);
    zwierzeTab[2]=new zmija("zmija",10,4,true);

    for(int i =0;i<zwierzeTab.length;i++){
        System.out.println(zwierzeTab[i].getNazwa()+" , "+zwierzeTab[i].getWaga()+" , "+zwierzeTab[i].getSzybkosc());
        zwierzeTab[i].odglos();
    }

    System.out.println("  ");

    lew lew = new lew(false);
    krowa krowa = new krowa(true);
    zmija zmija = new zmija(true);

    s.sprawdzZwierze(lew);
    s.sprawdzZwierze(zmija);
    s.sprawdzZwierze(krowa);

}
}

class sprawdzZwierze{
    public void sprawdzZwierze(zwierze s){
        s.odglos();
        }
        }
