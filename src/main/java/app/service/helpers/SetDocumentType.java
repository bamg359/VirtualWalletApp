package app.service.helpers;

import app.domain.enums.DocumentTypeEnum;
import app.utils.FormRuleValidator;

public class SetDocumentType {


    public static String getDocType(){

        int option = FormRuleValidator.validateInt("Seleccione el tipo de documento:\n1. Cédula de Ciudadanía\n2. Pasaporte\n3. Cédula de Extranjería\n4. NIT");
        String value = "";

        switch (option){
            case 1:
                value = DocumentTypeEnum.CEDULA.getValue();
                break;
            case 2:
                value = DocumentTypeEnum.PASSPORT.getValue();
                break;
            case 3:
                value = DocumentTypeEnum.CEDULA_EXTRANJERIA.getValue();
                break;
            case 4:
                value = DocumentTypeEnum.NIT.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }

        return value;

    }


}
