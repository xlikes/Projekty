package LicznikKalori;

import javax.swing.*;

public class Aktywnosc extends LicznikKalori{

    public void wybierzAktywnosc(JRadioButton a,JRadioButton b, JRadioButton c){
        if(a.isSelected()){
            //niska
            aktywnosc=1.1; // zmienna odpowiadajaca za mnoznik aktywnosci
        }
        else if(b.isSelected()){
            //srednia
            aktywnosc=1.2;
        }
        else if(c.isSelected()){
            //wysoka
            aktywnosc=1.4;
        }
    }
}
