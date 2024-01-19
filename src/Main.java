import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Frame ");
        frame.setContentPane(new form1().menuPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.pack();
        frame.setVisible(true);
    }
}
