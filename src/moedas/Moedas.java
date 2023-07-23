package moedas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Vinícius Pelizzari
 * @version 1.0
 */
public class Moedas {
    private static JComboBox<String> escolhaMoeda;
    private static JButton okButton;
    public String escolhaM = escolhaMoeda.getSelectedItem().toString();

    //chamando método de execução - Exe
    public static void main(String[] args) {
        Exe();
    }


    //criando tela de exibição - utilizando java swing
    //tamanho padrão de 100 x 30
    //seleção de temperatura e botão para confirmar a seleção
    public static void Exe(){
        escolhaMoeda = new JComboBox<>(new String[]{"", "BRL", "EUR", "USD", "GBP", "AUD", "CHF", "CAD"});
        escolhaMoeda.setBounds(20, 20, 100, 30);
        new FrameMoedas("MOEDAS", escolhaMoeda, "SELECIONAR");

        //tratamento de erro - inicialização do botão
        try {
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    OpcaoMoedas opcaoMoedas = new OpcaoMoedas();
                    opcaoMoedas.OpcaoMoedas();
                }
            });
        } catch (NullPointerException ex){
        }
    }
}

