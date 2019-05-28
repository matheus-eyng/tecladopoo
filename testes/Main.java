import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TextPanel frame = new TextPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}