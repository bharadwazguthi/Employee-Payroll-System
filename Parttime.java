public class Parttime extends Employee{
    private String name;
    private int hours;

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int hours){
        this.hours = hours;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return hours*100;
    }
}
