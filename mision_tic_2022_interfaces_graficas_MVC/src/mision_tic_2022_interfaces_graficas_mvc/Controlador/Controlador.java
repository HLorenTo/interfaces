package mision_tic_2022_interfaces_graficas_mvc.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mision_tic_2022_interfaces_graficas_mvc.Modelo.Modelo;
import mision_tic_2022_interfaces_graficas_mvc.Vista.Ventana;
public class Controlador implements ActionListener{
    private Ventana vent;
    private Modelo mod;

    public Controlador(Ventana vent, Modelo mod) {
        this.vent = vent;
        this.mod = mod;
        this.vent.btncalcular.addActionListener(this);
    }
    public void iniciar (){
        vent.setTitle("EJEMPLO 1 MVC");
        vent.setLocationRelativeTo(null);//centro
        vent.setVisible(true);//sea visible
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //cuando pulse el boton se va a ejecutar lo que tenga el boton
        int n1,n2;
        n1 = Integer.parseInt(vent.txtnum1.getText());
        n2 = Integer.parseInt(vent.txtnum2.getText());
        mod.setN1(n1);
        mod.setN2(n2);
        vent.txtimprimir.setText(String.valueOf(mod.getResultado()));
        
    }
    
}
