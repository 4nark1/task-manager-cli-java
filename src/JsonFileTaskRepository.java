import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.FileReader;

public class JsonFileTaskRepository implements TaskRepository{

    private List<Task> listaTask;
    private final String caminhoArquivo;
    private final Gson gson = new Gson();

    public JsonFileTaskRepository(String caminhoArquivo){
        this.caminhoArquivo = caminhoArquivo;
        this.listaTask = new ArrayList<>();
        carregarDoArquivo();
    }

    @Override
    public Task save(Task task){
        listaTask.add(task);
        salvarNoArquivo();
        return task;
    }

    @Override
    public Task findById(int id){
        Task elemento = null;
        for(Task index : listaTask){
            if(index.getId() == id){
                elemento = index;
                break;
            }
        }
        return elemento;
    }

    @Override
    public ArrayList<Task> findAll(){
        return new ArrayList<Task>(listaTask);
    }

    @Override
    public boolean deleteById(int id){
        Iterator<Task> iterator = listaTask.iterator();

        while(iterator.hasNext()){
            Task task = iterator.next();
            if(task.getId() == id){
                iterator.remove();
                salvarNoArquivo();
                return true;
            }
        }
        return false;
    }

    @Override
    public void persistTask(Task task){
        salvarNoArquivo();
    }

    @Override
    public int getMaxId(){
        int maiorId = 0;

        for(Task index : listaTask){
            if(index.getId() > maiorId){
                maiorId = index.getId();
            }
        }
        return maiorId;
    }

    private void salvarNoArquivo(){
        try(FileWriter fw = new FileWriter(caminhoArquivo)){
            gson.toJson(listaTask, fw);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    private void carregarDoArquivo(){
        try(FileReader reader = new FileReader(caminhoArquivo)){
            List<Task> tarefas = gson.fromJson(reader, new TypeToken<List<Task>>(){}.getType());

            if(tarefas != null){
                listaTask = tarefas;
            } else {
                listaTask = new ArrayList<>();
            }
        }
        catch(IOException e){
            listaTask = new ArrayList<>();
        }
    }
}