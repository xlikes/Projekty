package thinkingInJava.ksztaltyPolimorfizm;

import java.util.*;

public class randomShapeGenerator {

    private Random rand = new Random();

    public shape next(){
        switch(rand.nextInt(4)){
            default:
            case 0:
                return new circle();
            case 1:
                return new square();
            case 2:
                return new triangle();
            case 3:
                return new pentagon();
        }

    }
}
