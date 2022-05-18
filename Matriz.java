import java.util.Scanner;
public class Matriz{
    public static void main(String[] args) {
        
        int[][] matriz = criarMatriz();

    }

    public static int[][] criarMatriz(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o nº de linhas da matriz: ");
        int nlinha = scan.nextInt();
        System.out.print("Informe o nº de colunas da matriz: ");
        int ncoluna = scan.nextInt();
        System.out.println("Informe o elemento inicial: ");
        int inicio = scan.nextInt();
        System.out.println("Informe a razão da progressão aritmética: ");
        int razao = scan.nextInt();
        scan.close();
        int[][] matriz = new int[nlinha][ncoluna];

        for(int linha=0;linha<nlinha;linha++){
            for(int coluna=0;coluna<ncoluna;coluna++){
                matriz[linha][coluna]=inicio;
                inicio+=razao;
            }
        }
        print(matriz);
        return matriz;
    }


    public static void print(int [][]matriz){
        for(int linha=0;linha<matriz.length;linha++){
            System.out.print(" [ ");
            for(int coluna=0;coluna<matriz[linha].length;coluna++){
                System.out.print(+matriz[linha][coluna]+" ");
            }
            System.out.println(" ] ");
        }
    }
}