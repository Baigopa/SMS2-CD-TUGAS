import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama mahasiswa (ketik 'selesai' untuk berhenti): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                mahasiswa.add(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nDaftar nama mahasiswa:");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("Nama ke-" + (i + 1) + ": " + mahasiswa.get(i));
        }

        scanner.close();
    }
}
