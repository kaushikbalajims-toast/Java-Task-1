import java.util.*;

public class TestEmployee{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        String[] designation_array = {"Manager", "Senior developer", "Software developer", "Intern"};
        String[] department_array = {"R & D", "IT", "Admin", "HR", "Support"};
        String name = "";
        int dept_choice = 0, desg_choice = 0, choice = 1;
        double salary = 0;
        Scanner scin = new Scanner(System.in);
        boolean invalidInput = false;
        while(choice == 1){
            do{
                invalidInput = false;
                try{
                    System.out.print("---- Menu ----\n1.Add employees\nAny other key to display and exit\nEnter choice: ");
                    choice = Integer.parseInt(scin.nextLine());
                }
                catch(NumberFormatException e){
                    System.out.println("Enter valid menu option (only integers)\n");
                    invalidInput = true;
                }
            }while(invalidInput);
            if(choice != 1){
                break;
            }
                while(true){
                    System.out.print("Enter name: ");
                    name = scin.nextLine();
                    if(name.matches("^[A-Z][a-zA-Z ]+")){
                        break;
                    }
                    else{
                        System.out.println("Enter valid name (Start with caps)\n");
                    }
                }
                do{
                    do{
                        invalidInput = false;
                            try{
                                System.out.print("\nDepartment choices \n1.R & D\n2.IT\n3.Admin\n4.HR\n5.Support\nEnter department choice:");
                                    dept_choice = Integer.parseInt(scin.nextLine());
                            }
                            catch(NumberFormatException e){
                                System.out.println("Enter only one integer option\n");
                                invalidInput = true;
                            }
                    }while(invalidInput);
                    if(dept_choice>5 || dept_choice<0){
                        System.out.println("Enter an available option (1-5)\n");
                    }
                }while(dept_choice>5 || dept_choice<0);
                do{
                    do{
                        invalidInput = false;
                        try{
                            System.out.print("Designation choice\n1.Manager\n2.Senior developer\n3.Software developer\n4.Intern\nEnter designation choice: ");
                            desg_choice = Integer.parseInt(scin.nextLine());
                        }
                        catch(NumberFormatException e){
                            System.out.println("Enter only one integer option\n");
                            invalidInput = true;
                        }
                    }while(invalidInput);
                    if(desg_choice>4 || desg_choice<0){
                        System.out.println("Enter an available option (1-4)\n");
                    }
                }while(desg_choice>4 || desg_choice<0);
                do{
                    invalidInput = false;
                    try{
                        System.out.print("Enter Salary: ");
                        salary = Double.parseDouble(scin.nextLine());
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter valid salary");
                        invalidInput = true;
                    }
                }while(invalidInput);
                employees.add(new Employee(name, department_array[dept_choice-1] , designation_array[desg_choice-1], salary));
                System.out.println();
            }
        scin.close();
        if(employees.size() != 0){
            System.out.println("..... All Employees available .....");
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).ToString();
                System.out.println();
            }
        }
        else{
            System.out.println("No employees to display");
        }
    }
}