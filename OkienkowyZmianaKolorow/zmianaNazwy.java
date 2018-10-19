package OkienkowyZmianaKolorow;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class zmianaNazwy extends JButton implements ActionListener {

    private boolean wcisniety = false;

    zmianaNazwy(){
        super("Nie Wcisniety");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(wcisniety) {
            setText("Wcisniety");
        }
        else{
            setText("Nie Wcisniety");
            wcisniety=!wcisniety;
        }
        }
}
