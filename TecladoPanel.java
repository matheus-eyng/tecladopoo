package teclado;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanel extends JPanel {
	private GridBagLayout layout;
	private Painel1 painel1 = new Painel1();
	private Painel2 painel2 = new Painel2();
	private Painel3 painel3 = new Painel3();
	private Painel4 painel4 = new Painel4();
	private Painel5 painel5 = new Painel5();
	private GridBagConstraints constraints;
//	private JButton[] linha1 = new JButton[14];
//	private JButton[] linha2 = new JButton[14];
//	private JButton[] linha3 = new JButton[14];
//	private JButton[] linha4 = new JButton[14];
//	private JButton[] linha5 = new JButton[14];
//	private String[] texto1 = {"~","1","2","3","4","5","6","7","8","9","0","-","+","<- Backspace"};
//	private String[] texto2 = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","'\'"};
//	private String[] texto3 = {"Caps","A","S","D","F","G","H","J","K","L",":"," \" ","Enter"};
//	private String[] texto4 = {"Shift","Z","X","C","V","B","N","M",",",".","?","'/''\'"};
//	private String[] texto5 = {"","<","'\''/'",">"};
	
	public TecladoPanel() {
		super();
		this.layout= new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		addComponent(painel1,0,0,1,1,5);
		addComponent(painel2,1,0,1,1,5);
		addComponent(painel3,2,0,1,1,5);
		addComponent(painel4,3,0,1,1,5);
		addComponent(painel5,4,0,1,1,5);
//		int z = 0;
//		for(int x = 0; x<= 12; x++) {
//			linha1[x] = new JButton(texto1[x]);
//			linha1[x].setBackground(Color.WHITE);
//			addComponent(linha1[x],0,x+z,2,2,5);
//			z=z+2;
//		}
//		linha1[13] = new JButton(texto1[13]);
//		linha1[13].setBackground(Color.WHITE);
//		addComponent(linha1[13],0,39,2,4,5);
//		z=3;
//		linha2[0] = new JButton(texto2[0]);
//		linha2[0].setBackground(Color.WHITE);
//		addComponent(linha2[0],3,0,2,3,5);
//		for(int x = 1; x<= 13; x++) {
//			linha2[x] = new JButton(texto2[x]);
//			linha2[x].setBackground(Color.WHITE);
//			addComponent(linha2[x],3,x+z,2,2,5);
//			z=z+2;
//		}
		
		
	}
	public void trocaCor(char c, int linha, int coluna) {
		if (c == 'p') {
			if(linha == 1) {
				painel1.trocaCorP(coluna);
			}
			if(linha == 2) {
				painel2.trocaCorP(coluna);
			}
			if(linha == 3) {
				painel3.trocaCorP(coluna);
			}
			if(linha == 4) {
				painel4.trocaCorP(coluna);
			}
			if(linha == 5) {
				painel5.trocaCorP(coluna);
			}
		
		}else if(c == 'r') {
			if(linha == 1) {
				painel1.trocaCorR(coluna);
			}
			if(linha == 2) {
				painel2.trocaCorR(coluna);
			}
			if(linha == 3) {
				painel3.trocaCorR(coluna);
			}
			if(linha == 4) {
				painel4.trocaCorR(coluna);
			}
			if(linha == 5) {
				painel5.trocaCorR(coluna);
			}
		}
	}
	private void addComponent( Component component,
		      int row, int column, int width, int height, int borda )
		   {
		      constraints.gridx = column; // set gridx
		      constraints.gridy = row; // set gridy
		      constraints.gridwidth = width; // set gridwidth
		      constraints.gridheight = height; // set gridheight
		      constraints.fill = GridBagConstraints.BOTH;
		      //constraints.anchor = GridBagConstraints.LINE_START;
//		      constraints.weightx = borda;
//		      constraints.weightx = borda;
		      constraints.insets = new Insets(5, 5, 0, 0);
		      layout.setConstraints( component, constraints ); // set constraints
		      add( component ); // add component
		   }
	
	
	public class Painel1 extends JPanel{
		private JButton[] linha1 = new JButton[14];
		private String[] texto1 = {"~","1","2","3","4","5","6","7","8","9","0","-","+","<- Backspace"};
		private GridBagLayout layout;
		private GridBagConstraints constraints;
		
		public Painel1() {
			super();
			this.layout= new GridBagLayout();
			setLayout(layout);
			constraints = new GridBagConstraints();
			int z = 0;
			for(int x = 0; x<= 12; x++) {
				linha1[x] = new JButton(texto1[x]);
				linha1[x].setBackground(Color.WHITE);
				addComponent(linha1[x],0,x+z,2,2,5);
				z=z+2;
			}
			linha1[13] = new JButton(texto1[13]);
			linha1[13].setBackground(Color.WHITE);
			addComponent(linha1[13],0,39,2,4,5);
			
		}
		public void trocaCorP(int x) {
			linha1[x].setBackground(Color.GRAY);
		}
		public void trocaCorR(int x) {
			linha1[x].setBackground(Color.WHITE);
		}
		
		
		
		
		
		private void addComponent( Component component,
			      int row, int column, int width, int height, int borda )
			   {
			      constraints.gridx = column; // set gridx
			      constraints.gridy = row; // set gridy
			      constraints.gridwidth = width; // set gridwidth
			      constraints.gridheight = height; // set gridheight
			      constraints.fill = GridBagConstraints.BOTH;
			      //constraints.anchor = GridBagConstraints.LINE_START;
//			      constraints.weightx = borda;
//			      constraints.weightx = borda;
			      constraints.insets = new Insets(5, 5, 0, 0);
			      layout.setConstraints( component, constraints ); // set constraints
			      add( component ); // add component
			   }
		
		}
	
	
	public class Painel2 extends JPanel{
		private String[] texto2 = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","\u006C"};
		private JButton[] linha2 = new JButton[14];
		private GridBagLayout layout;
		private GridBagConstraints constraints;
		
		public Painel2() {
			super();
			this.layout= new GridBagLayout();
			setLayout(layout);
			constraints = new GridBagConstraints();
			int z=3;
			linha2[0] = new JButton(texto2[0]);
			linha2[0].setBackground(Color.WHITE);
			addComponent(linha2[0],3,0,2,3,5);
			for(int x = 1; x<= 13; x++) {
				linha2[x] = new JButton(texto2[x]);
				linha2[x].setBackground(Color.WHITE);
				
				addComponent(linha2[x],3,x+z,2,2,5);
				z=z+2;
			}
			addComponent(Box.createHorizontalStrut(2),3,29,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,31,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,33,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,35,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,129,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,131,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,133,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,135,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,229,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,231,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,233,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,35,2,2,5);
		
		}
		public void trocaCorP(int x) {
			linha2[x].setBackground(Color.GRAY);
		}
		public void trocaCorR(int x) {
			linha2[x].setBackground(Color.WHITE);
		}
		
		
		
		private void addComponent( Component component,
			      int row, int column, int width, int height, int borda )
			   {
			      constraints.gridx = column; // set gridx
			      constraints.gridy = row; // set gridy
			      constraints.gridwidth = width; // set gridwidth
			      constraints.gridheight = height; // set gridheight
			      constraints.fill = GridBagConstraints.BOTH;
			      //constraints.anchor = GridBagConstraints.LINE_START;
//			      constraints.weightx = borda;
//			      constraints.weightx = borda;
			      constraints.insets = new Insets(5, 5, 0, 0);
			      layout.setConstraints( component, constraints ); // set constraints
			      add( component ); // add component
			   }
		
		}
	
	public class Painel3 extends JPanel{
		private String[] texto3 = {"Caps","A","S","D","F","G","H","J","K","L",":"," \" ","Enter"};
		private JButton[] linha3 = new JButton[13];
		private GridBagLayout layout;
		private GridBagConstraints constraints;
		
		public Painel3() {
			super();
			this.layout= new GridBagLayout();
			setLayout(layout);
			constraints = new GridBagConstraints();
			int z=3;
			linha3[0] = new JButton(texto3[0]);
			linha3[0].setBackground(Color.WHITE);
			addComponent(linha3[0],3,0,2,3,5);
			for(int x = 1; x<= 12; x++) {
				linha3[x] = new JButton(texto3[x]);
				linha3[x].setBackground(Color.WHITE);
				addComponent(linha3[x],3,x+z,2,2,5);
				z=z+2;
			}
			linha3[12] = new JButton(texto3[12]);
			linha3[12].setBackground(Color.WHITE);
			addComponent(linha3[12],3,0,2,4,5);
			
			addComponent(Box.createHorizontalStrut(2),3,29,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,31,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,33,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,35,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,37,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,39,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,41,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,43,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,45,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,47,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,129,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,131,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,133,2,2,5);
		
			
		}
		public void trocaCorP(int x) {
			linha3[x].setBackground(Color.GRAY);
		}
		public void trocaCorR(int x) {
			linha3[x].setBackground(Color.WHITE);
		}
		
		
		
		private void addComponent( Component component,
			      int row, int column, int width, int height, int borda )
			   {
			      constraints.gridx = column; // set gridx
			      constraints.gridy = row; // set gridy
			      constraints.gridwidth = width; // set gridwidth
			      constraints.gridheight = height; // set gridheight
			      constraints.fill = GridBagConstraints.BOTH;
			      //constraints.anchor = GridBagConstraints.LINE_START;
//			      constraints.weightx = borda;
//			      constraints.weightx = borda;
			      constraints.insets = new Insets(5, 5, 0, 0);
			      layout.setConstraints( component, constraints ); // set constraints
			      add( component ); // add component
			   }
		
		}
	
	public class Painel4 extends JPanel{
		private String[] texto4 = {"Shift","Z","X","C","V","B","N","M",",",".","?","\u2191"};
		private JButton[] linha4 = new JButton[12];
		private GridBagLayout layout;
		private GridBagConstraints constraints;
		
		public Painel4() {
			super();
			this.layout= new GridBagLayout();
			setLayout(layout);
			constraints = new GridBagConstraints();
			int z=4;
			linha4[0] = new JButton(texto4[0]);
			linha4[0].setBackground(Color.WHITE);
			addComponent(linha4[0],3,0,2,4,5);
			for(int x = 1; x<= 10; x++) {
				linha4[x] = new JButton(texto4[x]);
				linha4[x].setBackground(Color.WHITE);
				addComponent(linha4[x],3,x+z,2,2,5);
				z=z+2;
			}
			addComponent(Box.createHorizontalStrut(2),3,29,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,31,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,33,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,35,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,37,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,39,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,41,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,43,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,45,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,47,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,129,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,131,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,133,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,135,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,229,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,231,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,233,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,235,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,237,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,239,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,241,2,2,5);
			addComponent(Box.createHorizontalStrut(2),3,243,2,2,5);
			
			linha4[11] = new JButton(texto4[11]);
			linha4[11].setBackground(Color.WHITE);
			addComponent(linha4[11],3,55,2,4,5);
			
		
		}
		public void trocaCorP(int x) {
			linha4[x].setBackground(Color.GRAY);
		}
		public void trocaCorR(int x) {
			linha4[x].setBackground(Color.WHITE);
		}
		
		
		
		private void addComponent( Component component,
			      int row, int column, int width, int height, int borda )
			   {
			      constraints.gridx = column; // set gridx
			      constraints.gridy = row; // set gridy
			      constraints.gridwidth = width; // set gridwidth
			      constraints.gridheight = height; // set gridheight
			      constraints.fill = GridBagConstraints.BOTH;
			      //constraints.anchor = GridBagConstraints.LINE_START;
//			      constraints.weightx = borda;
//			      constraints.weightx = borda;
			      constraints.insets = new Insets(5, 5, 0, 0);
			      layout.setConstraints( component, constraints ); // set constraints
			      add( component ); // add component
			   }
		
		}
	public class Painel5 extends JPanel{
		private JButton[] linha5 = new JButton[4];
		private String[] texto5 = {"                                                                                ","\u2190","\u2193","\u2192"};
		private GridBagLayout layout;
		private GridBagConstraints constraints;
		
		public Painel5() {
			super();
			this.layout= new GridBagLayout();
			setLayout(layout);
			constraints = new GridBagConstraints();
			linha5[0] = new JButton(texto5[0]);
			linha5[1] = new JButton(texto5[1]);
			linha5[2] = new JButton(texto5[2]);
			linha5[3] = new JButton(texto5[3]);
			linha5[0].setBackground(Color.WHITE);
			linha5[1].setBackground(Color.WHITE);
			linha5[2].setBackground(Color.WHITE);
			linha5[3].setBackground(Color.WHITE);
			addComponent(linha5[0],0,50,12,2,5);
			addComponent(linha5[1],0,152,2,2,5);
			addComponent(linha5[2],0,154,2,2,5);
			addComponent(linha5[3],0,156,2,2,5);
//			addComponent(Box.createHorizontalStrut(5),0,0,2,2,5);
//			addComponent(Box.createHorizontalStrut(5),0,2,2,2,5);
			addComponent(Box.createHorizontalStrut(5),0,4,2,2,5);
			addComponent(Box.createHorizontalStrut(5),0,6,2,2,5);
			addComponent(Box.createHorizontalStrut(5),0,8,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,22,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,24,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,26,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,28,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,30,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,32,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,34,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,36,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,38,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,40,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,42,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,44,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,46,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,48,2,2,5);
			
			addComponent(Box.createHorizontalStrut(2),0,64,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,66,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,68,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,70,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,72,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,74,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,76,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,78,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,80,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,82,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,84,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,86,2,2,5);
			addComponent(Box.createHorizontalStrut(2),0,88,2,2,5);
//			addComponent(Box.createHorizontalStrut(2),0,90,2,2,5);
//			addComponent(Box.createHorizontalStrut(2),0,92,2,2,5);
//			addComponent(Box.createHorizontalStrut(2),0,94,2,2,5);
//			addComponent(Box.createHorizontalStrut(2),0,96,2,2,5);
//			addComponent(Box.createHorizontalStrut(2),0,98,2,2,5);
//			addComponent(Box.createHorizontalStrut(2),0,100,2,2,5);
			
			
			
			
		}
		public void trocaCorP(int x) {
			linha5[x].setBackground(Color.GRAY);
		}
		public void trocaCorR(int x) {
			linha5[x].setBackground(Color.WHITE);
		}
		private void addComponent( Component component,
			      int row, int column, int width, int height, int borda )
			   {
			      constraints.gridx = column; // set gridx
			      constraints.gridy = row; // set gridy
			      constraints.gridwidth = width; // set gridwidth
			      constraints.gridheight = height; // set gridheight
			      constraints.fill = GridBagConstraints.BOTH;
			      //constraints.anchor = GridBagConstraints.LINE_START;
//			      constraints.weightx = borda;
//			      constraints.weightx = borda;
			      constraints.insets = new Insets(5, 5, 0, 0);
			      layout.setConstraints( component, constraints ); // set constraints
			      add( component ); // add component
			   }
	
	
	}
	
}
