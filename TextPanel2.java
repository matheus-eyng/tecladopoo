import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel2 extends JPanel {

    private JTextArea textArea;
    private JLabel displayPangrama;
    private String pan = "Um pequeno jabuti xereta viu dez cegonhas felizes";
    private String line1 = "";
    private String erros = "";
    private Score score;

    public TextPanel2() {
        
        super();
        setLayout(new BorderLayout());
        score = new Score();

        textArea = new JTextArea(10, 40);
        displayPangrama = new JLabel(pan);
        add(textArea, BorderLayout.NORTH);
        add(displayPangrama, BorderLayout.CENTER);

    }
}