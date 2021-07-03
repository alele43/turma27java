// EXERCICIO 3 - LISTA 2


programa
{
	//Leia 4 (quatro) números
	//Calcule o quadrado de cada um;
	//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	funcao inicio()
	{
		inteiro num1, num2, num3, num4

		
		escreva("Digite um numero inteiro: ")
		leia(num1)
		escreva("Digite outro numero inteiro: ")
		leia(num2)
		escreva("Digite outro numero inteiro: ")
		leia(num3)
		escreva("Digite outro numero inteiro: ")
		leia(num4)

		num1 = num1*num1
		num2 = num2*num2
		num3 = num3*num3
		num4 = num4*num4
		
		se (num3 >= 1000){
			escreva("\nO terceiro número digitado é: ",num3, " portanto maior que 1000. ")
			escreva("\nPrograma Finalizado!!!!!")	
		}
		 senao{
			escreva("\nOs números ao quadrado são:\n",num1,"\n",num2,"\n",num3,"\n",num4,"\n")
			}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 881; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */