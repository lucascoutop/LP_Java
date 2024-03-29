import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraJFrame extends JFrame implements ActionListener {
    private JTextField display;

    public CalculadoraJFrame() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        JButton button7 = createButton("7");
        JButton button8 = createButton("8");
        JButton button9 = createButton("9");
        JButton buttonDivide = createButton("/");
        JButton button4 = createButton("4");
        JButton button5 = createButton("5");
        JButton button6 = createButton("6");
        JButton buttonMultiply = createButton("*");
        JButton button1 = createButton("1");
        JButton button2 = createButton("2");
        JButton button3 = createButton("3");
        JButton buttonSubtract = createButton("-");
        JButton button0 = createButton("0");
        JButton buttonDecimal = createButton(".");
        JButton buttonEquals = createButton("=");
        JButton buttonAdd = createButton("+");

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonSubtract);
        panel.add(button0);
        panel.add(buttonDecimal);
        panel.add(buttonEquals);
        panel.add(buttonAdd);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(this);
        return button;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            display.setText(display.getText());
        } else {
            display.setText(display.getText() + command);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraJFrame();
            }
        });
    }
}
