//EXERCICIO 2 - LISTA 1

//Faça um sistema que leia a idade de uma pessoa expressa
//em dias e mostre-a expressa em anos, meses e dias. 




programa
{
	
	funcao inicio()
	{
		inteiro  idadeDias, anos, meses, dias //VARIAVEIS
		
		escreva("Digite seu ano de nascimento: ") //ENTRADA 
		leia(idadeDias) //ENTRADA

		anos = 2021 - idadeDias  //PROCESSAMENTO
		meses = idadeDias / 30 //PROCESSAMENTO
		dias = idadeDias % 365 //PROCESSAMENTO
		
		escreva("Anos: " +anos+ "\n") //SAIDA
		escreva("Meses: " +meses+ "\n") //SAIDA
		escreva("Dias: " +dias+ "\n") //SAIDA
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */