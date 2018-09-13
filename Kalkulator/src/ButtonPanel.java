import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT=400;
    public static final int WIDTH =300;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;

            public ButtonPanel() {

                oneButton = new JButton("1");
                twoButton = new JButton("2");
                threeButton = new JButton("3");

                oneButton.addActionListener(this);
                twoButton.addActionListener(this);
                threeButton.addActionListener(this);

                setLayout(new FlowLayout());
                setPreferredSize(new Dimension(WIDTH, HEIGHT));
                add(oneButton);
                add(twoButton);
                add(threeButton);
            }

        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();

            if(source==oneButton)
                System.out.println("1");

                }

            }

