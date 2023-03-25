import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JPanel panel;
    private JTextField buscarD;
    private JButton buscarD2;
    private JButton ingresarDato;
    private JList list1;
    private JButton listarElementosButton;
    DefaultListModel<String> model = new DefaultListModel<>();
    public VentanaPrincipal() {
        buscarD2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list1.setModel(model);
                model.removeAllElements();
                VacCovid sd = new VacCovid();
                String cuiBuscar = buscarD.getText();
                String resultado = sd.buscarVacunas(cuiBuscar);
                model.addElement("Datos del DPI: "+cuiBuscar);
                model.addElement(" "+resultado);
                buscarD.setText("");
            }
        });
        ingresarDato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IngresarNuevoDato d = new IngresarNuevoDato();
                d.levantar();
            }
        });
    }


    public static void main(String[] args) {
        VentanaPrincipal f = new VentanaPrincipal();
        f.setContentPane(new VentanaPrincipal().panel);
        f.setSize(500, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
    }
}
