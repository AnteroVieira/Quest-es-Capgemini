package questao2capgemini;

import java.util.Scanner;

public class q2capgemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("Digite a sua senha");
    Scanner senha= new Scanner(System.in);
    String  n= senha.nextLine();
    if(n.length()< 6) {
    	System.out.print("Somente " +n.length()+ "caracteres!");
    	int tam= 6-n.length();
    	System.out.print("SUA SENHA DEVE CONTER 6 CARACTERES ACRESCENTE +"+ tam);
    		
    	
    	
    }
    else {;
    	 System.out.println("Senha forte!"+n.length()+"caracteres");
    }
    ;
    
	}

}
