package app.domain.enums;

public enum PersonStateEnum {

    ACTIVE("Activo"),
    INACTIVED("Inactivo"),
    BLOCKED("Bloqueado");

    private final String value;

    PersonStateEnum(String value){
        this.value= value;
    }

    public String getValue(){
        return value;
    }
}
