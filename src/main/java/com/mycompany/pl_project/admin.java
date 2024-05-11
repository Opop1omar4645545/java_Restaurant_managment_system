/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;


/**
 *
 * @author Moustafa Tarek
 */
public class admin extends person{
        

       public void create_admin_file(){
        try{
   file_class fw =new file_class("admin.txt");
    fw.createFile();
    fw.writeToFile("admin");
    fw.writeToFile("\n");
    fw.writeToFile("admin"+"123");
    fw.writeToFile("\n");
        }
         catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }
       public boolean Login(String username, String userPass)
    {
        return this.Login("admin", username, userPass);
    }
       public void modify_admin_data(String name ,String pass)
       {
            file_class fw =new file_class("admin.txt");
              fw.createFile();
               fw.writeToFile2(name+"\n"+pass);  
      }
    public void add_employee(String name , String address , int workhours,String phone_num,int age)
    {
           emp_id++;
 
        employee emp=new employee(name,address,emp_sal(workhours),phone_num,age,emp_id);
        emp.add_employeee();
        emp.create_file_employee(tostring(emp_id));
        
 
    }
     private String emp_sal(int work_hours)
    {
    if(work_hours<12) emp_salary=work_hours*100;
    
    else emp_salary=work_hours*150;
    
    return Double.toString(emp_salary);
    }  

    public void listemp()
    {
        employee em=new employee();
         em.listempp();
    }

    public void update_employee(String id,String old,String neew)
    {
        employee em=new employee();
         em.update_employeee( id, old, neew);

    }
    public void delete_emp(String id)
    {
           employee em=new employee();
         em.delete_empp( id);
           
    }
    public void searche(String id)
    {
         employee em=new employee();
         em.search_empppppp(id);
    }
    public void listMeal()
    {
        Meals ms=new Meals();
         ms.listmeall();
    }
        public void search_mealss(String id)
    {
         Meals em=new Meals();
         em.search_meals(id);
    }


    public void update_meal(String id,String old,String neew)
    {
        Meals ms=new Meals();
         ms.update_meall( id, old, neew);

    }
    public void delete_meal(String id)
    {
           Meals ms=new Meals();
         ms.delete_meall( id);
  
    }
        public void add_meal(String meal,int price)
    {
        meal_id++;
           Meals ms=new Meals();
         ms.add_meal(meal, price,meal_id);
  
    }
        public void add_report()
        {
              report_id++;

            reports ff =new reports();
            ff.add_reports(tostring(report_id));
            
            
        }

    /**
     *
     */
    @Override
              public void printdata()
                {
                    System.out.print("You are in the admin class" );
                }
              
        

} 
