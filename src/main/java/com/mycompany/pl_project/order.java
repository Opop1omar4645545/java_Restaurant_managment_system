/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;

/**
 *
 * @author Moustafa Tarek
 */
public class order extends person {
    public order(){};
    public order(String cust_id,String meal_id,int order_id)
    {
        int k=Integer.parseInt(meal_id);
        this.meal_id=k;
        this.order_id=order_id;
            
    }
    public void add_order(String cust_id,String meal_id,int order_id,String meal_price)
    {
        file_class w=new file_class("order.txt");
        w.createFile();
        w.writeToFile(cust_id+","+meal_id+","+tostring(order_id)+","+meal_price+"\n");
    }
                        public void printdata()
                {
                    System.out.print("You are in the order class" );
                }

}
