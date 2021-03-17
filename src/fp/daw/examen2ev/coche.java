package fp.daw.examen2ev;

public final class coche extends vehiculosPersonas{
	private double precioBase=super.getPrecioBase();
	private String matricula;
	private double plazas=super.getPlazas();

	
	public coche(int plazas, String matricula) {
		super(plazas, matricula);
	}
	
	
	
}
