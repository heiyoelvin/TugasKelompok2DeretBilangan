import java.util.Scanner;
public class TugasKelompok2 {
    public static void main(String[] args) {

        Scanner input_name = new Scanner(System.in);
        Scanner input_nim = new Scanner(System.in);
        Scanner input_number = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean running = true;
        String loopingAnswer;


        while (running) {
            System.out.print("Masukkan nama Anda [1..25] : ");
            String name = input_name.nextLine();

            if (name.length() >= 25) {
                System.out.println("Lebih dari 25 Karakter");
            } else {
                System.out.print("Masukkan NIM Anda [Harus 10 Karakter] : ");
                String nim = input_nim.nextLine();
                System.out.println(" ");

                if (nim.length() == 10) {
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println(" ");
                    System.out.println("Registrasi Sukses");
                    System.out.println("Selamat datang " + name + " [NIM : " + nim +"]..^^v" );
                    System.out.println(" ");
                    System.out.println("Mari belajar macam-macam deret bilangan..");

                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println(" ");
                    System.out.print("Masukkan Sembarang Angka [5..20] : ");
                    int angka = input_number.nextInt();
                    System.out.println(" ");
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

                    if (angka >= 5 && angka <= 20) {
                        System.out.println(" ");
                        System.out.println("Deret Bilangan");
                        System.out.println("#################");
                        System.out.println(" ");
                        System.out.println(angka + " Bilangan Genap :");
                        int counter = 0;
                        int totalgenap = 0;

                        for (int a = 2; true; a += 2) {
                            System.out.print(a + " ");
                            totalgenap += a;
                            counter++;

                            if (counter > (angka - 1)) {
                                break;
                            }
                        }
                        System.out.println(" ");
                        System.out.println("Hasil dari penjumlahan = " + totalgenap);
                        System.out.println(" ");
                        int hitung = 0;
                        int totalganjil = 0;
                        System.out.println(angka + " Bilangan Ganjil :");

                        for (int a = 1; true; a += 2) {
                            System.out.print(a + " ");
                            totalganjil += a;
                            hitung++;

                            if (hitung > (angka - 1)) {
                                break;
                            }
                        }

                        System.out.println(" ");
                        System.out.println("Hasil dari penjumlahan = " + totalganjil);

                        System.out.println(" ");
                        System.out.println(angka + " Bilangan fibonacci :");
                        int past, current, fibonacci;
                        past = 0;
                        current = 1;
                        fibonacci = 1;
                        int totalfibo = 0;

                        for (int i = 1; i <= angka; i++) {
                            System.out.print(current + " ");
                            totalfibo += current;
                            fibonacci = past + current;
                            past = current;
                            current = fibonacci;
                        }
                        System.out.println(" ");
                        System.out.println("Hasil dari penjumlahan = " + totalfibo);
                        System.out.println(" ");
                    }
                } else {
                    System.out.print("NIM tidak valid\n");
                }
            }

            System.out.print("Anda ingin mengulang [y/t] : ");
            loopingAnswer = input.nextLine();

            if (loopingAnswer.equalsIgnoreCase("t")) {
                running = false;
            }
        }
    }
}
