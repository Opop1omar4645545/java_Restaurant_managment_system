/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;

/**
 *
 * @author Moustafa Tarek
 */
import java.io.File;
import java.util.*;
public abstract class  person {
    String name;
    String address;
   String pass = "123";
    String phone_num;
     int workhours;
    static int emp_id=20218000;
    static int meal_id=0;
     static int cust_total_pay=0;
     static int cust_id=1000;
     int age;
     String meal;
     static int order_id=0;
     static int report_id=0;


    double emp_salary;
    int price;
       
  public person(){
  }
public boolean Login(String type, String username, String userPass)
    {
        String fileName = type+".txt";
        File file = new File(fileName);
        
        try 
        {
            Scanner input = new Scanner(file);
            while(input.hasNextLine())
            {
              name = input.nextLine();
              pass = input.nextLine();
            
              if(username.equals(name))
              {
                if(userPass.equals(pass))
                {
                    input.close();
                    return true;
                }
            
             }
           }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
  


  public String tostring(int x)
  {
      String str=Integer.toString(x);
      return str;
  }
  public abstract void  printdata();

}
