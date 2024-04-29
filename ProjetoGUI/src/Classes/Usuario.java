
package Classes;

public class Usuario {
    
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private boolean adm;

    public Usuario() {
    }

    public Usuario(String nome, String email, String usuario, String senha, boolean adm) {
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.adm = adm;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
