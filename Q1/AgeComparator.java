/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt;

import java.util.Comparator;

/**
 *
 * @author User543
 */
public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
       if(emp1.getAge()> emp2.getAge()){
            return 1
                //return;
        } else {
            return -1;
        }
    }
}
