package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	
	public String verificarIntegridad() {
		int i;
		int Testcode = registro;
		for (i = 0; i < asientos.length; i++) {
			Asiento Silla = asientos[i];
			if (Silla.registro != Testcode) {
				return "Las piezas no son originales";
			}
		}
		if (motor.registro != Testcode) {
			return "Las piezas no son originales";
		}
		return "Auto original";
	}
}
