Olá a todos,

Gostaria de apresentar a minha API
Fiz uma apirest utilizando java,maven para gerenciar,sping bot para fazer a base com  dependencies (spring web,Spring Data JPA e H2 Database.) e utilizei Swagger para documentar,
iniciei o projeto fazendo o spring bot,
logo apos fui criar o banco do projeto com id, name , email e department id, não utilizei sql é sim o h2 Database para fornecer um remoto.
foi uma tabela simples para ter o id o nome email e qual departamento o id ficaria,
utilizei da criação de codigos do spring para criar os import e linkar tudo.

Para acessar o banco de dados acesse: http://localhost:8080/h2-console e utilizar a Url: jdbc:h2:mem:testdb é possivel ver é manipular as tabelas,
tambem fiz um endpoint para o usuario acessar a tabela acesse aqui: http://localhost:8080/users
os arquivos onde fiz a parte do java estão no main dentro do src na pasta do com e do atvsw,
a crianção principal da tabela esta na user.java e Department.java onde fiz os import e a criação das infomaçoes do banco
as classes nao ficarão muito organizadas mais estao completamente funcionais,
tambem modifiquei o application.properties para fazer o h2 o data e o apa funcionarem adquadamente utilizando spring,
fiz uma tabela import.sql é coloquei os import das informacoes do usuario/banco.

indo pra parte do Swagger utilizei o site https://springdoc.org/ para pegar as dependencies do OpenAPI/Swegger feito isso fui ao pom.xml e as coloquei 
com isso temos esse acesso: http://localhost:8080/swagger-ui.html onde podemos ver o end point documentado.
