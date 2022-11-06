import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = (int) (Math.random() * 3);

        System.out.println("seçiminizi yapın  => makas(0) taş(1) kağıt(2)");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 2)
            System.out.println("hatalı seçim yaptınız");
        else if (number == 0 && x == 1)
            System.out.println("bilgisayar taşı seçti kaybettiniz");
        else if (number == 0 && x == 2)
            System.out.println("bilgisayar kağıdı seçti kazandınız");
        else if (number == 1 && x == 0)
            System.out.println("bilgisayar makası seçti kazandınız");
        else if (number == 1 && x == 2)
            System.out.println("bilgisayar kağıdı seçti kaybettiniz");
        else if (number == 2 && x == 0)
            System.out.println("bilgisayar makası seçti kaybettiniz");
        else if (number == 2 && x == 1)
            System.out.println("bilgisayar taşı seçti kazandınız");
        else if (number == 0 && x == 0)
            System.out.println("bilgisayarda makası seçti berabere");
        else if (number == 1 && x == 1)
            System.out.println("bilgisayarda taşı seçti berabere");
        else if (number == 2 && x == 2)
            System.out.println("bilgisayarda kağıdı seçti berabere");
        else
            System.out.println("****************************");

    }
}