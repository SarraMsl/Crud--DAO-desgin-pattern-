

package model;


public class Database {
    String url;
    
    String uss;
    
    String pwd;
    
    String driver;

    public Database(String url, String uss, String pwd, String driver) {
        this.url = url;
        this.uss = uss;
        this.pwd = pwd;
        this.driver = driver;
    }

    
  

    public Database() {
        this.url = "jdbc:mysql://192.168.43.144:3306/coures";
        this.uss = "sara";
        this.pwd = "root123";
        this.driver = "com.mysql.jdbc.Driver";
    }

    public String getUrl() {
        return url;
    }

    public String getUss() {
        return uss;
    }

    public String getPwd() {
        return pwd;
    }

    public String getDriver() {
        return driver;
    }
    
                                      
    
    
    
}
