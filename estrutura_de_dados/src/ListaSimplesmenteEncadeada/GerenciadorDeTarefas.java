package ListaSimplesmenteEncadeada;

public class GerenciadorDeTarefas {
    private int length;
    private Task head;

    public GerenciadorDeTarefas() {
        this.length = 0;
        this.head = null;
    }

    public void addTask(String name){
        if(this.head == null){
            this.head = new Task(name);
            return;
        }
        Task current = this.head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Task(name);
    }

    public void updateStatus(int index) {
        if(index == 0){
            this.head.status = true;
            return;
        }

        Task current = this.head.next;
        int count = 1;
        while (current.next != null){
            if (count == index){
                current.status = true;
                return;
            }
            count++;
            current = current.next;
        }

        current.status = true;
    }

    public void removeTask(int index) {
        Task current = this.head;
        if (index == 0){
            this.head = current.next;
            return;
        }

        int count = 1;
        while (current.next != null){
            if (count == index){
                //System.out.println(current.name);
                current.next = current.next.next;
                //System.out.println(current.name);
                return;
            }
            count++;
            current = current.next;
        }
    }

    public void printTasks() {
        Task task = this.head;
        System.out.println("Lista de tarefas:");

        while (task.next != null){
            String status = task.status ? "concluido" : "não concluido";
            System.out.println("Tarefa: " + task.name + ". Estado: " + status);
            task = task.next;
        }

        String status = task.status ? "concluido" : "não concluido";
        System.out.println("Tarefa: " + task.name + ". Estado: " + status);
    }
}
