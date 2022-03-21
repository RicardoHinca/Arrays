package arrays.desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
//Calcular a media de um aluno, o usuario vai passar essas nota
//Primeira pergunta é quantas notas voce quer informar? quero informar x notas
//ai se cria um array de x posicoes para informar as notas
//2 laços for, a primeira  voce vai pegar as notas e armazenar em um array for tradicional
// digite nota 1 digite nota 2....
// ir novamente no array usando foreach vai somar todas as notas em uma vriavel soma e no final voce 
// apresenta a media do aluno 
		
		Scanner entrada = new Scanner (System.in); //Sempre que quiser interação do usuario usar scanner para digitar
		
		System.out.println("Quantas notas você quer adicionar: "); // mostrando na tela a pergunta 
		
		int qtdeNotas = entrada.nextInt(); // campo onde vai ser armazenada a resposta do usuario
		// System.out.println(qtdeNotas); Apenas para ver se o programa estava funcionando ate aqui.
		
		double [] notas = new double[qtdeNotas]; // iniciando o array colocando a resp do usuario no valor de campos a ser preenchido
		
		for(int i = 0; i < notas.length; i++) { //inciando o laço for, definindo a variavel I, informando para ele que a variavel
												// i < a ultima nota do array ele saia do laço e por ultimo incremento de i+1
			System.out.print("Informe a nota " + (i + 1) + ": "); 
			notas[i] = entrada.nextDouble(); // necessarios para que eu digite a nota para o sistema armazenar 
		}
		// System.out.println(Arrays.toString(notas)); Apenas para ver se o programa estava funcionando ate aqui.
		
		double total = 0; // criando variavel total 
		for(double nota : notas) { // novo laço foreach onde defino a variavel nota puxando o array notas
			total += nota; // a variavel que criamos sendo a soma de todas as notas do nosso array
		}
		
		double media = total / notas.length; // nova variavel media puxando o total das notas / pelo num notas informadas pelo usuario
		System.out.println("A média é " + media + "!");
		
		entrada.close(); // finalizando o scanner
	}
}
