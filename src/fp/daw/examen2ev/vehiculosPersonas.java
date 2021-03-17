package fp.daw.examen2ev;

abstract class vehiculosPersonas extends vehiculo{
	private double precioBase=super.getPrecioBase();
	private String matricula;
	private double plazas;
	

	public vehiculosPersonas( double plazas,String matricula) {
		super(matricula);
		this.plazas=plazas;
	}
	public double getPlazas() {
		return plazas;
	}
	public double getPrecioBase() {
		return precioBase+plazas+1.5;	
	}
	
	public String toString() {
		return "el alquiler diario del vehiculo de personas "+getMatricula()+" es de "+getPrecioBase();
		
	}
}
