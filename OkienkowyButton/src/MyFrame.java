import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    public MyFrame(){
        super("Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);
        setLocation(100,100);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,30)); //FlowLayout ustawiamy left right center
    //hgap odstepy w poziomie, vgap odstepy w pionie
        add(new JButton("Button 1")); //Dodanie nowego przycisku
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));

        setVisible(true);


    }


}
