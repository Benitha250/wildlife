import org.sql2o.Sql2o;

public class DB {
    public static Sql2o sql2o = new Sql2o( "jdbc:postgresql://localhost:5432/wildlife_tracker", "benitha", "123");

/*
    public static Sql2o sql2o = new Sql2o( "jdbc:postgres://qjjrheskfhtory:2da6bd8f46c23bdfbf56c8c9a35e807b8cd7c7a2060b8f2aedd5556eb3fb8f4f@ec2-3-210-23-22.compute-1.amazonaws.com:5432/dcgh7bft4djkt7", "qjjrheskfhtory", "2da6bd8f46c23bdfbf56c8c9a35e807b8cd7c7a2060b8f2aedd5556eb3fb8f4f");
*/

}
