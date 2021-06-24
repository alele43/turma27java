// PROGRAMA : NOME - OBJETIVO
//INICIO
	//VARIAVEIS
	//ENTRADAS
	//PROCESSAMENTOS
	//SAIDA
//FIM
//EXERCICIO 3 - LISTA 1 
/*Faça um sistema que leia o tempo de duração de um evento em uma *
 * fábrica expressa em segundos e mostre-o expresso *
 * em horas, minutos e segundos
 * segundos 
 * minutos = 1 minuto = 60 segundos
 * hora = 60 minutos = 3600 segundos 
*/

programa
{
	
	funcao inicio()
	{

		inteiro  tempoEvento, horas, minutos, segundos //VARIAVEIS
		
		escreva("Digite os segundos do evento: ") //ENTRADA 
		leia(tempoEvento) //ENTRADA
		
		horas = tempoEvento / 3600  //PROCESSAMENTO
		minutos = (tempoEvento % 3600) / 60 //PROCESSAMENTO
		segundos = (tempoEvento % 3600) % 60 //PROCESSAMENTO
		
		escreva("Horas: " +horas+"\n") //SAIDA
		escreva("Minutos: " +minutos+"\n") //SAIDA
		escreva("Segundos: " +segundos+"\n") //SAIDA
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 716; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */