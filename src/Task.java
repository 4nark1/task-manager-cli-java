
public class Task {
    private final int id;
    private String Nome;
    private String Descricao;
    private String Prioridade;
    private Status Status;

    public Task(int id, String Nome, String Descricao, String Prioridade, Status Status){
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Prioridade = Prioridade;
        this.Status = Status;
        this.id = id;
    }

    public enum Status{
        PENDENTE, CONCLUIDA
    }

    public String getNome(){
        return Nome;
    }

    public String getDescricao(){
        return Descricao;
    }

    public String getPrioridade(){
        return Prioridade;
    }

    public Status getStatus(){
        return Status;
    }

    public int getId(){
        return id;
    }

    public Status definirStatus(){
        return Status = this.Status.CONCLUIDA;
    }

    @Override
    public String toString(){
        return String.format("Id: " + id + "\nNome: " + Nome + " \nDescrição: " + Descricao + " \nPrioridade: " + Prioridade + " \nStatus: " + Status);
    }
}