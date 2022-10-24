
import java.util.ArrayList;


public class Dosen extends Person{
     private int jumlahmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address){
        super(name, address);
        jumlahmatkul = 0;
        matkuList = new ArrayList<>();

    }

    public boolean addCourse(String course){
        //jika dalam arraylist ada yang sama maka matkul telah ada
        if(matkuList.contains(course)){
            System.out.println("Matkul Telah Ada");
            return false;
        }

        //menambahkan
        jumlahmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        //jika dalam arraylist tidak ada course maka tidak bisa menghapus matkul
        if(!matkuList.contains(course)){
            System.out.println("Matkul Yang Akan Dihapus Tidak Ada");
            return false;
        }

        //jika ada yang dihapus
        jumlahmatkul--;
        matkuList.remove(course);
        return true;
        
    }

    public int getjumlahmatkul() {
        return jumlahmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\n Jumlah Mata Kuliah Yang Diampu : " + getjumlahmatkul();
    }
}
