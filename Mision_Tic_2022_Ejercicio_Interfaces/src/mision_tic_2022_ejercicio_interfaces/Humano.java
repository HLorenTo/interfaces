package mision_tic_2022_ejercicio_interfaces;
public abstract class Humano implements AccionesHumano, AccionesGeneral {
    
    public Humano(){
    }
    public void trabajar() {    
        System.out.println("El humano trabaja");
    }
    public void estudiar() {
        System.out.println("El humano estudia");
    }

    
    
    
}
