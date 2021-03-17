package fp.daw.examen2ev;

abstract class vehiculo {
	private double precioBase= 50;
	private String matricula;


	public vehiculo(String matricula) {
		this.matricula=matricula;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public double getPrecioAlquiler(int dias) {
		return getPrecioBase()*dias;
	}
	
}
