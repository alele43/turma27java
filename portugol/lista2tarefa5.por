//EXERCICIO 5 - LISTA 2

programa
{
	
	funcao inicio()
	{
		// 3 grupos de indústrias POLUIDORAS.
		//índice de poluição aceitável varia de 0,05 até 0,25
		
		real indicePoluicao = 0.0
		
		
		escreva("Informe qual a taxa de poluição da sua empresa? ")
		leia(indicePoluicao)
		

		se (indicePoluicao >= 0.3 e <= 0.4) {
			escreva("\nO grupo 1 está intimado a suspender as atividades!\n")
		
		}
		senao se ( indicePoluicao >= 0.4 e <= 0.5) {
				escreva("\nOs grupos 1 e 2 estão intimados a suspenderem suas atividades!\n")
						
		}
		senao se (indicePoluicao >= 0.5) {
			escreva("\nTodos os grupos estão intimados a paralisarem suas atividades!\n")	
		}
		senao se (indicePoluicao < 0.25) {
			
			escreva("\nParabéns estão dentro do limite aceitável! ")	
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */