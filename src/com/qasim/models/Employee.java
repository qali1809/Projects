package com.qasim.models;

public class Employee {
    //  4 fields (ID, name, yearOfJoin, Title)
    private int id;
    private String name;
    private int yearOfJoin;
    private String title;
    //  2 constructers (default, all)
    public Employee() {

    }
    public Employee(int id, String name, int yearOfJoin, String title) {
       this.setId(id);
       this.name = name;
       this.yearOfJoin = yearOfJoin;
       this.title = title;



    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", yearOfJoin=" + this.yearOfJoin +
                ", title='" + this.title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0 && id <= 100) {
            this.id = id;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }

    public void setYearOfJoin(int yearOfJoin) {
        this.yearOfJoin = yearOfJoin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void checkTitle()
    {
        if(this.title.equalsIgnoreCase("manager"))
        {
            System.out.println("Hello Manger");
        }else
        {
            System.out.println("F off");
        }


    }

}

    //  2 methods (printOutEmployeeInfo, checkTitle)
    //  getters and setters for the 4 fields






