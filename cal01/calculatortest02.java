import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculatortest02 implements ActionListener {
    Boolean isOperationUsed = false;
    String Oldvalue;
    JFrame jf;
    JLabel displayJLabel;
    JButton nineButton;
    JButton eightButton;
    JButton sevenButton;
    JButton divideButton;
    JButton sixButton;
    JButton fiveButton;
    JButton fourButton;
    JButton multiplyButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton minusButton;
    JButton decimalButton;
    JButton zeroButton;
    JButton equallButton;
    JButton plusButton;
    JButton ClearButton;

    public calculatortest02() {
        jf = new JFrame("Calculator Standard");
        jf.setLayout(null);
        jf.setSize(650, 700);
        jf.setLocation(200, 300);

        displayJLabel = new JLabel();
        displayJLabel.setBounds(30, 50, 540, 40);
        displayJLabel.setBackground(Color.gray);
        displayJLabel.setOpaque(true);
        displayJLabel.setHorizontalAlignment(SwingConstants.LEFT);
        displayJLabel.setForeground(Color.WHITE);
        jf.add(displayJLabel);

        nineButton = new JButton("9");
        nineButton.setBounds(30, 120, 90, 90);
        nineButton.setFont(new Font("Arial", Font.BOLD, 20));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        eightButton = new JButton("8");
        eightButton.setBounds(180, 120, 90, 90);
        eightButton.setFont(new Font("Arial", Font.BOLD, 20));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(330, 120, 90, 90);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 20));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        divideButton = new JButton("/");
        divideButton.setBounds(470, 120, 60, 60);
        divideButton.setFont(new Font("Arial", Font.BOLD, 15));
        divideButton.addActionListener(this);
        jf.add(divideButton);

        sixButton = new JButton("6");
        sixButton.setBounds(30, 240, 90, 90);
        sixButton.setFont(new Font("Arial", Font.BOLD, 20));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(180, 240, 90, 90);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 20));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        fourButton = new JButton("4");
        fourButton.setBounds(330, 240, 90, 90);
        fourButton.setFont(new Font("Arial", Font.BOLD, 20));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(470, 200, 60, 60);
        multiplyButton.setFont(new Font("Arial", Font.BOLD, 15));
        multiplyButton.addActionListener(this);
        jf.add(multiplyButton);

        threeButton = new JButton("3");
        threeButton.setBounds(30, 360, 90, 90);
        threeButton.setFont(new Font("Arial", Font.BOLD, 20));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        twoButton = new JButton("2");
        twoButton.setBounds(180, 360, 90, 90);
        twoButton.setFont(new Font("Arial", Font.BOLD, 20));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        oneButton = new JButton("1");
        oneButton.setBounds(330, 360, 90, 90);
        oneButton.setFont(new Font("Arial", Font.BOLD, 20));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        minusButton = new JButton("-");
        minusButton.setBounds(470, 280, 60, 60);
        minusButton.setFont(new Font("Arial", Font.BOLD, 15));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        decimalButton = new JButton(".");
        decimalButton.setBounds(30, 480, 90, 90);
        decimalButton.setFont(new Font("Arial", Font.BOLD, 20));
        decimalButton.addActionListener(this);
        jf.add(decimalButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(180, 480, 90, 90);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 480, 90, 90);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        equallButton = new JButton("=");
        equallButton.setBounds(470, 360, 60, 60);
        equallButton.setFont(new Font("Arial", Font.BOLD, 15));
        equallButton.addActionListener(this);
        jf.add(equallButton);

        ClearButton = new JButton("CE");
        ClearButton.setBounds(470, 450, 60, 118);
        ClearButton.setFont(new Font("Arial", Font.BOLD, 15));
        ClearButton.addActionListener(this);
        jf.add(ClearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new calculatortest02();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nineButton) {
            if (isOperationUsed) {
                displayJLabel.setText("9");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "9");
            }
        } else if (e.getSource() == eightButton) {
            if (isOperationUsed) {
                displayJLabel.setText("8");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "8");
            }

        } else if (e.getSource() == sevenButton) {
            if (isOperationUsed) {
                displayJLabel.setText("7");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "7");
            }

        } else if (e.getSource() == sixButton) {
            if (isOperationUsed) {
                displayJLabel.setText("6");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "6");
            }

        } else if (e.getSource() == fiveButton) {
            if (isOperationUsed) {
                displayJLabel.setText("5");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "5");
            }

        } else if (e.getSource() == fourButton) {
            if (isOperationUsed) {
                displayJLabel.setText("4");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "4");
            }

        } else if (e.getSource() == threeButton) {
            if (isOperationUsed) {
                displayJLabel.setText("3");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "3");
            }

        } else if (e.getSource() == twoButton) {
            if (isOperationUsed) {
                displayJLabel.setText("2");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "2");
            }

        } else if (e.getSource() == oneButton) {
            if (isOperationUsed) {
                displayJLabel.setText("1");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "1");
            }

        } else if (e.getSource() == zeroButton) {
            if (isOperationUsed) {
                displayJLabel.setText("0");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "0");
            }

        } else if (e.getSource() == decimalButton) {
            displayJLabel.setText(displayJLabel.getText() + ".");
            // ********************** */
        } else if (e.getSource() == equallButton) {
            String NewValue = displayJLabel.getText();
            float OldvalueF = Float.parseFloat(Oldvalue);
            float NewValueF = Float.parseFloat(NewValue);
            float Result = NewValueF + OldvalueF;
            displayJLabel.setText(Result + "");
            // ********************** */
        } else if (e.getSource() == plusButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            // ********************** */
        } else if (e.getSource() == divideButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            // *****************
        } else if (e.getSource() == multiplyButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            // ********************** */
        } else if (e.getSource() == minusButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            // ********************** */
        } else if (e.getSource() == ClearButton) {
            displayJLabel.setText("");
            // ********************** */
        }

    }
}
