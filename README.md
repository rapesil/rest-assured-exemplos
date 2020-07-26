![Java CI](https://github.com/rapesil/rest-assured-exemplos/workflows/Java%20CI/badge.svg)
# Projeto Simples para Treino do Rest Assured (JAVA) *** Em construcao ***

## Prerrequisitos

* Java 
* Maven
* Docker (opcional)

## Como executar

Você pode executar os testes apontando para um servidor local com docker ou diretamente na web.

* Local com docker

Inicie o Docker

````shell script
docker run docker run -p 80:80 kennethreitz/httpbin
````

* Com o servidor local rodando, execute:

```shell script
mvn clean test -Denv=local
```

* Caso não queira usar o docker e executar os testes na web, use o seguinte comando:

```shell script
mvn clean test -Denv=web
```

> Alguns testes podem falhar devido aos resultados esperados serem informacões específicas da máquina que estiver rodando.


