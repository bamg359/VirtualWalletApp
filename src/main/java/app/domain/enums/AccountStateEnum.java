package app.domain.enums;

public enum AccountStateEnum {

    ACTIVE("Activa"),
    INACTIVE("Inactiva"),
    BLOCKED("Bloqueada");


    private final String value;

    AccountStateEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
