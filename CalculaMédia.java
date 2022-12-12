public class CalculaMédia {
    private static final float NOTA_DE_CORTE = 7.0f;

    public static void main(String[] args) {
        float nota1 = Float.parseFloat(args[0]);
        float nota2 = Float.parseFloat(args[1]);

        String resultado = (nota1 + nota2) >= NOTA_DE_CORTE ? "Aprovado" : "Reprovado";

        System.out.println("O Aluno está: " + resultado);

    }
}
