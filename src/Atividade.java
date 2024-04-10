public class Atividade {
    public static void main(String[] args) throws Exception {
       
        //Declare duas variáveis do tipo double chamadas num1 e num2 e
        // inicialize-as com quaisquer valores decimais. Em seguida, calcule a soma, 
        //a diferença, o produto e o quociente de num1 e num2 e imprima os resultados.

     double num1 = 10;
     double num2 = 5;

     double calculo1 = num1 + num2;
     double calculo2 = num1 - num2;
     double calculo3 = num1 / num2;
     double calculo4 = num1 * num2;

    System.out.println(num1 + num2);    
    System.out.println(num1 - num2);
    System.out.println(num1 / num2);
    System.out.println(num1 * num2);

    System.out.printf("\nValor da soma do %f + %f = %f\n" ,num1,num2,calculo1);
    System.out.printf("\nValor da subtração de %f - %f = %f\n" ,num1,num2,calculo2);
    System.out.printf("\nValor de divisão de %f / %f = %f \n" ,num1,num2,calculo3);
    System.out.printf("\nValor multiplicado de %f * %f = %f\n" ,num1,num2,calculo4);

        

    }
}
