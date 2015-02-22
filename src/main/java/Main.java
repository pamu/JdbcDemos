/**
 * Created by android on 22/2/15.
 */
public class Main {
    public static void main(String[] args) {
        try {
            DbUtils.insertPosition(new Position("opener", "virat kohli", 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
