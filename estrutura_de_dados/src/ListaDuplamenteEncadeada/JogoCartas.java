package ListaDuplamenteEncadeada;

public class JogoCartas {
    public Card head;
    public  Card tail;
    public int length;

    public JogoCartas() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void addCard(int value){
        if (value > 13 || value < 0){
            System.out.println("Valor inválido");
            return;
        }

        if(this.head == null){
            Card newCard = new Card(value);
            this.head = newCard;
            this.tail = newCard;
            this.length++;
            return;
        }

        Card newCard = new Card(value);
        newCard.preview = this.tail;
        this.tail.next = newCard;
        this.tail = newCard;
        this.length++;

    }

    public void remove(int index){
        if(this.head == null){
            return;
        }

        if(index > this.length){
            return;
        }

        if (index == 0){
            this.head = this.head.next;
            if (this.length == 1) {
                this.tail = null;
            }
            this.length--;
        }

        Card current = this.head;
        for (int i=0; i < index; i++){
            current = current.next;
        }
        current.next.preview = current.preview;
        current.preview.next = current.next;
        this.length--;
    }

    public void reorder(int index, String direction){
        if(index >= this.length){
            return;
        }

        if(index == 0 && direction.equals("back")){
            return;
        }

        if(index == this.length-1 && direction.equals("next")){
            return;
        }

        if (index == 0){
            int oldValue = this.head.value;
            this.head.value = this.head.next.value;
            this.head.next.value = oldValue;
            return;
        }

        if (index == this.length - 1){
            Card currentCard = this.head;
            for (int i = 0; i < this.length -2; i++){
                currentCard = currentCard.next;
            }
            int oldValue = currentCard.value;
            currentCard.value = currentCard.next.value;
            currentCard.next.value = oldValue;
            return;
        }
        Card current = this.head;
        for (int i = 0; i < index; i++){
            if(current.next == null){
                return;
            }
            current = current.next;
        }

        if(direction.equals("next")){
            int oldValue = current.value;
            current.value = current.next.value;
            current.next.value = oldValue;
            return;
        }

        int oldValue = current.value;
        current.value = current.preview.value;
        current.preview.value = oldValue;
    }

    public void print(){
        System.out.println("Mão:");
        Card currentCard = this.head;

        if(currentCard == null){
            return;
        }

        int count = 0;

        while (currentCard.next != null){
            System.out.println(count + ": " + currentCard.value);
            currentCard = currentCard.next;
            count++;
        }

        System.out.println(count + ": " + currentCard.value);
    }
}
