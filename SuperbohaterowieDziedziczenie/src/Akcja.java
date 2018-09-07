

public class Akcja {
    public static void main (String args[]){

        Superbohater superbohater = new Superbohater();
        superbohater.setpunktyZycia(50);
        superbohater.setsila(40);
        superbohater.setzrecznosc(30);
        superbohater.setwytrzymalosc(20);

        Batman batman = new Batman(100,80,70,30,true);
        batman.uzyjBatmobilu();
        batman.setpunktyZycia(30);

        Spiderman spiderman = new Spiderman(80,20,30,100,true);
        spiderman.strzelajSiecia();

        System.out.println(batman.getpunktyZycia());

    }
}
