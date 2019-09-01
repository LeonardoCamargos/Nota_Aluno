
public class Student {
	//Atributos
	
	public String name;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	
	//Metodos
	
	public double finalSemestre() {
		return trimestre1 + trimestre2 + trimestre3;
	}
	
	public double pontosPerdidos() {
		if(finalSemestre() < 60.0) {
			return 60.0 - finalSemestre();
		}
		else {
			return 0.0;
		}
	
	}
}
