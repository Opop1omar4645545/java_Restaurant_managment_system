/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;

import java.util.ArrayList;

/**
 *
 * @author Moustafa Tarek
 */
public class customer extends person{
        file_class fw =new file_class("customer data.txt");
        public customer(){};
        public customer(String name , String address ,String phone_num,int age,int cust_id)
    {
        this.name= name;
        this.address= address;
        this.phone_num=phone_num;
        this.age=age;
        this.cust_id=cust_id;
    }
    

      public void create_file_customer(String id){
        try{
   file_class f =new file_class("customer data.txt");
    f.createFile();
    f.writeToFile(id);
    f.writeToFile("\n");
    f.writeToFile(name+"123");
    f.writeToFile("\n");
        }
         catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }
    

public boolean Login(String username, String userPass)
    {
        return this.Login("customer", username, userPass);
    }

       public void add_Cutsomer()
       {
           
           fw.createFile();
           fw.writeToFile(get_Customer_data());
           fw.writeToFile("\n");
 
       }
         public void update_customer(String id,String old,String neew)
    {
         file_class fe = new file_class("Customer data.txt");
          fe.createFile();
          ArrayList<String>ard =fe.upd(id,old,neew);
          String name="";

           for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i)+"\n";
           }
           fe.writeToFile2(name);

    }
           public void listcustt()
    {
         file_class fe = new file_class("Customer data.txt");
          fe.createFile();
          fe.file_read();
    }
        public void search_custtt(String cust_id)
        {
          file_class fe = new file_class("Customer data.txt");
                    fe.createFile();
                    String str;
                    
                  str= fe.search(cust_id);
                   System.out.print(str+"\n");
                         
        }

        public void delete_custt(String id)
    {
          file_class fe = new file_class("Customer data.txt");
          fe.createFile();
          ArrayList<String>ard =fe.del(id); 
          String name="";

           for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i)+"\n";
           }
           fe.writeToFile2(name);
    }
 

                public String get_Customer_data()
       {
           return this.name+","+tostring(cust_id)+","+this.address+","+this.phone_num+","+tostring(age)+","+tostring(cust_total_pay);
           
       }
                public void make_order( String meal_id,String cust_id)
                {
               
                            
                 file_class fe = new file_class("meals.txt");
                 fe.createFile();
                 String c="";
                 c=fe.read(meal_id);

                 if(!c.equals(""))
                 {
                        order_id++;
                     order fw=new order((cust_id),meal_id,order_id);
                     fw.add_order( (cust_id), meal_id, order_id,c);
                     employee e1=new employee ();
                     e1.customer_biling(cust_id, c);
                     e1.customer_discount(cust_id);
                     
                 }
                 
                    
                    
                }
        @Override
                             public void printdata()
                {
                    System.out.print("You are in the customer class" );
                }
}
