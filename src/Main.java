import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("A simple window");
        jFrame.setSize(400, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        container.setLayout(new FlowLayout());
        JButton jButton = new JButton("Press me!");
        JTextField jTextField = new JTextField(15);
        JButton wrongButton = new JButton();
        jButton.addActionListener((actionEvent)-> { //лямбда выражение
            String s = JOptionPane.showInputDialog("Enter any text:");
            jTextField.setText(s);
        }
        );
        container.add(jTextField);
        container.add(jButton);


        jFrame.setVisible(true);
    }
}