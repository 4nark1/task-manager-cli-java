import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskRepository repository = new JsonFileTaskRepository("tarefas.json");
        TaskManager manager = new TaskManager(repository);
        final Scanner scanner = new Scanner(System.in);
        String nome;
        String descricao;
        String prioridade;
        int id;
        int escolha;
        Task taskId;

        while(true){
            System.out.println("Task Manager");
            System.out.println("1 - Criar Tarefa\n" + "2 - Listar Tarefas\n" +
                    "3 - Buscar por ID\n" + "4 - Concluir Tarefa\n" +
                    "5 - Excluir Tarefa\n" + "0 - Sair");

            System.out.println("Digite o número da opção desejada");
            escolha = Integer.parseInt(scanner.nextLine());

            if(escolha == 0){
                break;
            }
            switch(escolha){
                case 1:
                    System.out.println("Nome da Tarefa:");
                    nome = scanner.nextLine();
                    System.out.println("Descrição da Tarefa:");
                    descricao = scanner.nextLine();
                    System.out.println("Prioridade da Tarefa:");
                    prioridade = scanner.nextLine();

                    manager.addTask(nome, descricao, prioridade);
                    System.out.println("Tarefa adicionada\n");
                    break;

                case 2:
                    for(Task task : manager.listarTarefas()){
                        System.out.println(task + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID da tarefa");
                    id = Integer.parseInt(scanner.nextLine());
                    taskId = manager.consultarPorId(id);
                    if(taskId != null){
                       System.out.println(manager.consultarPorId(id));
                    }
                    else{
                        System.out.println("Tarefa não encontrada");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID da tarefa");
                    id = Integer.parseInt(scanner.nextLine());
                    taskId = manager.consultarPorId(id);
                    if(taskId != null){
                        manager.marcarConcluida(id);
                        System.out.println("Tarefa marcada como concluida");
                    }
                    else{
                        System.out.println("Tarefa não encontrada");
                    }
                    break;

                case 5:
                    System.out.println("Digite o ID da tarefa");
                    id = Integer.parseInt(scanner.nextLine());
                    taskId = manager.consultarPorId(id);
                    if(taskId != null){
                        manager.excluirTarefa(id);
                        System.out.println("Tarefa excluida");
                    }
                    else{
                        System.out.println("Tarefa não encontrada");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}