package thinkingInJava.ksztaltyPolimorfizm;

public class square extends shape {

    public void draw(){
        System.out.println("Rysuj kwadrat");
    }
    public void erase(){
        System.out.println("Wymazuje kwadrat");
    }
    public void kBazowa(){
        System.out.println("Jestem kwadratem"); // przesloniecie metody z klassy shape
    }

}
