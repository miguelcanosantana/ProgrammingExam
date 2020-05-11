package ejercicio4;
import java.util.ArrayList;

public class Usuario extends Persona implements Cliente {

  //_Variables
  private String telefonoUsuario;
  ArrayList<Articulo> listaObjetosComprados = new ArrayList();
  
  //_Constructor
  public Usuario(String nombrePersona, String emailPersona, String telefonoUsuario) {
    super(nombrePersona, emailPersona);
  }
  

  //_Override de la función compra() en la interfaz Cliente
  @Override
  public void compra(Comercial comercial, Articulo articulo) {
    comercial.listaVentaObjetos.add(articulo);
    listaObjetosComprados.add(articulo);
    
  }
}
