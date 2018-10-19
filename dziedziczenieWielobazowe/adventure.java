package thinkingInJava.dziedziczenieWielobazowe;

public class adventure {

    public static void f(fight x){
        System.out.println("Walka");
        x.fight();}

    public static void s(swim x){
        System.out.println("plywanie");
        x.swim();
    }

    public static void c(climb x){
        System.out.println("wspinaczka");
        x.climb();}

    public static void main(String args[]){
        hero bohater = new hero();
        f(bohater); // obiekt hero jako figth
        s(bohater); //obiekt hero jako swim
        c(bohater);
    }
}
