package model;

public class UsuarioVo {
    //----------------- ATRIBUTOS ----------------
    private int idUsua;
    private String nombreUsua;
    private String apellidoUsua;
    private String tipoidUsua;
    private int identificacionUsua;
    private int celularUsua;
    private String correoUsua;
    private String usuar;
    private int claveUsua;
    private boolean estadoUsua;
    

    //-------------- METODO CONSTRUCTOR ------------------
    public UsuarioVo(){

    }

    //------------------------- METODO CONSTRUCTOR CON PARAMETROS ------------------

    public UsuarioVo(int idUsua, String nombreUsua, String apellidoUsua, String tipoidUsua, int identificacionUsua, int celularUsua, String correoUsua, String usuar, int claveUsua, boolean estadoUsua) {
        this.idUsua = idUsua;
        this.nombreUsua = nombreUsua;
        this.apellidoUsua = apellidoUsua;
        this.tipoidUsua = tipoidUsua;
        this.identificacionUsua = identificacionUsua;
        this.celularUsua = celularUsua;
        this.correoUsua = correoUsua;
        this.usuar = usuar;
        this.claveUsua = claveUsua;
        this.estadoUsua = estadoUsua; 
    }

//-------------- METODOS ACCESORES ------------

    public int getIdUsua() {
        return idUsua;
    }

    public void setIdUsua(int idUsua) {
        this.idUsua = idUsua;
    }

    public String getNombreUsua() {
        return nombreUsua;
    }

    public void setNombreUsua(String nombreUsua) {
        this.nombreUsua = nombreUsua;
    }

    public String getApellidoUsua() {
        return apellidoUsua;
    }

    public void setApellidoUsua(String apellidoUsua) {
        this.apellidoUsua = apellidoUsua;
    }

    public String getTipoidUsua() {
        return tipoidUsua;
    }

    public void setTipoidUsua(String tipoidUsua) {
        this.tipoidUsua = tipoidUsua;
    }

    public int getIdentificacionUsua() {
        return identificacionUsua;
    }

    public void setIdentificacionUsua(int identificacionUsua) {
        this.identificacionUsua = identificacionUsua;
    }

    public int getCelularUsua() {
        return celularUsua;
    }

    public void setCelularUsua(int celularUsua) {
        this.celularUsua = celularUsua;
    }

    public String getCorreoUsua() {
        return correoUsua;
    }

    public void setCorreoUsua(String correoUsua) {
        this.correoUsua = correoUsua;
    }

    public String getUsuar() {
        return usuar;
    }

    public void setUsuar(String usuar) {
        this.usuar = usuar;
    }

    public int getClaveUsua() {
        return claveUsua;
    }

    public void setClaveUsua(int claveUsua) {
        this.claveUsua = claveUsua;
    }

    
   
    public boolean getEstadoUsua() {
        return estadoUsua;
    }

    public void setEstadoUsua(boolean estadoUsua) {
        this.estadoUsua = estadoUsua;
    }

    
    
   
     

     

  

    

   
   
    


   
    
}
