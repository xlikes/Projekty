package LicznikKalori;

import javax.swing.*;

public class Cel extends LicznikKalori {

    public void wybierzCel(JRadioButton a, JRadioButton b, JRadioButton c){
        if(a.isSelected()){
            //schudnac
            cel=-200; // zmienna ustalajaca kalorie wedlug celu
        }
        else if(b.isSelected()){
            //utrzymac wage
            cel=0;
        }
        else if(c.isSelected()){
            //przytyc
            cel=200;
        }
    }
}
