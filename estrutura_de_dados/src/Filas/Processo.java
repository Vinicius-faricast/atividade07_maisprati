package Filas;

public class Processo {
    public String name;
    public Processo next;

    public Processo(String name){
        this.name = name;
        this.next = null;
    }
}
