/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pl_project;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Moustafa Tarek
 */
public class file_class extends person {

    public file_class() {
    }

    String file_name;
    
     File file;
     
    public file_class(String path)
      {
          this.file_name = path;
      }
    
  public void createFile()
  {
      
       file = new File(file_name);
  }
  
  public void writeToFile(String line)
  {
      try
        {   
            FileWriter fw = new FileWriter(file,true); 
            fw.append(line);
            fw.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
  }
    public void writeToFile2(String line1)
  {
      try
        {   
            FileWriter fw = new FileWriter(file,false);
            fw.write(line1+"\n");
            fw.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
  }
  public void file_read()
  {
       String name="";
      String allNames[];
         try {
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                name += fr.nextLine()+"\n";
            }
            allNames = name.split("\n");
                    for(int i =0; i< allNames.length ; i++)
                System.out.println(allNames[i]);
 
       } 
        catch (Exception e) {
            allNames= new String[1];
            allNames[0] = e.getMessage();
        }
  }  public String search(String id)
  {
       String name="";
      String allNames[];
         try {
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                name += fr.nextLine();
                
             allNames = name.split(",");
             for(int i=0;i<allNames.length;i++)
             {
                 if(allNames[i].equals(id))
                     return name;
                 
             }

            }
  
 
       } 
        catch (Exception e) {
            allNames= new String[1];
            allNames[0] = e.getMessage();
        }
        return null;
  }

    public ArrayList<String> del(String id)
    {
        String name[];
        boolean flaaag=false;
 
       ArrayList <String> list=new ArrayList <String>();
         try {
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                list.add(fr.nextLine());
            }
            for(int i=0;i<list.size();i++)
            {
                name=list.get(i).split(",");
                for(int r=0;r<name.length;r++)
                {
                    if(name[r].equals(id))
                    {
                        list.remove(i);
                        flaaag=true;
                    
                    }
                    
                      if(flaaag) break;
                }
               if(flaaag) break;
  
            }
            return list;
            
            
      
       } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            list.add("eror");
            return list;
  }
    }
     public ArrayList<String> upd(String id,String x,String y)
    {
        String name[];
        boolean flaaaaag=false;
                
 
       ArrayList <String> list=new ArrayList <String>();
         try {
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                list.add(fr.nextLine());
            }
            for(int i=0;i<list.size();i++)
            {
                name=list.get(i).split(",");
                for(int r=0;r<name.length;r++)
                {
                    if(name[r].equals(id))
                    {
                    String v=list.get(i).replace(x,y);
                     list.set(i, v);
                      flaaaaag=true;
                    }
                      if(flaaaaag) break;
                }
               if(flaaaaag) break;
  
            }
            return list;
            
      
       } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            list.add("eror");
            return list;
  }
    }   
     public String read(String id)
     {
         String name[] = null;
         String h="";
         boolean flaaaag=false;
       ArrayList <String> list=new ArrayList <String>();
       try
       {
             Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                list.add(fr.nextLine());
            }
              for(int i=0;i<list.size();i++)
            {
                name=list.get(i).split(",");
              for(int t=0;t<name.length;t++)
              {
              if(id.equals(name[t]))
              {
               h= name[t-1];
              flaaaag=true;
              break;
              }
              }
              if(flaaaag)break;
            }

              return h;
              
            
       }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "";

  }
              
     }
   public String read2(String id)
     {
         String name[] = null;
         String h="";
         boolean afroos=false;
       ArrayList <String> list=new ArrayList <String>();
       try
       {
             Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                list.add(fr.nextLine());
            }
              for(int i=0;i<list.size();i++)
            {
                name=list.get(i).split(",");
              for(String it: name)
              
              if(id.equals(it))
              {
               h+= name[1]+",";
              }
             }
            

              return h;
     }
              
            
       
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "";

  }
              
     }
    public ArrayList<String> del2(String id)
    {
        String name[];
 
       ArrayList <String> list=new ArrayList <>();
         try {
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                list.add(fr.nextLine());
            }

            for(int i=0;i<list.size();i++)
            {
                name=list.get(i).split(",");
                for(String it: name)
                {
                 
                    while(it.equals(id))
                    {
                        list.remove(i);
                        if(list.isEmpty())break;
                   
                    }
                    
                    
                }
  
            }

            return list;
            
            
      
       } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            list.add("eror");
            return list;
  }
    }
      public String[] file_read2()
  {
       String name="";
      String allNames[];
         try {
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine())
            {
                name += fr.nextLine()+"\n";
            }
            allNames = name.split("\n");
            return allNames;
            
       } 
        catch (Exception e) {
            allNames= new String[1];
            allNames[0] = e.getMessage();
                        return allNames;

        }
  }
            @Override
                             public void printdata()
                {
                    System.out.print("You are in the file class" );
                }

                
}

    



