package fp.daw.examen2ev;

abstract class vehiculosMercancias extends vehiculo{
	private double precioBase=super.getPrecioBase();
	private String matricula;
	double pma;
	
	
	public vehiculosMercancias( double pma,String matricula) {
		super(matricula);
		this.pma=pma;
		
	}
	public double getPma() {
		return pma;
	}
	@Override
	public double getPrecioBase() {
		return precioBase+pma*20;	
	}
	
	public String toString() {
		return "el alquiler diario del vehiculo de Mercancias "+getMatricula()+" es de "+getPrecioBase();
		
	}

}
