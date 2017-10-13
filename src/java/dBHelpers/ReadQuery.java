
package dBHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UIGolfers;

public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery() {
        Properties props= new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url =  props.getProperty("server.name");
        String username= props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead (){
        try {
            String query = "Select * from UIGolfers";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLtable () {
        String table= "";
        table += "<table>";
        table += "<tr class= headerBackground>";
        table +="<th>";
        table += "Golfer ID";
        table += "</th>";
        table +="<th>";
        table += "Golfer Name";
        table += "</th>";
        table +="<th>";
        table += "Age";
        table += "</th>";
        table +="<th>";
        table += "Handicap";
        table += "</th>";
        table +="<th>";
        table += "Club Brand";
        table += "</th>";
        table += "<th>";
        table += "";
        table += "</th>";
        table += "</tr>";
        
        try {
            while(this.results.next()){
                
                UIGolfers uigolfers= new UIGolfers();
                uigolfers.setGolferID(this.results.getInt("golferID"));
                uigolfers.setGolferName(this.results.getString("golferName"));
                uigolfers.setAge(this.results.getInt("age"));
                uigolfers.setHandicap(this.results.getInt("handicap"));
                uigolfers.setClubBrand(this.results.getString("clubBrand"));
               
                
                
                table += "<tr class= trBackground>";
                table += "<td>";
                table += uigolfers.getGolferID();
                table += "</td>";
            
                table += "<td>";
                table += uigolfers.getGolferName();
                table += "</td>";
            
                table += "<td>";
                table += uigolfers.getAge();
                table += "</td>";
           
                table += "<td>";
                table += uigolfers.getHandicap();
                table += "</td>";
            
                table += "<td>";
                table += uigolfers.getClubBrand();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?golferID=" + uigolfers.getGolferID() + "> Delete </a>"; 
                table += "</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";
                return table;
    }
    
}
