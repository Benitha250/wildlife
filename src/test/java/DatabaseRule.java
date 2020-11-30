import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource {

    @Override
    public void before(){
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "benitha", "123");

/*
        DB.sql2o = new Sql2o( "jdbc:postgres://qjjrheskfhtory:2da6bd8f46c23bdfbf56c8c9a35e807b8cd7c7a2060b8f2aedd5556eb3fb8f4f@ec2-3-210-23-22.compute-1.amazonaws.com:5432/dcgh7bft4djkt7", "qjjrheskfhtory", "2da6bd8f46c23bdfbf56c8c9a35e807b8cd7c7a2060b8f2aedd5556eb3fb8f4f");
*/
    }


    @Override
    public void after(){
        try (Connection con = DB.sql2o.open()){

            String deleteAnimalQuery="DELETE FROM animals ";
            String deleteSightingsQuery="DELETE FROM sightings *";
            String deleteRangerQuery="DELETE FROM rangers";
            con.createQuery(deleteAnimalQuery).executeUpdate();
            con.createQuery(deleteSightingsQuery).executeUpdate();
            con.createQuery(deleteRangerQuery).executeUpdate();
            String deleteLocationQuery="DELETE FROM locations *";
            con.createQuery(deleteLocationQuery).executeUpdate();
        }
    }

}
