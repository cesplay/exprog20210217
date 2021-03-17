package fp.daw.examen2ev;

public final class microbus extends vehiculosPersonas{
	private double precioBase=super.getPrecioBase();
	private String matricula;
	private double plazas=super.getPlazas();

	
	public microbus(int plazas, String matricula) {
		super(plazas, matricula);
	}
@Override
	public double getPrecioBase() {
		return (precioBase+plazas*2+2);	
	}
}
