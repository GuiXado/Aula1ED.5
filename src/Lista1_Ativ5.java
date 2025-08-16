import javax.swing.JOptionPane;

public class Lista1_Ativ5 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		double a = rec(n);
		JOptionPane.showMessageDialog(null, "A somatória é: " + a);
	}
	
	public static double rec(int n) {
		// Ponto de parada foi dado quando "n" for 1 a soma será de 1.
		if(n == 1) {
			return 1;
		/* Tava a dica, mas foi difícil, começaria do menor ao maior valor de "n" o caso 1/2 depois 1/3,
		 * a divisão por 1.0 foi só pra fazer a conta virar double. Como para em 1, tem o retorno 1 + 1/2...
		 * 1,5 + 1/3... */
		} else {
			return  1.0 / n + rec(n-1);
		}
			
	}

}
