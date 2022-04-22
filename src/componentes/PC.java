package componentes;

public class PC extends ComponentePC{
	private TarjetaVideo tarjetaVideo;
	private Monitor monitor;
	private DiscoDuro[] discos;
	
	
	public PC(String marca, String modelo, TarjetaVideo tarjetaVideo,
			Monitor monitor, DiscoDuro[] discos) {
		this.marca = marca;
		this.modelo = modelo;
		this.tarjetaVideo = tarjetaVideo;
		this.monitor = monitor;
		this.discos = discos;
	}

	public void desplegarCaracteristicas(){
		System.out.println("=============================");
		System.out.println("Características de la PC");
		System.out.println("Marca:"+this.getMarca());
		System.out.println("Modelo:"+this.getModelo());
		this.tarjetaVideo.desplegarCaracteristicas();
		this.monitor.desplegarCaracteristicas();
		this.discos[0].desplegarCaracteristicas();
		this.discos[1].desplegarCaracteristicas();
		System.out.println("=============================");
	}

	/*
	public PC(String marca, String modelo,
			TarjetaVideo tarjetaVideo, Monitor monitor, 
			DiscoDuro[] discos) {
		super(marca,modelo);
		this.tarjetaVideo = tarjetaVideo;
		this.monitor = monitor;
		this.discos = discos;
	}
	
	public PC(){
		super(null,null);
	}*/

	public TarjetaVideo getTarjetaVideo() {
		return tarjetaVideo;
	}

	public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public DiscoDuro[] getDiscos() {
		return discos;
	}

	public void setDiscos(DiscoDuro[] discos) {
		this.discos = discos;
	}
	public void setDisco(DiscoDuro nuevoDisco, int numDisco){
		if (this.discos == null){
			this.discos = new DiscoDuro[2];
		}
		if (numDisco >= this.discos.length)
			return;
		this.discos[numDisco]= nuevoDisco;
	}
	public String getDescripcion(){
		return "PC";
	}

}
