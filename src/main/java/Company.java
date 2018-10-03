public class CompanyClass {

    public String companyName;
    public String description;

    public CompanyClass (String companyName, String description)
    {
        this.companyName=companyName;
        this.description=description;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName=companyName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public void AddCompany (String companyName, String description)
    {
        this.companyName=companyName;
        this.description=description;
    }

}
