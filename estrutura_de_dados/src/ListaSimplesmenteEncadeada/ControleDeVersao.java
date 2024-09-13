package ListaSimplesmenteEncadeada;

public class ControleDeVersao {
    private Version head;

    public void ControleDeVersao(){
        this.head = null;
    }

    public void addText(String data) {
        Version current = this.head;
        if (current == null){
            this.head = new Version(data);
            return;
        }

        if (current.next == null){
            String newText = current.text + " " + data;
            current.next = new Version(newText);
            return;
        }

        while (current.next != null){
            current = current.next;
        }
        String newText = current.text + " " + data;
        current.next = new Version(newText);
    }

    public void undo() {
        Version current = this.head;

        if (current == null){
            return;
        }

        if (current.next == null){
            this.head = null;
            return;
        }

        while (current.next.next != null){
            current = current.next;
        }

        current.next = null;
    }

    public String get() {
        Version current = this.head;
        if (current == null){
            return "";
        }

        if (current.next == null){
            return current.text;
        }

        while (current.next != null){
            current = current.next;
        }

        return current.text;
    }

    public void printText() {
        System.out.println(this.get());
    }
}
