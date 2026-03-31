import java.util.ArrayList;

public interface TaskRepository {
    Task save(Task task);
    Task findById(int id);
    ArrayList<Task> findAll();
    boolean deleteById(int id);
    void persistTask(Task task);
    int getMaxId();
}