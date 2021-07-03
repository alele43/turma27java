programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva ("Digite um numero: ")
		leia(num)

		se(num < 0 ){
			escreva("Não é possível calcular com numero negativo! ")
		}
		senao se  (num % 2 == 0) {
			escreva( "Esse número " +num+ " é par! ")
			
		} 
		senao {
			escreva ("Esse número " +num+ " ímpar! ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */