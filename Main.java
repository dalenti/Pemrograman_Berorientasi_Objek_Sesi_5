
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukan Nama Dosen : ");
        String nama = sc.nextLine();
        System.out.print("Masukan Alamat Dosen : ");

        String alamat = sc.nextLine();

        Dosen dosen1 = new Dosen(nama, alamat);

        for(int i = 0; i < 3; i++){
            System.out.print("Masukan Mata Kuliah Yang Diampu: ");
            String matkul = sc.nextLine();
            dosen1.addCourse(matkul);
        }

        System.out.println(dosen1);

    }
}
