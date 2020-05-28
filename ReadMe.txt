Aplikasi terdapat 2 jenis: Desktop dan Web.
	1. Aplikasi web bernama PCA2019
	2. Aplikasi desktop bernama Sistem-Pencatatan-Kedatangan-Mahasiswa

PCA2019
1. Buka proyek di netbeans
2. Cari file Home.jsp di folder Web Pages. Klik kanan, pilih run.
3. Aplikasi terdiri dari 3 Tab yaitu Home, Aspa, dan Aspi.
  Home berisi daftar semua mahasiswa
  Aspa berisi daftar nama mahasiswa perkamar
  Aspi berisi daftar nama mahasiswi perkamar
4. Pada Home, kita bisa mengecek kedatangan mahasiswa baru dengan menekan tombol Datang.
   Apabila kita menekan tombol datang, maka kamar mahasiswa otomatis terbagi.
5. Untuk melihat daftar kamar, kita bisa memilih Aspa/Aspi.

Pastikan anda sudah mengikutsertakan mysql connector

Sistem-Pencatatan-Kedatangan-Mahasiswa
1. Buka ..\Sistem-Pencatatan-Kedatangan-Mahasiswa\src\sistem\pencatatan\kedatangan\mahasiswa\baru\it\del
2. Buka cmd pada path tersebut
3. Run command "javac -cp .;completePathOfMysqlConnector/mysql-connector-java-5.1.6.jar *.java" untuk compile semua file java beserta library jar anda
 (note: lokasi file jar anda berbeda setiap PC)
4. Kemudian run command "start rmiregistry" untuk start java rmi
5. Setelah itu jalankan server dengan command "java Server"
6. Jika berhasil, akan muncul tulisan "Server Ready".
7. Setelah itu jalankan client dengan command :
"java -cp .;completePathOfMysqlConnector/mysql-connector-java-5.1.6.jar Clien"
8. Aplikasi desktop terbuka