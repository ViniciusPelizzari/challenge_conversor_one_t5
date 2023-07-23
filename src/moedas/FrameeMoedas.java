package moedas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * criar tela padrão de exibição - lista, botão confirmar seleção, campo inserçao dados
 */
public class FrameeMoedas {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;
    private static String quantiaParaConversao;
    private static JTextField textFieldValue;

    /**
     * construtor tela padrão - 300 x 200
     * @param title
     * @param jcomBox
     * @param txtButton
     */
    public FrameeMoedas(String title, JComboBox jcomBox, String txtButton) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        frame.add(jcomBox);

        /**
         * construtor do botão
         */
        okButton = new JButton(txtButton);
        okButton.setBounds(140, 20, 120, 30);
        frame.add(okButton);

        /**
         * criando campo captura de texto
         */
        textFieldValue = new JTextField();
        textFieldValue.setBounds(20, 70, 240, 30);
        frame.add(textFieldValue);

        /**
         * criando exibição de texto
         */
        labelResult = new JLabel();
        labelResult.setBounds(20, 120, 360, 30);
        frame.add(labelResult);

        /**
         * deixando tela habilitada para visualização
         */
        frame.setVisible(true);

        /**
         * capturando clique botão
         */
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputValue = textFieldValue.getText();
                setQuantiaParaConversao(inputValue);
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public JButton getOkButton() {
        return okButton;
    }

    public static String getQuantiaParaConversao() {
        return quantiaParaConversao;
    }

    public static void setQuantiaParaConversao(String quantiaParaConversao) {
        FrameeMoedas.quantiaParaConversao = quantiaParaConversao;
    }

    public static String getTextFieldValue() {
        return textFieldValue.getText();
    }
}

