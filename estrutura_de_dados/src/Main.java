import ListaSimplesmenteEncadeada.GerenciadorDeTarefas;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        gerenciador.addTask("lavar louça");
        gerenciador.addTask("Passar roupa");
        gerenciador.addTask("estudar java");
        gerenciador.addTask("arrumar a cama");

        //gerenciador.updateStatus(0);
        gerenciador.updateStatus(1);
        gerenciador.updateStatus(2);

        gerenciador.removeTask(3);

        gerenciador.printTasks();
    }
}