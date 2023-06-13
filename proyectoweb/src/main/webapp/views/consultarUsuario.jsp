<%@include file="header.jsp" %>
<link rel="stylesheet" type="text/css" href="assets/css/usuarios.css"> 
<script src="https://kit.fontawesome.com/2ee23e2b77.js" crossorigin="anonymous"></script>
<div class="flex-fill flex-grow-1 ms-3">

    <!-- <h1>Lista de Usuarios</h1> -->
    <a type="button" class="boton" href="usuario?accion=abrirForm">
    <i class="bi bi-plus-circle"></i> 
    Agregar Usuario
    </a>
  
    <div id="container">
   <table>
   
          <tr>
              <th>Id</th>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Tipo identificacion</th>
              <th>Identificacion</th>
              <th>Celular</th>
              <th>Correo</th>
              <th>Usuario</th>
              <th>Clave</th>
              <th><center>Estado</center></th>            
              <th colspan="3"><center>Acciones</center></th> 
          </tr>
          
  <c:forEach var="usuario" items="${usuario}">         
          
          <tr>
          <td>${usuario.getIdUsua()}</td>
          <td>${usuario.getNombreUsua()}</td>
          <td>${usuario.getApellidoUsua()}</td>
          <td>${usuario.getTipoidUsua()}</td>
          <td>${usuario.getIdentificacionUsua()}</td>
          <td>${usuario.getCelularUsua()}</td>
          <td>${usuario.getCorreoUsua()}</td>
          <td>${usuario.getUsuar()}</td>
          <td>${usuario.getClaveUsua()}</td>
           <c:if test="${usuario.getEstadoUsua() == true}">
             <td><span class="badge bg-success active">Activo</span></td> 
          </c:if>
          <c:if test="${usuario.getEstadoUsua() == false}">
              <td><span class="badge bg-danger active">Inactivo</span></td> 
          </c:if>
          
        <td>
          <button type="submit" class="btn btn-editar"><i class="fa-solid fa-pen"></i></button>
        </td>
        <td>
          <button type="submit" class="btn btn-activar"> <i class="fa-solid fa-user-plus"></i></button>
        </td>
        <td>
          <button type="submit" class="btn btn-desactivar"><i class="fa-solid fa-user-minus"></i></button>
        </td>
          <!-- <td>
           <c:if test="${usuario.getEstadoUsua() == true}">
             <a usuario="button" 
             class="btn btn-danger btn-sm" 
             onclick=""> 
          Inactivar
          </a>
          </c:if>
          <c:if test="${usuario.getEstadoUsua() == false}">
              <a usuario="button" 
              class="btn btn-success btn-sm" 
            >
          Activar
          </a>
          </c:if>  
          <c:choose>
              <c:when test="${usuario.estadoUsua == true}">
                <input type="hidden" id="item" value="${usuario.idUsua}">
                  <a id="desactivarUsuario" href="usuario?cambiar=desactivar&cod=${usuario.idUsua}" class="btn btn-danger"  data-toggle="tooltip" title="Desactivar" data-original-title="Desactivar">
                    <i class="fa fa-remove"></i></a>
              </c:when>
              <c:otherwise>
                <input type="hidden" id="item" value="${usuario.idUsua}">
                  <a id="activarUsuario" href="usuario?cambiar=activar&cod=${usuario.idUsua}" class="btn btn-primary" data-toggle="tooltip" title="Activar" data-original-title="Activar">
                     <i class="glyphicon glyphicon-eye-open"></i></a>
               </c:otherwise>
          </c:choose>
          </td> -->
          
          
          <!-- <td>
          <a usuario="button" 
          class="btn btn-warning" 
          href="">
          <i class="fa-solid fa-pen"></i>
          </a>
  
          <a usuario="button" 
          class="btn btn-danger" 
          onclick="">
          
          <i class="fa-solid fa-user-plus"></i>
          </a>
          
          </td>
          <tr> -->
       
  </c:forEach>    
  
 
  </table>
</div>
  
  
  </div> 
  </div>