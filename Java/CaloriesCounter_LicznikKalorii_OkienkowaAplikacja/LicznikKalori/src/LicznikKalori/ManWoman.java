package LicznikKalori;

import javax.swing.*;

public class ManWoman extends LicznikKalori {

    public void wybierzPlec(JRadioButton a, JRadioButton b){

        if (a.isSelected()){
            //kobieta
            manWoman=-162; // zmienna ustalajaca kalorie ktore sa zalezne od plci
        }
        else if(b.isSelected()){
            //mezczyzna
            manWoman=5;
        }
    }
}
