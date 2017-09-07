/**
 * @author bvanchuhov
 */
public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 102;
        int registrationYear = 2012;
        int currentYear = java.time.Year.now().getValue(); // 2017

        double likesperYear = (double) likesCount / (currentYear - registrationYear);

        System.out.println(likesperYear + " likes/year");
    }
}
