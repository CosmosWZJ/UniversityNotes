public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private Integer totalSales;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setTotalSales(int t){
        this.totalSales = t;
    }

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    public String toString(){
        String s = totalSales.toString();
        return lastName + ", " + firstName + ", " + s;
    }
    public boolean equals(Object o){
        if(o.getClass() == this.getClass()){
            SalePerson s = (SalePerson) o;
            return (this.firstName == s.getFirstName() && this.lastName == s.getLastName());

        }
        return false;
    }
    public int compareTo(Object o){
        if(o.getClass() == this.getClass()){
            SalePerson s = (SalePerson) o;
            if(this.totalSales == s.getTotalSales())
                return -1*this.lastName.compareTo(s.getLastName());
            else
                return (this.totalSales > s.getTotalSales())? 1 : -1;

        }
        return 2;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getTotalSales(){
        return totalSales;
    }
}
