package com.greatjin.picameraSE;

import java.io.IOException;  
import java.util.logging.Level;  
import java.util.logging.Logger;  
  
public class Camera {   
    
  public Camera() {   
  }   
  public void takePicture(String pFileName, String pPicDir)   
  {   
   executeShellCommand("raspistill -o "+pFileName+".jpg -t 750 -rot 180");   
   executeShellCommand("sudo mv -f "+pFileName+".jpg "+pPicDir);  
  }   
  public void film(String pFileName,long pTimeInMilliSeconds)   
  {   
   executeShellCommand("raspivid -o "+pFileName+".h264 -t "+pTimeInMilliSeconds);   
  }   
  private void executeShellCommand(String pCommand)   
  {   
   try {   
    Runtime run = Runtime.getRuntime() ;   
    Process pr = run.exec(pCommand) ;   
    pr.waitFor() ;   
   } catch (IOException e){
	    Logger.getLogger(Camera.class.getName()).log(Level.SEVERE, null, e);   
   } catch (InterruptedException ex) {   
    Logger.getLogger(Camera.class.getName()).log(Level.SEVERE, null, ex);   
   }   
  }   
 }   