import ListaSimplesmenteEncadeada.GerenciadorDeTarefas;
import ListaSimplesmenteEncadeada.HistoricoDeNavegacao;

public class Main {
    public static void main(String[] args) {

//        Descomente o codigo abaixo para executar o exercicio 01
//        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
//
//        gerenciador.addTask("lavar louça");
//        gerenciador.addTask("Passar roupa");
//        gerenciador.addTask("estudar java");
//        gerenciador.addTask("arrumar a cama");
//
//        //gerenciador.updateStatus(0);
//        gerenciador.updateStatus(1);
//        gerenciador.updateStatus(2);
//
//        gerenciador.removeTask(3);
//
//        gerenciador.printTasks();

    HistoricoDeNavegacao historico = new HistoricoDeNavegacao(3);

    historico.addUrl("www.instagram.com.br");
    historico.addUrl("www.outlook.com.br");
    historico.addUrl("www.facebook.com.br");
    historico.addUrl("www.youtube.com.br");


    historico.printHistoric();
    }
}