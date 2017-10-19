
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


public class ReadRecord {
    
        
       private Connection conn;
       private ResultSet results;
       private UIGolfers uigolfers= new UIGolfers();
       private int golferID;
       
    public ReadRecord (int golferID) {
        Properties props= new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url =  props.getProperty("server.name");
        String username= props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.golferID= golferID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead (){
        try {
            String query= "SELECT * FROM UIGolfers WHERE golferID= ?";
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setInt(1, golferID);
            
            this.results= ps.executeQuery();
            
                this.results.next();
            
                uigolfers.setGolferID(this.results.getInt("golferID"));
                uigolfers.setGolferName(this.results.getString("golferName"));
                uigolfers.setAge(this.results.getInt("age"));
                uigolfers.setHandicap(this.results.getInt("handicap"));
                uigolfers.setClubBrand(this.results.getString("clubBrand"));
                
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
    public UIGolfers getUIGolfers() {
        return this.uigolfers;
        
    }
}
