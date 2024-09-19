package Filas;

public class FilaBanco {
    private Client head;
    private Client tail;
    private int length;

    public void FilaBanco(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void add(String nameClient){
        if(this.head == null){
            Client newClient = new Client(nameClient);
            this.head = newClient;
            this.tail = newClient;
            return;
        }

        Client newClient = new Client(nameClient);
        this.tail.next = newClient;
        this.tail = newClient;
        return;
    }

    public void remove(){
        if(this.head == null){
            return;
        }
        this.head = this.head.next;
    }

    public  void print(){
        System.out.println("Ordem da fila");
        if(this.head == null){
            System.out.println("Fila Vazia");
            return;
        }

        Client current = this.head;
        while (current.next != null){
            System.out.println("cliente: " + current.name);
            current = current.next;
        }

        System.out.println("cliente: " + current.name);

    }
}
