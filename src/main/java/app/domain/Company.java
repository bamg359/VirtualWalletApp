package app.domain;

public class Company extends User{


    private Long nit;
    private String companyType;

    public Company() {
    }

    public Company(Integer id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, String isActive, Long nit, String companyType) {
        super(id, name, lastName, documentType, email, password, isActive);
        this.nit = nit;
        this.companyType = companyType;
    }


    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
}
