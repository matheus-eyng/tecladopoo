import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonPanel extends JPanel {

    private JRadioButton pangrama1;
    private JRadioButton pangrama2;
    private JRadioButton pangrama3;
    private JRadioButton pangrama4;
    private JRadioButton pangrama5;
    private String text;

    public RadioButtonPanel() {

        pangrama1 = new JRadioButton("Um pequeno jabuti xereta viu dez cegonhas felizes");
        pangrama2 = new JRadioButton("Quem traz CD, LP, fax, engov e whisky JB?");
        pangrama3 = new JRadioButton("Gazeta publica hoje breve nota de faxina na quermesse.");
        pangrama4 = new JRadioButton("Jovem craque belga prediz falhas no xote.");
        pangrama5 = new JRadioButton("Bancos fúteis pagavam-lhe queijo, whisky e xadrez.");

        // Valor default
        text = pangrama1.getText();

        // Adicionando ao grupo
        ButtonGroup group = new ButtonGroup();
        group.add(pangrama1);
        group.add(pangrama2);
        group.add(pangrama3);
        group.add(pangrama4);
        group.add(pangrama5);

        // Adicionando os listeners
        RadioButtonListener listener = new RadioButtonListener();
        pangrama1.addItemListener(listener);
        pangrama2.addItemListener(listener);
        pangrama3.addItemListener(listener);
        pangrama4.addItemListener(listener);
        pangrama5.addItemListener(listener);

        // Adicionando os radio buttons ao panel
        this.add(pangrama1);
        this.add(pangrama2);
        this.add(pangrama3);
        this.add(pangrama4);
        this.add(pangrama5);
    }

    public String getText() {
        return text;
    }

    private class RadioButtonListener implements ItemListener {
        @Override
        public void itemStateChanged (ItemEvent event) {
            if (pangrama1.isSelected()) {
                text = pangrama1.getText();
            }

            if (pangrama2.isSelected()) {
                text = pangrama2.getText();
            }

            if (pangrama3.isSelected()) {
                text = pangrama3.getText();
            }

            if (pangrama4.isSelected()) {
                text = pangrama4.getText();
            }

            if (pangrama5.isSelected()) {
                text = pangrama5.getText();
            }
        }
    }
}