package mision_tic_2022_interface;
public class Acumulador implements Modificacion{
    private int valor;
    //constructor
    public Acumulador(int valor) {
        this.valor = valor;
    }
    public int retornarValor(){
        return this.valor;
    }
    public void incremento(int incre){
        this.valor += incre;
    }
}
