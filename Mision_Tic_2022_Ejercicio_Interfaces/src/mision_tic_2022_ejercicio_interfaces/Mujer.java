package mision_tic_2022_ejercicio_interfaces;
public class Mujer extends Humano {

    public void trabajar(){
        System.out.println("La mujer Trabaja");
    }
    public void estudiar(){
        System.out.println("La mujer Estudia");
        
    }
    @Override
    public void desplazar() {
        System.out.println("La mujer se desplaza");   
    }

    @Override
    public void dormir() {
       System.out.println("La mujer se duerme");   
    }

    @Override
    public void jugar() {
       System.out.println("La mujer juega");   
    }

    @Override
    public void alimentar() {
       System.out.println("La mujer se alimenta");   
    }
    
}
