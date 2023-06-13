package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioDao;
import model.UsuarioVo;

public class Usuario extends HttpServlet{
    UsuarioVo u=new UsuarioVo();
    UsuarioDao ud=new UsuarioDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String accion=req.getParameter("accion");

    
        switch(accion){
                case "abrirForm":
                    abrirForm(req, resp);
                break;
                

                case "consultar":
                    listar(req,resp);
                break; 

                
        } 
  

        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Entró al DoPost");
        String accion=req.getParameter("accion");

         switch(accion){
            case "add":
                add(req,resp);
            break;
        } 
    }

//------------------------ ABRIR FORMULARIO DE REGISTRO USUARIOS -----------------------
    private void abrirForm(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/registrarUsuario.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }catch(Exception e){
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }

//--------------------------------- REGISTRAR USUARIOS --------------------------------
private void add(HttpServletRequest req, HttpServletResponse resp) {

    if(req.getParameter("idUsua")!=null){
        u.setIdUsua(Integer.parseInt(req.getParameter("idUsua")));
    }
    if(req.getParameter("nombreUsua")!=null){
        u.setNombreUsua(req.getParameter("nombreUsua"));
    }
    if(req.getParameter("apellidoUsua")!=null){
        u.setApellidoUsua(req.getParameter("apellidoUsua"));
    }
    if(req.getParameter("tipoidUsua")!=null){
        u.setTipoidUsua(req.getParameter("tipoidUsua"));
    }
    if(req.getParameter("identificacionUsua")!=null){
        u.setIdentificacionUsua(Integer.parseInt(req.getParameter("identificacionUsua")));
    }
    if(req.getParameter("celularUsua")!=null){
        u.setCelularUsua(Integer.parseInt(req.getParameter("celularUsua")));
    }
    if(req.getParameter("correoUsua")!=null){
        u.setCorreoUsua(req.getParameter("correoUsua"));
    }
    if(req.getParameter("usuar")!=null){
        u.setUsuar(req.getParameter("usuar"));
    }
    if(req.getParameter("claveUsua")!=null){
        u.setClaveUsua(Integer.parseInt(req.getParameter("claveUsua")));
    }
    
    if(req.getParameter("estadoUsua") != null){
        u.setEstadoUsua(true);
    }
    else{
        u.setEstadoUsua(false);
    } 
    try {
        ud.registrarUsuario(u);
        System.out.println("Registro insertado correctamente");
    } catch (Exception e) {
        System.out.println("Error en la inserción del registro "+e.getMessage().toString());
    }
}

//------------------------- CONSULTAR REGISTROS DE USUARIOS ---------------------------
    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List usuario=ud.listar();
            req.setAttribute("usuario", usuario);
            req.getRequestDispatcher("views/consultarUsuario.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }


    //------------ ACTIVAR E INACTIVAR USUARIOS----------------

    private void cambiarEstado(HttpServletRequest request, HttpServletResponse response) {
       /*  DAOUSUARIO dao; ud
        usuario usu; u */ 
        try {
          
            if (request.getParameter("cambiar").equals("activar")) {
                u.setEstadoUsua(true);
            } else {
                u.setEstadoUsua(false);
            }

            if (request.getParameter("cod") != null) {
                u.setIdUsua(Integer.parseInt(request.getParameter("cod")));
                ud.estadoUsuario(u);
            } else {
                request.setAttribute("msje", "No se obtuvo el id del usuario");
            }

        } catch (Exception e) {
            request.setAttribute("msje", e.getMessage());
        }
        this.listar(request, response);
    }


}
