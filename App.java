import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {


        ArrayList<String> x=new ArrayList<String>();

        System.out.println(" ");
        System.out.println("Isi array awal : "+x);
        System.out.println("Apakah array kosong(?)(true/false) : "+x.isEmpty());
        System.out.println("Jumlah elemen array saat ini : "+x.size()+" elemen");
        x.add("a");
        x.add("l");
        x.add("d");
        x.add("i");

        System.out.println(" ");
        System.out.println("Cek isi array : "+x);
        System.out.println("Apakah array kosong(?)(true/false) : "+x.isEmpty());
        System.out.println("Jumlah elemen array saat ini : "+x.size()+" elemen");
        
        System.out.println(" ");
        System.out.println("Isi indeks ke-0 : "+x.get(0));
        System.out.println("Isi indeks ke-2 : "+x.get(2));
        //System.out.println("Isi indeks ke-6 : "+x.get(6));
        //System.out.println("Isi indeks ke-(-3) : "+x.get(-3));

        System.out.println(" ");
        System.out.println("Indeks a : ke-"+x.indexOf("a"));
        System.out.println("Indeks c : ke-("+x.indexOf("c")+")");
        System.out.println("Indeks q : ke-("+x.indexOf("q")+")");
        System.out.println("Indeks d : ke-"+x.indexOf("d"));

        System.out.println(" ");
        System.out.println("Cek isi array : "+x);
        System.out.println("Jumlah elemen array saat ini : "+x.size()+" elemen");
        x.remove(3);
        System.out.println(" ");
        System.out.println("Kondisi array setelah remove(3)");
        System.out.println("Cek isi array : "+x);
        System.out.println("Jumlah elemen array saat ini : "+x.size()+" elemen");
        x.remove(1);
        System.out.println(" ");
        System.out.println("Kondisi array setelah remove(1)");
        System.out.println("Cek isi array : "+x);
        System.out.println("Jumlah elemen array saat ini : "+x.size()+" elemen");

        x.add(0,"e");
        System.out.println(" ");
        System.out.println("add e");
        System.out.println("Cek isi array : "+x);
    
        x.add(2,"f");
        System.out.println(" ");
        System.out.println("add f");
        System.out.println("Cek isi array : "+x);
    
        x.add(3,"g");
        System.out.println(" ");
        System.out.println("add g");
        System.out.println("Cek isi array : "+x);
    
        x.add(4,"h");
        System.out.println(" ");
        System.out.println("add h");
        System.out.println("Cek isi array : "+x);
    
        x.add(6,"h");
        System.out.println(" ");
        System.out.println("add h");
        System.out.println("Cek isi array : "+x);
    
        //x.add(-3,"j");
        //System.out.println(" ");
        //System.out.println("add j");
        //System.out.println("Cek isi array : "+x);

        
    }
}
