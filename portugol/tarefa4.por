programa
{
	 inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
			inteiro a,b,c,r,s
			real d 
			
			escreva("Digite um numero inteiro: ")
			leia(a)
			escreva("Digite um numero inteiro: ")
			leia(b)
			escreva("Digite um numero inteiro: ")
			leia(c)

	r = Mat.potencia ((a+b),2)
	s = Mat.potencia ((b+c),2)
	d = r+s/2
	
        
        escreva("O valor de D é " + d )
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */