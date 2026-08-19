
import java.util.Scanner;

public class ToDoList_Professor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        
        int opcao = 0;
        
        while(opcao != 5){
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefa");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Excluir Tarefa");
            System.out.println("5 - Sair");
            
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
        
            switch (opcao) {
                case 1:
                    
                    int posicaoLivre = -1;
                    
                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] == null) {
                           posicaoLivre = i;
                           break;
                     
                    }
            }
                    if (posicaoLivre == 1) {
                        System.out.println("A lista de tarefas esta cheia!");
                    } else {
                        System.out.println("Digite a tarefa:");
                        tarefas[posicaoLivre] = scanner.nextLine();
                        concluidas[posicaoLivre] = false;
                        System.out.println("Tarefa adicionada com sucesso");
                    }
                    break;
        }            
    }
    }
}