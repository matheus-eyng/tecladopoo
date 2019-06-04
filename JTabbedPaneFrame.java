import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class JTabbedPaneFrame extends JFrame {
	
	Score score = new Score();

	
	// set up GUI
	public JTabbedPaneFrame() {
        super("JTabbedPane Demo ");

		JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane
        // set up pane11 and add it to JTabbedPane
        TecladoPanel calculadora = new TecladoPanel();
		TextPanel2 texto = new TextPanel2();
		
		// Tab 1
		FramePrincipal teclado = new FramePrincipal();
		JLabel label1 = new JLabel( "panel um");
        JPanel panel1 = new JPanel(); // create first panel
        panel1.add(teclado);
		tabbedPane.addTab( "Digitação", null, panel1, "Primeiro Panel" );
		
		// Tab 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
		RadioButtonPanel radioButtonPanel = new RadioButtonPanel();
		panel2.add(radioButtonPanel, BorderLayout.CENTER);
		tabbedPane.addTab("Selecao", null, panel2, "Segundo Panel");
		
		// Tab 3
		JPanel panel3 = new JPanel(); // create third panel
		panel3.setLayout( new BorderLayout() ); // use borderlayout
		JTextArea textAreaHistorico = new JTextArea(30,50);
		panel3.add( textAreaHistorico, BorderLayout.CENTER );
		tabbedPane.addTab( "Histórico", null, panel3, "Terceiro Panel" );
		
		add( tabbedPane ); // add JTabbedPane to frame
	}

}