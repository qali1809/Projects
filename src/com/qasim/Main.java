package com.qasim;

import com.qasim.models.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1010, "Jafer", 2020, "Manager");
        Employee f = new Employee(1011, "qasim", 2020, "Emp");
        System.out.println(e.toString());
        System.out.println(f.toString());
        e.checkTitle();
        f.checkTitle();



    }
}