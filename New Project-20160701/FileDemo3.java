import java.io.*;
public class FileDemo3 {
     public static void main(String[] args){
         File[] files =File.listRoots();
         for(File file:files){
             System.out.println(file);
             if(file.length()>0){
                 String[] filenames =file.list();
                 for(String filename:filenames){
                     System.out.println(filename);
                 }
             }
         }
     }

 }