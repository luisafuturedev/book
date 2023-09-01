package est.luisa.classes;
public class OlaMundo {
    public static void main(String[] args) {
    String primeiroNome = "Luisa";
    String segundoNome = "Oliveira";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
