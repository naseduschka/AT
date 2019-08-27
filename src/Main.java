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
        jButton.addActionListener((actionEvent)-> { //лямбда выражение
            JOptionPane.showMessageDialog(null, "The button was pressed");
        }
        );
        container.add(jButton);


        jFrame.setVisible(true);
    }
}