import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextPanel extends JFrame {
    private JTextArea textArea;
    private JLabel displayPangrama;
    private String pan = "Um pequeno jabuti xereta viu dez cegonhas felizes";
    private String line1 = "";
    private String erros = "";
    private Score score;

    public TextPanel() {
        super("Panel Teste");
        setLayout(new FlowLayout());
        Listener listener = new Listener();
        score = new Score();

        textArea = new JTextArea(10, 30);
        displayPangrama = new JLabel(pan);
        add(textArea);
        add(displayPangrama);
        textArea.addKeyListener(listener);

    }

    private class Listener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent event) {
            if(event.getKeyCode() == 10) {  // 10 representa a tecla enter
                textArea.setText(line1 + " essa é a string"); // teste
                String textString = textArea.getText(); // mandar essa String para o documento HISTORICO
                score.analyze(pan, erros);
                textArea.setText("Erros: " + score.getErros() + "\nAcertos: " + score.getAcertos() + "\n" + erros + "\n" + pan);

            }
        }

        @Override
        public void keyReleased(KeyEvent event) {

        }

        @Override
        public void keyTyped(KeyEvent event) {
            line1 = String.format(line1 + "%s", event.getKeyChar()); // mostra a tecla
            erros = erros + (event.getKeyChar()); // String que salva TUDO o que foi digitado
        }
    }
}
