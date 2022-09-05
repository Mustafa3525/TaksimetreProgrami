import java.util.Scanner;
public class TaksimetrePro {
        public static void main(String[] args) {
                int acilis= 10 ,a=20;
                double gidilenKm, kmBasi= 2.20, total;

                Scanner inp = new Scanner(System.in);
                System.out.print("Gidilen Km : ");
                gidilenKm = inp.nextDouble();

                total = (gidilenKm * kmBasi) + acilis;

                boolean son = total <= a;
                double str = (son) ? a+acilis : total ;

                System.out.println("Ödenecek Tutar : " + str);

        }
}
