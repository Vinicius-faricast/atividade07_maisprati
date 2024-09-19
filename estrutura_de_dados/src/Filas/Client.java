package Filas;

public class Client {
    public Client next;
    public String name;

    public Client(String name) {
        this.name = name;
        this.next = null;
    }
}
