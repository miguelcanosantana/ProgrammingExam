package ejercicio4;

public class Persona {

  //Variables
  protected String nombrePersona;
  protected String emailPersona;

  //_Constructor
  public Persona(String nombrePersona, String emailPersona) {
    this.nombrePersona = nombrePersona;
    this.emailPersona = emailPersona;
  }

  //toString genérico (Usado en Comercial con datos variantes)
  /*
  
  @Override
  public String toString() {
    return "Nombre: " + nombrePersona + "\n"+ "Email: " + emailPersona;
  }

  */

}
