# O que é API REST?

  O termo API em inglês significa interface de programação de aplicativos.
Podemos entendê-la como um conjunto de regras que define como aplicativos vão se conectar e comunicar entre si para exercer certa função.
REST é uma arquitetura de API criada por Dr. Roy Fielding em 2000, que oferece mais flexibilidade no serviços de software, sendo comumente usado em arquiteturas de microsserviços e outra estruturas complexas de rede. Os software que utilizam REST são chamados de RESTful.

## Como funciona

A API REST funciona executando CRUD's básicos (criação, leitura, edição e deleção) no banco de dados através de requisições HTTP. Para, por exemplo, editar uma foto em um site, o sistema fará uma requisição PUT enviando os dados da imagem. Assim, o cliente envia a solicitação no formato que a documentação da API recomenda, em seguida o servidor verifica a autorização do cliente e retorna uma resposta. As API's REST podem retornar dados ao cliente em diversos formatos, como textos, HTML, XLT ou o mais comum; Javascript Object Nation (JSON). 

Assim, certas informações como o status da requisição, identificadores, cookies e autorizações também são importantes para os serviços Rest, e podem ser informados através do cabeçalho. 


![image](https://github.com/AyuHamano/construcao-software/assets/98706488/2c40b7d0-08ce-4ada-b4a3-61d2dcfaa44a)


Cada requisição exige um: 
* Localizador de recurso uniforme (URL), para que o servidor localize o caminho para o recurso
* Método utilizado (POST, PUT, GET ou DELETE) - que especifica o tipo de operação o cliente está solicitando
* Cabeçalhos (Headers):
      * Dados: com body, no caso de requisições PUT e POST
      * Parâmetros: dados incluídos na URL para detalhar a operação

### Body enviado na requisição post
![image](https://github.com/AyuHamano/construcao-software/assets/98706488/919ad90a-81de-4287-bf2a-9adb851380f5)

### Resposta do servidor

![image](https://github.com/AyuHamano/construcao-software/assets/98706488/fb8445bd-dbfd-4ef5-9aa5-c97661175219)



## Princípios do design Rest

1. ### Interface uniforme 
2. ### Desacoplamento do cliente-servidor
3. ### Sem estado definido
4. ### Capacidade de armazenamento em cache
5. ### Arquitetura de sistema em camadas
6. ### Código sob demanda

#
## Benefícios

* ### A ausência de estado retira a carga de gerenciamento do servidor, possibilitando o uma escalabilidade eficiente
* ### A separação do cliente do servidor possbilita mais flexibilidade,uma vez que cada parte se modifica de forma independente
* ### Independência de tecnologias, ou seja, podem ser acessadas por várias linguagem e frameworks sem modificar o design da API


## Referências: 
https://aws.amazon.com/pt/what-is/restful-api/
https://www.ibm.com/br-pt/topics/rest-apis
https://www.hostinger.com.br/tutoriais/api-restful

