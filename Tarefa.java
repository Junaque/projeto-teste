public class Tarefa {
    private int idTarefa;
    private String titulo;
    private String descriçao;
    private String dataCriaçao;
    private String dataConclusao;
    private Projeto idProjeto;
    private prioridade Prioridade;
    private statusTarefa statustarefa;
    
    public Tarefa(int idTarefa, String titulo, String descriçao, String dataCriaçao, String dataConclusao,
            Projeto idProjeto, prioridade prioridade, statusTarefa statusTarefa) {
        this.idTarefa = idTarefa;
        this.titulo = titulo;
        this.descriçao = descriçao;
        this.dataCriaçao = dataCriaçao;
        this.dataConclusao = dataConclusao;
        this.idProjeto = idProjeto;
        prioridade = Prioridade;
        statusTarefa = statustarefa;
    }

    public void atualizarStatus(statusTarefa novoStatus) {
        this.statustarefa = novoStatus;
    }
    public void definirPrazo(String prazo) {
        this.dataConclusao = prazo;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getDataCriaçao() {
        return dataCriaçao;
    }

    public void setDataCriaçao(String dataCriaçao) {
        this.dataCriaçao = dataCriaçao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Projeto getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Projeto idProjeto) {
        this.idProjeto = idProjeto;
    }

    public prioridade getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(prioridade prioridade) {
        Prioridade = prioridade;
    }

    public statusTarefa getStatustarefa() {
        return statustarefa;
    }

    public void setStatustarefa(statusTarefa statustarefa) {
        this.statustarefa = statustarefa;
    }
}