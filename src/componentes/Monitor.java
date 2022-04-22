package componentes;
public class Monitor extends ComponentePC
{
	public Monitor(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo = modelo;
	}
 

	public void desplegarCaracteristicas()
	{
		System.out.println("--------------------");
		System.out.println("MONITOR:");
		System.out.println("   Marca     : " + this.getMarca());
		System.out.println("   Modelo    : " + this.getModelo());
		System.out.println("--------------------");
	}
 
	public void desplegar(String imagen)
	{
		System.out.println("Desplegando imagen...\n");
		System.out.println(imagen);
		System.out.println("");
	}
	public String getDescripcion(){
		return "Monitor";
	}

}
