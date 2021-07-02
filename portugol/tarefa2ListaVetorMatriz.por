//EXERCICIO 2- LISTA 4 VETORES E MATRIZES
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/
 


programa
{
	
	funcao inicio()
	{
		inteiro dado[10], x
		inteiro media = 0
		inteiro soma = 0
		inteiro maiorPontuacao =  0
		inteiro contador = 0
		
		para (x=0; x<10; x++){

			escreva("Digite um numero de 1 a 6: ")
			leia(dado[x])

			//dado[i] = Util.sorteia(1,6)
			}
			limpa()

		para (x=0; x<10; x++) {
			escreva("\nSua jogada foi: ",dado[x])
			escreva("\n")
		}
		
		escreva("\n A soma dos numeros foram: ",soma += dado[x])
		escreva("\n A média foi: ",media = soma / 10)
			





			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 836; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */