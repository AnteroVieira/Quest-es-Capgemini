package questao1capgemini;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Digite um número");
		Scanner novo= new Scanner(System.in);
		int n;
		n= novo.nextInt();
		for (int i=1;i<=n;i++) {;
		for (int j =1;j<i;j++) {
			System.out.printf("*");
			
		}
		
		System.out.printf("*\n");

	}
		
}}
