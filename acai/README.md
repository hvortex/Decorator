PRÁTICA - AÇAÍ

Ao comprar açaí, podemos adicionar complementos como leite em pó, banana, morango, mousse de maracujá, granulado, granola, leite condensado, entre outros. Cada adicional possui um custo adicional, que precisa ser lançado no sistema. Para evitar a criação de inúmeras combinações de açaí com diferentes adicionais, podemos utilizar o padrão de projeto Decorator.
Com o Decorator, começamos com um objeto base representando o açaí simples e, em tempo de execução, podemos “decorar” este objeto adicionando os complementos desejados.
Crie uma interface Adicional com os métodos getDescricao() e custo().
Crie uma classe Acai que implementa Adicional.
Crie uma classe BaseDecorator que implementa Adicional e contém um atributo Adicional chamado wrappee.
Crie as classes Morango, Banana e LeiteCondensado que estendem de BaseDecorator e sobrescrevem os métodos getDescricao() e custo().
Crie uma classe TestaDecorator para testar o padrão:
Crie um objeto Adicional que representa um Açaí simples.
Crie um objeto Adicional que adiciona Morango ao Açaí.
Crie um objeto Adicional que adiciona Morango, Leite Condensado e Banana ao Açaí.
Faça uma cópia do projeto e modifique o código para suportar tamanhos diferentes: pequeno, médio e grande e cobrar os adicionais de acordo com os tamanhos. Por exemplo: o morango custará R$ 1.00, R$ 1.50 e R$ 2.00 para pequeno, médio e grande, respectivamente.
Crie um enum Tamanho com valores PEQUENO, MEDIO, GRANDE.
Altere a classe Acai para receber o Tamanho no construtor.
Ajuste os decoradores para cobrar adicionais com base no tamanho do açaí.
