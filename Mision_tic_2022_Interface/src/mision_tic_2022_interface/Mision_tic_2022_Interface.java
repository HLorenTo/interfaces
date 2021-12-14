package mision_tic_2022_interface;
public class Mision_tic_2022_Interface {
    public static void main(String[] args) {
        //objeto 
        Acumulador acumulador = new Acumulador(25);
        acumulador.incremento(10);
        System.out.println(acumulador.retornarValor());
        
    }
    
}
