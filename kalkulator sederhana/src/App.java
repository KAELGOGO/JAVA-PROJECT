
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variable
        int operator, i, x;
        int hasilb = 0;
        int input1i, input2i;
        boolean exit = false;
        double input1d, input2d;
        double hasil = 0;
        String opr = "";
        // scanner
        Scanner sc = new Scanner(System.in);
        // intro
        System.out.println("\n\t\t\tSELAMAT DATANG DI KALKULATOR SEDERHANA BUATAN KLEE\n");
        System.out.println(
                "===============================================================================================================");
        while (!exit) {
            // penentuan operator
            System.out.println(
                    "\n\t\t\tTOLONG PILIH OPERASI YANG DI INGINKAN !!(DENGAN ANGKA)\n ");
            System.out.print(
                    "tambah(1)\tkurang(2)\tbagi(3)\tkali(4)\tmodulo(5)\tfpb(6)\tkpk(7)\tpersentase(8)\tfaktorial(9)\n\n\t\t\t\t\t\tselesai(0): ");
            operator = sc.nextInt();
            switch (operator) {
                case 1:
                    tambah();
                    break;
                case 2:
                    kurang();
                    break;
                case 3:
                    bagi();
                    break;
                case 4:
                    kali();
                    break;
                case 5:
                    mod();
                    break;
                case 6:
                    fpb();
                    break;
                case 7:
                    kpk();
                    break;
                case 8:
                    persen();
                    break;
                case 9:
                    faktorial();
                    break;
                case 0:
                    System.out.println("\n\t\t\t\t\tBAIKLAH SAMPAI JUMPA LAGI\n");
                    exit = true;
                    break;
                default:
                    System.out.println("TOLONG PILIH PILIHAN YANG SESUAI DI ATAS ");
                    break;
            }
        }
    }

    public static void tambah() {
        // buat Input1
        System.out.print("TOLONG MASUKKAN ANGKA YANG INGIN DI HITUNG : ");
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        // buat input2d
        System.out.print("TOLONG MASUKKAN ANGKA YANG SELANJUT NYA : ");
        double input2 = sc.nextDouble();

        double hasil = input1 + input2;
        System.out.println("HASIL DARI " + input1 + " + " + input2 + " = " + hasil);
    }

    public static void kurang() {
        // buat Input1
        System.out.print("TOLONG MASUKKAN ANGKA YANG INGIN DI HITUNG : ");
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        // buat input2d
        System.out.print("TOLONG MASUKKAN ANGKA YANG SELANJUT NYA : ");
        double input2 = sc.nextDouble();

        double hasil = input1 - input2;
        System.out.println("HASIL DARI " + input1 + " - " + input2 + " = " + hasil);

    }

    public static void bagi() {
        // buat Input1
        System.out.print("TOLONG MASUKKAN ANGKA YANG INGIN DI HITUNG : ");
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        // buat input2d
        System.out.print("TOLONG MASUKKAN ANGKA YANG SELANJUT NYA : ");
        double input2 = sc.nextDouble();

        double hasil = input1 / input2;
        System.out.println("HASIL DARI " + input1 + " / " + input2 + " = " + hasil);

    }

    public static void kali() {
        // buat Input1
        System.out.print("TOLONG MASUKKAN ANGKA YANG INGIN DI HITUNG : ");
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        // buat input2d
        System.out.print("TOLONG MASUKKAN ANGKA YANG SELANJUT NYA : ");
        double input2 = sc.nextDouble();

        double hasil = input1 * input2;
        System.out.println("HASIL DARI " + input1 + " * " + input2 + " = " + hasil);

    }

    public static void mod() {
        // buat Input1
        System.out.print("TOLONG MASUKKAN ANGKA YANG INGIN DI HITUNG : ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        // buat input2d
        System.out.print("TOLONG MASUKKAN ANGKA YANG SELANJUT NYA : ");
        int input2 = sc.nextInt();

        int hasil = input1 % input2;
        System.out.println("HASIL DARI " + input1 + " mod " + input2 + " = " + hasil);

    }

    public static void fpb() {
        Scanner sc = new Scanner(System.in);
        // buat input1
        System.out.print("MAU FPB ANGKA APA ? : ");
        int input1 = sc.nextInt();
        // input 2
        System.out.print("ANGKA KE 2 NYA APA? : ");
        int input2 = sc.nextInt();
        int kosong = input1;
        int kosong2 = input2;
        while (input2 != 0) {
            int temp = input2;
            input2 = input2 % input1;
            input1 = temp;
        }
        int hasil = input1;
        System.out.println("HASIL FPB DARI " + kosong + " DAN " + kosong2 + " = " + hasil);
    }

    public static void kpk() {
        Scanner sc = new Scanner(System.in);
        // buat input1
        System.out.print("MAU KPK ANGKA APA ? : ");
        int input1 = sc.nextInt();
        // input 2
        System.out.print("ANGKA KE 2 NYA APA? : ");
        int input2 = sc.nextInt();
        int kosong = input1;
        int kosong2 = input2;
        while (input2 != 0) {
            int temp = input2;
            input2 = input2 % input1;
            input1 = temp;
        }
        int hasil = (kosong * kosong2) / input1;
        System.out.println("HASIL KPK DARI " + kosong + " DAN " + kosong2 + " = " + hasil);
    }

    public static void persen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("TOLONG ISI ANGKA YANG INGIN DI PERSENTASEKAN : ");
        double input1 = sc.nextDouble();
        System.out.print("TOLONG ISI ANGKA PERSENTASE : ");
        double input2 = sc.nextDouble();
        double kosong = input2;
        input2 /= 100;
        double hasil = input1 * input2;
        System.err.println("HASIL " + kosong + "% " + "dari " + input1 + " = " + hasil);
    }

    public static void faktorial() {
        // buat Input1
        System.out.print("TOLONG MASUKKAN ANGKA YANG INGIN DI FAKTORIALKAN : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int hasil = 1;
        if (input == 0 || input == 1) {
            hasil = 1;
        } else {
            for (int i = 1; i <= input; i++) {
                hasil *= i;
            }
        }
        System.out.println("HASIL DARI " + input + "! = " + hasil);
    }
}
