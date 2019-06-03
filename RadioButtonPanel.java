import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonPanel extends JPanel {

    private JRadioButton pangrama1;
    private JRadioButton pangrama2;
    private JRadioButton pangrama3;
    private JRadioButton pangrama4;
    private JRadioButton pangrama5;

    public RadioButtonPanel() {

        pangrama1 = new JRadioButton("Um pequeno jabuti xereta viu dez cegonhas felizes");
        pangrama2 = new JRadioButton("Quem traz CD, LP, fax, engov e whisky JB?");
        pangrama3 = new JRadioButton("Gazeta publica hoje breve nota de faxina na quermesse.");
        pangrama4 = new JRadioButton("Jovem craque belga prediz falhas no xote.");
        pangrama5 = new JRadioButton("Bancos fúteis pagavam-lhe queijo, whisky e xadrez.");

        ButtonGroup group = new ButtonGroup();
        group.add(pangrama1);
        group.add(pangrama2);
        group.add(pangrama3);
        group.add(pangrama4);
        group.add(pangrama5);

        this.add(pangrama1);
        this.add(pangrama2);
        this.add(pangrama3);
        this.add(pangrama4);
        this.add(pangrama5);
    }
}