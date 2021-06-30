//EXERCICIO 3 - LISTA VETORES E MATRIZES

programa
{
	
	funcao inicio()
	{

		inteiro N1[4][6]
		inteiro N2[4][6]
		inteiro M1[4][6]
		inteiro M2[4][6]

		inteiro linha =0
		inteiro coluna =0

//giro da matriz
		para(linha=0; linha<4; linha++){
			para(coluna=0; coluna<6; coluna++){
				escreva("\nDigite o valor de: " ,linha," - ",coluna, " N1: ")
				leia(N1[linha][coluna])
				escreva("\nDigite o valor de: " ,linha," - ",coluna, " N2: ")
				leia(N2[linha][coluna])	
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				
				/*N1[linha][coluna]=Util.sorteia(3,5)
				 * N2[linha][coluna]=Util.sorteia(0,2)
				 * M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				 * M2[linha[coluna]=N1[linha][coluna]-N2[linha[coluna]
				 */
			}
		}
		escreva("MATRIZ N1")
		para(linha=0; linha<4; linha++){
			para(coluna=0; coluna<6; coluna++){
			escreva(N1[linha][coluna], " ")
		}
		escreva("\n")	
			}
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */