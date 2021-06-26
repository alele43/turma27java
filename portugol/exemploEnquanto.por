programa
{
	
	funcao inicio()
	{

		inteiro idade 
		inteiro contador =1 
		
		escreva("Digita sua idade: ")
		leia(idade)

		enquanto(idade <18){
			escreva ("Você não tem permissão de acesso a página!\n ")
			escreva("Digite sua idade: ")
			contador++
				se(contador >3){
				escreva("Você não possui mais tentativas!\n ")
				pare
				}
				leia(idade)
		}
		se(contador ==1){
			escreva("Parabéns, você tem acesso a página!\n ")
		} senao {
			escreva("Você não tem permissão de acesso a página!\n ")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */