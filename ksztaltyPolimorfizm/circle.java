package thinkingInJava.ksztaltyPolimorfizm;

public class circle extends shape{

    public void draw(){
        System.out.println("Rysuje kolo");
    }
    public void erase(){
        System.out.println("Wymazuje kolo");
    }
    public void kBazowa(){
        System.out.println("Jestem kolem");
    }
}
