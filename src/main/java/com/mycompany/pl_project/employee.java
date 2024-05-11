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
public class employee extends person {
    String emp_sal="";

        

       public employee(){
   }
       public employee(String name , String address , String emp_sal,String phone_num,int age,int emp_idd)
       {
           this.age=age;
           this.address=address;
           this.phone_num=phone_num;
           this.name=name;
           this.emp_sal=emp_sal;
           emp_id=emp_idd;
       }
       public void add_employeee()
       {
           file_class fe = new file_class("employee data.txt");
           fe.createFile();
           fe.writeToFile(get_Employee_data());
           fe.writeToFile("\n");
 
       }
                       public String get_Employee_data()
       {
           return this.name+","+emp_id+","+this.address+","+this.phone_num+","+emp_sal;
           
       }
           public void update_employeee(String id,String old,String neew)
    {
         file_class fe = new file_class("employee data.txt");
          fe.createFile();
          ArrayList<String>ard =fe.upd(id,old,neew);
          String name="";

           for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i)+"\n";
           }
           fe.writeToFile2(name);
    }

           public void listempp()
    {
         file_class fe = new file_class("employee data.txt");
          fe.createFile();
          fe.file_read();
    }

        public void delete_empp(String id)
    {
          file_class fe = new file_class("employee data.txt");
          fe.createFile();
          ArrayList<String>ard =fe.del(id); 
          String name="";

           for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i)+"\n";
           }
           fe.writeToFile2(name);
    }
        public void search_empppppp(String emp_id)
        {
          file_class fe = new file_class("employee data.txt");
                    fe.createFile();
                    String str;
                    
                   str= fe.search(emp_id);
                   System.out.print(str+"\n");
                         
        }
              public void searchc(String id)
    {
         customer em=new customer();
         em.search_custtt(id);
         
    }


      
       

    public void create_file_employee(String emp_id){
      
        try{
   file_class fw =new file_class("employee.txt");
    fw.createFile();
    fw.writeToFile(emp_id);
    fw.writeToFile("\n");
    fw.writeToFile(emp_id+"123");
    fw.writeToFile("\n");
        }
         catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }
    public boolean Login(String username, String userPass)
    {
        return this.Login("employee", username, userPass);
    }

            public void list_cust()
    {
               customer cs=new customer();
                  cs.listcustt();
    }

    public void update_cust(String id,String old,String neew)
    {
               customer cs=new customer();
                  cs.update_customer(id, old, neew);

    }
    public void delete_cust(String id)
    {
               customer cs=new customer();
                  cs.delete_custt(id);
  
    }
        public void add_cust(String name , String address , int cust_total_pay,String phone_num,int age)
    {
        cust_id++;
        customer cs=new customer(name,address,phone_num,age,cust_id);
        cs.add_Cutsomer();
        cs.create_file_customer(tostring(cust_id));
        
    }
        public void customer_biling(String id,String price)
    {
          file_class w=new file_class("customer_biling.txt");
          w.createFile();
          w.writeToFile(id+","+price+"\n");

    }
        public void customer_discount(String id)
        {
            String h;
             int k = 0;

           file_class w=new file_class("customer_biling.txt");
           w.createFile();
           h=w.read2(id);
           String p[];
          p= h.split(",");
          
          for(int i=0;i<p.length;i++)
          {
              k+=Integer.parseInt(p[i]);
                      
          }
              file_class t=new file_class("customer_biling.txt");
                        String name="";


          if(k>500)
          {
              k*=.8;
          h=tostring(k);
          t.createFile();
          ArrayList<String>ard =t.del2(id); 
          for(int i=0;i<ard.size();i++)
           {
               name+=ard.get(i);
           }
          if(name.equals(""))t.writeToFile2(name+id+","+h);
          else t.writeToFile2(name+"\n"+id+","+h);
          
        }
        }
        public boolean approve(boolean f)
        {
            if(f)return true;
             return false;
            
        }
            public void printdata()
                {
                    System.out.print("You are in the employee class" );
                }
              
}



