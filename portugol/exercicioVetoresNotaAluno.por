programa
{
	//vetor de 4 alunos, nome de cada aluno.
	//vetor de 4 notas, nota de cada aluno.
	//REGRA: A NOTA ATÉ CINCO TEM QUE APARECER A MENSAGEM POR ALUNO - AINDA NÃO, ESTUDE MAIS
    // ACIMA DE 5, APROVADO, CONTINUE O BOM TRABALHO

	funcao inicio()
	{
		inteiro notas [4]
		cadeia nomes [4]

		para (inteiro i = 0; i < 4; i++) {
			escreva("\nDigite o nome do aluno: \n")
			leia(nomes[i])
			escreva("\nDigite a nota do aluno: \n")
			leia(notas[i])
		}

		escreva("\n ---------------------------------- \n")
		escreva("\nAlune " ,nomes[i], " Ficou com a nota: ", notas[i], "\n") 
		para(inteiro i = 0; i<4; i++){
			se (notas[i] >= 5) {
				escreva (nomes[i], " Ficou com a nota: ", notas[i], "Aprovado!\n") 
				} senao (notas[i] <= 5) {
					  escreva(nomes[i], " Ficou com a nota: ", notas[i], "Reprovado!\n")
					}
			
		} 

		escreva("FIM DO PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 836; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */