/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pencatatan.kedatangan.mahasiswa.baru.it.del;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class Server extends SistemPencatatanKedatanganMahasiswaBaruITDel{
    public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         SistemPencatatanKedatanganMahasiswaBaruITDel obj = new SistemPencatatanKedatanganMahasiswaBaruITDel();
      
         // Exporting the object of implementation class  
         // (here we are exporting the remote object to the stub) 
         AppRemote stub = (AppRemote) UnicastRemoteObject.exportObject(obj, 0);  
      
         // Binding the remote object (stub) in the registry 
         Registry registry = LocateRegistry.getRegistry(); 
         
         registry.bind("AppRemote", stub);  
         System.err.println("Server ready"); 
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
