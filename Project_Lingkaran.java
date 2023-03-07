package project_lingkaran;

import java.util.Scanner;

public class Project_Lingkaran {
    public static void main(String[] args) {
        /* Projek ini bertujuan untuk menghitung Luas dan Keliling sebuah lingkaran
        dimana rumus untuk menghitungnya adalah sebagai berikut
        Variabel yang menjadi inputan adalah jari-jari (r) dan atau diameter (d)
        diameter adalah besarnya 2 kali jari-jari (d=2r)
        Luas = phi * r * r;
        Keliling = phi * d;
         */
        
        /*
        Membuat inisiasi konstanta yang telah diketahui melalui referensi bahwa 
        nilai phi sudah ditetapkan sebesar 3.14
        */
        final double phi = 3.14d; //deklarasi variabel
        double Luas, Keliling, r, d;
        
        Scanner input = new Scanner(System.in); //library Scanner untuk memberikan inputan
        System.out.print("Jika yang diketahui jari-jari KETIK 1, jika diameter KETIK 2 = ");
        int pilihan = input.nextInt(); //percabangan dengan Switch Case untuk kondisi jika yang diketahui berupa jari-jari atau diameter?
        switch (pilihan) {
            case 1:
                System.out.print("Inputkan nilai jari-jari dalam satuan meter = ");
                r = input.nextDouble();
                //Menghitung luas lingkaran
                Luas = phi * r * r;
                System.out.println("\t Luas lingkaran dengan jari-jari " + r +" meter adalah = "+Luas +" m^2");
                //Menghitung keliling lingkaran
                Keliling = phi * 2 * r; 
                System.out.println("\t Keliling lingkaran dengan jari-jari " + r +" meter adalah = "+Keliling +" m");
                break;
            case 2:
                System.out.print("Inputkan nilai diameter dalam satuan meter = ");
                d = input.nextDouble();
                //Menghitung luas lingkaran
                Luas = (0.25 * phi) * d * d;
                System.out.println("\t Luas lingkaran dengan diameter " + d +" meter adalah = "+Luas +" m^2");
                //Menghitung keliling lingkaran
                Keliling = phi * d;
                System.out.println("\t Keliling lingkaran dengan diameter " + d +" meter adalah = "+Keliling +" m");
                break;
            default:
            System.out.print("Inputan tidak sesuai!");
            break;
        }
    }
}
