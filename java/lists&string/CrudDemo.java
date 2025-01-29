import java.util.*;

class Employee {

  private int employeeNumber;
  private String employeeName;
  private int employeeSalary;

  Employee(int employeeNumber, String employeeName, int employeeSalary){
    this.employeeNumber = employeeNumber;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
  }

  public int getEmployeeNumber(){
    return employeeNumber;
  }

  public String getEmployeeName(){
    return employeeName;
  }

  public int getEmployeeSalary(){
    return employeeSalary;
  }

  public String toString(){
    return  employeeNumber+" "+employeeName+" "+employeeSalary;
  }

}


class CrudDemo{

  public static void main(String[] args){
    int choice;
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    List<Employee> employee = new ArrayList<Employee>();

    do{
      System.out.println("1.INSERT");
      System.out.println("2.LIST");
      System.out.println("3.SEARCH");
      System.out.println("4.DELETE");
      System.out.println("5.UPDATE");

      System.out.print("Enter your choice: ");
      choice = s.nextInt();

      switch(choice){
        case 1:
          System.out.println("+++++++++++++++++++++++++++++++++++++++");
          try{
            System.out.print("Enter employee number: ");
            int employeeNumber = s.nextInt();
            System.out.print("Enter the employee name: ");
            String employeeName = s1.nextLine();
            System.out.print("Enter employee salary: ");
            int employeeSalary = s.nextInt();
            
            Employee emp = new Employee(employeeNumber,employeeName,employeeSalary);
            employee.add(emp);
            System.out.println("");
          }catch(Exception e){
            System.out.println("An error occured: "+e);
          }
        break;

        case 2:
          System.out.println("========================================");
          try{
            // System.out.println(employee);
            Iterator<Employee> i = employee.iterator();
            while(i.hasNext()){
              Employee e = i.next();
              System.out.println(e);
            }
            System.out.println("");
          }catch(Exception e){
            System.out.println("An error occured: "+e);
          }
        break;

        case 3:
          try{
            boolean found = false;
            System.out.println("Enter the employee number to search: ");
            int empNumber = s.nextInt();
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            Iterator<Employee> emp = employee.iterator();
            while(emp.hasNext()){
              Employee e = emp.next();
              if(e.getEmployeeNumber() == empNumber){
                System.out.println(e);
                System.out.println("");
                found = true;
              }
            }

            if(!found){
              System.out.println("Employee with provided number not found");
              System.out.println("");
            }

          }catch(Exception e){
            System.out.println("An error occured:  "+e);
          }

          break;

        case 4:
          boolean found = false;
          System.out.println("--- --- --- --- --- --- --- --- --- ---");
          try{
            System.out.print("Enter employee number you want to delete: ");
            int empNumner = s.nextInt();
            Iterator<Employee> emp = employee.iterator(); // Iterator can not be modified.
            while(emp.hasNext()){
              Employee employeeInstance = emp.next();
              if(employeeInstance.getEmployeeNumber() == empNumner){
                emp.remove();
                found = true;
              }
            }

            if(!found){
              System.out.println("Failed to delete employee");
              System.out.println("");
            }else{
              System.out.println("Employee deleted successfully !!");
              System.out.println("");
            }
          }catch(Exception e){
            System.out.println("An error occured during deleting data");
            System.out.println("");
          }

          break;

        case 5:
          System.out.println("+++ +++ +++ +++ +++ +++ +++ +++ +++ +++");
          try{
            boolean isUpdated = false;
            System.out.print("Enter the employee number you want ro update: ");
            int empNumber = s.nextInt();
            ListIterator<Employee> li = employee.listIterator(); // ListIterator can be modified 
            while(li.hasNext()){
              Employee data = li.next();
              if(data.getEmployeeNumber() == empNumber){
                System.out.print("Enter new name: ");
                String newEmployeeName = s1.nextLine();
                System.out.println("");
                System.out.print("Enter new salary: ");
                int newEmployeeSalary = s.nextInt();

                Employee newEmployee = new Employee(empNumber,newEmployeeName,newEmployeeSalary);
                li.set(newEmployee);
                isUpdated = true;
              }
            }
            if(!isUpdated){
              System.out.println("Failed to update employee !!");
              System.out.println("");
            }else{
              System.out.println("Employee updated successfully !!");
              System.out.println("");
            }
          }catch(Exception e){
            System.out.println("Error occured during updating record !!");
            System.out.println("");
          }

          break;

      }

    }while(choice != 0);
  }
}


