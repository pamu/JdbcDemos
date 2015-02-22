/**
 * Created by android on 22/2/15.
 */
public class Position {
    String name;
    String description;
    int positionId;
    public Position(String name, String desc, int positionId) {
        this.description = desc;
        this.name = name;
        this.positionId = positionId;
    } 
    public static String positionQuery = " create table \"Positions\" (\"positionName\" VARCHAR(254) NOT NULL,\"description\" VARCHAR(254) NOT NULL,\"positionId\" INTEGER NOT NULL PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY)\n";
}
