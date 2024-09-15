import ListaDuplamenteEncadeada.ControleDeVersaoV2;
import ListaSimplesmenteEncadeada.ControleDeVersao;
import ListaSimplesmenteEncadeada.GerenciadorDeTarefas;
import ListaSimplesmenteEncadeada.HistoricoDeNavegacao;

import java.util.Scanner;

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

//        Descomente o codigo abaixo para executar o exercicio 02
//        HistoricoDeNavegacao historico = new HistoricoDeNavegacao(3);
//
//        historico.addUrl("www.instagram.com.br");
//        historico.addUrl("www.outlook.com.br");
//        historico.addUrl("www.facebook.com.br");
//        historico.addUrl("www.youtube.com.br");
//
//        historico.printHistoric();

//        Descomente o codigo abaixo para executar o exercicio 03
//        ControleDeVersao text = new ControleDeVersao();
//        Scanner myScan = new Scanner(System.in);
//        boolean condition = true;
//
//        while (condition){
//            System.out.println("Texto atual");
//            text.printText();
//            System.out.println("Digite '0' para sair");
//            System.out.println("Digite '1' para retornar a versão anterior");
//            System.out.println("Digite '2' para acrescentar texto");
//            System.out.print("escolha uma opção: ");
//            int option = myScan.nextInt();
//
//            switch (option){
//                case 0:
//                    condition = false;
//                    break;
//                case 1:
//                    text.undo();
//                    break;
//                case 2:
//                    myScan.nextLine();
//                    text.printText();
//                    String newText = myScan.nextLine();
//                    text.addText(newText);
//                    break;
//            }
//
//        }

//Descomente o codigo abaixo para executar o exercicio 03
        ControleDeVersaoV2 text = new ControleDeVersaoV2();
        Scanner myScan = new Scanner(System.in);
        boolean condition = true;

        while (condition){
            System.out.println("Texto atual");
            System.out.println(text.getHead());
            System.out.println("Digite '0' para sair");
            System.out.println("Digite '1' para desfazer");
            System.out.println("Digite '2' para refazer");
            System.out.println("Digite '3' para acrescentar texto");

            System.out.print("escolha uma opção: ");
            int option = myScan.nextInt();

            switch (option){
                case 0:
                    condition = false;
                    break;
                case 1:
                    text.undo();
                    break;
                case 2:
                    text.redo();
                    break;
                case 3:
                    myScan.nextLine();
                    System.out.println(text.getHead());
                    String newText = myScan.nextLine();
                    text.add(newText);
                    break;
            }

        }
    }
}