package moneda;

import menu.Menu;

import moneda.operaciones.ConversionLogica;

import javax.swing.*;
import java.awt.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static moneda.constante.MonedaValor.*;
import static moneda.constante.MonedaString.*;


public class ConversionMonedas  extends Frame {

  private static  ConversionLogica conversionLogica  = new ConversionLogica() ;

    private JPanel conversionmonedasform;
    private JTextField txtvalconvertir;
    private JLabel lblresultado;
    private JButton btnsalir;
    private JRadioButton rbteuro;
    private JRadioButton rbtyen;

    private JRadioButton rbtdolar;
    private JButton btnconvertir;
    private JButton btnlimpiar;




    public ConversionMonedas()
    {


        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.');

        DecimalFormat formateador = new DecimalFormat(FORMATO.getMs(), simbolo);


        add(conversionmonedasform);
        setTitle(TITULO.getMs());
        setSize( QUINIENTOS.getValormoneda(),QUINIENTOS.getValormoneda());


        btnsalir.addActionListener(e -> {

                menu.Menu menu = new Menu();
                menu.setVisible(true);
                esconderVentana();

        });
        btnconvertir.addActionListener(e -> {

                if(rbtdolar.isSelected())
                {
                conversionLogica.calcularDolar();
                    datos(txtvalconvertir.getText());

                    lblresultado.setText(String.valueOf(formateador.format(conversionLogica.calcularDolar())));
                }
                else if (rbteuro.isSelected()){
                    conversionLogica.calcularEuro();
                    datos(txtvalconvertir.getText());

                    lblresultado.setText(String.valueOf(formateador.format(conversionLogica.calcularEuro())));

                }
                else if (rbtyen.isSelected()) {
                    conversionLogica.calcularYen();
                    datos(txtvalconvertir.getText());

                    lblresultado.setText(String.valueOf(formateador.format(conversionLogica.calcularYen())));
                }
                else{
                    JOptionPane.showMessageDialog(null,ALERTA.getMs());
                }


        });
        btnlimpiar.addActionListener(e->
        {
            txtvalconvertir.setText(VACIO.getMs());
            rbteuro.setSelected(false);
            rbtdolar.setSelected(false);
            rbtyen.setSelected(false);
        } );


    }

    private void esconderVentana()
    { this.dispose();
    }

    private void datos(String valor1){

        conversionLogica.setMoneda(Double.parseDouble(valor1));
        lblresultado.setVisible(true);
    }

}