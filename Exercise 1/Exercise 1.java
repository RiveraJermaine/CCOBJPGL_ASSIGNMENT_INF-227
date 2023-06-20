public class App {

    static boolean iwillReview = true;
    static boolean iwillNotFail = true;

    public static void main(String[] args) throws Exception {

        // precondition
        assert iwillReview == true : "i did not review";

        // study implementation
        exam();
        // postcondition
        assert iwillNotFail == true : "i failed";

    }

    static void exam() {
        iwillNotFail = false;
    }
}