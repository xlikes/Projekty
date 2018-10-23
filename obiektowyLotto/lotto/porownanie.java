package lotto;

public class porownanie extends lottoStart {

    public void test(int[] odcGracza,int[] liczbyWygr){
        int licznik=0; // zmienna zliczajaca punkty
        for(int i=0;i<6;i++){ // petla iterujaca po tablicy wygrywajacej
            for(int j=0;j<3;j++) { // petla iterujaca po tablicy gracza
                if (odcGracza[j]==liczbyWygr[i]) { // sprawdzenie czy jakies liczby sie zgadzaja
                    licznik++;
                }
            }
        }
        System.out.println("Trafiono "+licznik+" liczb");
    }

}
