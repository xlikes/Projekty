import java.sql.SQLOutput;
import java.util.Scanner;
public class Wisielec {
    public static void main(String[] args) {

        int dobre=0;
        int bledy = 0;
        int pkt = 0;
        int zycia = 0;
        System.out.println("Podaj haslo");
        Scanner odczyt = new Scanner(System.in);
        char[] haslo = odczyt.nextLine().toCharArray(); //Pierwsza tablica do sprawdzania warunków
        char[] haslonowe = new char[haslo.length]; //Druga tablica do pokazywania graczowi
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; zycia < 10; i++) {
            System.out.println();
            System.out.println("Podaj litere");
            Scanner sprawdz = new Scanner(System.in);
            char litera = sprawdz.next().charAt(0); // Wprowadzenie jednego znaku
            for (int j=0; j<haslo.length; j++) {
                boolean dobrze=haslo[j]==litera;
                boolean test=haslonowe[j]!=haslo[j];
                boolean zle=haslo[j]!=litera;
                boolean powtorka=haslonowe[j]!=litera;

                if (dobrze) {
                    haslonowe[j] = litera;
                }
                else if(zle&&test){
                    char puste = '_';
                    haslonowe[j]=puste;
                }

                if(dobrze&&powtorka){
                    if(dobre<1){
                        System.out.println("DOBRA LITERA");
                        dobre++;
                    }
                    pkt++;
                    if(pkt==haslo.length){
                        System.out.println("!!!HASLO ODGADNIETE!!!");
                        break;
                    }
                }
               if(dobre==0&&j==haslo.length-1){
                        System.out.println("ZLA LITERA");
                        zycia++;

                        switch (zycia) {
                            case 1:
                                System.out.println("                                        ______________");
                                break;
                            case 2:
                                System.out.println("                                              []      ");
                                System.out.println("                                              []      ");
                                System.out.println("                                              []      ");
                                System.out.println("                                              []      ");
                                System.out.println("                                              []      ");
                                System.out.println("                                              []      ");
                                System.out.println("                                              []      ");
                                System.out.println("                                        ______[]______");
                                break;
                            case 3:
                                System.out.println("                                              []=========      ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 4:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 5:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []    (͡๏̯͡๏)      ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 6:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []    (͡๏̯͡๏)      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 7:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []    (͡๏̯͡๏)      ");
                                System.out.println("                                              []    --|        ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 8:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []    (͡๏̯͡๏)      ");
                                System.out.println("                                              []    --|--      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []               ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 9:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []    (͡๏̯͡๏)      ");
                                System.out.println("                                              []    --|--      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []     ╱        ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                break;
                            case 10:
                                System.out.println("                                              []======|==      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []    (͡๏̯͡๏)      ");
                                System.out.println("                                              []    --|--      ");
                                System.out.println("                                              []      |        ");
                                System.out.println("                                              []     ╱╲       ");
                                System.out.println("                                              []               ");
                                System.out.println("                                        ______[]______         ");
                                System.out.println("");
                                System.out.println("                        PRZEGRALES                             ");
                                break;
                        }
                }
            }
            dobre =0;
            if(pkt==haslo.length){
                for(char x:haslonowe){
                    System.out.print(x+" ");
                }
                break;
            }
            for(char x:haslonowe){
                System.out.print(x+" ");
            }
        }
    }
}
