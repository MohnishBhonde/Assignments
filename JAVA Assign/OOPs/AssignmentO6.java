abstract class Persistence{
    abstract String persist();

    }
    class FilePersistence extends Persistence{
        @Override
        String persist() {
            return "This is File Persistence";
        }
    }
    class DatabasePersistence extends Persistence{
        @Override
        String persist() {
            return "This is Database Persistence";
        }
    }

public class AssignmentO6 {
    public static void main(String[] args ){
        FilePersistence fp=new FilePersistence();
        System.out.println(fp.persist());
        DatabasePersistence dp=new DatabasePersistence();
        System.out.println(dp.persist());
    }
}
