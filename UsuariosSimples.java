package luiigi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuariosSimples {


    public static void main(String[] args) {


        exemploListMinha();

    }


    private static void exemploListMinha(){


        Scanner s = new Scanner(System.in);

        System.out.println("Vamos começar o trabalho? Responda essa soma para prosseguir: 1 + 1 = ?");
        int soma = s.nextInt();


        while(soma == 2) {








            System.out.println("Olá qual o seu nome usuario 1? ");
            String nome = s.next();
            System.out.println("Olá qual o seu nome usuario 2? ");
            String nome2 = s.next();
            System.out.println("Olá qual o seu nome usuario 3? ");
            String nome3 = s.next();

            List<String> lista = new ArrayList<>();
            lista.add(nome);
            lista.add(nome2);
            lista.add(nome3);
            System.out.println("Aqui está sua lista de usuarios abaixo: ");
            System.out.println(lista);
            System.out.println("");
            System.out.println("Deseja começar novamente?");
            String repeat = s.next();

            if (repeat.equalsIgnoreCase("Sim")) {
                soma = 0;
                soma = 2;
            } else {
                System.out.println("Obrigado");
                break;
            }



        }







        if (soma == 2){






        } else if (soma != 2) {



            System.out.println("VocÊ errou! Deseja tentar novamente?");
            String sim = s.next();

            if (sim.equalsIgnoreCase("sim")){
                soma = 0;
                System.out.println("Vamos começar o trabalho? Responda essa soma para prosseguir: 1 + 1 = ?");
                soma = s.nextInt();
                while(soma == 2) {








                    System.out.println("Olá qual o seu nome usuario 1? ");
                    String nome = s.next();
                    System.out.println("Olá qual o seu nome usuario 2? ");
                    String nome2 = s.next();
                    System.out.println("Olá qual o seu nome usuario 3? ");
                    String nome3 = s.next();

                    List <String> lista = new ArrayList<>();
                    lista.add(nome);
                    lista.add(nome2);
                    lista.add(nome3);
                    System.out.println("Aqui está sua lista de usuarios abaixo: ");
                    System.out.println(lista);
                    System.out.println("");
                    System.out.println("Deseja começar novamente?");
                    String repeat = s.next();

                    if (repeat.equalsIgnoreCase("Sim")) {
                        soma = 0;
                        soma = 2;
                    } else {
                        System.out.println("Obrigado");
                        break;
                    }



                }




            } else {
                System.out.println("VocÊ errou novamente! Obrigado.");
            }




        }













    }






}
