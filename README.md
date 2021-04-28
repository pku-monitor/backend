### Como executar esta aplicação?

Voce ira precisar ter instalado:

1. Java
2. Docker
3. Maven

Passo a passo:

###### Banco de dados

Para o ambiente de desenvolvimento estaremos utilizando um banco de dados local postgres,
para facilitar a configuração basta subir esse banco com docker com o comando:

docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres --name pkumonitor_db postgres

2. Spring, a aplicação backend exige algumas bibliotecas spring, portanto ter maven instalado
   é essencial 