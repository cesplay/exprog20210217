package fp.daw.examen2ev;

public final class furgoneta extends vehiculosMercancias{
	private double precioBase=super.getPrecioBase();
	private String matricula;
	double pma=super.getPma();
	
	public furgoneta(double pma, String matricula) {
		super(pma, matricula);
	}
	
}
