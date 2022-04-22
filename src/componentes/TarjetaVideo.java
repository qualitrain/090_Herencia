package componentes;
/*
   Esta clase es usada por la clase 'PC'.
*/

public class TarjetaVideo extends ComponentePC
{
 	private String memoria;
 
   public TarjetaVideo(String marca,String modelo, String memoria)
   {
	   this.marca = marca;
	   this.modelo = modelo;
	   this.memoria = memoria;
   }
 
 
 	public String getDescripcion(){
		return "Tarjeta de Video";
	}


public void desplegarCaracteristicas(){
	   System.out.println("--------------------");
	   System.out.println("TARJETA DE VIDEO:");
	   System.out.println("   Marca     : " + this.getMarca());
	   System.out.println("   Modelo    : " + this.getModelo());
	   System.out.println("   Memoria   : " + this.memoria);
	   System.out.println("--------------------");
   }
 
   public void procesarImagen(String imagen,Monitor monitor){
	   System.out.println("Procesando imagen...");
	   monitor.desplegar("imagen" + imagen + "imagen");
   }
}
