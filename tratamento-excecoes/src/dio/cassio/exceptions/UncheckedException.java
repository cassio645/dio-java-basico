package dio.cassio.exceptions;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLoop = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+ resultado);
                continueLoop = false;
            } 
            catch (NumberFormatException e){
                System.out.println("Digite apenas números inteiros!!!");
                //e.printStackTrace();
            } 
            catch (ArithmeticException e){
                System.out.println("Não é possível dividir por 0.");
            }
            finally {
                System.out.println("Chegou no finally.");
            }
        }while(continueLoop);

        System.out.println("O código continua...");
        
    }

    public static int dividir(int a, int b){ return a/b;}
}
