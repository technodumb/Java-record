import java.awt.Color;

import javax.swing.*;

public class SwingTraffic {
    SwingTraffic(){
        JFrame background = new JFrame();
        JPanel panels[] = new JPanel[7];
        for(int i = 0; i < 7; i++){
            panels[i] = new JPanel();
            panels[i].setBackground(Color.BLACK);
        }
        
        JRadioButton lights[] = new JRadioButton[3];
        String butNames[] = {"Start", "Wait", "STOP"};
        for(int i = 0; i < 3; i++){
            lights[i] = new JRadioButton();
            
        }
        lights[0] = new JRadioButton("Start");
        lights[0].setBounds(100+40, 200, 30, 30);
        lights[1] = new JRadioButton("Wait");
        lights[1].setBounds(100+80, 200, 30, 30);

        lights[2] = new JRadioButton("STOP");
        lights[2].setBounds(100+120, 200, 30, 30);
        ButtonGroup bgroup = new ButtonGroup();
        for(int i = 0; i <3; i++){
            bgroup.add(lights[1]);
            background.add(lights[1]);

        }
        background.setLayout(null);
        background.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        background.setVisible(true);
        

    }

    public static void main(String[] args) {
        new SwingTraffic();
    }
}
