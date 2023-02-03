package lesson1_Study_Demo;

 import java.util.ArrayList;
 
 public class Person {
     public String name;
     public Person superior;     // double linked = both navigation directions
     public ArrayList<Person> employees = new ArrayList<>();
 
     Person(String name, Person superior)
    {
         this.name = name;
         this.employees = new ArrayList<>();
         if (superior != null)   // Supererior exists => is not boss
         {
             this.superior = superior;
             superior.employees.add(this);
         }
         else
             this.superior = null;
     }
 
     public String getName() {
         return name;
     }
     public Person getSuperior() {
         return superior;
     }
     public ArrayList<Person> getEmployees() {
         return employees;
     }
 }