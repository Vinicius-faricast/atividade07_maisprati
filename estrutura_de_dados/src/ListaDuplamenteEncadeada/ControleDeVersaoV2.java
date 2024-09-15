package ListaDuplamenteEncadeada;

public class ControleDeVersaoV2 {
    private Version head;

    public void ControleDeVersaoV2() {
        this.head = null;
    }

    public void add(String data){
        if(this.head == null){
            this.head = new Version(data);
            return;
        }

        Version newData = new Version(this.head.data+ data);
        this.head.next = newData;
        newData.back = this.head;
        this.head = newData;
    }

    public String getHead(){
        if(this.head == null){
            return "";
        }
        return this.head.data;
    }

    public void undo(){
        if(this.head == null){
            return;
        }
        if(this.head.back == null){
            this.head = null;
            return;
        }
        this.head = this.head.back;
    }

    public void redo() {
        if(this.head == null){
            return;
        }

        if(this.head.next == null){
            return;
        }

        this.head = this.head.next;
    }
}
