package ListaSimplesmenteEncadeada;

public class Task {
    public String name;
    public boolean status;
    public Task next;

    public Task(String name) {
        this.name = name;
        this.status = false;
        this.next = null;
    }
}
