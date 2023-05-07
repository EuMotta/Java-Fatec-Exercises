public class Argumentos {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        } else {
            System.out.println("Por favor, forneça pelo menos dois argumentos de linha de comando.");
        }
    }
}
