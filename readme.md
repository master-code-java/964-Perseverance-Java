Olá pessoal,


Java Virtual Machine (JVM) - Executa o bytecode. <br>
Java Runtime Environment (JRE) - Tem as bibliotecas do java que permitem compilar o código para bytecode.<br>
Java development Kit (JDK) - Compilador + JRE + JVM <br><br>

JAVAC - Java compiler, responsável por compilar o arquivo .java para o .class <br>
JAVA - Executa o arquivo .class .jar .war <br><br>

Onde baixar a JDK (Java development Kit)<br>
https://www.oracle.com/java/technologies/downloads/

Linha de comando para exemplo:<br><br>

Compilar o arquivo para bytecode: <br>
javac C:\Public\java\Aula.java<br><br>

Executar o .class na JVM<br>
java -cp C:\Public\java Aula <br><br>

Executar o .class na JVM passando parametros para a aplicação.<br>
java -cp C:\Public\java Aula param1 param2<br><br>


Exemplo de classe:<br>

```
public class Aula {

    public static void main(String[] args) {
        System.out.println("Hello world:" + args[0])
    }

}
```

