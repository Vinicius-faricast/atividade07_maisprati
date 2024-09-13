package ListaSimplesmenteEncadeada;

public class HistoricoDeNavegacao {
    private Url head;
    private int maxLength;
    private int length;

    public HistoricoDeNavegacao(int maxLength) {
        this.length = 0;
        this.maxLength = maxLength;
        this.head = null;
    }

    public void addUrl(String data) {
        Url current = this.head;

        if(current == null){
            this.head = new Url(data);
            this.length++;
            return;
        }

        if(current.next == null){
            current.next = new Url(data);
            this.length++;
            return;
        }

        while (current.next != null){
            current = current.next;
        }

        current.next = new Url(data);
        this.length++;

        if(length > maxLength){
            this.length--;
            this.head = this.head.next;
        }

    }

    public void printHistoric () {
        Url current = this.head;
        if (current == null){
            System.out.println("Historico vazio");
            return;
        }

        if(current.next == null){
            System.out.println("Url: " + current.address);
        }
        while (current.next != null){
            System.out.println("Url: " + current.address);
            System.out.println("---------------------------");
            current = current.next;
        }

        System.out.println("Url: " + current.address);
        System.out.println("---------------------------");
    }
}
