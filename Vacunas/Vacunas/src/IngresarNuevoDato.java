import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarNuevoDato extends JFrame{
    private JPanel panel;
    private JTextField fec1;
    private JTextField Vac1;
    private JTextField Cui1;
    private JButton ingresarDatoNuevo;
    private JTextField Vac2;
    private JLabel Dosis2;
    private JTextField fec2;

    public IngresarNuevoDato() {
        ingresarDatoNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VacCovid vacuna = new VacCovid();
                IngresarNuevoDato dato = new IngresarNuevoDato();
                String cui = Cui1.getText();
                String datos = Vac1.getText()+", "+ fec1.getText()+" ; "+ Vac2.getText()+", "+ fec2.getText();
                vacuna.guardarArchivo(cui, datos);
                Cui1.setText("");
                Vac1.setText("");
                fec1.setText("");
                Vac2.setText("");
                fec2.setText("");
                JOptionPane.showMessageDialog(panel, "Se han guardado los datos");
                //Falta como cerrar la venta despues de dar click

            }
        });
    }
    public void levantar(){
        IngresarNuevoDato f = new IngresarNuevoDato();
        f.setContentPane(new IngresarNuevoDato().panel);
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.pack();
    }
}
