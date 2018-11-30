package LicznikKalori;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LicznikKalori extends JFrame implements ActionListener {

    private JLabel lname,lplec,lWaga,lWzrost,lWiek,lAktywnosc,lCel,lKalorie,lBialko,lWegle,lTluszcze;

    ButtonGroup bgPlec,bgAktywnosc,bgCel;
    JRadioButton rMan, rWoman,rNiska,rSrednia,rWysoka,rSchu,rUtrz,rPrzyt;
    JTextField tWaga,tWzrost,tWiek;
    JButton bOblicz;

    double cel,manWoman,aktywnosc,waga,wzrost,wiek,wynik;
    boolean blad;

    public LicznikKalori(){
    setSize(300,620);
    setTitle("Obliczanie Kalori");
    setLayout(null);

        //Buttony
    bOblicz = new JButton("Oblicz kalorie");
    bOblicz.setBounds(64,440,150,30);
    bOblicz.addActionListener(this);
    add(bOblicz);

        //Etykiety
    lname = new JLabel("Licznik Kalori"); // naglowek
    lname.setBounds(40,10,200,30);
    lname.setFont(new Font("SansSerif", Font.BOLD,30));
    add(lname);

    lplec = new JLabel("Płeć"); // wybiera plec naglowek
    lplec.setBounds(19,65,100,20);
    lplec.setFont(new Font("SansSerif",Font.BOLD,16));
    add(lplec);

    lWaga = new JLabel("Waga           kg");
    lWaga.setBounds(20,122,150,20);
    add(lWaga);
    lWzrost = new JLabel("Wzrost        cm");
    lWzrost.setBounds(20,146,150,20);
    add(lWzrost);
    lWiek = new JLabel("Wiek            lata");
    lWiek.setBounds(20,170,150,20);
    add(lWiek);


    lAktywnosc = new JLabel("Jak duża jest twoja aktywnosc");
    lAktywnosc.setBounds(19,200,300,30);
    lAktywnosc.setFont(new Font("SansSerif",Font.BOLD,16));
    add(lAktywnosc);

    lCel = new JLabel("Jaki jest twój cel");
    lCel.setBounds(19,306,300,30);
    lCel.setFont(new Font("SansSerif",Font.BOLD,16));
    add(lCel);

    lKalorie = new JLabel();
    lKalorie.setBounds(20,480,150,30);
    add(lKalorie);

    lBialko = new JLabel();
    lBialko.setBounds(20,500,150,30);
    add(lBialko);

    lWegle = new JLabel();
    lWegle.setBounds(20,520,150,30);
    add(lWegle);

    lTluszcze = new JLabel();
    lTluszcze.setBounds(20,540,150,30);
    add(lTluszcze);

        // Radio
    rWoman = new JRadioButton("Kobieta",true);
    rWoman.setBounds(14,92,80,20);
    add(rWoman);
    rMan = new JRadioButton("Mezczyzna");
    rMan.setBounds(100,92,100,20);
    add(rMan);

    rNiska = new JRadioButton("Niska       (0-1 Trenig w tygodniu)",true);
    rNiska.setBounds(14,240,250,20);
    add(rNiska);
    rSrednia = new JRadioButton("Srednia   (2-4 Treningi w tygodniu)");
    rSrednia.setBounds(14,260,250,20);
    add(rSrednia);
    rWysoka = new JRadioButton("Wysoka  (5 i wiecej treningów w tygodniu)");
    rWysoka.setBounds(14,280,270,20);
    add(rWysoka);

    rSchu = new JRadioButton("Zrzucić wagę",true);
    rSchu.setBounds(14,346,250,20);
    add(rSchu);
    rUtrz = new JRadioButton("Utrzymać wagę");
    rUtrz.setBounds(14,370,250,20);
    add(rUtrz);
    rPrzyt = new JRadioButton("Zwiekszyć wage)");
    rPrzyt.setBounds(14,394,270,20);
    add(rPrzyt);

        // Grupy radio
        bgPlec = new ButtonGroup(); // stworzenie grupy dla plci
        bgPlec.add(rWoman);
        bgPlec.add(rMan);

        bgAktywnosc = new ButtonGroup(); // grupa dla treningow
        bgAktywnosc.add(rNiska);
        bgAktywnosc.add(rSrednia);
        bgAktywnosc.add(rWysoka);

        bgCel = new ButtonGroup(); // grupa dla Celi
        bgCel.add(rSchu);
        bgCel.add(rUtrz);
        bgCel.add(rPrzyt);


        // Pola Tekstowe
        tWaga = new JTextField();
        tWaga.setBounds(110,124,150,20);
        add(tWaga);

        tWzrost = new JTextField();
        tWzrost.setBounds(110,148,150,20);
        add(tWzrost);

        tWiek = new JTextField();
        tWiek.setBounds(110,172,150,20);
        add(tWiek);
    }

    public static void main(String args[]){
        LicznikKalori aplikacja = new LicznikKalori();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent d) {
        Object source = d.getSource(); // dodanie zrodla

        ManWoman sprawdzPlec = new ManWoman();
        Aktywnosc sprawdzAktwnosc = new Aktywnosc();
        Cel sprawdzCel = new Cel();
        WagaWzrostWiek sprawdzParametry = new WagaWzrostWiek();

        if(source==bOblicz){
            wynik=0;
            sprawdzParametry.wybierzParametry(tWaga,tWzrost,tWiek); // sprawdzamy parametry waga wzrost i wiek
            sprawdzPlec.wybierzPlec(rWoman,rMan); // sprawdzamy plec
            sprawdzAktwnosc.wybierzAktywnosc(rNiska,rSrednia,rWysoka); // sprawdzamy aktywnosc
            sprawdzCel.wybierzCel(rSchu,rUtrz,rPrzyt); // sprawdzamy cel

            wynik=(((9.99*sprawdzParametry.waga)+(6.25*sprawdzParametry.wzrost)-
                    (4.92*sprawdzParametry.wiek))*sprawdzAktwnosc.aktywnosc)
                    +sprawdzPlec.manWoman+sprawdzCel.cel; // wzor na oblicznie kalori


                if(sprawdzParametry.blad==false) { // jesli niema bledu
                    lKalorie.setText("Kalorie:   " + (int) wynik + " kcal"); // wypisanie wyniku
                    lBialko.setText("Białko:   " + (int) (0.3 * wynik) + " kcal");
                    lWegle.setText("Węglowodany:   " + (int) (0.5 * wynik) + " kcal");
                    lTluszcze.setText("Tluszcze:   " + (int) (0.2 * wynik) + " kcal");
                }else if(sprawdzParametry.blad==true){ // jesli mamy blad w danych
                    lKalorie.setText("Blad niepoprawne dane"); // wypisanie bledu
                    lBialko.setText("");
                    lWegle.setText("");
                    lTluszcze.setText("");
                }


        }
    }
}
