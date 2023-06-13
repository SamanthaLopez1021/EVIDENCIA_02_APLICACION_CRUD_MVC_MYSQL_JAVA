<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="header.jsp" %>
<link rel="stylesheet" type="text/css" href="assets/css/formulario.css">
<form action="usuario" method="post">
    <div class="form-group">
        <label for="nombreUsua">Nombre</label>
        <input type="text" name="nombreUsua" id="nombreUsua" class="form-control">
    </div>
    <div class="form-group">
        <label for="apellidoUsua">Apellido</label>
        <input type="text" name="apellidoUsua" id="apeliidoUsua" class="form-control">
    </div>
    <div class="form-group">
        <label for="tipoidUsua">Tipo de identificacion</label>
        <input type="text" name="tipoidUsua" id="tipoidUsua" class="form-control">
    </div>
    <div class="form-group">
        <label for="identificacionUsua">Numero identificacion</label>
        <input type="text" name="identificacionUsua" id="identificacionUsua" class="form-control">
    </div>
    <div class="form-group">
        <label for="celularUsua">Celular</label>
        <input type="text" name="celularUsua" id="celularUsua" class="form-control">
    </div>
    <div class="form-group">
        <label for="correoUsua">Correo</label>
        <input type="text" name="correoUsua" id="correoUsua" class="form-control">
    </div>
    <div class="form-group">
        <label for="usuar">Usuario</label>
        <input type="text" name="usuar" id="usuar" class="form-control">
    </div>
    <div class="form-group">
        <label for="claveUsua">Contraseña</label>
        <input type="password" name="claveUsua" id="claveUsua" class="form-control">
    </div>
    <div>
    <div class="form-check">
        <input type="checkbox" name="estadoUsua" id="estadoUsua" checked class="form-check-input">
        <label for="estadoUsua">Activo</label>
    </div>
        <button type="submit" class="btn btn-primary" name="accion" value="add">Guardar</button>
    </div>
</form>