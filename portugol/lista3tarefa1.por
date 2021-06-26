//EXERCICIO 1  - LISTA 3
/*Pesquisa entre 20 habitantes, coletando dados sobre: Salário e Número de filhos. 
 * A prefeitura deseja saber:   
 * média do salário da população; 
 * média do número de filhos; 
 * maior salário; 
 * percentual de pessoas com salário até R$100,00.  
*/

programa
{

	funcao inicio()
	{
		real salario, salarioTotal, mediaSalario, mediaFilhos, filhosTotal, maiorSalario, porcentagem
		inteiro filhos, abaixoDeCem  

		salario = 0.0
		salarioTotal = 0.0
		mediaSalario = 0.0
		filhos = 0
		filhosTotal = 0
		mediaFilhos = 0.0
		maiorSalario = 0.0
		abaixoDeCem = 0
		porcentagem = 0

		para (inteiro i = 1; i <= 4; i++){
			
			escreva("Digite o valor de seu salário: ")
			leia(salario)
			salarioTotal += salario

			mediaSalario = salarioTotal/4

			escreva("Digite quantos filhos você tem: ")
			leia(filhos)
			filhosTotal += filhos

			mediaFilhos = filhosTotal/4

		
			se (salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario < 100.00){
				abaixoDeCem= abaixoDeCem + 1
				porcentagem = ((abaixoDeCem*100)/4)
			}

		}

		escreva("A média salarial é: "+mediaSalario+" R$\n")
		escreva("A média de filhos é: "+mediaFilhos+"\n")
		escreva("O maior salário é: "+maiorSalario+" R$\n")
		escreva("A porcentagem de pessoas que recebem menos de R$100 é: "+(porcentagem)+"%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */