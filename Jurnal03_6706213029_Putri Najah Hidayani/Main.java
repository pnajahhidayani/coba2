import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Pilihlah menu:");
        System.out.println("1. Input Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cetak List Pegawai");
        System.out.println("4. Keluar");
 

        Scanner input = new Scanner (System.in);
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();

        int perintah = Integer.parseInt(input.nextLine());
        if (perintah == 1){
            System.out.println ("Masukkan data: ");
            String nip = input.nextLine();
            String nama = input.nextLine();
            String divisi = input.nextLine();
            

            linkedList.insertAtFront(new Pegawai(nip, nama, divisi));
            linkedList.print();
            

        } 
        if (perintah == 2){
            linkedList.remove();
        }
        linkedList.print();
    
    }
}
