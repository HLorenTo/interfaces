package mision_tic_2022_ejercicio_interfaces;
public class Hombre extends Humano{
    public void trabajar(){
        System.out.println("El hombre Trabaja");
    }
    public void estudiar(){
        System.out.println("El hombre Estudia");
        
    }

    @Override
    public void desplazar() {
        System.out.println("El hombre se desplaza");   
    }

    @Override
    public void dormir() {
       System.out.println("El hombre se duerme");   
    }

    @Override
    public void jugar() {
       System.out.println("El hombre juega");   
    }

    @Override
    public void alimentar() {
       System.out.println("El hombre se alimenta");   
    }
    
}
