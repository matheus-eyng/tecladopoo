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
		JLabel label1 = new JLabel( "panel um");
        JPanel panel1 = new JPanel(); // create first panel
        panel1.setLayout(new BorderLayout());
        panel1.add(texto, BorderLayout.NORTH);
        panel1.add(calculadora, BorderLayout.CENTER); // add label to panel
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

	public void keyAction(char c, int linha, int coluna) {
		this.calculadora.trocaCor(c,linha,coluna);
	}

	    private class Listener implements KeyListener {

	        @Override
	        public void keyPressed(KeyEvent event) {
	            if (event.getKeyCode() == 10) {  // 10 representa a tecla enter
	                String textString = texto.getText(); // mandar essa String para o documento Log.txt
	                score.analyze(pan, erros);
	                textArea.setText("Erros: " + score.getErros() + "\nAcertos: " + score.getAcertos());
	                
	                // Cria o arquivo (se nao houver nenhum) com o log do que ja foi digitado e adiciona o pangrama atual.
	                CreateSequencialFile newLog = new CreateSequencialFile();
	                newLog.openFile();
	                newLog.addRecords(textString);
	                newLog.closeFile();
	            }
	            int x = 1000000;
	            int z = 0;
	            int y= 0;
	            if(event.getKeyCode() == 192)
	            	JTabbedPaneFrame.this.keyAction('p',1,0);
	            if(event.getKeyCode() == 49)
	            	JTabbedPaneFrame.this.keyAction('p',1,1);
	            if(event.getKeyCode() == 50)
	            	JTabbedPaneFrame.this.keyAction('p',1,2);
	            if(event.getKeyCode() == 51)
	            	JTabbedPaneFrame.this.keyAction('p',1,3);
	            if(event.getKeyCode() == 52)
	            	JTabbedPaneFrame.this.keyAction('p',1,4);
	            if(event.getKeyCode() == 53)
	            	JTabbedPaneFrame.this.keyAction('p',1,5);
	            if(event.getKeyCode() == 54)
	            	JTabbedPaneFrame.this.keyAction('p',1,6);
	            if(event.getKeyCode() == 55)
	            	JTabbedPaneFrame.this.keyAction('p',1,7);
	            if(event.getKeyCode() == 56)
	            	JTabbedPaneFrame.this.keyAction('p',1,8);
	            if(event.getKeyCode() == 57)
	            	JTabbedPaneFrame.this.keyAction('p',1,9);
	            if(event.getKeyCode() == 48)
	            	JTabbedPaneFrame.this.keyAction('p',1,10);
	            if(event.getKeyCode() == 189)
	            	JTabbedPaneFrame.this.keyAction('p',1,11);
	            if(event.getKeyCode() == 187)
	            	JTabbedPaneFrame.this.keyAction('p',1,12);
	            if(event.getKeyCode() == 8)
	            	JTabbedPaneFrame.this.keyAction('p',1,13);
	            if(event.getKeyCode() == 9)
	            	JTabbedPaneFrame.this.keyAction('p',2,0);
	            if(event.getKeyCode() == 81)
	            	JTabbedPaneFrame.this.keyAction('p',2,1);
	            if(event.getKeyCode() == 87)
	            	JTabbedPaneFrame.this.keyAction('p',2,2);
	            if(event.getKeyCode() == 69)
	            	JTabbedPaneFrame.this.keyAction('p',2,3);
	            if(event.getKeyCode() == 82)
	            	JTabbedPaneFrame.this.keyAction('p',2,4);
	            if(event.getKeyCode() == 84)
	            	JTabbedPaneFrame.this.keyAction('p',2,5);
	            if(event.getKeyCode() == 89)
	            	JTabbedPaneFrame.this.keyAction('p',2,6);
	            if(event.getKeyCode() == 85)
	            	JTabbedPaneFrame.this.keyAction('p',2,7);
	            if(event.getKeyCode() == 73)
	            	JTabbedPaneFrame.this.keyAction('p',2,8);
	            if(event.getKeyCode() == 79)
	            	JTabbedPaneFrame.this.keyAction('p',2,9);
	            if(event.getKeyCode() == 80)
	            	JTabbedPaneFrame.this.keyAction('p',2,10);
	            if(event.getKeyCode() == 219)
	            	JTabbedPaneFrame.this.keyAction('p',2,11);
	            if(event.getKeyCode() == 221)
	            	JTabbedPaneFrame.this.keyAction('p',2,12);
	            if(event.getKeyCode() == 220)
	            	JTabbedPaneFrame.this.keyAction('p',2,13);
	            if(event.getKeyCode() == 20)
	            	JTabbedPaneFrame.this.keyAction('p',3,0);
	            if(event.getKeyCode() == 65)
	            	JTabbedPaneFrame.this.keyAction('p',3,1);
	            if(event.getKeyCode() == 83)
	            	JTabbedPaneFrame.this.keyAction('p',3,2);
	            if(event.getKeyCode() == 68)
	            	JTabbedPaneFrame.this.keyAction('p',3,3);
	            if(event.getKeyCode() == 70)
	            	JTabbedPaneFrame.this.keyAction('p',3,4);
	            if(event.getKeyCode() == 71)
	            	JTabbedPaneFrame.this.keyAction('p',3,5);
	            if(event.getKeyCode() == 72)
	            	JTabbedPaneFrame.this.keyAction('p',3,6);
	            if(event.getKeyCode() == 74)
	            	JTabbedPaneFrame.this.keyAction('p',3,7);
	            if(event.getKeyCode() == 75)
	            	JTabbedPaneFrame.this.keyAction('p',3,8);
	            if(event.getKeyCode() == 76)
	            	JTabbedPaneFrame.this.keyAction('p',3,9);
	            if(event.getKeyCode() == 186)
	            	JTabbedPaneFrame.this.keyAction('p',3,10);
	            if(event.getKeyCode() == 222)
	            	JTabbedPaneFrame.this.keyAction('p',3,11);
	            if(event.getKeyCode() == event.VK_ENTER)
	            	JTabbedPaneFrame.this.keyAction('p',3,12);
	            if(event.getKeyCode() == 16)
	            	JTabbedPaneFrame.this.keyAction('p',4,0);
	            if(event.getKeyCode() == 90)
	            	JTabbedPaneFrame.this.keyAction('p',4,1);
	            if(event.getKeyCode() == 88)
	            	JTabbedPaneFrame.this.keyAction('p',4,2);
	            if(event.getKeyCode() == 67)
	            	JTabbedPaneFrame.this.keyAction('p',4,3);
	            if(event.getKeyCode() == 86)
	            	JTabbedPaneFrame.this.keyAction('p',4,4);
	            if(event.getKeyCode() == 66)
	            	JTabbedPaneFrame.this.keyAction('p',4,5);
	            if(event.getKeyCode() == 78)
	            	JTabbedPaneFrame.this.keyAction('p',4,6);
	            if(event.getKeyCode() == 77)
	            	JTabbedPaneFrame.this.keyAction('p',4,7);
	            if(event.getKeyCode() == 188)
	            	JTabbedPaneFrame.this.keyAction('p',4,8);
	            if(event.getKeyCode() == 190)
	            	JTabbedPaneFrame.this.keyAction('p',4,9);
	            if(event.getKeyCode() == 191)
	            	JTabbedPaneFrame.this.keyAction('p',4,10);
	            if(event.getKeyCode() == 38)
	            	JTabbedPaneFrame.this.keyAction('p',4,11);
	            if(event.getKeyCode() == event.VK_ENTER)
	            	JTabbedPaneFrame.this.keyAction('p',3,12);
	           
	            if(event.getKeyCode() == 32)
	            	JTabbedPaneFrame.this.keyAction('p',5,0);
	            if(event.getKeyCode() == 37)
	            	JTabbedPaneFrame.this.keyAction('p',5,1);
	            if(event.getKeyCode() == 40)
	            	JTabbedPaneFrame.this.keyAction('p',5,2);
	            if(event.getKeyCode() == 39)
	            	JTabbedPaneFrame.this.keyAction('p',5,3);
	            
	        }

	        @Override
	        public void keyReleased(KeyEvent event) {
	        	if(event.getKeyCode() == 192)
	            	JTabbedPaneFrame.this.keyAction('r',1,0);
	            if(event.getKeyCode() == 49)
	            	JTabbedPaneFrame.this.keyAction('r',1,1);
	            if(event.getKeyCode() == 50)
	            	JTabbedPaneFrame.this.keyAction('r',1,2);
	            if(event.getKeyCode() == 51)
	            	JTabbedPaneFrame.this.keyAction('r',1,3);
	            if(event.getKeyCode() == 52)
	            	JTabbedPaneFrame.this.keyAction('r',1,4);
	            if(event.getKeyCode() == 53)
	            	JTabbedPaneFrame.this.keyAction('r',1,5);
	            if(event.getKeyCode() == 54)
	            	JTabbedPaneFrame.this.keyAction('r',1,6);
	            if(event.getKeyCode() == 55)
	            	JTabbedPaneFrame.this.keyAction('r',1,7);
	            if(event.getKeyCode() == 56)
	            	JTabbedPaneFrame.this.keyAction('r',1,8);
	            if(event.getKeyCode() == 57)
	            	JTabbedPaneFrame.this.keyAction('r',1,9);
	            if(event.getKeyCode() == 48)
	            	JTabbedPaneFrame.this.keyAction('r',1,10);
	            if(event.getKeyCode() == 189)
	            	JTabbedPaneFrame.this.keyAction('r',1,11);
	            if(event.getKeyCode() == 187)
	            	JTabbedPaneFrame.this.keyAction('r',1,12);
	            if(event.getKeyCode() == 8)
	            	JTabbedPaneFrame.this.keyAction('r',1,13);
	            if(event.getKeyCode() == 9)
	            	JTabbedPaneFrame.this.keyAction('r',2,0);
	            if(event.getKeyCode() == 81)
	            	JTabbedPaneFrame.this.keyAction('r',2,1);
	            if(event.getKeyCode() == 87)
	            	JTabbedPaneFrame.this.keyAction('r',2,2);
	            if(event.getKeyCode() == 69)
	            	JTabbedPaneFrame.this.keyAction('r',2,3);
	            if(event.getKeyCode() == 82)
	            	JTabbedPaneFrame.this.keyAction('r',2,4);
	            if(event.getKeyCode() == 84)
	            	JTabbedPaneFrame.this.keyAction('r',2,5);
	            if(event.getKeyCode() == 89)
	            	JTabbedPaneFrame.this.keyAction('r',2,6);
	            if(event.getKeyCode() == 85)
	            	JTabbedPaneFrame.this.keyAction('r',2,7);
	            if(event.getKeyCode() == 73)
	            	JTabbedPaneFrame.this.keyAction('r',2,8);
	            if(event.getKeyCode() == 79)
	            	JTabbedPaneFrame.this.keyAction('r',2,9);
	            if(event.getKeyCode() == 80)
	            	JTabbedPaneFrame.this.keyAction('r',2,10);
	            if(event.getKeyCode() == 219)
	            	JTabbedPaneFrame.this.keyAction('r',2,11);
	            if(event.getKeyCode() == 221)
	            	JTabbedPaneFrame.this.keyAction('r',2,12);
	            if(event.getKeyCode() == 220)
	            	JTabbedPaneFrame.this.keyAction('r',2,13);
	            if(event.getKeyCode() == 20)
	            	JTabbedPaneFrame.this.keyAction('r',3,0);
	            if(event.getKeyCode() == 65)
	            	JTabbedPaneFrame.this.keyAction('r',3,1);
	            if(event.getKeyCode() == 83)
	            	JTabbedPaneFrame.this.keyAction('r',3,2);
	            if(event.getKeyCode() == 68)
	            	JTabbedPaneFrame.this.keyAction('r',3,3);
	            if(event.getKeyCode() == 70)
	            	JTabbedPaneFrame.this.keyAction('r',3,4);
	            if(event.getKeyCode() == 71)
	            	JTabbedPaneFrame.this.keyAction('r',3,5);
	            if(event.getKeyCode() == 72)
	            	JTabbedPaneFrame.this.keyAction('r',3,6);
	            if(event.getKeyCode() == 74)
	            	JTabbedPaneFrame.this.keyAction('r',3,7);
	            if(event.getKeyCode() == 75)
	            	JTabbedPaneFrame.this.keyAction('r',3,8);
	            if(event.getKeyCode() == 76)
	            	JTabbedPaneFrame.this.keyAction('r',3,9);
	            if(event.getKeyCode() == 186)
	            	JTabbedPaneFrame.this.keyAction('r',3,10);
	            if(event.getKeyCode() == 222)
	            	JTabbedPaneFrame.this.keyAction('r',3,11);
//	            if(event.getKeyCode() == 13)
//	            	JTabbedPaneFrame.this.keyAction('r',3,12);
//	           
	            if(event.getKeyCode() == 16)
	            	JTabbedPaneFrame.this.keyAction('r',4,0);
	            if(event.getKeyCode() == 90)
	            	JTabbedPaneFrame.this.keyAction('r',4,1);
	            if(event.getKeyCode() == 88)
	            	JTabbedPaneFrame.this.keyAction('r',4,2);
	            if(event.getKeyCode() == 67)
	            	JTabbedPaneFrame.this.keyAction('r',4,3);
	            if(event.getKeyCode() == 86)
	            	JTabbedPaneFrame.this.keyAction('r',4,4);
	            if(event.getKeyCode() == 66)
	            	JTabbedPaneFrame.this.keyAction('r',4,5);
	            if(event.getKeyCode() == 78)
	            	JTabbedPaneFrame.this.keyAction('r',4,6);
	            if(event.getKeyCode() == 77)
	            	JTabbedPaneFrame.this.keyAction('r',4,7);
	            if(event.getKeyCode() == 188)
	            	JTabbedPaneFrame.this.keyAction('r',4,8);
	            if(event.getKeyCode() == 190)
	            	JTabbedPaneFrame.this.keyAction('r',4,9);
	            if(event.getKeyCode() == 191)
	            	JTabbedPaneFrame.this.keyAction('r',4,10);
	            if(event.getKeyCode() == 38)
	            	JTabbedPaneFrame.this.keyAction('r',4,11);
	            if(event.getKeyCode() == 32)
	            	JTabbedPaneFrame.this.keyAction('r',5,0);
	            if(event.getKeyCode() == 37)
	            	JTabbedPaneFrame.this.keyAction('r',5,1);
	            if(event.getKeyCode() == 40)
	            	JTabbedPaneFrame.this.keyAction('r',5,2);
	            if(event.getKeyCode() == 39)
	            	JTabbedPaneFrame.this.keyAction('r',5,3);
	            
	        
	        }

	        @Override
	        public void keyTyped(KeyEvent event) {
	            line1 = String.format(line1 + "%s", event.getKeyChar()); // mostra a tecla
	            erros = erros + (event.getKeyChar()); // String que salva TUDO o que foi digitado, inclusive os backspaces!
	        }
	    }
	}
}