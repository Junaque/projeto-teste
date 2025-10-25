import java.util.ArrayList;

public class Projeto {
    private int idProjeto;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataConclusao;
    private statusProjeto statusprojeto;
    private Usuario responsavel;
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Usuario> participantes;

    public Projeto(int idProjeto, String nome, String descricao, String dataInicio, String dataConclusao, statusProjeto statusprojeto, Usuario responsavel) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.statusprojeto = statusprojeto;
        this.responsavel = responsavel;
        this.tarefas = new ArrayList<Tarefa>();
        this.participantes = new ArrayList<Usuario>();
    }
    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }
    public void adicionarParticipante(Usuario participante) {
    this.participantes.add(participante);
    }
    public int getIdProjeto() {
        return idProjeto;
    }
    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataConclusao() {
        return dataConclusao;
    }
    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    public statusProjeto getStatusprojeto() {
        return statusprojeto;
    }
    public void setStatusprojeto(statusProjeto statusprojeto) {
        this.statusprojeto = statusprojeto;
    }
    public Usuario getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }
    
}
