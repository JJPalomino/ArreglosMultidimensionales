import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //arregloMultidimensional();
        //arregloMultidimensional2();
        //arregloString();
        ejercicio();
    }


    public static void arregloMultidimensional() {
        // int[] numerosEnteros = new int[5]; Arreglo de una dimensión
        // int[] <-- tipo de dato que va a contener el arreglo (matriz)
        // [][] <-- Indicar las filas y columnas int[3][2] --> 3 filas y 2 columnas
        //  int [][][] tridimensional = int[3][2][1];
        int[][] bidimensional = new int[3][2];   //Arreglo bidimensional, esto indica que tiene tres filas y dos columnas
        bidimensional[0][0] = 8;
        bidimensional[0][1] = 3;
        bidimensional[1][0] = 9;
        bidimensional[1][1] = 6;
        bidimensional[2][0] = 1;
        bidimensional[2][1] = 10;

        for(int i = 0; i < bidimensional.length; i++){
            for (int j = 0; j < bidimensional[i].length; j++){
                System.out.print(bidimensional[i][j] + " ");
            }
            System.out.println("\n");
        }
        //System.out.println(Arrays.toString(bidimensional));
    }

    public static void arregloMultidimensional2(){
        int[][] numeros = {{1,3,6,9}, {2,8,4,0}};
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void arregloString(){
        String[][] frutasyverduras = new String[2][2];

        frutasyverduras[0][0] = "Man";
        frutasyverduras[0][1] = "Jit";
        frutasyverduras[1][0] = "Pap";
        frutasyverduras[1][1] = "Pla";

        for (int i = 0; i < frutasyverduras.length; i++){
            for (int j = 0; j < frutasyverduras[i].length; j++){
                System.out.print(frutasyverduras[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void ejercicio(){
        String[][] nombresyapellidos = new String[4][2];
        nombresyapellidos[0][0] = "Juan";
        nombresyapellidos[0][1] = "Palomino";
        nombresyapellidos[1][0] = "Pedro";
        nombresyapellidos[1][1] = "Perez";
        nombresyapellidos[2][0] = "Joaquin";
        nombresyapellidos[2][1] = "Gonzalez";
        nombresyapellidos[3][0] = "Erick";
        nombresyapellidos[3][1] = "Ramirez";

        for (int i = 0; i < nombresyapellidos.length; i++){
            for (int j = 0; j < nombresyapellidos[i].length; j++){
                System.out.print(nombresyapellidos[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}