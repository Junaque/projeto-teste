import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String descriçao;
    private String email;
    private String senha;
    private String dataNascimento;
    private statusUsuario statususuario;
    private ArrayList<Projeto> projetos;
    
    public Usuario(int idUsuario, String nome, String descriçao, String email, String senha, String dataNascimento,
            statusUsuario statususuario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.descriçao = descriçao;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.statususuario = statususuario;
        this.projetos = new ArrayList<Projeto>();
    }
    public void login(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            System.out.println("Login feito com sucesso");
        }else{
            System.out.println("Email ou senha incorretos.");
        }
    }
    public void logout() {
        System.out.println("Usuário deslogado.");
    }
    public void atribuirProjeto(Projeto novProjeto) {
        projetos.add(novProjeto);
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescriçao() {
        return descriçao;
    }
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public statusUsuario getStatususuario() {
        return statususuario;
    }
    public void setStatususuario(statusUsuario statususuario) {
        this.statususuario = statususuario;
    }
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }
}
