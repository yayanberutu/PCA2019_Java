/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pencatatan.kedatangan.mahasiswa.baru.it.del;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ASUS
 */
public class Client {
    private Client() {} 
   public static void main(String[] args) {  
      try { 
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         AppRemote stub = (AppRemote) registry.lookup("AppRemote"); 
         
         // Calling the remote method using the obtained object 
         stub.jalankan();
         
         System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
