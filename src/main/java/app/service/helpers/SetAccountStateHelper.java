package app.service.helpers;

import app.domain.enums.AccountStateEnum;
import app.utils.FormRuleValidator;

public class SetAccountStateHelper {

    public static String getAaccountState(){

       String state= "";

       int option = FormRuleValidator.validateInt("""
               Seleccione:
                1. Activo
                2. Inactivo
                3. Bloqueado
               
               """);

       switch(option){
           case 1:
               state = AccountStateEnum.ACTIVE.getValue();
               break;
           case 2 :
               state = AccountStateEnum.INACTIVE.getValue();
                break;
           case 3:
               state = AccountStateEnum.BLOCKED.getValue();
               break;
           default:
               System.out.println("Seleccione una opcion valida");

       }
       return state;
    }
}
