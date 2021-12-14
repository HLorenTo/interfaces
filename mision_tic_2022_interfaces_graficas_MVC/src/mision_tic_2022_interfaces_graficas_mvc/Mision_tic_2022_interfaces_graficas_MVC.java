package mision_tic_2022_interfaces_graficas_mvc;


import mision_tic_2022_interfaces_graficas_mvc.Controlador.Controlador;
import mision_tic_2022_interfaces_graficas_mvc.Modelo.Modelo;
import mision_tic_2022_interfaces_graficas_mvc.Vista.Ventana;

public class Mision_tic_2022_interfaces_graficas_MVC {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Ventana ventana = new Ventana();
        Controlador ctrl = new Controlador(ventana, modelo);
        ctrl.iniciar();
    }
    
}
