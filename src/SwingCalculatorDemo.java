// Write a Java program that works as a simple calculator. Arrange Buttons for digits and
// the + - * % operations properly. Add a text field to display the result. Handle any possible
// exceptions like divide by zero. Use Java Swing. 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwingCalculatorDemo {
    JFrame frame = new JFrame("Calculator");
    JTextField textField = new JTextField();
    boolean operUsed = false, toReset=false;
    String lastOper = "";
    float a, b, result;

    SwingCalculatorDemo() {
        frame.setSize(450,550);
        frame.setLayout(null);
        textField.setBounds(50,50,320,40);
        textField.setEditable(false);
        frame.add(textField);
        String buttonText[] = {"7", "8", "9", "4","5","6", "1","2","3","0"};
        int i, j;
        JButton buttons[]=new JButton[16];
        // JButton bsum[]= new JButton[10]; bdif, bprod, bdiv, beq, bClr;
        for(i=0; i<4; i++)
            for(j=0; j<3; j++){
                buttons[i*3+j]=new JButton(buttonText[i*3+j]);
                buttons[i*3+j].setBounds(50+j*80,100+i*80,80,80);
                frame.add(buttons[i*3+j]);
                    buttons[i*3+j].setActionCommand(buttonText[i*3+j]);
                    buttons[i*3+j].addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(toReset){
                                textField.setText("");
                                toReset=false;
                            }
                            textField.setText(textField.getText()+e.getActionCommand());
                        }
                    });
                if(i==3) break;
            }
        JButton operButtons[] = new JButton[4];
        String operButtonsText[] = {"+", "-", "*", "/"};
        for(i=0; i<4; i++) {
            operButtons[i] = new JButton(operButtonsText[i]);
            operButtons[i].setBounds(290,100+80*i,80,80);
            frame.add(operButtons[i]);
            operButtons[i].setActionCommand(operButtonsText[i]);
            operButtons[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operUsed){
                        b = Integer.parseInt(textField.getText());
                        operate();
                    }
                    else{
                        a = Integer.parseInt(textField.getText());
                        textField.setText("");
                        lastOper = e.getActionCommand();
                        operUsed = true;
                    }
                }
            });
        }
        JButton clear = new JButton("Clear");
        clear.setBounds(130,340,80,80);
        frame.add(clear);
        clear.setAction(new AbstractAction("Clear") {
            public void actionPerformed(ActionEvent e) {
                clearScreen();
            }
        });

        JButton equal = new JButton("=");
        equal.setBounds(210,340,80,80);
        frame.add(equal);
        equal.setAction(new AbstractAction("=") {
            public void actionPerformed(ActionEvent e) {
                b = Integer.parseInt(textField.getText());
                operate();
            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    void clearScreen(){
        textField.setText("");    
        operUsed = false;
    }

    void operate(){
        if(lastOper.equals("+")) result = a + b;
        else if(lastOper.equals("-")) result = a - b;
        else if(lastOper.equals("*")) result = a * b;
        else if(lastOper.equals("/")) result = a / b;
        textField.setText(Float.toString(result));
        operUsed = false;
        toReset = true;
    }
    public static void main(String[] args){
        SwingCalculatorDemo swingcd = new SwingCalculatorDemo();
    }

}