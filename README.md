# SIGEP - Desktop

Repositório para desenvolvimento de um Sistema para hotelaria desenvolvido para a disciplina de DSC.

**Nome do pacote (group_id)**: br.com.sigep
**Nome do artefato (artifact_id)**: sigep

**Responsáveis:**
- Bernardo Ribeiro
- Guilherme Froes
- Hárisson Durães


## Tecnologias utilizadas
Para a construção do sistema, foram utilizadas as seguintes tecnologias:
- **Linguagem:** Java 11
- **Framework:** Java Spring Boot v2.7.2
- **Depedências:** JPA, JDBC API, Lombok, MySQL Driver e Spring Boot DevTools
- **Arquitetura:** MVC
- **Paradigma:** Programação Orienteada a Objetos
- **Controle de versão:** Git


## Padrões do projeto

**Sintaxe | Nomenclaturas:**
- Pacotes: lowercase.example
- Classes: UpperCamelCase
- Variáveis, funções (métodos): lowerCamelCase
- Constantes: UPPER_SNAKE_CASE

**Padrão de commits/branches:** 
Serão escritos em Português; 
Formato: “Prefixo + descrição“

```Shell
git commit -m 'feat: message' # <nova funcionalidade>
git commit -m 'fix: message' # <correção de bug>
git commit -m 'docs: message' # <documentação>
git commit -m 'style: message' # <mudanças que não afetam o sentido do código>
git commit -m 'refactor: message' # <refazer algo; não corrige um bug nem adiciona funcionalidade>
git commit -m 'perf: message' # <código que melhora a performance>
git commit -m 'test: message' # <adicinoa testes faltando ou corrige os tests existentes>
git commit -m 'build: message' # <mudanças que afetam a construção ou dependências do projeto>
git commit -m 'ci: message' # <mudanças que afetam os arquivos de configração de CI>
git commit -m 'chore: message' # <mudanças que não modificam arquivos src ou de  testes>
```


**Padrão de comentários no código:** 
Serão feitos em Português; Seguir o padrão do Google:
```Java
/**
  * Multiplas linhas de texto de Javadoc são escritas aqui,
  * com quebras de linhas normais
 */

 /** Um pedaço especialmente curto de Javadoc. */
```


## Setup do projeto
> Descrever aqui como fazer o setup do projeto na máquina dos colaboradores.

**IDE:** VSCode
   **Extensões `obrigatórias`:** 
   - Java Extension Pack
   - Spring Boot Extension Pack
   - JavaFX Support
   - Lombok Annotation Support for VSCode

**Instruções**
1. Clonar o projeto na sua máquina.
2. ...