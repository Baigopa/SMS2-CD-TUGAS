import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        LocalDate today = LocalDate.now();
        String name,birthDay,getGender;
        char gender;
        Scanner userImput = new Scanner(System.in);
        System.out.print("Nama: ");
        name = userImput.nextLine();

        System.out.print("Jenis Kelamin (L/O) :  ");
        gender = userImput.next().charAt(0);
        userImput.nextLine();

        System.out.print("Tanggal Lahir :(yyy-mm-ddd) : ");
        birthDay = userImput.nextLine();

        String[] parts = birthDay.split("-");
        int year = Integer.parseInt(parts[0]);
        int month  = Integer.parseInt(parts[1]);
        int day =  Integer.parseInt(parts[2]);

        LocalDate calculate = LocalDate.of(year,month,day);
        int calYears = Period.between(calculate,today).getYears();
        int calmonth = Period.between(calculate,today).getMonths();

        getGender = (gender == 'P') ? "Perempuan" : "Laki-Laki";
        System.out.println("Nama : " + name + "\nJenis Kelamin : " + getGender + "\nUmur Anda : " + calYears + " Tahun " + calmonth + " Bulan");
    }
}