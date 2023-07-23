package moedas;

import javax.swing.*;

public class ImprimirFrameMoeda {
    private JFrame frame;
    private JLabel label;

    //criação de tela especial -> apenas para exibição do resultado do problema
    public ImprimirFrameMoeda(String title, String labelText) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 140);
        frame.setLayout(null);

        label = new JLabel(labelText);
        label.setBounds(20, 20, 360, 40);
        frame.add(label);

        frame.setVisible(true);
    }
}

