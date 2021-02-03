<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="database.*" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html lang="pt-br">
   <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Home page</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css" />
        <link rel="stylesheet" href="styles.css">
   </head>
   <body>
             <div class="wrapper">
         <header>
            <nav>
               <div class="menu-icon">
                  <i class="fa fa-bars fa-2x"></i>
               </div>
               <div class="logo">
                  <img src="https://res.cloudinary.com/http-voicetoworld-netlify-app/image/upload/v1611742348/University_of_Rwanda_-_LOGO_ihplup.ico" />
               </div>
               <div class="menu">
                  <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="registration.jsp">Register</a></li>
                    <li>
                        <form class="search" action="card.jsp">
                            <input type="text" name="search" placeholder="Search..">
                        </form>
                    </li>
                  </ul>
               </div>
            </nav>
         </header>
      </div>
 <section>
        <%
           // DbConnection con = new DbConnection();
            int imageid;
//            if(request.getParameter("search").equals("")){
//                JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID REGISTRATION NUMBER");
//                 response.sendRedirect("index.jsp");
//            }
//            else if(Integer.parseInt(request.getParameter("search")) < 216000000){
//                imageid =Integer.parseInt(request.getParameter("search"));
//                JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID REGISTRATION NUMBER");
//                 response.sendRedirect("index.jsp");
//            }
            try{
                imageid =Integer.parseInt(request.getParameter("search"));
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/university?serverTimezone=CAT","root","");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM students WHERE reg_number="+imageid+"";
                ResultSet rs = st.executeQuery(sql);

                //
                while(rs.next()){
                    String name = rs.getString("username");
                    String school = rs.getString("school");
                    String faculity = rs.getString("faculty");
                    String photoname = rs.getString("filename");
                    int level = rs.getInt("level");
                    int reg_number =  rs.getInt("reg_number");
              
                 %>
                 
<!--                 <table style="width: 100%">
                     <tr>
                         <th>Id</th>
                         <th>Image</th>
                     </tr>
                     <tr>
                         <td><%=photoname %></td>
                         <td><image src="photos/<%=photoname%>" width="200" alt="student photo" height="200"/></td>
                     </tr>
                 </table>-->


        <div class="cards">
            <div class="image"><image src="photos/<%=photoname%>" alt="student photo"  /></div>
            <div class="inf">
              <div>
                <label>Name: </label><%=name%>
              </div>
              <div>
                 <label>School: </label><%=school%>
              </div>
              <div>
                  <label>Faculity: </label><%=faculity%>
              </div>
              <div>
                   <label>Level: </label> <%=level%>
              </div>
              <div>
                    <label>Registration Number: </label> <%=reg_number%>
              </div>
         </div>  
       </div>
    



            <%     
                }
            }catch (Exception e) {
                    //JOptionPane.showMessageDialog(null, "Fail to fetch data ");
                    JOptionPane.showMessageDialog(null, e);
                    out.println(e);
                }
                
            %>
               </section>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="javascript.js"></script> 
    </body>
</html>
