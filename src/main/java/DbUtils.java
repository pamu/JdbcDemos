import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by android on 22/2/15.
 */
public class DbUtils {
    static {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demo1;create=true");
        return conn;
    }
    
    public static void create() {
        try {
            Connection conn = getConnection();
            
            conn.createStatement().execute(Position.positionQuery);
            
            conn.createStatement().execute(Player.playerQuery);
            
            conn.createStatement().execute(Match.matchQuery);
            
            conn.createStatement().execute(Team.teamQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void insertPlayer(Player player, Position position) {

    }
    
    public static int insertPosition(Position position) throws Exception {
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("?, ?, ?");
            stmt.setString(0, position.name);
            stmt.setString(1, position.description);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new Exception("Failed insertion");
    }
    
    public static void insertMatch(Match match) {

    }
    
    public static void insertTeam(Match match, Player player) {
        
    }
    
}
