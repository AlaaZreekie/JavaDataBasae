import java.sql.Connection;

import com.company.DbFunctions;

public class Main {

    public static void main(String[] args) {
        DbFunctions db=new DbFunctions();
        Connection conn=db.connect_to_db("TransactionDbForJava","postgres","hiast");
        db.createTable(conn,"employee");
        db.insert_row(conn,"employee","Alaa","Syria");
        db.update_name(conn,"employee","Alaa","ALaaa");
        db.search_by_name(conn,"employee","Zrekie");
        db.delete_row_by_name(conn,"employee","Zrekie");
        db.delete_row_by_id(conn,"employee",4);
        db.read_data(conn,"employee");
        // db.delete_table(conn,"employee");
    }

}
