import java.text.DecimalFormat;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea converter = new ConversaoDeUnidadesDeArea();
        System.out.print("Insira um valor em metros quadrados: ");
        Scanner num = new Scanner(System.in);
        double metrosQuadrados = num.nextDouble();
        double pesQuadrados = converter.metroParaPes(metrosQuadrados);
        double centimetrosQuadrados = converter.pesParaCentimetros(pesQuadrados);
        double milhasQuadradas = converter.milhaParaAcre(pesQuadrados);
        double acres = converter.acreParaPesQuadrados(metrosQuadrados);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(metrosQuadrados) + " metros quadrados");
        System.out.println(df.format(pesQuadrados) + " pés quadrados");
        System.out.println(df.format(centimetrosQuadrados) + " centímetros quadrados");
        System.out.println(df.format(milhasQuadradas) + " milhas quadradas");
        System.out.println(df.format(acres) + " acres");
        num.close();
    }
}
