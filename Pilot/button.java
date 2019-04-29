import java.sql.SQLOutput;
import java.util.Scanner;
public class button {
    private char but;
    private int channel;
    private int audio;
    boolean on;
    boolean off;
    String check;


    public button(char but){
        this.but=but;
    }


    public void getcheck() {
        System.out.println("Aby wlaczyc wpisz on");
        System.out.println("Aby wylaczyc wpisz off");
        Scanner odczyt = new Scanner(System.in);
        check = odczyt.nextLine();
        boolean on = check.equals("on");
        boolean off = check.equals("off");
        System.out.println(check);
    }

    public void channels(){
        boolean on = check.equals("on");
        boolean off = check.equals("off");
        if(on){
            Scanner zmiana= new Scanner(System.in);
            System.out.println("TV wlaczony mozesz wybrac kanaly od 1 do 4 \n glosniej + ciszej - oraz gora dol [ ],\n f wylacz");
            switch (but = zmiana.next().charAt(0)) {
                case '1':
                    System.out.println("Wybrales TVP1");
                    channel=1;
                    break;
                case '2':
                    System.out.println("Wybrales TVP2");
                    channel=2;
                    break;
                case '3':
                    System.out.println("Wybrales Polsat");
                    channel=3;
                    break;
                case '4':
                    System.out.println("Wybrales TVN");
                    channel=4;
                    break;
                case 'f':
                    System.out.println("TV wylaczony");
                    getcheck();
                    break;
                case '-':
                    if(audio>0) {
                        audio -= 1;
                        System.out.println("Glosnosc: " + audio);
                    }
                    else{
                        System.out.println("Glosnosc 0");
                    }
                    break;
                case '+':
                    audio+=1;
                    System.out.println("Glosnosc: "+audio);
                    break;
                case '[':
                    channel+=1;
                    switch(channel){
                        case 1:
                            System.out.println("Wybrales TVP1");
                            break;
                        case 2:
                            System.out.println("Wybrales TVP2");
                            break;
                        case 3:
                            System.out.println("Wybrales Polsat");
                            break;
                        case 4:
                            System.out.println("Wybrales TVN");
                            break;
                        case 5:
                            channel=1;
                            System.out.println("Wybrales TVP1");
                            break;
                    }
                    break;
                case ']':
                    channel-=1;
                    switch(channel){
                        case 1:
                            System.out.println("Wybrales TVP1");
                            break;
                        case 2:
                            System.out.println("Wybrales TVP2");
                            break;
                        case 3:
                            System.out.println("Wybrales Polsat");
                            break;
                        case 4:
                            System.out.println("Wybrales TVN");
                            break;
                        case 0:
                        channel=4;
                            System.out.println("Wybrales TVN");
                            break;
                    }
                    break;
                    default:
                        System.out.println("Zly przycisk");
                        break;
            }

        }
        else{
            check="off";
        }

    }

    public void stan(){
        boolean on = check.equals("on");
        boolean off = check.equals("off");

                while(on||off){
                    if(on){
                        channels();
                    }
                    else if(off){
                        getcheck();
                    }
                }


    }

}
