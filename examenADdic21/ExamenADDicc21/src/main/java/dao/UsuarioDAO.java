package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;

public class UsuarioDAO {
    
    private Connection connection;
    
    /* Completar consultas */
    static final String INSERT_QUERY ="INSERT INTO usuario(nombre,apellidos,dni) VALUES(?,?,?)";
    static final String LIST_QUERY="SELECT * FROM usuario";
    static final String GET_BY_DNI="SELECT * FROM coche WHERE modelo = ?";
    
    
    public void connect(){
        
        String url = "jdbc:mysql://localhost:3306/examen?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "";
        
        try {
            connection = DriverManager.getConnection(url, user, password);       
            System.out.println("Conexion establecida con la base de datos");
        }catch(Exception ex){
            System.out.println("Error al conectar a la base de datos");
            System.out.println("ex");
        }     
    }
    
    public void close(){
        try {
            connection.close();
            System.out.println("Sesion cerrada correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la base de datos");     
        }
    }
    
    public void save( Usuario u){
    
        System.out.println("Método save completado");
        try {
           PreparedStatement ps = connection.prepareStatement(INSERT_QUERY,RETURN_GENERATED_KEYS);
           ps.setString(1, u.getNombre());
           ps.setString(2, u.getApellidos());
           ps.setString(3, u.getDni());
           ps.executeUpdate();
           
           ResultSet ids = ps.getGeneratedKeys();
           ids.next();
           u.setId( (long)(ids.getInt(1)) );
           System.out.println(u);
       } catch (Exception ex) {
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error al añadir");
           System.out.println(ex);
       }
    }

    public ArrayList<Usuario> list(){

        var salida = new ArrayList<Usuario>(0);
        
        /* Completar código para devolver un arraylist con todos los usuarios */
        
        System.out.println("Método list completado");
        try( Statement st = connection.createStatement() ){
            
            ResultSet resultado = st.executeQuery(LIST_QUERY);
            
            while(resultado.next()){
                Usuario u = new Usuario();
                u.setNombre( resultado.getString("nombre") );
                u.setApellidos( resultado.getString("apellidos") );
                u.setDni( resultado.getString("dni") );
                
                salida.add(u);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }    
    
    public Usuario getByDNI(String dni){
        
        Usuario salida = new Usuario();
        
        /**
         * Completar código para devolver el usuario que tenga ese dni.
         * Si no existe, se debe devolver null
         */
        
        System.out.println("Método getByDNI no completado");

        return salida;
    }    
}
