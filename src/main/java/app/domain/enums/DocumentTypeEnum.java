package app.domain.enums;

public enum DocumentTypeEnum {

    CEDULA("Cedula de Ciudadania"),
    PASSPORT("Pasaporte"),
    CEDULA_EXTRANJERIA("Cedula de Extranjería"),
    NIT("NIT");

    private final String value;

    DocumentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
