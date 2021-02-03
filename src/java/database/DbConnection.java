package database;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import javax.swing.*;
import Models.*;

public class DbConnection {
    
    Connection connection=null;
    Statement statement=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    
    public static void main(String[] args){
      DbConnection jdbc=new DbConnection();
      jdbc.getData();
      
//          Scanner inputs = new Scanner(System.in);
//        System.out.print("username");
//        String username = inputs.next();
//                System.out.print("school");
//        String school = inputs.next();
//                System.out.print("faculity");
//        String faculty = inputs.next();
//                System.out.print("Level");
//        int level = inputs.nextInt();
//               System.out.print("Reg_number");
//        int reg_number = inputs.nextInt();
       
//         jdbc.addData(username,school, faculty, level, reg_number);
      //jdbc.getData();
      
    }
    public Statement createConnection(){
      try{
          //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //create connection
       connection=DriverManager.getConnection("jdbc:mysql://localhost/university?serverTimezone=CAT","root","");
        Statement st = connection.createStatement();
        System.out.println("databaase connected sucessfully");
        return st;
      }catch(Exception e){
        System.out.println("fail to connect");
        e.printStackTrace();
        return null;
      }
    
    }
    public void delete(Object id){
        Statement st = createConnection();
        String query = "DELETE FROM student WHERE uid =\""+id+"\";";
        try{
            st.executeUpdate(query);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "fail to delete");
        }
        
    }
    public String addData(Students student){
        String result = "data Inserted successful";
      try{
        createConnection(); 
        preparedStatement=connection.prepareStatement("INSERT INTO students(username,school,faculty,level,reg_number,photo,filename)" + "VALUES(?,?,?,?,?,?,?)");
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2,student.getSchool());
        preparedStatement.setString(3,student.getFaculity());
        preparedStatement.setInt(4,student.getLevel());
        preparedStatement.setInt(5,student.getReg_number());
        preparedStatement.setString(6,student.getPhoto());
        preparedStatement.setString(7,student.getFileName());
        preparedStatement.executeUpdate();
        connection.close();
      }catch(Exception e){
      e.printStackTrace();
      result = "Data not inserted";
      }
      return result;
    }
    public Object[][] getData(){
        Object [][]data = new Object[10][7];
      try{ 
        createConnection();
        preparedStatement=connection.prepareStatement("SELECT * FROM students");
        resultSet=preparedStatement.executeQuery();
        
        int xindex = 0;
        while(resultSet.next()){
            String id=resultSet.getString("uid");
            String username=resultSet.getString("username");
            String school=resultSet.getString("school");
            String faculty=resultSet.getString("faculty");
            int level=resultSet.getInt("level");
            int reg_number=resultSet.getInt("reg_number");
            byte[] photo=resultSet.getBytes("photo");
            
              data[xindex][0] = id;
              data[xindex][1] = username;
              data[xindex][2] = school;
              data[xindex][3] = faculty;
              data[xindex][4] = level;
              data[xindex][5] = reg_number;
              data[xindex][6] = photo;
            xindex++;
        }
        
      }catch(Exception e){
        e.printStackTrace();
      }
       return data;
      }
    boolean update(String id, String firstName, String lastName, String phone){
        Statement statement = createConnection();
        
        String query = "UPDATE contacts SET firstname=\""+firstName+"\", lastName=\""+lastName+"\",telephone=\""+phone+"\" WHERE cid=\""+id+"\";";
        try {
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, " well inserted \" click get data in database to see changes\"");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " fail to insert");
            return false;
        }
        
    }
}
