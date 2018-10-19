package OkienkowyZmianaKolorow;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class buttonTlo extends JButton implements ActionListener {

    buttonTlo(){
        super("Drugi");
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.BLUE); //zmiana koloru przycisku
    }
}
