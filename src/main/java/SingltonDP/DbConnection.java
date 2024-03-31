package SingltonDP;

import java.io.PrintWriter;
import java.util.Properties;

public class DbConnection {

//    private String url = "www.google.com";
//    private String path = "/home/ute/Desktop";
    private static DbConnection dbinstance = null;


    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public void setSelect(String select) {
        this.select = select;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    private DbConnection() {
//        this.url = url;
//        this.path = path;
    }

//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getPath() {
//        return path;
//    }
//
//    public void setPath(String path) {
//        this.path = path;
//    }

    public void connect(){
        System.out.println("Connected to db");
    }
    public void execute(){
        System.out.println("Execute DB query  db");
    }

    public void start(){
        System.out.println("Start  DB ");
    }

    public static DbConnection  getInstance(){

        if(dbinstance== null){
            dbinstance = new DbConnection();

        }
        return  dbinstance;

    }
}
