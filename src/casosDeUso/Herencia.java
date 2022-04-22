package casosDeUso;

import componentes.DiscoDuro;
import componentes.Monitor;
import componentes.PC;
import componentes.TarjetaVideo;


/* Ejercicio Herencia */

/*
   En este directorio se incluyen las clases 
   - Monitor
   - Disco Duro
   - Tarjeta Video
   Cada una de estas clases tiene 2 atributos comunes:
   - marca
   - modelo
   
   1.- Modifique estas 3 clases de manera que hereden de una superclase llamada 'ComponentePC',
       en la que se encuentren estos atributos.  
       
   2.- Cree una clase llamada PC que también herede de ComponentePC y que este compuesta 
       por las clases Monitor, DiscoDuro y TarjetaVideo   
       
   3.- Implemente un método desplegarCaracterísticas en la clase PC que muestra sus
       propias características y las de sus componentes.
*/
class Herencia {
	public static void main(String[] args){
		DiscoDuro disco1=new DiscoDuro("Seagate","XD34","400Gb");
		DiscoDuro disco2=new DiscoDuro("Dell","Z360","600Gb");
	
		DiscoDuro[] arrDiscos =new DiscoDuro[]{disco1,disco2};
		
		TarjetaVideo tarjeta = new TarjetaVideo("Sony","YOKO34","2Gb");
		Monitor monitor = new Monitor("Samsung","Flat-56");
		PC miPc = new PC("Dell","Latitude E456",tarjeta,monitor,arrDiscos);
		miPc.desplegarCaracteristicas();
		/*
		 * Otra manera
		 
		
		PC otraPc = new PC();
		otraPc.setMarca("HP");
		otraPc.setModelo("Delirium 23");
		otraPc.setDiscos(arrDiscos);
		otraPc.setMonitor(monitor);
		otraPc.setTarjetaVideo(tarjeta);
		otraPc.desplegarCaracteristicas();
		
		/*
		 * Otra manera más
		 
		
		PC pc3 = new PC();
		pc3.setMarca("lenovo");
		pc3.setModelo("hard work");
		pc3.setDisco(disco1, 0);
		pc3.setDisco(disco2, 1);
		pc3.setMonitor(monitor);
		pc3.setTarjetaVideo(tarjeta);
		pc3.desplegarCaracteristicas();
		
		*/

		
		
	}
	
}
