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
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara1/2/3).");
            }
        }
        sc.close();
    }
}