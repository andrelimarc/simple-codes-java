package luiigi;

import java.util.Scanner;

public class SchoolSimple {



    public static void main(String[] args) {


        calculo();




    }

    public static void calculo(){

        Scanner s = new Scanner(System.in);
        System.out.println("Vamos começar o trabalho? ");
        String vamos = s.next();




        if (vamos.equalsIgnoreCase("Sim")) {




            while (vamos.equalsIgnoreCase("sim")){



                System.out.println("Olá! Muito bom ter vocÊ conosco. Qual o seu nome?");
                String nome = s.next();
                System.out.println("Prazer em conhecer! "+nome);
                System.out.println("Vamos começar nosso trabalho. Digite sua primeira nota: ");
                double primeiranota = s.nextDouble();
                System.out.println("Digite sua segunda nota: ");
                double segundanota = s.nextDouble();
                System.out.println("Digite sua terceira nota: ");
                double terceiranota = s.nextDouble();
                System.out.println("Digite sua quarta nota: ");
                double quartanota = s.nextDouble();



                double mediafinal = (primeiranota+segundanota+terceiranota+quartanota)/4;

                if (mediafinal>=7){
                    System.out.println("Aprovado! Parabéns "+nome+"!"+" Sua média final foi: "+mediafinal);
                } else if (mediafinal >= 4 && mediafinal <=6) {
                    System.out.println("Recuperação.");
                } else if (mediafinal < 4) {
                    System.out.println("Reprovado.");

                }


                System.out.println("Deseja começar novamente: ");
                vamos = s.next();

                if (vamos.equalsIgnoreCase("sim")){

                } else {
                    System.out.println("obrigado");
                }





                //  System.out.println("Sua primeira nota é "+primeiranota+" sua segunda nota é "+ segundanota+ " sua terceira nota é "+terceiranota+" sua quarta nota é "+quartanota+" e sua média final = "+mediafinal);

            }








        } else {
            System.out.println("Obrigado!");
        }




    }







}
