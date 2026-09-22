package app.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormRuleValidator {

    static Scanner sc = new Scanner(System.in);

    public static int validateInt(String prompt){

        while(true){
            try{
                System.out.println(prompt);
                int value = sc.nextInt();
                sc.nextLine();
                return value;

            }catch(InputMismatchException e){
                System.out.println("Error: Ingrese un número entero válido." + e.getMessage());
                sc.nextLine(); // Limpiar el buffer del scanner

            }
        }
    }


    public static Double validateDouble(String prompt){

        while(true){
            try{
                System.out.println(prompt);
                Double value = sc.nextDouble();
                sc.nextLine();
                return value;

            }catch (InputMismatchException e){
                System.out.println("Error: Ingrese un número decimal válido." + e.getMessage());
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }

    }

    public static Boolean validateBoolean(String prompt){

        while(true){
            try{
                System.out.println(prompt);
                Boolean value = sc.nextBoolean();
                sc.nextLine();
                return value;

            }catch (InputMismatchException e){
                System.out.println("Error: Ingrese un valor Booleano valido." + e.getMessage());
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }


    public static String validateString(String prompt){

        while(true){
            System.out.println(prompt);
            String value = sc.nextLine().trim();
            if(!value.isEmpty()){
                return value;
            }else {
                System.out.println("Error: Ingrese un valor de texto válido.");
            }
        }
    }




}
