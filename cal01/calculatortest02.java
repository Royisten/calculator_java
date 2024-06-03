
// Import necessary classes from Java's built-in libraries
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

// Declare a public class named 'calculatortest02' that implements the 'ActionListener' interface
public class calculatortest02 implements ActionListener {

    // Declare variables that will be used throughout the class
    Boolean isOperationUsed = false;// A flag to check if an operation button was pressed
    String Oldvalue; // String to store the value before pressing an operator
    String operator = "";// used string for action implemented by operators
    JFrame jf;// JFrame is the main window for our calculator
    JLabel displayJLabel;// JLabel is used to display the numbers and results

    // Buttons for numbers, operators, decimal point, equals, and clear
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

    // Constructor method to set up the calculator's GUI
    public calculatortest02() {
        // Initialize the JFrame (window) and set its title, layout, size, and position
        jf = new JFrame("Calculator Standard");
        jf.setLayout(null);// Using null layout to manually set positions of components
        jf.setSize(650, 700);// Set the size of the window
        jf.setLocation(200, 300);// Set the position of the window on the screen
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);// set the background color

        // Initialize the display label and set its properties like position, size,
        // color, and text alignment
        displayJLabel = new JLabel();
        displayJLabel.setBounds(30, 50, 500, 45);
        displayJLabel.setBackground(Color.gray);
        displayJLabel.setOpaque(true);// Make the background color visible
        displayJLabel.setHorizontalAlignment(SwingConstants.LEFT);// Align text to the left
        displayJLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        displayJLabel.setForeground(Color.BLACK);// Text color
        displayJLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));// border(+color) and thickness
        jf.add(displayJLabel);// Add the label to the JFrame

        // Initialize number buttons (0-9) and set their properties
        // Each button is set with text, position, size, font, and an action listener
        nineButton = new JButton("9");
        nineButton.setBounds(30, 120, 90, 90);// Position and size
        nineButton.setFont(new Font("Arial", Font.BOLD, 20));// Font style and size
        nineButton.setBorder(new LineBorder(Color.BLACK));// button border
        nineButton.addActionListener(this);// Add action listener for button click
        jf.add(nineButton);// Add button to JFrame

        eightButton = new JButton("8");
        eightButton.setBounds(180, 120, 90, 90);
        eightButton.setFont(new Font("Arial", Font.BOLD, 20));
        eightButton.setBorder(new LineBorder(Color.BLACK));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(330, 120, 90, 90);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 20));
        sevenButton.setBorder(new LineBorder(Color.BLACK));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        divideButton = new JButton("/");
        divideButton.setBounds(470, 120, 60, 60);
        divideButton.setFont(new Font("Arial", Font.BOLD, 15));
        divideButton.setBorder(new LineBorder(Color.BLACK));
        divideButton.addActionListener(this);
        jf.add(divideButton);

        sixButton = new JButton("6");
        sixButton.setBounds(30, 240, 90, 90);
        sixButton.setFont(new Font("Arial", Font.BOLD, 20));
        sixButton.setBorder(new LineBorder(Color.BLACK));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(180, 240, 90, 90);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 20));
        fiveButton.setBorder(new LineBorder(Color.BLACK));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        fourButton = new JButton("4");
        fourButton.setBounds(330, 240, 90, 90);
        fourButton.setFont(new Font("Arial", Font.BOLD, 20));
        fourButton.setBorder(new LineBorder(Color.BLACK));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(470, 200, 60, 60);
        multiplyButton.setFont(new Font("Arial", Font.BOLD, 15));
        multiplyButton.setBorder(new LineBorder(Color.BLACK));
        multiplyButton.addActionListener(this);
        jf.add(multiplyButton);

        threeButton = new JButton("3");
        threeButton.setBounds(30, 360, 90, 90);
        threeButton.setFont(new Font("Arial", Font.BOLD, 20));
        threeButton.setBorder(new LineBorder(Color.BLACK));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        twoButton = new JButton("2");
        twoButton.setBounds(180, 360, 90, 90);
        twoButton.setFont(new Font("Arial", Font.BOLD, 20));
        twoButton.setBorder(new LineBorder(Color.BLACK));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        oneButton = new JButton("1");
        oneButton.setBounds(330, 360, 90, 90);
        oneButton.setFont(new Font("Arial", Font.BOLD, 20));
        oneButton.setBorder(new LineBorder(Color.BLACK));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        minusButton = new JButton("-");
        minusButton.setBounds(470, 280, 60, 60);
        minusButton.setFont(new Font("Arial", Font.BOLD, 15));
        minusButton.setBorder(new LineBorder(Color.BLACK));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        decimalButton = new JButton(".");
        decimalButton.setBounds(30, 480, 90, 90);
        decimalButton.setFont(new Font("Arial", Font.BOLD, 20));
        decimalButton.setBorder(new LineBorder(Color.BLACK));
        decimalButton.addActionListener(this);
        jf.add(decimalButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(180, 480, 90, 90);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
        zeroButton.setBorder(new LineBorder(Color.BLACK));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 480, 90, 90);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));
        plusButton.setBorder(new LineBorder(Color.BLACK));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        equallButton = new JButton("=");
        equallButton.setBounds(470, 360, 60, 60);
        equallButton.setFont(new Font("Arial", Font.BOLD, 15));
        equallButton.setBorder(new LineBorder(Color.BLACK));
        equallButton.addActionListener(this);
        jf.add(equallButton);

        ClearButton = new JButton("CE");
        ClearButton.setBounds(470, 450, 60, 118);
        ClearButton.setFont(new Font("Arial", Font.BOLD, 15));
        ClearButton.setBorder(new LineBorder(Color.BLACK));
        ClearButton.addActionListener(this);
        jf.add(ClearButton);

        // Make the JFrame visible and set default close operation
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new calculatortest02();
    }

    public void actionPerformed(ActionEvent e) {
        // Handle ClearButton click: reset display and flags
        // Handle operator buttons: set operator and flag for operation used
        // Handle number buttons: update display with numbers
        // Handle equal button: perform calculation based on stored operator
        if (e.getSource() == ClearButton) {
            displayJLabel.setText("");
            Oldvalue = "";
            operator = "";
            isOperationUsed = false;
        } else if (e.getSource() == equallButton) {
            String NewValue = displayJLabel.getText();
            float OldvalueF = Float.parseFloat(Oldvalue);
            float NewValueF = Float.parseFloat(NewValue);
            float Result = 0;

            switch (operator) {
                case "+":
                    Result = OldvalueF + NewValueF;
                    break;
                case "-":
                    Result = OldvalueF - NewValueF;
                    break;
                case "*":
                    Result = OldvalueF * NewValueF;
                    break;
                case "/":
                    Result = OldvalueF / NewValueF;
                    break;
                default:
                    break;
            }
            displayJLabel.setText(Result + "");

        } else if (e.getSource() == plusButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            operator = "+";
        } else if (e.getSource() == divideButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            operator = "/";
        } else if (e.getSource() == multiplyButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            operator = "*";
        } else if (e.getSource() == minusButton) {
            isOperationUsed = true;
            Oldvalue = displayJLabel.getText();
            operator = "-";
        } else if (e.getSource() == nineButton) {
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
            if (isOperationUsed) {
                displayJLabel.setText(".");
                isOperationUsed = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + ".");
            }

        }

    }
}
