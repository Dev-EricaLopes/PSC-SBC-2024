
package Classes;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Usuario {
    
    private int codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    String sql = "INSERT INTO tb_usuario(nome, usuario, email, senha) VALUES (?, ?, ?,?)";
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
    
    String sql = "update tb_usuario set nome = ?, email= ?, senha= ? where usuario=?";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.setString(3, senha);
        ps.setString(4, usuario);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
    
    public void apagar (){
        String sql = "DELETE FROM tb_usuario WHERE codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void Consultar(){
        String sql = "SELECT * FROM tb_usauario where codigo=?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                String aux = String.format(
                "Código: %d, Nome: %s, Fone: %s, Email: %s",
                codigo,
                nome,
                fone,
                email
                );
                JOptionPane.showMessageDialog (null, aux);
                }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean ValidaSenha(){
        String sql = "SELECT * FROM tb_usauario where usuario=? and senha=?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);     
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return true;
                }
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
