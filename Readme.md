# Value of Shipping API 

Projeto desenvolvido em Java + SpringBoot para cálculo de valor de frete utilizando api externa "Via CEP"
> https://viacep.com.br/

A documentação é feita utilizando o Swagger, disponível em:
> http://localhost/swagger-ui.html

## Endpoints

### Quotation
~~~
POST /api/quotation
~~~
Dados no body:
~~~
{
  "cep_destino": "cep",
  "cep_origem": "cep",
  "nome_destino": "nome",
  "peso": 10
}
~~~
Exemplo de retorno:
~~~
{
  "cep_origem": "00000000",
  "cep_destino": "00000000",
  "vl_total_frete": 5,
  "data_prevista_entrega": "2022-02-06"
}
~~~

## 🛠️ Desenvolvido com

* [IntelliJ](http://www.dropwizard.io/1.0.2/docs/) - A IDE do ❤️
* [Maven](https://maven.apache.org/) - Gerenciador de dependências
* [SpringBoot](https://start.spring.io/) - Framework para aplicações web
* [H2 DataBase](https://www.h2database.com/html/main.html) - Banco de dados SQL em memória
* [Lombok](https://projectlombok.org/) - Facilitar a criação de construtores
* [Swagger](https://swagger.io/tools/open-source/open-source-integrations/) - Listagem endpoints da API
* [ModelMapper](http://modelmapper.org/) - Conversão de objetos


---
⌨️ com ❤️ por [Allan Garcia Ferreira](https://github.com/allan201gf) 

