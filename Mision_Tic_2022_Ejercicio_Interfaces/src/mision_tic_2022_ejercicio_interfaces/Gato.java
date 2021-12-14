package mision_tic_2022_ejercicio_interfaces;
public class Gato extends Animal{
    @Override
    public void desplazar(){
        System.out.println("El gato se desplaza");
    }
    @Override
    public void dormir(){
        System.out.println("El gato duerme");
    }
    @Override
    public void jugar(){
        System.out.println("El gato juega");
    }
    @Override
    public void alimentar(){
        System.out.println("El gato se alimenta");
    }
}
