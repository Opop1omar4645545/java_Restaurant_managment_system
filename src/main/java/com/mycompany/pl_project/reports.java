/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;

import java.time.LocalDate;

/**
 *
 * @author Omar
 */
public class reports  {
    public reports(){};
    public void add_reports(String id)
    {
        file_class fw=new file_class("report.txt");
        fw.createFile();
            LocalDate myObj = LocalDate.now(); 
            int y = 0;
            

        fw.writeToFile(myObj+"\n");
      file_class d=new file_class("order.txt");
      d.createFile();
      String x[];
     x= d.file_read2();
     y+=x.length;
      for(int i=0;i<x.length;i++)
      {
          fw.writeToFile(x[i]+"\n");
          
      }
      fw.writeToFile("we have "+x.length+" orders"+"\n"+"\n");
            file_class dd=new file_class("employee data.txt");
            dd.createFile();
            
     x= dd.file_read2();
          y+=x.length;

      for(int i=0;i<x.length;i++)
      {
          fw.writeToFile(x[i]+"\n");
      }
         fw.writeToFile("we have "+x.length+" employee_regstraions"+"\n"+"\n");
         file_class ddd=new file_class("customer data.txt");
            ddd.createFile();
            
     x= ddd.file_read2();
          y+=x.length;

      for(int i=0;i<x.length;i++)
      {
          fw.writeToFile(x[i]+"\n");
      }
         fw.writeToFile("we have "+x.length+" customers_regstraions"+"\n"+"\n");
         
         fw.writeToFile("we have "+y +" transactions today"+"\n");
         


      
      fw.writeToFile("see you soon😁😁");
      

        
        
    }
    
}
