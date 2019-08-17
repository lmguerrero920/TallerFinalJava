package menu;

import empleados.SalarioEmpleados;
import moneda.ConversionMonedas;
import opciones.operacionesmatematicas.OperacionesMatematicas;

import javax.swing.*;
import java.awt.*;


public class Menu extends Frame {
    private JPanel menuprincipal;
    private JButton operacionesMatematicasButton;
    private JButton salarioButton;
    private JButton conversionButton;

    public Menu(){
        add(menuprincipal);
        setTitle("Menu principal");
        setSize(500, 600);

        operacionesMatematicasButton.addActionListener(e -> {
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderVentana();
        });


        salarioButton.addActionListener(e-> {

              SalarioEmpleados salarioEmpleados= new SalarioEmpleados();
              salarioEmpleados.setVisible(true);
              esconderVentana();


        });

        conversionButton.addActionListener(e -> {


                ConversionMonedas conversionMonedas= new ConversionMonedas();
                conversionMonedas.setVisible(true);
                esconderVentana();


        });
    }

    private void esconderVentana(){
        this.dispose();
    }

}
