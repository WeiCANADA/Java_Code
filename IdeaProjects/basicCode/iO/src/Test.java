import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
/*        System.out.println(LocalDate.now());
        Period period = Period.between(LocalDate.of(1984, 12, 20),
                LocalDate.now());
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.currentTimeMillis();*/

        long l = LocalDate.now().toEpochDay()
                - LocalDate.of(1984, 12, 20).toEpochDay();
        System.out.println(l);
    }
}
