Olá pessoal,

Java Virtual Machine (JVM) - Executa o bytecode.
Java Runtime Environment (JRE) - Tem as bibliotecas do java que permitem compilar o código para bytecode.
Java development Kit (JDK) - Compilar + JRE + JVM

JAVAC - Java compiler, responsável por compilar o arquivo .java para o .class
JAVA - Executa o arquivo .class .jar .war

Linha de comando para exemplo:

Compilar o arquivo para bytecode: 
javac C:\Public\java\Aula.java

Executar o .class na JVM
java -cp C:\Public\java Aula 

Executar o .class na JVM passando parametros para a aplicação.
java -cp C:\Public\java Aula param1 param2


Exemplo de classe:

public class Aula {

    public static void main(String[] args) {
        System.out.println("Hello world:" + args[0])
    }

}
