import java.util.ArrayList;

import javax.swing.JOptionPane;
public class NumerosPrimosHastaN {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String sc1=JOptionPane.showInputDialog(null, "Introduzca un numero");
        int N=Integer.parseInt(sc1);
        ArrayList<Integer> Primos = new ArrayList<Integer>();
        int Conta=0;
        for(int i=N;i>1;i--) {

            int M=i-1;
            while(M>1){
                if(i%M==0){Conta+=1;}
                M--;
            }

            if(Conta==0) {Primos.add(i);}
            else {Conta=0;}
        }
        //JOptionPane.showMessageDialog(null,Primos,"Numeros primos hasta "+N,JOptionPane.INFORMATION_MESSAGE);
        int tamano=Primos.size();
        System.out.println("Cantidad de elementos "+tamano);
    }

}
