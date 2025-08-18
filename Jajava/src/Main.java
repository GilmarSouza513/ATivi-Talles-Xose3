//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Animal house = new Animal( "Filho da Puta",
         "Foi um cavalo puro-sangue inglês que ganhou nove de suas doze corridas.",
         "1812 a 1835");

        System.out.println("Nome: " + house.getName());
        System.out.println("Descrição: " + house.getDescription());
        System.out.println("Viveu: " + house.getDate());

        System.out.println("===========================================================");

        Animal cow = new Animal( "Big Bertha",
                "Foi uma vaca da Irlanda notória pelo recorde em tempo de vida 49 anos, inclusive ela bebia whisky.",
                "1945 a 1993");
        System.out.println("Nome: " + cow.getName());
        System.out.println("Descrição: " + cow.getDescription());
        System.out.println("Viveu: " + cow.getDate());

    System.out.println("========================================================");

        Animal monkey = new Animal( "Jack",
                "Jack foi um babuíno comprado em 1881 e seu dono Wide o treinou para empurrar sua cadeira de rodas e operar os sinais das ferrovias sob supervisão,em seus nove anos de trabalho na companhia ferroviária, Jack nunca cometeu um único erro.",
                "... a 1890");
        System.out.println("Nome: " + monkey.getName());
        System.out.println("Descrição: " + monkey.getDescription());
        System.out.println("Viveu: " + monkey.getDate());

    System.out.println("Para mais informações; Pesquise na Wikipédia");
    }
}