import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel myPanel;
    private JTextField display;
    private JPanel keysPanel;
    private JButton ACButton;
    private JButton backspaceButton;
    private JButton changeSignButton;
    private JButton addButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton minusButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton multiplyButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton divideButton;
    private JButton doubleZeroButton;
    private JButton zeroButton;
    private JButton pointButton;
    private JButton resultButton;
    private String opA;
    private String opB;
    private String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               display.setText("");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"7");
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"6");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"9");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"0");
            }
        });
        doubleZeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() +"00");
            }
        });
        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.isEmpty()){
                    disp = disp.substring(0,disp.length() -1);
                }
                display.setText(disp);
            }
        });
        changeSignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.isEmpty()){
                    if(disp.contains(".")){
                        double doubleDisp = Double.parseDouble(disp);
                        doubleDisp = -doubleDisp;
                        display.setText(Double.toString(doubleDisp));

                    }else{
                        int intDisp = Integer.parseInt(disp);
                        intDisp = -intDisp;
                        display.setText(Integer.toString(intDisp));
                    }

                    }
                }
            });

        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.contains(".")){
                    disp  = disp + ".";
                    display.setText(disp);
                }


            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.isEmpty()){
                    opA = disp;
                    op = "+";
                    display.setText("");

                }

            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.isEmpty()){
                    opA = disp;
                    op = "-";
                    display.setText("");

                }

            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.isEmpty()){
                    opA = disp;
                    op = "*";
                    display.setText("");

                }

            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if(!disp.isEmpty()){
                    opA = disp;
                    op = "/";
                    display.setText("");

                }

            }
        });

        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disp = display.getText();
                if (!disp.isEmpty() && !op.isEmpty()) {
                    opB = disp;
                    double a = Double.parseDouble(opA);
                    double b = Double.parseDouble(opB);
                    String result ="";
                    if (op.equals("+")) {
                        result = Double.toString(a + b);


                    } else if (op.equals("-")) {
                        result = Double.toString(a - b);

                    } else if (op.equals("*")) {
                        result = Double.toString(a * b);
                    } else if (op.equals("/")) {
                        result = Double.toString(a / b);
                    }
                    display.setText(result);
                }
            }
        });
    }

    public JPanel getRoot(){
        return myPanel;

    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane((new Calculator()).getRoot());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
