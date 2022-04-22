package componentes;

public class DiscoDuro extends ComponentePC{
	private String capacidad;
 
 public void desplegarCaracteristicas()
 {
  System.out.println("--------------------");
  System.out.println("DISCO DURO:");
  System.out.println("   Marca     : " + this.getMarca());
  System.out.println("   Modelo    : " + this.getModelo());
  System.out.println("   Capacidad : " + this.capacidad);
  System.out.println("--------------------");
 }

 public DiscoDuro(String marca, String modelo,  String capacidad) {
	this.marca = marca;
	this.modelo = modelo;
	this.capacidad = capacidad;
 }


 public String leerImagen(String nombreImagen)
 {
  String imagen = new String();
  
  System.out.println("Leyendo imagen [" + nombreImagen + "]");
  
  for(int i=0; i<nombreImagen.length(); i++)
  {
   imagen = imagen + "*";
  }
  return imagen;
 }
	public String getDescripcion(){
		return "Disco duro";
	}

}
