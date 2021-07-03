//EXERCICIO 2 - LISTA 2


programa
{
	
	funcao inicio()
	{
		// R$ 10,00 por hora
		//Quando o número de horas exceder a 50 = excesso de pagamento armazenando-o na variável 
		//hora excedente de trabalho vale R$ 20,00
		//caso contrário zerar tal variável
		//imprimir o salário total e o salário excedente.

		
		real numHoras = 0.0
		real horasExtra = 0.0
		real salarioTotal = 0.0 
		real salarioExtra = 0.0
		
		
		

		escreva("Digite quantas horas trabalhadas: ")
		leia(numHoras)
		
		salarioTotal = numHoras * 10 
		escreva("\nSeu salário é: " ,salarioTotal)    
		
		se( numHoras > 50) {
			horasExtra = numHoras - 50
			salarioExtra = horasExtra*20
			escreva("\nSeu salário extra é: " ,salarioExtra)
			
			} 
			 senao {
			 	
				escreva("\nVocê não realizou horas extras!")    
			}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */