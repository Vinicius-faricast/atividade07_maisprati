import Filas.FilaBanco;
import Filas.FilaProcessos;
import Filas.GerenciamentoImpressao;
import ListaDuplamenteEncadeada.ControleDeVersaoV2;
import ListaDuplamenteEncadeada.JogoCartas;
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

//Descomente o codigo abaixo para executar o exercicio 04
//        ControleDeVersaoV2 text = new ControleDeVersaoV2();
//        Scanner myScan = new Scanner(System.in);
//        boolean condition = true;
//
//        while (condition){
//            System.out.println("Texto atual");
//            System.out.println(text.getHead());
//            System.out.println("Digite '0' para sair");
//            System.out.println("Digite '1' para desfazer");
//            System.out.println("Digite '2' para refazer");
//            System.out.println("Digite '3' para acrescentar texto");
//
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
//                    text.redo();
//                    break;
//                case 3:
//                    myScan.nextLine();
//                    System.out.println(text.getHead());
//                    String newText = myScan.nextLine();
//                    text.add(newText);
//                    break;
//            }
//
//        }

//Descomente o codigo abaixo para executar o exercicio 05
//        JogoCartas jogo = new JogoCartas();
//
//        jogo.print();
//        jogo.addCard(1);
//        jogo.print();
//        jogo.addCard(2);
//        jogo.print();
//        jogo.addCard(11);
//        jogo.print();
//        jogo.addCard(3);
//        jogo.print();
//        jogo.remove(1);
//        jogo.print();
//        jogo.reorder(2, "next");
//        jogo.print();
//        jogo.reorder(1, "back");
//        jogo.print();
//        jogo.reorder(0, "back");

//Descomente o codigo abaixo para executar o exercicio 06
//        FilaBanco fila = new FilaBanco();
//
//        fila.add("Fulano");
//        fila.add("Cicrano");
//        fila.add("Beltrano");
//
//        fila.print();
//
//        fila.remove();
//
//        fila.print();

//        Descomente o codigo abaixo para executar o exercicio 07
//        GerenciamentoImpressao fila = new GerenciamentoImpressao();
//
//        fila.add("texto.txt");
//        fila.add("imagem.img");
//        fila.add("arquivo.pdf");
//        fila.printFila();
//
//        fila.remove();
//
//        fila.printFila();

//        Descomente o codigo abaixo para executar o exercicio 08
        FilaProcessos processos = new FilaProcessos();

        processos.add("visualStudio");
        processos.add("Mysql");
        processos.add("worbench");
        processos.print();

        processos.remove();

        processos.print();
    }
}