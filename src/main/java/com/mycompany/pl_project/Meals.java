/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Meals extends person {
    private String meal;
    public Meals(){};
    public Meals(String meal,int price)
    {
        this.meal=meal;
        this.price=price;
    }
    public void add_meal(String meal,int price,int id)
    {
        file_class fe = new file_class("meals.txt");
         fe.createFile();
         fe.writeToFile(meal+','+tostring(price)+','+tostring(id)+"\n");
    }
              public void update_meall(String id,String old,String neew)
    {
         file_class fe = new file_class("meals.txt");
          fe.createFile();
          ArrayList<String>ard =fe.upd(id,old,neew);
          String name="";

           for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i)+"\n";
           }
           fe.writeToFile2(name);

    }
           public void listmeall()
    {
         file_class fe = new file_class("meals.txt");
          fe.createFile();
          fe.file_read();
    }

        public void delete_meall(String id)
    {
          file_class fe = new file_class("meals.txt");
          fe.createFile();
          ArrayList<String>ard =fe.del(id); 
          String name="";

           for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i)+"\n";
           }
           fe.writeToFile2(name);
    }
                public void search_meals(String meal_id)
        {
            
          file_class fe = new file_class("meals.txt");
                    fe.createFile();
                    String str;
                    
                   str= fe.search(meal_id);
                   System.out.print(str+"\n");
                         
        }
                        public void printdata()
                {
                    System.out.print("You are in the Meals class" );
                }

    
}