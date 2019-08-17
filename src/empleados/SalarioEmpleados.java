package empleados;

import empleados.constante.SalarioString;
import empleados.operaciones.SalarioLogica;
import menu.Menu;


import javax.swing.*;
import java.awt.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static empleados.constante.SalarioString.*;
import static empleados.constante.SalarioMedida.*;


public class SalarioEmpleados extends Frame {


  private static SalarioLogica salarioLogica = new SalarioLogica();

    private JTextField txthoras;
    private JButton calcularButton;
    private JButton limpiarButton;

    private JPanel opcionsalario;
    private JButton btnsalir;
    private JRadioButton rbtmanana;
    private JRadioButton rbtnoche;
    private JRadioButton rbtlaborable;
    private JRadioButton rbtfestivo;
    private JLabel lblsalario;

    public SalarioEmpleados(){



        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.');

        DecimalFormat formateador = new DecimalFormat(FORMATO.getMs(), simbolo);

        add(opcionsalario);
        setTitle(TITULO.getMs());
        setSize(QUINIENTOS.getValor(),QUINIENTOSCINCUENTA.getValor());

        btnsalir.addActionListener( e -> {

            menu.Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();


        });


        calcularButton.addActionListener(e -> {



            String nombre= JOptionPane.showInputDialog(null,ALERTANOMBRE.getMs());




            if (rbtmanana.isSelected()&&rbtlaborable.isSelected()){

                salarioLogica.calcularDiurna();
                datos(txthoras.getText());
                lblsalario.setVisible(true);
                lblsalario.setText(String.valueOf(formateador.format(salarioLogica.calcularDiurna())));

            }

            else if (rbtmanana.isSelected()&&rbtfestivo.isSelected()){

                salarioLogica.calcularDiurna();
                datos(txthoras.getText());
                lblsalario.setVisible(true);
                lblsalario.setText(String.valueOf( salarioLogica.totalDiurnoFestivo()));

            }
            else if (rbtnoche.isSelected()&&rbtlaborable.isSelected())
            {

                salarioLogica.calcularNocturna();
                datos(txthoras.getText());
                lblsalario.setVisible(true);
                lblsalario.setText(String.valueOf(formateador.format(salarioLogica.calcularNocturna())));
            }

            else if (rbtnoche.isSelected()&&rbtfestivo.isSelected())
            {

                salarioLogica.calcularNocturna();
                datos(txthoras.getText());
                lblsalario.setVisible(true);
                lblsalario.setText(String.valueOf(formateador.format(salarioLogica.totalNocturnoFestivo())));
            }
            else
            {
                JOptionPane.showMessageDialog(null, ALERTANOMBRE.getMs());
            }

            JOptionPane.showMessageDialog(null,DATOS.getMs()+NOMBRE.getMs()
                    +nombre+HORAS_LAB.getMs()+txthoras.getText()+
                    SALARIO.getMs());


        });


        limpiarButton.addActionListener(e-> {


            txthoras.setText(SalarioString.VACIO.getMs());
            lblsalario.setVisible(false);
            rbtlaborable.setSelected(false);
            rbtfestivo.setSelected(false);
            rbtmanana.setSelected(false);
            rbtnoche.setSelected(false);

        });
    }

    private void esconderVentana(){

        this.dispose();
    }

    private void datos(String valor1){



        salarioLogica.setValor(Double.parseDouble(valor1));

        lblsalario.setVisible(true);
    }



}
