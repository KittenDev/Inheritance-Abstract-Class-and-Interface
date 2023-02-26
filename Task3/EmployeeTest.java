package Task3;

/**
 *
 * @author Dafaa
 */
public class EmployeeTest{
    public static void main (String[] args){
        Employee[] staff = new Employee[5];
        
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Dio Brando", 9000000, 1, 11, 1989);
        staff[2] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[3] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[4] = new Employee("Enrico Pucci", 1000000, 1, 9, 1983);
        Sortable.shell_sort(staff);
        
        int i;
        for (i = 0; i < 5; i++) 
            staff[i].raiseSalary(5);
        for (i = 0; i < 5; i++) 
            staff[i].print();
    }
}
