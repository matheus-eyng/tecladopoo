import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame();
		tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPaneFrame.setSize(750, 450); // set frame size
		tabbedPaneFrame.setVisible(true); // display frame
	}
}
