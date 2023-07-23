package moedas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * criar tela padrão de exibição - lista e botão confirmar seleção
 */
public class FrameMoedas {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;

    /**
     * Construtor da classe FrameMoedas.
     *
     * @param title o título da janela
     * @param jcomBox o JComboBox a ser adicionado na janela
     * @param txtButton o texto do botão
     */
    public FrameMoedas(String title, JComboBox jcomBox, String txtButton){

        frame=new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,140);
        frame.setLayout(null);

        frame.add(jcomBox);

        okButton = new JButton(txtButton);
        okButton.setBounds(140, 20, 120, 30);
        frame.add(okButton);

        labelResult = new JLabel();
        labelResult.setBounds(20, 120, 360, 30);
        frame.add(labelResult);

        frame.setVisible(true);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OpcaoMoedas opcaoMoedas = new OpcaoMoedas();
                opcaoMoedas.OpcaoMoedas();
                //desabilitando exibição de tela
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}

