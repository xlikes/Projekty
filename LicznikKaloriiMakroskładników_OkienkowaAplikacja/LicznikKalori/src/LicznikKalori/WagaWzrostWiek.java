package LicznikKalori;

import javax.swing.*;

public class WagaWzrostWiek extends LicznikKalori{
    public void wybierzParametry(JTextField a,JTextField b,JTextField c){
        blad=false; //
        try {
            waga = Double.parseDouble(a.getText()); // pobieramy wage i zmieniamy na double
            wzrost = Double.parseDouble(b.getText()); //pobieramy wzrost zmieniamy na double
            wiek = Double.parseDouble(c.getText()); // pobieramy wiek zmieniamy na double
            if((waga>25&&waga<150)&&(wzrost<220&&wzrost>100)&&(wiek>10&&wiek<110)){ // sprawdzamy minimalne i maksymalne wartosci
                blad =false;
            }else{
                blad=true;
            }
        } catch (NumberFormatException e) { // jesli pole jest puste bądź wprowadzono zle wartosci
        blad=true;
    }

    }
}
