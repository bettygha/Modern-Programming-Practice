package lesson1_Study_Demo;

public class Main {
 
     public static void main(String[] args) {
         Person p1 = new Person("Boss", null);
 
         Person p11 = new Person("Head of Department - Purchasing", p1);
         Person p111 = new Person("Purchaser A", p11);
         Person p112 = new Person("Purchaser B", p11);
 
         Person p12 = new Person("Head of Department - IT", p1);
         Person p121 = new Person("Programmer", p12);
         Person p122 = new Person("Administrator", p12);
 
         System.out.println("Superiors of: " + p121.getName());
         Main.showSuperior(p121);
 
         System.out.println("\nEmployees of: " + p1.getName() + ": ");
         Main.showEmployees(p1, 0);
     }
 
 
     static private void showSuperior(Person p)  // possible without recursion
     {
         while(p.getSuperior() != null)
         {
             System.out.println(p.getSuperior().getName());
             p = p.getSuperior();
         }
     }
 
     static private void showEmployees(Person p, int recDepth)
     {
         if (p.getEmployees().size() > 0)
         {
             recDepth++;
             for (Person person: p.getEmployees())
             {
                 for (int i = 0; i < recDepth; i++)
                     System.out.print("\t");
                 System.out.println(person.getName() + " ");
                 Main.showEmployees(person, recDepth);  // recursive call
             }
         }
     }
 }
