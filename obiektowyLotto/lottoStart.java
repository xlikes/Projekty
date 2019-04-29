package lotto;

import java.util.Arrays;

public class lottoStart {

    public static void main(String args[]){
        int numbWin;
        int randNumb;

        int[] liczbyWygr = new int[6]; // tablica z wylosowanymi liczbami wygrywajacymi
        int[] odcGracza = new int[3]; // tablica do ktorej gracz wprowadza liczby

        losujLiczby wygryw = new losujLiczby();
        odczytLiczb los = new odczytLiczb();
        porownanie sprawdz = new porownanie();


        for(int j=0; j<3; j++){
            int test=0;
            numbWin=los.sprawdz(); //wywolanie scannera liczb od gracza
            odcGracza[j]=numbWin;
            for(int x=0;x<=j;x++){
                if (numbWin ==liczbyWygr[x]){
                    test++; //jesli liczba sie powtarza dodaj jeden
                }
            }
            if(test==0){ // dodaj liczbe tylko wtedy kiedy sie nie powtarza
                liczbyWygr[j] = numbWin; // jesli liczba sie nie powtarza wrzuc do tablicy
            }
            else{
                System.out.println("podales juz taka liczbe ");
                j--;//jesli liczba sie powtarza powtorz iteracje petli
            }
        }


         for(int i=0; i<6; i++){
             int test=0;
             randNumb =wygryw.losowanie();// wlozenie wylosowanych liczb do tablicy
             for(int x=0;x<=i;x++){
             if (randNumb ==liczbyWygr[x]){
                 test++; //jesli liczba sie powtarza dodaj jeden
                 }
             }
         if(test==0){ // dodaj liczbe tylko wtedy kiedy sie nie powtarza
             liczbyWygr[i] = randNumb; // jesli liczba sie nie powtarza wrzuc do tablicy
         }
         else{
             i--;//jesli liczba sie powtarza powtorz iteracje petli
         }
         }



        System.out.println("Liczby wygrywajace to  "+Arrays.toString(liczbyWygr)); // wyswietlenie liczb wygrywajacych
        System.out.println("Twoje liczby to  "+Arrays.toString(odcGracza)); // wyswietlanie liczb wprowadzonych przez gracza
        sprawdz.test(odcGracza,liczbyWygr); //przekazanie tablic do sprawdzenia




        //liczby wygrywajace
        //podaj liczby
        //porownaj liczby



    }
}
