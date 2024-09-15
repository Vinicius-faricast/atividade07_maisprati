package ListaDuplamenteEncadeada;

public class Version {
    public String data;
    public Version next;
    public Version back;

    public Version(String data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
