import java.util.Scanner;
public class Atleta {
	String nome;
	int tx;
	
	Scanner leia = new Scanner(System.in);
	
	
	// Cadastro do atleta
	public void cadastrar() {
		System.out.println("Qual o nome do atleta?");
		this.nome = leia.next();
		System.out.println("Qual a taxa de testosterona do atleta?");
		this.tx = leia.nextInt();
	}
	
	
	//Calculo de testosterona
	public void calcular() {
		if (this.tx > 1400) {
			System.out.println("Testosterona acima dos limites padrões. O atleta "+this.nome+" foi desclassificado");
			
		}else {
			System.out.println("Testosterona dentro dos limites padrões. O atleta "+this.nome+" poderá participar da comnpetição");
		};
		
			
	}
	
}
