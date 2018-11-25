package view;
import java.sql.*;
public class AcessoBD {
 private Connection con;
 private Statement stm;
 public AcessoBD(){
 con = null;
 stm = null;
 }
 public void conecta(){
 try{
Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/gelaflix?user=root");
 System.out.println("Conexão bem sucedida!");
 stm = con.createStatement();
 }
 catch(ClassNotFoundException cnf){
 System.out.println("Exceção: " + cnf.toString());
 }
 catch(SQLException se){
 System.out.println("Exceção: " + se.toString());
 }
 }
 public void executa(String pedido){
 try{
 stm.executeUpdate(pedido);
 System.out.println("Execução de Pedido Completada!");
 }
 catch(SQLException e){
 System.out.println("Exceção: " + e.toString());
 }
 catch(NullPointerException npe){
 System.out.println("Exceção: " + npe.toString());
 }
 }
 public ResultSet consulta(String consulta){ResultSet rs = null;
 try{
 rs = stm.executeQuery(consulta);
 }
 catch(SQLException e){
 System.out.println("Exceção: " + e.toString());
 }
 finally{
 return rs;
 }
 }
 public void fechaConexao(){
 try{
 stm.close();
 con.close();
 }
 catch(SQLException e){
 System.out.println("Exceção: " + e.toString());
 }
 }
}
