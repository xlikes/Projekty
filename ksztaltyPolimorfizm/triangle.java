package thinkingInJava.ksztaltyPolimorfizm;

public class triangle extends shape {

    public void draw(){
        System.out.println("Rysuje trojkat");
    }
    public void erase(){
        System.out.println("Wymazuje trojkat");
    }
    public void kBazowa(){
        System.out.println("Jestem trojkatem");
    }
}
