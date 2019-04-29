package lotto;

import java.util.Random;

public class losujLiczby {

    public int losowanie(){

        int liczba;
        Random los = new Random();
        liczba = los.nextInt(10)+1;
        return liczba;
    }

}
