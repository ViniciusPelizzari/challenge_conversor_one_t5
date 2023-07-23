package temperaturas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Vinícius Pelizzari
 * @version 1.0
 */
public class Temperaturas {
    private static JComboBox<String> escolhaTemperatura;
    private static JButton okButton;
    public String escolhaT = escolhaTemperatura.getSelectedItem().toString();

    /**
     * chamando método de execução - Exe
     * @param args
     */
    public static void main(String[] args){
        Exe();
    }

    //criando tela de exibição - utilizando java swing
    //tamanho padrão de 100 x 30
    //seleção de temperatura e botão para confirmar a seleção
    public static void Exe(){
        escolhaTemperatura = new JComboBox<>(new String[]{"", "Celsius (°C)", "Fahrenheit (°F)", "Kelvin (K)"});
        escolhaTemperatura.setBounds(20, 20, 100, 30);
        new FrameTemperatura("TEMPERATURAS", escolhaTemperatura, "SELECIONAR");

        //tratamento de erro - inicialização do botão
        try {
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    OpcaoTemperatura opcaoTemperatura = new OpcaoTemperatura();
                    opcaoTemperatura.Temperaturas();
                }
            });
        } catch (NullPointerException ex) {
        }
    }
}