# Teste-canil

Teste Prático


# O problema 

Senhor Eduardo é proprietário de um canil em Belo Horizonte, ele trabalha com diversas raças, pequenas e grandes. Eduardo gosta que seus cães estejam sempre arrumados, felizes e cheirosos. No bairro do canil, para realizar o banho nos animais, existem três petshops: Meu Canino Feliz, Vai Rex, e ChowChawgas. Cada um deles cobra preços diferentes para banho em cães pequenos e grandes e o preço pode variar de acordo com o dia da semana. 
● Meu Canino Feliz: Está distante 2km do canil. Em dias de semana o banho para cães pequenos custa R$20,00 e o banho em cães grandes custa R$40,00.      
Durante os finais de semana o preço dos banhos é aumentado em 20%. 
● Vai Rex: Está localizado na mesma avenida do canil, a 1,7km. O preço do banho para dias úteis em cães pequenos é R$15,00 e em cães grandes é R$50,00. Durante os finais de semana o preço para cães pequenos é R$ 20,00 e para os grandes é R$ 55,00. 
● ChowChawgas: Fica a 800m do canil. O preço do banho é o mesmo em todos os dias da semana. Para cães pequenos custa R$30 e para cães grandes R$45,00. Apesar de se importar muito com seus cãezinhos, Eduardo quer gastar o mínimo possível. Desenvolva uma solução para encontrar o melhor petshop para levar os cães. O melhor petshop será o que oferecer menores preços, em caso de empate o melhor é o mais próximo do canil.


# A solução

Para resolver o problema pensou se em separar em classes com os nomes dos Petshops, sendo assim assumindo que o usuário seja o dono do canil que utilizará esta solução, baseou-se em colocar as informações pedidas mais claras para o usuário, explicitando sempre o que deve ser digitado e qual tipo de saída.
 A entrada deve ser feita no formato data, mês e ano por separação com parênteses entre eles, em seguida é pedido a quantidade de cães pequenos e posteriormente com cães grandes. no final  a saída mostra o petshop com menor custo e o valor total do banho.

# Estruturação do código 

Foi utilizado a linguagem java e programação orientada a objeto, com 6 classes sendo a classe TestePraticoCanil a responsável pelas chamadas as outras classes pois é onde se localiza o main (menu) principal.
 Na estruturação do código criou se a classe petshop para servir como classe pai onde as classes de nomes dos petshops, MeuCaninoFeliz, VaiRex e ChowChawgas herdam métodos como: quantidade de animais pequenos e grandes e a melhor opção entre os petshops. 
Fazendo as classes dos petshops herdarem da classe pai cada petshop pode implementar suas próprias características e preços ou até mesmo futuras modificações e inclusões de novas funcionalidades essas classes possuem apenas o método de calcular o preço dos cachorros grandes e pequenos retornando para a função principal o valor total.
Criou se também uma classe chamada calendário, responsável por receber a data e retornar se esta data é um dia da semana ou um final de semana, retornando também o valor 1 para fim de semana, 2 para segunda a sexta e 0 para data incorreta. Na classe principal é passado para cada petshop a quantidade de animais pequenos e grandes se é um final de semana ou não a data que foi recebida pelo usuário, e ao retorno dos preços de cada petshop é instanciado a classe petshops passando para o método melhorOpcao os valores de cada petshop, sendo então este método responsável por dizer qual é o petshop com menor custo.  

# Instruções para Executar

É necessário ter o pacote instalado com a máquina virtual java com o JDK. Caso não tenha acesse o site da oracle e faça a instalação de acordo com o seu sistema operacional. Caso seu sistema operacional for windows 64 bits escolha o instalador do windows x64.
Em seguida deve descompactar o arquivo TestePratico-Canil.zip e abrir o .jar localizado no seguinte arquivo: dist/TestePratico-Canil.jar.  
Windows:
Caso seu sistema operacional for windows você simplesmente pode clicar com o botão direito e executar o arquivo.jar
Linux :
Abra o terminal na pasta do arquivo e digite o comando: java -jar TestePratico-Canil.jar


