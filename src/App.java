import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int pessoas = sc.nextInt();
        int folhas = sc.nextInt();
        int qtd = sc.nextInt();

        int total = pessoas * qtd;

        if(folhas >= total){
            System.out.println("S");
        }else{
            System.out.println("N");
        }

        sc.close();
    }
}
