import java.util.InputMismatchException;
import java.util.Scanner;
public class Wyjatki {
    public static void main(String[]ars){
        int check;
        int[] zmienne = {1,2,3,4,5};
        System.out.println("Podaj nr tablicy");
        Scanner odczyt = new Scanner(System.in);


        //Funkcja try-catch wylapujaca blad w try wpisujemy dzialanie w catch rodzaj bledu

            try {
                check = odczyt.nextInt();
                System.out.println("liczba odpowiadajaca nr tablicy to " + zmienne[check]);
            }
            catch(InputMismatchException e){
                System.out.println("niepoprawny parametr tablicy");
            }
            catch(ArrayIndexOutOfBoundsException n){
                System.out.println("liczba poza zakresem tablicy");
            }
            }
        }


