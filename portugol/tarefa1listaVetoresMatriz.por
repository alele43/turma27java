//EXERCICIO 1 - LISTA 4 VETOR E MATRIZ
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */

programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5], x, maiorPontuacao =0

		para (x=0; x<5; x++){
			escreva("Digite sua pontuação: ")
			leia(pontuacao[x])
			
			se(pontuacao[x] > maiorPontuacao){
				maiorPontuacao = pontuacao[x]
				}
			
		}
		limpa()
		
		para (x= 0; x<5; x++){
			escreva("Sua pontuação foi:  ",pontuacao[x])
			escreva("\n")
			}

		escreva("\n")	
		escreva("A maior pontuação foi: ",maiorPontuacao)
		escreva("\n-----------FIM DO PROGRAMA--------------\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 707; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */