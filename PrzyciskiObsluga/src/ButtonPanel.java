import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton greenButton;
    private JButton redButton;
    private JButton blueButton;
    private JButton pinkButton;

    public ButtonPanel(){
        greenButton = new JButton("Green");
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        pinkButton = new JButton("Pink");

        greenButton.addActionListener(this);
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        pinkButton.addActionListener(this);


        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(greenButton);
        add(redButton);
        add(blueButton);
        add(pinkButton);
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source==greenButton)
            setBackground(Color.GREEN);
        else if(source==redButton)
            setBackground(Color.RED);
        else if(source==blueButton)
            setBackground(Color.BLUE);
        else if(source==pinkButton)
            setBackground(Color.PINK);

    }

}
