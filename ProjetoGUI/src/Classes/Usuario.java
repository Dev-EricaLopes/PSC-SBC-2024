
package Classes;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

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
    
    public void inserir(){
    
    String sql = "INSERT INTO tb_pessoa(nome, usuario, "
            + "email, senha) VALUES (?, ?, ?,?)";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, usuario);
        ps.setString(3, email);
        ps.setString(4, senha);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
    
    public void alterar(){
    
    String sql = "update tb_pessoa set nome = ?, email= ?, senha= ? where usuario=?";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.setString(3, senha);
        ps.setString(4, usuario);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário alterado com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
    
    public void listar (){
        //1: Definir o comando SQL
        String sql = "SELECT * FROM tb_pessoa";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Executa o comando e guarda
        //o resultado em um ResultSet
        ResultSet rs = ps.executeQuery();
        //5: itera sobre o resultado
        
        while (rs.next()){
            int codigo = rs.getInt("codigo");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
