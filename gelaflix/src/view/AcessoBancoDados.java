package view;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AcessoBancoDados {
 public static AcessoBD acessoBD;
 public static ResultSet rs = null;
 public static String pedidoSQL1;
 public static String pedidoSQL2;
 public static String nome;
 public static String email;
 public static String senha;
 public static void main(String[] args){
 pedidoSQL2 = "SELECT * FROM usuario;";
 acessoBD = new AcessoBD();
 acessoBD.conecta();
 //acessoBD.executa(pedidoSQL1);
 rs = acessoBD.consulta(pedidoSQL2);
 try{
 while(rs.next()){
 email = rs.getString("email");
 nome = rs.getString("nome");
 senha = rs.getString("senha");
 System.out.println("Nome: " + nome);
 System.out.println("Email: " + email);
 System.out.println("Senha: " + senha);}
 }
 catch(SQLException e){
 System.out.println("Exceção: " + e.toString());
 }
acessoBD.fechaConexao();
 }
}
