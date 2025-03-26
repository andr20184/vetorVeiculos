//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Veiculo[] garagem = new Veiculo[3];

       garagem[0] = new Veiculo("Fox",2024);
       garagem[1] = new Veiculo("Onix",2017);
       garagem[2] = new Veiculo("Civic",2025);

       for (Veiculo veiculo : garagem){
           System.out.print(veiculo);
       }
    }
}