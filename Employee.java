package ru.GeekBrains;




public class Employee
{
    private String userName;
    private String position;
    private String email;
    private String telNumber;
    private int salary;
    private int age;

   public Employee()
   {
       userName="NIkita";
       position="assistant";
       email = "lupanova-2011@mail.ru";
       salary = 50000;
       age = 19;
       fillIn();
   }


    void fillIn()
   {
       System.out.println(userName +", " + position +", " + email +", " + telNumber +", "+ salary +", " + age);
   }


   public Employee(String userName, String position, String email, int salary, int age)
   {
        this.userName = userName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
   }


}
