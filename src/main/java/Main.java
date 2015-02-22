import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by android on 22/2/15.
 */
public class Main {
    public static void main(String[] args) {
        
        try {
            DbUtils.insertPosition(new Position("opener", "virat kohli", 0));
            Connection conn = DbUtils.getConnection();
            ResultSet set = conn.createStatement().executeQuery("select * from \"Positions\"");
            while(set.next()) {
                for(int i = 1; i < 4; i++)  System.out.println(set.getString(i) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
