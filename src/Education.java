import java.util.Scanner;

public class Education {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
            String nama = scan.nextLine();

        System.out.print("Masukkan NIM: ");
            int nim = scan.nextInt();

        System.out.print("Masukkan Umur: ");
            int age = scan.nextInt();

        scan.nextLine();
        System.out.print("Masukkan pendidikan: ");
            String education = scan.nextLine();

        System.out.println(" Nama: " + nama + " Nim: " + nim + " Umur: " + age + " Pendidikan: " + education);

    }
}
