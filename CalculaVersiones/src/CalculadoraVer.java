
public class CalculadoraVer {

	private int num;
	private int num2;
	
	public CalculadoraVer(int num, int num2) {
		this.num = num;
		this.num2 = num2;
	}
	
	
	public int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	public int restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	
	public int multiplicar(int num1, int num2) {
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}
}
