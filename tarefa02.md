1. ## O que é REST?
REST significa Tranferência de Estado Representacional e é uma arquitetura de API criada por Dr. Roy Fielding em 2000, que oferece mais flexibilidade no serviços de software, sendo comumente usado em arquiteturas de microsserviços e outra estruturas complexas de rede. Os software que utilizam REST são chamados de RESTful.

2. ## Diferencia REST e RESTful.
REST é a arquitetura de API, e RESTful são as aplicações Web que utilizam REST em seus serviços.

3. ## Uma das características do REST é ser Stateless. O que significa?
Significa uma método de comunicação sem estado, ou seja, o servidor executa uma solicitação independentemente da ordem e das demais solicitações. 

4. ## Na arquitetura REST o que são os verbos HTTP? explique cada um deles.
Os verbos HTTP são:
* POST - método para criar um novo elemento 
* PUT  - usado para atualizar algum elemento
* GET - método para ler/listar dados de um ou mais elementos
* DELETE - usado para deletar algum elemento

5. ## Uma solicitação em REST, geralmente, consiste em verbo, header, caminho do recurso e corpo da mensagem. Explique esses itens (exceto verbo, que já foi explicado na questão anterior).

* Header: contém informações necessárias do cliente, como chave de API, token de autorização, endereço IP entre outros dados.

* Caminho do recurso / endpoint / URI: indica o caminho no servidor que se encontra os recursos. Normalmente é usada a URL (Universal Resource Location) que é um tipo de URI (Universal Resource Indentifier).

* Corpo da mensagem: são dados enviado na requisição em métodos POST / PUT, que podem ser em formato JSON ou XML.

6. ## Ao usar o protocolo HTTP com o REST podemos utilizar os status dos códigos HTTP padrão. Explique a família de códigos 100, 200, 300 , 400 e 500.
Precisa ter na reposta: apenas o código base (100, 200, 300, 400 e 500) e que classes de status são eles. Cite e explique os códigos que você tem familiaridade!

* 100 - classe informativa: em geral, informam o cliente sobre a requisição, que deve ser continuada. Ex: 101: o servidor está processando a requisição

* 200 - classe de sucesso: informam que a operação foi bem sucedida. Ex: 201: informa que o objeto foi criado com sucesso

* 300: - classe de múltiplos status: indica que a requisição tem mais de um status, e que é preciso escolher um.

* 400 - classe de erro no lado do cliente: informa que a requisição não chegou ao servidor devido a um erro no lado do cliente. Ex: 404: informa que o cliente acessou um endpoint que não existe

* 500 - classe de erro no lado do servidor: informa que o ocorreu um erro não tratado no servidor ao receber a requisição. Ex 501: significa que o método não está implementado no servidor 

7. ## Ao se trabalhar com REST podemos utilizar a representação de dados em JSON ou XML? Explique essas duas representações e indique qual a mais utilizada quando de trata do padrão REST.
Precisa ter na reposta: explicação do formato JSON, explicação do formato XMLe indicação de qual desses formatos é mais utilizado com REST (mesmo que seja apenas sua percepção).

JSON - JavaScript Object Notation: usa o formato padrão de objeto do JavaScript

````
{alines: [
    {
        sobrenome: 'Hamano',
        id: 20
    },
    {
        sobrenome: 'Nunes',
        id: 32
    }
]}
````

XML -  Extensible Markup Language: usa markdown para descrever os objetos

````
<alines>
  <aline>
    <sobrenome>Hamano</sobrenome> <idade>20</idade>
  </aline>
  <aline>
    <sobrenome>Nunea</sobrenome> <idade>32</idade>
  </aline>
</alines>

````

No REST, o JSON é mais usado por ser menos verboso, mais simples de se ler por aplicações JavaScript e mais rápido pois os dados já vêm convertidos em objeto, diferentemente do XML.

8. ## Dê um execmplo de um conjunto de dados no formato JSON.
O exemplo abaixo é um JSON simulando o=uma requisição GET de um usuário. Como parâmetros temos id, nome, cpf e email.

````
{
    id: 290,
    nome: 'fulano de tal',
    cpf: '896.702.280-85',
    email: 'fulanodetal@gmail.com'
}

````

9. ## Na linguagem que você utiliza tem algum Framework próprio para lidar com REST? qual?
Como tenho mais experiência no front-end, nunca fiz uma API REST, apenas trabalhei fazendo  requisições no client side usando React ts e Vue js. 
Porém, no back-end dos projetos que participo, usa-se muito Java SpringBoot para construir os endpoints.

10. ## Explique, com suas palavras, o que você entende por essa figura:
A figura representa a arquitetura REST, em que o cliente faz requisições ao servidor usando algum verbo, o servidor recebe e processa fazendo consultas no banco de dados, retornando a resposta ao cliente logo em seguida.


## Referências:
https://www.ibm.com/docs/en/mq-appliance/9.2?topic=interface-rest-request-structure