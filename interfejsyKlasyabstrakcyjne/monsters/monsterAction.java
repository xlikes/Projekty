package thinkingInJava.monsters;

public class monsterAction extends monsters{ 

    public static void b(vampwolf x){
        System.out.println("gryze");
        x.bite();}
    public static void h(vampwolf x){
        System.out.println("zyje");
        x.health();}
    public static void bl(vampwolf x){
        System.out.println("pije krew");
        x.blood();}
    public static void in(vampwolf x){
        System.out.println("znikamm");
        x.invisible();}
    public static void r(vampwolf x){
        System.out.println("Ryyczeee");
        x.roar();}

        public static void main(String args[]){

        monsters wampirWilk = new monsterAction(); // polimorfizm

        b(wampirWilk);
        h(wampirWilk);
        bl(wampirWilk);
        in(wampirWilk);
        r(wampirWilk);

        }
}
