//EXCERCICIO 1 - LISTA 2

programa
{
	
	funcao inicio()
	{

		real pesoTomates, E, M
		
		escreva("Qual o peso dos tomates em kg? ")
		leia(pesoTomates) 

		E = pesoTomates - 50
		M = E*4
		
		se (pesoTomates >50 ){
			escreva("Pagar multa de " +M+ " reais")
			
			} senao {
				escreva("ZERO ")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 25; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */