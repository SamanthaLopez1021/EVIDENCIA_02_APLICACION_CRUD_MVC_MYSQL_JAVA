package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDao {

    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

//-------------------------- REGISTRAR USUARIO ----------------------------------
    public int registrarUsuario(UsuarioVo usua) throws SQLException{
        sql="INSERT INTO Usuario(nombreUsua,apellidoUsua,tipoidUsua,identificacionUsua,celularUsua,correoUsua,usuar,claveUsua,estadoUsua) values(?,?,?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, usua.getNombreUsua());
            ps.setString(2, usua.getApellidoUsua());
            ps.setString(3, usua.getTipoidUsua());
            ps.setInt(4, usua.getIdentificacionUsua());
            ps.setInt(5, usua.getCelularUsua());
            ps.setString(6, usua.getCorreoUsua());
            ps.setString(7, usua.getUsuar());
            ps.setInt(8, usua.getClaveUsua());
            ps.setBoolean(9, usua.getEstadoUsua());


            
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el el usuario correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return r;
    }

//--------------------------- CONSULTAR REGISTROS DE USUARIO --------------------------

    public List<UsuarioVo> listar() throws SQLException{
        List<UsuarioVo> usuario=new ArrayList<>();
        sql="SELECT * from Usuario";
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                UsuarioVo r=new UsuarioVo();
                //Escribir  en el setter cada valor encontrado
                r.setIdUsua(rs.getInt("idUsua"));
                r.setNombreUsua(rs.getString("nombreUsua"));
                r.setApellidoUsua(rs.getString("apellidoUsua"));
                r.setTipoidUsua(rs.getString("tipoidUsua"));
                r.setIdentificacionUsua(rs.getInt("identificacionUsua"));
                r.setCelularUsua(rs.getInt("celularUsua"));
                r.setCorreoUsua(rs.getString("correoUsua"));
                r.setUsuar(rs.getString("usuar"));
                r.setClaveUsua(rs.getInt("claveUsua"));
                r.setEstadoUsua(rs.getBoolean("estadoUsua"));
                usuario.add(r);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return usuario;


    }

//---------------- ACTIVAR E INACTIVAR USUARIOS ---------------------

 public void estadoUsuario(UsuarioVo usuarioo) throws SQLException{
        String sql="UPDATE usuario SET estadoUsua="+(usuarioo.getEstadoUsua()==true ?"1":"0")+"WHERE idUsua="+(usuarioo.getIdUsua());
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
        
            
           /*  System.out.println(ps); */
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado correctamente el usuario correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }

    }



    
}
