import java.util.Date;

public class EmployeeClass {

    public String name;
    public String surname;
    public Date birthday;
    public double salary;
    public String companyName;

    public EmployeeClass (String name, String surname, Date birthday, double salary, String companyName)
    {
        this.name=name;
        this.surname=surname;
        this.birthday=birthday;
        this.salary=salary;
        this.companyName=companyName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String Surname)
    {
        this.surname=surname;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday=birthday;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName=companyName;
    }

    public void AddEmployee(String name, String surname, Date birthday, double salary, String companyName) throws MyException {
        this.name=name;
        this.surname=surname;
        this.birthday=birthday;
        this.salary=salary;
        this.companyName=companyName;
    }
}
