
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class FramePrincipal extends JFrame {
	protected TecladoPanel calculadora = new TecladoPanel();
	protected BorderLayout layout;
	protected TextPanel texto = new TextPanel();

	public FramePrincipal() {
		super("Teclado");
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel panelTab1 = new JPanel();
		JPanel panelTab2 = new JPanel();
		JPanel panelTab3 = new JPanel();
		
		/* layout = new BorderLayout();
		setLayout(layout);
		add(calculadora,layout.CENTER);
		add(texto,layout.NORTH); */
		panelTab1.setLayout(new FlowLayout());
		panelTab1.add(texto);
		panelTab1.add(calculadora);
		tabbedPane.addTab("Tab Um", panelTab1);
		tabbedPane.addTab("Tab Dois", panelTab2);
	}
	public void keyAction(char c, int linha, int coluna) {
		this.calculadora.trocaCor(c,linha,coluna);
	}

	    private class Listener implements KeyListener {

	        @Override
	        public void keyPressed(KeyEvent event) {
	            if (event.getKeyCode() == 10) {  // 10 representa a tecla enter
	                String textString = textArea.getText(); // mandar essa String para o documento Log.txt
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
	            	FramePrincipal.this.keyAction('p',1,0);
	            if(event.getKeyCode() == 49)
	            	FramePrincipal.this.keyAction('p',1,1);
	            if(event.getKeyCode() == 50)
	            	FramePrincipal.this.keyAction('p',1,2);
	            if(event.getKeyCode() == 51)
	            	FramePrincipal.this.keyAction('p',1,3);
	            if(event.getKeyCode() == 52)
	            	FramePrincipal.this.keyAction('p',1,4);
	            if(event.getKeyCode() == 53)
	            	FramePrincipal.this.keyAction('p',1,5);
	            if(event.getKeyCode() == 54)
	            	FramePrincipal.this.keyAction('p',1,6);
	            if(event.getKeyCode() == 55)
	            	FramePrincipal.this.keyAction('p',1,7);
	            if(event.getKeyCode() == 56)
	            	FramePrincipal.this.keyAction('p',1,8);
	            if(event.getKeyCode() == 57)
	            	FramePrincipal.this.keyAction('p',1,9);
	            if(event.getKeyCode() == 48)
	            	FramePrincipal.this.keyAction('p',1,10);
	            if(event.getKeyCode() == 189)
	            	FramePrincipal.this.keyAction('p',1,11);
	            if(event.getKeyCode() == 187)
	            	FramePrincipal.this.keyAction('p',1,12);
	            if(event.getKeyCode() == 8)
	            	FramePrincipal.this.keyAction('p',1,13);
	            if(event.getKeyCode() == 9)
	            	FramePrincipal.this.keyAction('p',2,0);
	            if(event.getKeyCode() == 81)
	            	FramePrincipal.this.keyAction('p',2,1);
	            if(event.getKeyCode() == 87)
	            	FramePrincipal.this.keyAction('p',2,2);
	            if(event.getKeyCode() == 69)
	            	FramePrincipal.this.keyAction('p',2,3);
	            if(event.getKeyCode() == 82)
	            	FramePrincipal.this.keyAction('p',2,4);
	            if(event.getKeyCode() == 84)
	            	FramePrincipal.this.keyAction('p',2,5);
	            if(event.getKeyCode() == 89)
	            	FramePrincipal.this.keyAction('p',2,6);
	            if(event.getKeyCode() == 85)
	            	FramePrincipal.this.keyAction('p',2,7);
	            if(event.getKeyCode() == 73)
	            	FramePrincipal.this.keyAction('p',2,8);
	            if(event.getKeyCode() == 79)
	            	FramePrincipal.this.keyAction('p',2,9);
	            if(event.getKeyCode() == 80)
	            	FramePrincipal.this.keyAction('p',2,10);
	            if(event.getKeyCode() == 219)
	            	FramePrincipal.this.keyAction('p',2,11);
	            if(event.getKeyCode() == 221)
	            	FramePrincipal.this.keyAction('p',2,12);
	            if(event.getKeyCode() == 220)
	            	FramePrincipal.this.keyAction('p',2,13);
	            if(event.getKeyCode() == 20)
	            	FramePrincipal.this.keyAction('p',3,0);
	            if(event.getKeyCode() == 65)
	            	FramePrincipal.this.keyAction('p',3,1);
	            if(event.getKeyCode() == 83)
	            	FramePrincipal.this.keyAction('p',3,2);
	            if(event.getKeyCode() == 68)
	            	FramePrincipal.this.keyAction('p',3,3);
	            if(event.getKeyCode() == 70)
	            	FramePrincipal.this.keyAction('p',3,4);
	            if(event.getKeyCode() == 71)
	            	FramePrincipal.this.keyAction('p',3,5);
	            if(event.getKeyCode() == 72)
	            	FramePrincipal.this.keyAction('p',3,6);
	            if(event.getKeyCode() == 74)
	            	FramePrincipal.this.keyAction('p',3,7);
	            if(event.getKeyCode() == 75)
	            	FramePrincipal.this.keyAction('p',3,8);
	            if(event.getKeyCode() == 76)
	            	FramePrincipal.this.keyAction('p',3,9);
	            if(event.getKeyCode() == 186)
	            	FramePrincipal.this.keyAction('p',3,10);
	            if(event.getKeyCode() == 222)
	            	FramePrincipal.this.keyAction('p',3,11);
	            if(event.getKeyCode() == event.VK_ENTER)
	            	FramePrincipal.this.keyAction('p',3,12);
	            if(event.getKeyCode() == 16)
	            	FramePrincipal.this.keyAction('p',4,0);
	            if(event.getKeyCode() == 90)
	            	FramePrincipal.this.keyAction('p',4,1);
	            if(event.getKeyCode() == 88)
	            	FramePrincipal.this.keyAction('p',4,2);
	            if(event.getKeyCode() == 67)
	            	FramePrincipal.this.keyAction('p',4,3);
	            if(event.getKeyCode() == 86)
	            	FramePrincipal.this.keyAction('p',4,4);
	            if(event.getKeyCode() == 66)
	            	FramePrincipal.this.keyAction('p',4,5);
	            if(event.getKeyCode() == 78)
	            	FramePrincipal.this.keyAction('p',4,6);
	            if(event.getKeyCode() == 77)
	            	FramePrincipal.this.keyAction('p',4,7);
	            if(event.getKeyCode() == 188)
	            	FramePrincipal.this.keyAction('p',4,8);
	            if(event.getKeyCode() == 190)
	            	FramePrincipal.this.keyAction('p',4,9);
	            if(event.getKeyCode() == 191)
	            	FramePrincipal.this.keyAction('p',4,10);
	            if(event.getKeyCode() == 38)
	            	FramePrincipal.this.keyAction('p',4,11);
	            if(event.getKeyCode() == event.VK_ENTER)
	            	FramePrincipal.this.keyAction('p',3,12);
	           
	            if(event.getKeyCode() == 32)
	            	FramePrincipal.this.keyAction('p',5,0);
	            if(event.getKeyCode() == 37)
	            	FramePrincipal.this.keyAction('p',5,1);
	            if(event.getKeyCode() == 40)
	            	FramePrincipal.this.keyAction('p',5,2);
	            if(event.getKeyCode() == 39)
	            	FramePrincipal.this.keyAction('p',5,3);
	            
	        }

	        @Override
	        public void keyReleased(KeyEvent event) {
	        	if(event.getKeyCode() == 192)
	            	FramePrincipal.this.keyAction('r',1,0);
	            if(event.getKeyCode() == 49)
	            	FramePrincipal.this.keyAction('r',1,1);
	            if(event.getKeyCode() == 50)
	            	FramePrincipal.this.keyAction('r',1,2);
	            if(event.getKeyCode() == 51)
	            	FramePrincipal.this.keyAction('r',1,3);
	            if(event.getKeyCode() == 52)
	            	FramePrincipal.this.keyAction('r',1,4);
	            if(event.getKeyCode() == 53)
	            	FramePrincipal.this.keyAction('r',1,5);
	            if(event.getKeyCode() == 54)
	            	FramePrincipal.this.keyAction('r',1,6);
	            if(event.getKeyCode() == 55)
	            	FramePrincipal.this.keyAction('r',1,7);
	            if(event.getKeyCode() == 56)
	            	FramePrincipal.this.keyAction('r',1,8);
	            if(event.getKeyCode() == 57)
	            	FramePrincipal.this.keyAction('r',1,9);
	            if(event.getKeyCode() == 48)
	            	FramePrincipal.this.keyAction('r',1,10);
	            if(event.getKeyCode() == 189)
	            	FramePrincipal.this.keyAction('r',1,11);
	            if(event.getKeyCode() == 187)
	            	FramePrincipal.this.keyAction('r',1,12);
	            if(event.getKeyCode() == 8)
	            	FramePrincipal.this.keyAction('r',1,13);
	            if(event.getKeyCode() == 9)
	            	FramePrincipal.this.keyAction('r',2,0);
	            if(event.getKeyCode() == 81)
	            	FramePrincipal.this.keyAction('r',2,1);
	            if(event.getKeyCode() == 87)
	            	FramePrincipal.this.keyAction('r',2,2);
	            if(event.getKeyCode() == 69)
	            	FramePrincipal.this.keyAction('r',2,3);
	            if(event.getKeyCode() == 82)
	            	FramePrincipal.this.keyAction('r',2,4);
	            if(event.getKeyCode() == 84)
	            	FramePrincipal.this.keyAction('r',2,5);
	            if(event.getKeyCode() == 89)
	            	FramePrincipal.this.keyAction('r',2,6);
	            if(event.getKeyCode() == 85)
	            	FramePrincipal.this.keyAction('r',2,7);
	            if(event.getKeyCode() == 73)
	            	FramePrincipal.this.keyAction('r',2,8);
	            if(event.getKeyCode() == 79)
	            	FramePrincipal.this.keyAction('r',2,9);
	            if(event.getKeyCode() == 80)
	            	FramePrincipal.this.keyAction('r',2,10);
	            if(event.getKeyCode() == 219)
	            	FramePrincipal.this.keyAction('r',2,11);
	            if(event.getKeyCode() == 221)
	            	FramePrincipal.this.keyAction('r',2,12);
	            if(event.getKeyCode() == 220)
	            	FramePrincipal.this.keyAction('r',2,13);
	            if(event.getKeyCode() == 20)
	            	FramePrincipal.this.keyAction('r',3,0);
	            if(event.getKeyCode() == 65)
	            	FramePrincipal.this.keyAction('r',3,1);
	            if(event.getKeyCode() == 83)
	            	FramePrincipal.this.keyAction('r',3,2);
	            if(event.getKeyCode() == 68)
	            	FramePrincipal.this.keyAction('r',3,3);
	            if(event.getKeyCode() == 70)
	            	FramePrincipal.this.keyAction('r',3,4);
	            if(event.getKeyCode() == 71)
	            	FramePrincipal.this.keyAction('r',3,5);
	            if(event.getKeyCode() == 72)
	            	FramePrincipal.this.keyAction('r',3,6);
	            if(event.getKeyCode() == 74)
	            	FramePrincipal.this.keyAction('r',3,7);
	            if(event.getKeyCode() == 75)
	            	FramePrincipal.this.keyAction('r',3,8);
	            if(event.getKeyCode() == 76)
	            	FramePrincipal.this.keyAction('r',3,9);
	            if(event.getKeyCode() == 186)
	            	FramePrincipal.this.keyAction('r',3,10);
	            if(event.getKeyCode() == 222)
	            	FramePrincipal.this.keyAction('r',3,11);
//	            if(event.getKeyCode() == 13)
//	            	FramePrincipal.this.keyAction('r',3,12);
//	           
	            if(event.getKeyCode() == 16)
	            	FramePrincipal.this.keyAction('r',4,0);
	            if(event.getKeyCode() == 90)
	            	FramePrincipal.this.keyAction('r',4,1);
	            if(event.getKeyCode() == 88)
	            	FramePrincipal.this.keyAction('r',4,2);
	            if(event.getKeyCode() == 67)
	            	FramePrincipal.this.keyAction('r',4,3);
	            if(event.getKeyCode() == 86)
	            	FramePrincipal.this.keyAction('r',4,4);
	            if(event.getKeyCode() == 66)
	            	FramePrincipal.this.keyAction('r',4,5);
	            if(event.getKeyCode() == 78)
	            	FramePrincipal.this.keyAction('r',4,6);
	            if(event.getKeyCode() == 77)
	            	FramePrincipal.this.keyAction('r',4,7);
	            if(event.getKeyCode() == 188)
	            	FramePrincipal.this.keyAction('r',4,8);
	            if(event.getKeyCode() == 190)
	            	FramePrincipal.this.keyAction('r',4,9);
	            if(event.getKeyCode() == 191)
	            	FramePrincipal.this.keyAction('r',4,10);
	            if(event.getKeyCode() == 38)
	            	FramePrincipal.this.keyAction('r',4,11);
	            if(event.getKeyCode() == 32)
	            	FramePrincipal.this.keyAction('r',5,0);
	            if(event.getKeyCode() == 37)
	            	FramePrincipal.this.keyAction('r',5,1);
	            if(event.getKeyCode() == 40)
	            	FramePrincipal.this.keyAction('r',5,2);
	            if(event.getKeyCode() == 39)
	            	FramePrincipal.this.keyAction('r',5,3);
	            
	        
	        }

	        @Override
	        public void keyTyped(KeyEvent event) {
	            line1 = String.format(line1 + "%s", event.getKeyChar()); // mostra a tecla
	            erros = erros + (event.getKeyChar()); // String que salva TUDO o que foi digitado, inclusive os backspaces!
	        }
	    }
	}
}
