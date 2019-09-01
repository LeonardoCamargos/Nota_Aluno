import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Autor Leonardo Camargos -_-
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Entre com seu nome e suas notas dos 3 trimestres");
		
		student.name = sc.nextLine();
		student.trimestre1 = sc.nextDouble();
		student.trimestre2 = sc.nextDouble();
		student.trimestre3 = sc.nextDouble();
		
		System.out.printf("Final do semestre:  %.2f%n", student.finalSemestre());
		
		if(student.finalSemestre() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Ausente %.2f pontos%n", student.pontosPerdidos());
		}
		else {
			System.out.println("Passou!");
		}
		
		
		sc.close();
	}

}
