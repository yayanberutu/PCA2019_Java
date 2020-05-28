/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pencatatan.kedatangan.mahasiswa.baru.it.del;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ASUS
 */
public interface AppRemote extends Remote {
    void jalankan() throws RemoteException; 
}
