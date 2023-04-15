import java.time.LocalDate;
class Test {
    public static void main(String args[]) {
        LocalDate ldate = LocalDate.of(2000, 6, 1);
        ldate.plusYears(20);
        ldate.plusDays(23);
        ldate.minusMonths(-1);
        System.out.println(ldate);
    }
}