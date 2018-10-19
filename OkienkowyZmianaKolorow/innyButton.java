package OkienkowyZmianaKolorow;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class innyButton extends JButton implements ActionListener{

    innyButton(){
        super("innyButton");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        setBackground(Color.BLUE);
    }
}
