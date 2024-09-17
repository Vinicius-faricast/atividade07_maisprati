package ListaDuplamenteEncadeada;

public class Card {
    public int value;
    public Card next;
    public Card preview;

    public Card(int value){
        this.value = value;
        this.next = null;
        this.preview = null;
    }
}
