import java.util.Scanner;

public class StudiKasus2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim().toLowerCase();
        int dokumen, peringkat, pendanaan;

        if (jenis.equals("belmawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            // Cabang perlombaan (tingkat 1)
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (dokumen >= 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " +
                            peringkat + ", dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + "dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        } else if (jenis.equals("pkm")) {
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            pendanaan = sc.nextInt();
            if (pendanaan == 1) {
                if (dokumen >= 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
        } else if (jenis.equals("lainnya")) {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        } else {
            System.out.println("Status : Jenis kegiatan tidak dikenal.");
        }
        sc.close();
    }
}
