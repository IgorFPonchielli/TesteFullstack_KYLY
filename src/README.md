# Sobre a Aplicação

### Pré requisitos

- JDK 1.8.0_231
- Node 10.15.3
- npm 6.4.1
- Spring Tools Suite 4
- MySQL
- Angular CLI 9.0.6

#### Inicialização Maven Project

Utilizando o Spring Tools Suite 4 abra o projeto **demo-product-list**, em src/main/resource 
altere o arquivo application.properties com as configurações do seu banco de dados.

    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/kyly_test?serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=
É necessario que o banco kyly_test já esteja criado.

Ainda no Spring Tools Suite 4 é possivel inicializar o serviço na aba **Boot Dashboard**
![bootDashboard](https://github.com/IgorFPonchielli/kyly-teste/blob/master/DEMO/SpringToolSuite4_bootDashboard.png "bootDashboard")

#### Inicialização do serviço Angular CLI
Para iniciarmos um servidor local usando o Angular CLI acessamos a pasta onde está o projeto, nesse caso é a pasta *Frontend-products\product-list*, então executamos o comando **ng serve**

Para acessar o projeto basta acessar a URL http://localhost:4200

**Pronto, todos os serviços já estão funcionando**
