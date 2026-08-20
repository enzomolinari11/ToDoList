package todolist;

import java.util.Scanner;

class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }
}


public class ToDoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tarefa[] tarefas = new Tarefa[10];
        int opcao;

        do {
            System.out.println("Digite 1: Adicionar tarefa");
            System.out.println("Digite 2: Listar suas tarefas");
            System.out.println("Digite 3: Concluir tarefa");
            System.out.println("Digite 4: Excluir tarefa");
            System.out.println("Digite 5: Para Sair");
            System.out.print("\n Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa(tarefas, scanner);
                    break;
                case 2:
                    listarTarefas(tarefas);
                    break;
                case 3:
                    concluirTarefa(tarefas, scanner);
                    break;
                case 4:
                    excluirTarefa(tarefas, scanner);
                    break;
                case 5:
                    System.out.println("Programa encerrado!!");
                    break;
                default:
                    System.out.println("Opcao inválida!!");
            }
        } while (opcao != 5);
        scanner.close();
    }
    public static void adicionarTarefa(Tarefa[] tarefas, Scanner scanner) {

        for (int i = 0; i < tarefas.length; i++) {

            if (tarefas[i] == null) {
                System.out.print("Digite a tarefa: ");
                String descricao = scanner.nextLine();

                tarefas[i] = new Tarefa(descricao);

                System.out.println("Tarefa adicionada com sucesso!");
                return;
            }
        }
        System.out.println("A lista de tarefas está cheia!");
    }

    public static void listarTarefas(Tarefa[] tarefas) {
        boolean encontrou = false;
        System.out.println("\n Suas Tarefas");
        for (int i = 0; i < tarefas.length; i++) {

            if (tarefas[i] != null) {
                encontrou = true;

                String status;
                
                if (tarefas[i].concluida) {
                    status = "[X]";
                } else {
                    status = "[ ]";
                }
                System.out.println((i + 1) + " - " + status + " " + tarefas[i].descricao);
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma tarefa cadastrada.");
        }
    }
    public static void concluirTarefa(Tarefa[] tarefas, Scanner scanner) {

        System.out.print("Digite o numero da tarefa que deseja concluir: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        int indice = numero - 1;

        if (indice >= 0 && indice < tarefas.length && tarefas[indice] != null) {

            tarefas[indice].concluida = true;

            System.out.println("Tarefa concluída com sucesso!");

        } else {
            System.out.println("Tarefa inválida!");
        }
    }
    public static void excluirTarefa(Tarefa[] tarefas, Scanner scanner) {

        System.out.print("Digite o numero da tarefa que deseja excluir: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        int indice = numero - 1;

        if (indice >= 0 && indice < tarefas.length && tarefas[indice] != null) {

            tarefas[indice] = null;

            System.out.println("Tarefa excluida com sucesso!");

        } else {
            System.out.println("Tarefa invalida!");
        }
    }
    
}
