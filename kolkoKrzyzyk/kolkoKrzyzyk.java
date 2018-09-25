package kolkoKrzyzyk;
import java.util.Scanner;

public class kolkoKrzyzyk {

    public static void main(String args[]) {

        char[] tabkk ={' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int wartosc;

        System.out.println("    GRA                       Numeracja pól gry");
        System.out.println("================================================");
        System.out.println(" "+tabkk[0]+" | "+tabkk[1]+" | "+tabkk[2]+"           HH           "+1+" | "+2+" | "+3);
        System.out.println("---+---+---"+"          HH          "+"---+---+---");
        System.out.println(" "+tabkk[3]+" | "+tabkk[4]+" | "+tabkk[5]+"           HH           "+4+" | "+5+" | "+6);
        System.out.println("---+---+---"+"          HH          "+"---+---+---");
        System.out.println(" "+tabkk[6]+" | "+tabkk[7]+" | "+tabkk[8]+"           HH           "+7+" | "+8+" | "+9);
        System.out.println("================================================");

        for(int i=0; i<9; i++) {
            if(i%2==0){
                    System.out.println("Ruch Gracza 1 'X' :");
                    Scanner odczyt = new Scanner(System.in);
                    wartosc = odczyt.nextInt();
                boolean zajete = tabkk[wartosc-1]=='X'||tabkk[wartosc-1]=='O';
                if(zajete){
                    System.out.println("To pole jest juz zajete");
                    i--;
                }
                else {
                    switch (wartosc) {
                        case 1:
                            tabkk[0] = 'X';
                            break;
                        case 2:
                            tabkk[1] = 'X';
                            break;
                        case 3:
                            tabkk[2] = 'X';
                            break;
                        case 4:
                            tabkk[3] = 'X';
                            break;
                        case 5:
                            tabkk[4] = 'X';
                            break;
                        case 6:
                            tabkk[5] = 'X';
                            break;
                        case 7:
                            tabkk[6] = 'X';
                            break;
                        case 8:
                            tabkk[7] = 'X';
                            break;
                        case 9:
                            tabkk[8] = 'X';
                            break;
                    }
                }
            }
            else{
                System.out.println("Ruch Gracza 2 'O' :");
                System.out.println("Podaj wartosc");
                Scanner odczyt = new Scanner(System.in);
                wartosc = odczyt.nextInt();
                boolean zajete = tabkk[wartosc-1]=='X'||tabkk[wartosc-1]=='O';
                if(zajete){
                    System.out.println("To pole jest juz zajete");
                    i--;
                }
                else {
                    switch (wartosc) {
                        case 1:
                            tabkk[0] = 'O';
                            break;
                        case 2:
                            tabkk[1] = 'O';
                            break;
                        case 3:
                            tabkk[2] = 'O';
                            break;
                        case 4:
                            tabkk[3] = 'O';
                            break;
                        case 5:
                            tabkk[4] = 'O';
                            break;
                        case 6:
                            tabkk[5] = 'O';
                            break;
                        case 7:
                            tabkk[6] = 'O';
                            break;
                        case 8:
                            tabkk[7] = 'O';
                            break;
                        case 9:
                            tabkk[8] = 'O';
                            break;
                    }
                }
            }
            //Drukowanie tablicy gry
            System.out.println("    GRA                       Numeracja pól gry");
            System.out.println("================================================");
            System.out.println(" "+tabkk[0]+" | "+tabkk[1]+" | "+tabkk[2]+"           HH           "+1+" | "+2+" | "+3);
            System.out.println("---+---+---"+"          HH          "+"---+---+---");
            System.out.println(" "+tabkk[3]+" | "+tabkk[4]+" | "+tabkk[5]+"           HH           "+4+" | "+5+" | "+6);
            System.out.println("---+---+---"+"          HH          "+"---+---+---");
            System.out.println(" "+tabkk[6]+" | "+tabkk[7]+" | "+tabkk[8]+"           HH           "+7+" | "+8+" | "+9);
            System.out.println("================================================");

            //Warunki wygranej

            boolean wygrX =tabkk[0]=='X'&&tabkk[1]=='X'&&tabkk[2]=='X'||
             tabkk[3]=='X'&&tabkk[4]=='X'&&tabkk[5]=='X'||
             tabkk[6]=='X'&&tabkk[7]=='X'&&tabkk[8]=='X'||
             tabkk[0]=='X'&&tabkk[3]=='X'&&tabkk[6]=='X'||
             tabkk[1]=='X'&&tabkk[4]=='X'&&tabkk[7]=='X'||
             tabkk[2]=='X'&&tabkk[5]=='X'&&tabkk[8]=='X'||
             tabkk[0]=='X'&&tabkk[4]=='X'&&tabkk[8]=='X'||
             tabkk[2]=='X'&&tabkk[4]=='X'&&tabkk[6]=='X';

            boolean wygrO =tabkk[0]=='O'&&tabkk[1]=='O'&&tabkk[2]=='O'||
                    tabkk[3]=='O'&&tabkk[4]=='O'&&tabkk[5]=='O'||
                    tabkk[6]=='O'&&tabkk[7]=='O'&&tabkk[8]=='O'||
                    tabkk[0]=='O'&&tabkk[3]=='O'&&tabkk[6]=='O'||
                    tabkk[1]=='O'&&tabkk[4]=='O'&&tabkk[7]=='O'||
                    tabkk[2]=='O'&&tabkk[5]=='O'&&tabkk[8]=='O'||
                    tabkk[0]=='O'&&tabkk[4]=='O'&&tabkk[8]=='O'||
                    tabkk[2]=='O'&&tabkk[4]=='O'&&tabkk[6]=='O';


            if(wygrX){
                System.out.println("Wygrał Gracz 1 'X'");
                break;
            }
            else if(wygrO){
                System.out.println("Wygral Gracz 2 'O'");
                break;
            }
            else{
                if(i==9) {
                    System.out.println("Remis");
                }
            }

        }
    }
}
