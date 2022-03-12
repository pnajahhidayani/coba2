import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main (String[] args){

        System.out.println("Pilihlah menu:");
        System.out.println("1. Input Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cetak List Pegawai");
        System.out.println("4. Keluar");
 

        Scanner input = new Scanner (System.in);
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();

        int perintah = input.nextInt();
        if (perintah == 1){
            System.out.println ("Masukkan data: ");
            int nip = Integer.parseInt(input.nextLine());
            String nama = input.nextLine();
            String divisi = input.nextLine();
            

            linkedList.add(new Pegawai(nip, nama, divisi));
            linkedList.print();
            

        } 
        if (perintah == 2){
            linkedList.remove();
        }
        linkedList.print();
    
    }
}
