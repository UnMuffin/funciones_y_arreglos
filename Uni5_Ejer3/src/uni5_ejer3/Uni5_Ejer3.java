package uni5_ejer3;

import java.util.*;

public class Uni5_Ejer3 {

    
    //Funciones----------------------------
    public int llenar(int i,int j){        
        Scanner in = new Scanner(System.in);
        int nm;
        System.out.println("("+i+" , "+j+")"+" Ingrese su valor:");
        nm = in.nextInt();
        
        return nm;
    }

    //Main---------------------------------
    public static void main(String[] args) {
        //Declaraciones        
        Scanner in = new Scanner(System.in);
        Uni5_Ejer3 mod = new Uni5_Ejer3();
        
        
        //Variables
        int opc;
        int num[][] = new int[3][3]; 
        
        //Acciones
        do{
            System.out.println("Selecciona una opcion:"
                    + "\n1. Llenar el arreglo"
                    + "\n2. Identificar elementos primos"
                    + "\n3. Sumar elementos por filas"
                    + "\n4. Sumar elementos por columnas"
                    + "\n5. Finalizar ejecucion");
            opc = in.nextInt();
            
            switch(opc){
                case 1:                    
                    for(int i = 0;i <= 2;i++){
                        for(int j = 0;j <= 2;j++){
                            num[i][j] = mod.llenar(i,j);
                        }
                    }
            }
            
        }while(opc != 5);
    }
    
}
