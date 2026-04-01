import java.util.ArrayList;

public class TaskManager {

    private static int id;
    private final TaskRepository repository;

    public TaskManager(TaskRepository repository){
        this.repository = repository;
        this.id = repository.getMaxId();
    }

    public void addTask(String nome, String descricao, String prioridade){
        Task novaTask = new Task(++id, nome, descricao, prioridade, Task.Status.PENDENTE);
        repository.save(novaTask);
    }

    public Task consultarPorId(int id){
        return repository.findById(id);
    }

    public boolean marcarConcluida(int id){
        Task elemento = repository.findById(id);
        if(elemento != null){
            elemento.definirStatus();
            repository.persistTask(elemento);
            return true;
        }
        return false;
    }

    public ArrayList<Task> listarTarefas(){
        return repository.findAll();
    }

    public boolean excluirTarefa(int id){
        return repository.deleteById(id);
    }
}