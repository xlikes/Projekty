package OkienkowyZmianaKolorow;
import java.util.Random;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton green;
    private JButton blue;
    private JButton red;
    private JButton random;
    private JButton tlo;
    private JButton zmianaNazwy;




    public ButtonPanel(){
        green = new JButton("Green");
        blue = new JButton("Blue");
        red = new JButton("Red");
        random = new JButton("Losowy");
        tlo = new buttonTlo(); //Dodany przycisk z klasy buttonTlo
        zmianaNazwy = new zmianaNazwy(); // dodany przycisk z klasy zmianaNazwy



        green.addActionListener(this);
        blue.addActionListener(this);
        red.addActionListener(this);
        random.addActionListener(this);


        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(green);
        add(blue);
        add(red);
        add(random);
        add(tlo);
        add(zmianaNazwy);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source==green){
            setBackground(Color.GREEN);
        }
        else if(source==blue){
            setBackground(Color.BLUE);
        }
        else if(source==red){
            setBackground(Color.RED);
        }
        else if(source==random){
            Random random = new Random();
            int a = random.nextInt(4);
            switch(a){
                case 0:
                    setBackground(Color.PINK);
                    break;
                case 1:
                    setBackground(Color.BLACK);
                    break;
                case 2:
                    setBackground(Color.GRAY);
                    break;
                case 3:
                    setBackground(Color.YELLOW);
                    break;
            }
        }
        }

    }
