package Filas;

public class GerenciamentoImpressao {
    public Print head;
    public Print tail;

    public GerenciamentoImpressao(){
        this.head = null;
        this.tail = null;
    }

    public void add(String data){
        if(this.head == null){
            Print newData = new Print(data);
            this.head = newData;
            this.tail =newData;
            return;
        }

        Print newData = new Print(data);
        this.tail.next = newData;
        this.tail = newData;
        return;
    }

    public void remove(){
        this.head = this.head.next;
        return;
    }

    public void printFila(){
        if (this.head == null){
            return;
        }
        Print current = this.head;
        while (current.next != null){
            System.out.println("Documento: " + current.data);
            current = current.next;
        }
        System.out.println("Documento: " + current.data);
    }
}
