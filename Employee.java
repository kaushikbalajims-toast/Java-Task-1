class Employee{
    private static int counter = 1001;
    private int empID;
    private String name;
    private String designation;
    private String department;
    private double salary;

    Employee(String name, String dept, String desg, double sal){
        this.name = name;
        this.designation = desg;
        this.department = dept;
        this.salary = sal;
        this.empID = counter++;
    }

    public int getEmpID(){
        return this.empID;
    }
    public String getName(){
        return this.name;
    }
    public String getDesg(){
        return this.designation;
    }
    public String getDept(){
        return this.department;
    }
    public double getSal(){
        return this.salary;
    }

    public void setEmpID(int id){
        this.empID = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDesg(String desg){
        this.designation = desg;
    }
    public void setDept(String dept){
        this.department = dept;
    }
    public void setSal(double sal){
        this.salary = sal;
    }

    public void SetAllowance(){
        double allowance;
        if(this.designation.compareTo("Manager") == 0){
            allowance = (20 * this.salary) / 100;
            this.salary += allowance; 
        }
        else{
            allowance = (10 * this.salary) / 100;
            this.salary += allowance;
        }
        System.out.println("Salary without allowance: " + (this.salary-allowance));
        System.out.println("Allowance: "+allowance);
        System.out.println("Salary with allowance: " + this.salary);
    }
    public void ToString(){
        System.out.println("ID:\t\t" + this.empID + "\nName:\t\t" + this.name + "\nDesignation:\t" + this.designation + "\nDepartment:\t" + this.department);
        System.out.println();
        SetAllowance();
    }
}