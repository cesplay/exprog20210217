package fp.daw.examen2ev;

public final class camion extends vehiculosMercancias{
	private double precioBase=super.getPrecioBase();
	private String matricula;
	double pma=super.getPma();
	
	public camion(double pma, String matricula) {
		super(pma, matricula);
	}
	@Override
	public double getPrecioBase() {
		return precioBase+pma*20+40;	
	}
	
}
