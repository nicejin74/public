package com.greatjin.picameraSE;

import java.io.File;  
import java.util.ArrayList;  
import java.util.logging.Level;  
import java.util.logging.Logger;  
  
/**  
 *  
 * @author debian  
 */  
public class TimeLapseCamera {  
  
   static int dirCount = 0;  
     
   public static void main(String[] args) {   
   Camera piCam = new Camera();   
   int picName = 1;     
   String dirName = "/home/pi/timelapse";  
         
   checkDirs(dirName, new ArrayList<File>());  
   String picDirectory = dirName + "/" + dirCount;  
     
   File dir = new File(picDirectory);  
   dir.mkdir();  
   while(true)  
   {   
    piCam.takePicture(picName + "", picDirectory);  
    picName++;  
    try {   
     Thread.sleep(5000);   
    } catch (InterruptedException ex) {   
     Logger.getLogger(TimeLapseCamera.class.getName()).log(Level.SEVERE, null, ex);   
      System.out.println("Crashed");  
    }  
   }  
  }  
     
  public static void checkDirs(String directoryName, ArrayList<File> files)  
  {  
    File directory = new File(directoryName);  
    dirCount++;  
      
    File[] fList = directory.listFiles();  
    for (File file : fList) {  
      if (file.isFile()) {  
      } else if (file.isDirectory()) {  
        checkDirs(file.getAbsolutePath(), files);  
      }  
    }  
  }  
}  