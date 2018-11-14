package replIt;

public class DataBase {

	public static void main(String[] args) {

	}

	public static String lameDb(String db, String op, String id, String data) {

		switch (op) {
		case "add":
			db = db + "#" + id + data;
			break;
		case "edit":
			db = db.substring(0, db.indexOf(id) + 1) 
			+ data + db.substring(db.indexOf("" + Integer.parseInt(id) + 1)-1);
			break;
		case "delete":

			break;
		case "none":
			break;
		default:
			System.out.println("Invalid operation");

		}
		return db;

	}
}
