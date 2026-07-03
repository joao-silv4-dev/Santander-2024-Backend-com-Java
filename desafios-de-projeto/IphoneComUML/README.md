## Modelando um Iphone com UML
Um exemplo de iphone extremamente básico em Java.

# Tecnologias utilizadas
<img src="https://github.com/marwin1991/profile-technology-icons/blob/main/icons/java.png" width="60" height="60" alt="Java">

# Como utilizar?

Para iniciar, é necessario possuir o Java instalado, abriremos o terminal na pasta do projeto e executaremos os seguintes passos:<br>
Abra o terminal na pasta onde foi baixado o projeto.<br>
Execute no terminal o comando `java Main` -> Para executarmos o arquivo `.class`.<br><br>
Caso de erro, tente atualizar sua versão Java para a versão 21, pois foi essa versão utilizada para o desenvolvimento do projeto.<br>

# UML do código

```mermaid
classDiagram
    class AparelhoTelefonico {
        <<Interface>>
        +ligar(String) void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<Interface>>
        +exibirPagina(String) void
        +adicionarNovaAba() void
        +iniciarCorreioVoz() void
    }

    class ReprodutorMusical {
        <<Interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String) void
    }

    class Main {
        +Iphone: Object
        +main() void
    }

    class Iphone {
        +musicaSelecionada: String
        +tocandoMusica: boolean
        +url: String
        +dentroDePagina: boolean
        +ligar(String) void
        +exibirPagina(String) void
        +tocar() void
        +selecionarMusica(String) void
        +pausar() void
        +iniciarCorreioVoz() void
        +adicionarNovaAba() void
        +iniciarCorreioVoz() void
        +atender() void
    }

    Main --> Iphone
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
    Iphone ..|> ReprodutorMusical
```