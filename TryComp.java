package comp;

import java.io.File;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TryComp {

    public static void main(String[] args) {

        /*
                Agregation
                    - Duas classes
                    - Tem relacionamento
                    - Não são dependentes - Relação fraca
                    - Exemplos:
                           - Pessoa (->) (1:N) Endereço
                Composition
                    - Duas classes
                    - Tem relacionamento
                    - São dependentes - Relação forte
                    - Exemplos:
                            - Casa - quarto
                            - Pessoa - Cartão de vacinação
                            - Pasta (->) (1:N) Arquivo

                Association
                    - Agregation
                    - Composition
         */


        Pessoa p1 = new Pessoa("Thiago", new Address(UF.GO), Gender.MALE, Animais.BONITOS);
        System.out.println(p1);
        System.out.println(p1);
    }

}

class Pessoa{

    private String name;

    private Address address;

    private Gender gender;

    private Animais animais;

    public Pessoa(String name, Address address, Gender gender, Animais animais) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.animais = animais;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

    public Animais getAnimais() {
        return animais;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", gender=" + gender +
                ", animais=" + animais +
                '}';
    }
}

class Address{

    private UF uf;

    public Address(UF uf) {
        this.uf = uf;
    }

    public UF getUf() {
        return uf;
    }
}

enum Animais{

    BONITOS(Domestico.GATO);

    enum Domestico{
        GATO
    }

    Animais(Domestico domestico){
        this.domestico = domestico;
    }

    public Domestico getDomestico() {
        return domestico;
    }

    private Domestico domestico;

}



enum Gender{
    MALE{
        @Override
        public String toPtBR() {
            // Salva no banco de dados a utilização
            return "Homem";
        }
    },
    FEMALE {
        @Override
        public String toPtBR() {
            return "Mulher";
        }
    };

    public abstract String toPtBR();

}

enum UF {

    SP("São Paulo"),
    RJ("Rio de Janeiro"),
    MG("Minas Gerais"),
    GO("Goiás");

    UF(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

    public String getFullName() {
        return fullName;
    }
}



class Pasta{

    private File file;

    private Pasta(){

    }

    Pasta(File file){
        this.file = file;
    }

    public File getFile() {
        return file;
    }
}

class TryCreateEnum{

    public static void main(String[] args) {
        Letters.A teste = new Letters.A("teste");
    }

}

class Letters{

    String letterMsg;

    public static class A extends Letters{
        A(String msg){
            this.letterMsg = msg;
        }

    }

    public static class B extends Letters{
        B(String msg){
            this.letterMsg = msg;
        }

    }

    public String getLetterMsg() {
        return letterMsg;
    }
}
