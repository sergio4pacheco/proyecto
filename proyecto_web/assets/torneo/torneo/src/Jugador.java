public class Jugador {
    String nombre;
    String apellido;
    String rol ;
    String numerocam;  
    String dni ; 
    String obrasocial ; 
    String aptomedico;
   
    public Jugador(String nombre, String apellido, String rol, String numerocam, String dni, String obrasocial,
        String aptomedico) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.rol = rol;
      this.numerocam = numerocam;
      this.dni = dni;
      this.obrasocial = obrasocial;
      this.aptomedico = aptomedico;
    }
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public String getApellido() {
      return apellido;
    }
    public void setApellido(String apellido) {
      this.apellido = apellido;
    }
    public String getRol() {
      return rol;
    }
    public void setRol(String rol) {
      this.rol = rol;
    }
    public String getNumerocam() {
      return numerocam;
    }
    public void setNumerocam(String numerocam) {
      this.numerocam = numerocam;
    }
    public String getDni() {
      return dni;
    }
    public void setDni(String dni) {
      this.dni = dni;
    }
    public String getObrasocial() {
      return obrasocial;
    }
    public void setObrasocial(String obrasocial) {
      this.obrasocial = obrasocial;
    }
    public String getAptomedico() {
      return aptomedico;
    }
    public void setAptomedico(String aptomedico) {
      this.aptomedico = aptomedico;
    }

    
   
   
   
  
  
  
  
  
  }