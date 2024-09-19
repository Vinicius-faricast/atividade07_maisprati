package Filas;

public class FilaProcessos {
    public Processo head;
    public Processo tail;

    public FilaProcessos() {
        this.head = null;
        this.tail = null;
    }

    public void add(String name){
        Processo newProcesso = new Processo(name);

        if(this.head == null){
            this.head = newProcesso;
            this.tail = newProcesso;
            return;
        }

        this.tail.next = newProcesso;
        this.tail = newProcesso;
    }

    public void remove() {
        if(this.head == null){
            return;
        }
        this.head = this.head.next;
    }

    public void print(){
        System.out.println("Processos pronto para execução");
        if (this.head == null){
            System.out.println("Não há nenhum processo na fila");
            return;
        }

        Processo current = this.head;
        while (current.next != null){
            System.out.println("Executando: " + current.name);
            current = current.next;
        }

        System.out.println("Executando: " + current.name);
    }
}
