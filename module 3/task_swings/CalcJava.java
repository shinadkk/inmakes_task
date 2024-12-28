package task5;
import java.awt.*;
import java.awt.event.*;

public class CalcJava extends Frame implements ActionListener 
{
    TextField display;
    Panel panel;
    String[] buttons = 
    	{
        "7", "8", "9", "/", 
        "4", "5", "6", "*", 
        "1", "2", "3", "-", 
        "0", ".", "=", "+"
    };
    Button[] btn;
    String num1, num2, operator;
 
    public CalcJava() {

        setTitle("Simple Calculator");
        setSize(400, 400);
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));
        
        btn = new Button[buttons.length];
        for (int i = 0; i < buttons.length; i++) 
        {
            btn[i] = new Button(buttons[i]);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }
        add(panel, BorderLayout.CENTER);

        num1 = num2 = operator = "";

        setVisible(true);
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            if (!operator.equals("")) 
            {
                num2 += command;
            } 
            else 
            {
                num1 += command;
            }
            display.setText(num1 + operator + num2);
        } 
        else if (command.equals("=")) 
        {
            double result;
            switch (operator) 
            {
                case "+": result = (Double.parseDouble(num1) + Double.parseDouble(num2)); break;
                case "-": result = (Double.parseDouble(num1) - Double.parseDouble(num2)); break;
                case "*": result = (Double.parseDouble(num1) * Double.parseDouble(num2)); break;
                case "/": result = (Double.parseDouble(num1) / Double.parseDouble(num2)); break;
                default: result = 0;
            }
            display.setText(num1 + operator + num2 + "=" + result);
            num1 = Double.toString(result);
            operator = num2 = "";
        } 
        else 
        {
            if (operator.equals("") || num2.equals("")) 
            {
                operator = command;
            }
            else 
            {
                double result;
                switch (operator) 
                {
                    case "+": result = (Double.parseDouble(num1) + Double.parseDouble(num2)); 
                    break;
                    case "-": result = (Double.parseDouble(num1) - Double.parseDouble(num2));
                    break;
                    case "*": result = (Double.parseDouble(num1) * Double.parseDouble(num2));
                    break;
                    case "/": result = (Double.parseDouble(num1) / Double.parseDouble(num2)); 
                    break;
                    default: result = 0;
                }
                num1 = Double.toString(result);
                operator = command;
                num2 = "";
            }
            display.setText(num1 + operator + num2);
        }
    }

    public static void main(String[] args) {
        new CalcJava();
    }
}
