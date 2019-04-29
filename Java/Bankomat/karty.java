import java.util.Scanner;
public class karty {

    private int money;
    private String name;
    private String pass;
    boolean check;


        public karty(int money, String name) {
            this.money = money;
            this.name = name;
        }

            public void getcheck() {
            System.out.println("Podaj nazwe karty");

            Scanner odczyt = new Scanner(System.in);
            pass = odczyt.nextLine();
            boolean check =pass.equals(name);

                if (check) {
                    int a;
                    System.out.println("Poprawna karta");
                    System.out.println("Aby wyplacic wybierz 1");
                    System.out.println("Aby sprawdzic stan konta wybierz 2");

                    a = odczyt.nextInt();
                    switch(a){
                        case 1:
                            System.out.println("Ile pieniedzy chcesz wyplacic");
                            int wyplata;
                            wyplata = odczyt.nextInt();
                            if(wyplata<=money) {
                                money = money - wyplata;
                            }
                            else{
                                System.out.println("Nie posiadasz takiej ilosci srodkow");
                                System.out.println("Stan konta to"+money);
                                break;
                            }
                        case 2:
                            System.out.println("Stan konta to "+money);
                    }
                } else {
                    System.out.println("Zla karta");
                }
            }

            public void getstan(){
                boolean stan = money>0;
               if(stan){
                   while(stan){
                       getcheck();
                   }
               }
               else{
                   System.out.println("Brak srodkow na koncie");
               }
            }


}
