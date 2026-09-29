package app.service.helpers;

import app.domain.enums.PersonStateEnum;
import app.utils.FormRuleValidator;

public class SetPersonState {

    public static String getPersonState(){

        while(true){
            String value = "";
            int option = FormRuleValidator.validateInt("""
                    Seleccione:
                    1. Activo
                    2. Inactivo
                    3. Bloqueado
                    """);

            switch (option){
                case 1:
                    value = PersonStateEnum.ACTIVE.getValue();
                    break;
                case 2:
                    value = PersonStateEnum.INACTIVED.getValue();
                    break;
                case 3:
                    value= PersonStateEnum.BLOCKED.getValue();
                default:
                    System.out.println("Seleccione una opción valida");
            }

            return value;
        }
    }
}
