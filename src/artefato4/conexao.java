
package artefato4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexao {
   public conexao(){
       
   } 
   public static Connection con = null;
   
   public static void Conectar()throws SQLException, ClassNotFoundException{
    try{
    Class.forName("oracle.jdbc.OracleDriver");   
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","USER_BD_ARTEFATO03","ALUNO");

   
    }catch(SQLException ex){
        throw new SQLException("Erro ao se conectar ao banco de dados",ex);
    }catch(ClassNotFoundException ex){
        throw new ClassNotFoundException("erro ao carregar o Driver mysql",ex);
                }
        
    }
    
    
}

