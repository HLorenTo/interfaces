package mision_tic_2022_ejercicio_interfaces;
public class Perro extends Animal{
    @Override
    public void desplazar(){
        System.out.println("El perro se desplaza");
    }
    @Override
    public void dormir(){
        System.out.println("El perro duerme");
    }
    @Override
    public void jugar(){
        System.out.println("El perro juega");
    }
    @Override
    public void alimentar(){
        System.out.println("El perro se alimenta");
    }
}
