import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		//Random serves to select a random number in the declared variable
		int aleatorio = random.nextInt(100) + 1;
		int palpite = 0;
		int tentativas = 0;
		
		System.out.println("============= ADIVINHE O NÚMERO =============");
		System.out.println("================== 1 A 100 ==================");
		
		while(palpite != aleatorio) {
			
			System.out.print("Digite seu palpite: ");
			palpite = input.nextInt();
			tentativas++;
			
			if (palpite > aleatorio) {
				System.out.println("Palpite maior que número. Tente novamente");
			}else if(palpite < aleatorio){
				System.out.println("Palpite menor que número. Tente novamente");
			}
			else{
				System.out.println("Parabéns! você acertou em "+ tentativas + " tentativas");
			}
		}
		input.close();	
		}	
}
