# Calculadora de Imposto de Renda - Manipulando listas em java

Para calcular o imposto de renda que deve ser pago por seus cidadãos, um país aplica as seguintes regras:

1- O imposto a ser pago sobre o salário deverá ser deduzido confome a tabela abaixo para **ganhos mensais**:  :arrow_down:

**Salário**           | **Imposto**      
-----------------------|-----------------
Abaixo de R$ 3.000,00  |Isento
R$ 3.000,00 até R$ 5.000,00 exclusive | 10%
R$ 5.000,00 ou acima| 20%

2- Adiconados a esse valor, devem ser incluídos os seguintes encargos:

* Para renda com prestação de serviços -> + 15% sobre o valor do serviço;
* Para renda com capital (imóveis, ações, etc) -> + 20% sobre o valor do capital.

  Por fim, a pessoa pode abater até 30% do imposto bruto com os gastos médicos ou/e educacionais, porém caso tais gastos sejam abaixo dos 30% do imposto bruto, apenas o valor dos gastos médicos e educacionais podem ser abatidos.

## Implementação:

O setor de TI das autoridades do país identificou e descreveu os requisitos criando uma classe para instaciar os dados de determinado número de contribuintes, armazenando suas informações em **listas** para serem usadas nos cálculos, o que facilita para cada família realizar o calculo de todos os membros:

![TaxPayer_Class](https://github.com/Lucimararocha872/Calculadora_De_Aumento_salarial/assets/96544129/c1f0586b-d98b-455e-ad02-e6be9bfa81d7)


## Demo


![demo_contributors2](https://github.com/Lucimararocha872/Calculadora_Imposto_de_Renda/assets/96544129/13ada054-74a2-4c92-a5dd-1f3db169f1b5)

## Para testar o programa:
Clone o repositório ou extraia os arquivos e posteriormente abra o projeto em uma IDE (eu utilizei o eclipse para desenvolver), compile o projeto e calcule impostos fictícios, ou reais!  :sweat_smile:
