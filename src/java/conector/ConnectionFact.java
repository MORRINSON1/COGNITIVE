/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conector;

import Pojo.Tusuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author E302
 */
public class ConnectionFact {

    //parametros de conexion
    private Connection connection;
    private String user = "root";
    private String password = "morris";
    private String url = "jdbc:mysql://localhost:3306/DBAPPAgenda";
    private String driver = "com.mysql.jdbc.Driver";

    private boolean connect() {
        System.out.println("Conectando a la BBDD...");
        try {
            Class.forName(driver);// Driver d=new Driver();
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            return false;
        } catch (SQLException ex) {
            return false;
        }

        return true;
    }

    public Connection getConnection() {
        return connection;
    }

    public void insertarUsuario(Tusuario p) throws SQLException {
        connect();
        PreparedStatement pst = this.getConnection()
                .prepareStatement("Insert into tusuario values(?,?,?,?,?,?,?,?)");
        pst.setInt(1, p.getCodigoUsuario());
        pst.setString(2, p.getNombre());
        pst.setString(3, p.getPrimerApellido());
        pst.setString(4, p.getSegundoApellido());
        pst.setString(5, p.getCorreoElectronico());
        pst.setString(6, p.getContrasenha());
        pst.setString(7, p.getSexo());
        pst.setString(8, p.getTelefono());
        pst.execute();

    }
    
     public void eliminarPersona(Tusuario p) throws SQLException {
        connect();
        PreparedStatement pst = this.getConnection()
                .prepareStatement("Delete from TUsuario where codigoUsuario=?");
        pst.setInt(1, p.getCodigoUsuario());
       
        pst.execute();

    }
  
   public void actualizarPersona(Tusuario p) throws SQLException {
        connect();
        PreparedStatement pst = this.getConnection()
                .prepareStatement("Update TUsuario set codigoUsuario=?, nombre=?, PrimerApellido=?, SegundoApellido=?, correoElectronico=?, contrasenha=?, sexo=?, telefono=? Where codigoUsuario=?");
       
        pst.setInt(1, p.getCodigoUsuario());
        pst.setString(2, p.getNombre());
        pst.setString(3, p.getPrimerApellido());
        pst.setString(4, p.getSegundoApellido());
        pst.setString(5, p.getCorreoElectronico());
        pst.setString(6, p.getContrasenha());
        pst.setString(7, p.getSexo());
        pst.setString(8, p.getTelefono());
        
        pst.execute();

    }
  public List<Tusuario> listar() throws SQLException{
      List<Tusuario> usuarios=new LinkedList<>();
         connect();
         
        PreparedStatement pst = this.getConnection()
                .prepareStatement("Select nombre, codigoUsuario, PrimerApellido, SegundoApellido, correoElectronico, contrasenha, sexo, telefono from TUsuario order by 3");
       
   
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
           Tusuario p=new Tusuario();
           
           p.setCodigoUsuario(rs.getInt(2));
           p.setNombre(rs.getString(1));
           p.setPrimerApellido(rs.getString(3));
           p.setSegundoApellido(rs.getString(4));
           p.setCorreoElectronico(rs.getString(5));
           p.setContrasenha(rs.getString(6));
           p.setSexo(rs.getString(7));
           p.setTelefono(rs.getString(8));
           
           usuarios.add(p);
        }
      
     return usuarios;
  }
  
  public Tusuario buscar(String ce) throws SQLException{
      Tusuario p=null;
         connect();
         
        PreparedStatement pst = this.getConnection()
                .prepareStatement("select nombre, codigoUsuario, PrimerApellido, SegundoApellido, correoElectronico, contrasenha, sexo, telefono from tusuario where correoElectronico=?");
       
       pst.setString(1, ce);//PARAMETRO A ENVIAR AL PreparedStatement
                                //REMPLAZA EL VALOR EN ?
        ResultSet rs = pst.executeQuery();//CONSULTA
        
        if(rs.next()){
           p=new Tusuario();
           p.setNombre(rs.getString(1));
           p.setCodigoUsuario(rs.getInt(2));
           p.setPrimerApellido(rs.getString(3));
           p.setSegundoApellido(rs.getString(4));
           p.setCorreoElectronico(rs.getString(5));
           p.setContrasenha(rs.getString(6));
           p.setSexo(rs.getString(7));
           p.setTelefono(rs.getString(8));
        }
      System.out.println("Usuario es"+p);
     return p;
  }
  
}
