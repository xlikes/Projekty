

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

        Superman superman = new Superman(200,300,120,20,true);
        superman.latam();

        Hulk hulk = new Hulk(300,400,20,330,true);
        hulk.superSkok();

        Wolverine wolverine = new Wolverine(120,150,300,100,true);
        wolverine.mocPazury();

        IronMan ironman = new IronMan(200,330,100,50,true);
        ironman.odrzutowyPlecak();
    }
}
