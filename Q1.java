/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt;


import java.util.TreeSet;

/**
 *
 * @author User543
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("===== Sortable by Last Name =====");
        
        TreeSet<Employee> tsEmployee = new TreeSet<Employee>(new NameComparator());
        tsEmployee.add(new Employee("Conor","Lynch" , 65));
        tsEmployee.add(new Employee("John","Kirk" , 52));
        tsEmployee.add(new Employee("Luke","Murphy" , 22));
        tsEmployee.add(new Employee("Joe","Bloggs" , 32));
        
        for (Employee employee : tsEmployee) {
            System.out.println(employee);
        }
        
        System.out.println("\n===== Sortable by Age =====");
        TreeSet<Employee> tsEmployee2 = new TreeSet<Employee>(new AgeComparator());
        tsEmployee2.add(new Employee("Conor","Lynch" , 65));
        tsEmployee2.add(new Employee("John","Kirk" , 52));
        tsEmployee2.add(new Employee("Luke","Murphy" , 22));
        tsEmployee2.add(new Employee("Joe","Bloggs" , 32));
          
        for (Employee employee : tsEmployee2) {
            System.out.println(employee);
        }
    }

}
