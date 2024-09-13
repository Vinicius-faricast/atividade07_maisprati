package ListaSimplesmenteEncadeada;

public class Url {
    public String address;
    public  Url next;

    public Url(String address){
        this.address = address;
        this.next = null;
    }
}
