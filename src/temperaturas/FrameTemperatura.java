package temperaturas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * criar tela padrão de exibição - lista e botão confirmar seleção
 */
public class FrameTemperatura {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;

    /**
     * construtor tela padrão - 300 x 140
     * @param title
     * @param jcomBox
     * @param txtButton
     */
    public FrameTemperatura(String title, JComboBox jcomBox, String txtButton){

        frame=new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,140);
        frame.setLayout(null);

        frame.add(jcomBox);

        //construtor do botão
        okButton = new JButton(txtButton);
        okButton.setBounds(140, 20, 120, 30);
        frame.add(okButton);

        //criando exibição de texto
        labelResult = new JLabel();
        labelResult.setBounds(20, 120, 360, 30);
        frame.add(labelResult);

        //deixando tela habilitada para visualização
        frame.setVisible(true);

        //capturando clique botão
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OpcaoTemperatura opcaoTemperatura = new OpcaoTemperatura();
                opcaoTemperatura.Temperaturas();
                //desabilitando exibição de tela
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}

