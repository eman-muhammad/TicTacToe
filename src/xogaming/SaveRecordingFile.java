/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogaming;
import java.io.File; 
import java.io.IOException;

/**
 *
 * @author Dream10
 */
public class SaveRecordingFile {
    public static void main(String[] args) {  
    try {  
      File myObj = new File("C:\\Users\\saveRecording.txt");
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());  
      } else {  
        System.out.println("File already exists.");  
      }  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    }  
  }  
}
