<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
   <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Registration</title>
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
                    <li><a href="#">Register</a></li>
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
            <div class="w3-container">
                <form class="form-horizontal" id="registration" method="POST" action="userController" enctype="multipart/form-data">
                 <fieldset>
                   <legend>Registration Form</legend>
                   <div class="control-group">
                     <label class="control-label">Name:</label>
                     <div class="controls">
                       <input type="text" id="username" name="name" />
                     </div>
                   </div>
                   <div class="control-group">
                     <label class="control-label">SCHOOL:</label>
                     <div class="controls">
                       <input type="text" id="school" name="school" />
                     </div>
                   </div>
                   <div class="control-group">
                     <label class="control-label">FACULITY:</label>
                     <div class="controls">
                       <input type="text" id="faculity" name="faculity" />
                     </div>
                   </div>
                   <div class="control-group">
                     <label class="control-label">Level:</label>
                     <div class="controls">
                       <select name="level" id="levels">
                         <option value="volvo" disabled selected>Year of study</option>
                         <option value="1">Year 1</option>
                         <option value="2">year 2</option>
                         <option value="3">year 3</option>
                         <option value="4">year 4</option>
                         <option value="5">year 5</option>
                       </select>
                     </div>
                   </div>
                   <div class="control-group">
                     <label class="control-label">Registration number</label>
                     <div class="controls">
                       <input type="number" min="216000000" id="reg_number" name="reg_number" />
                     </div>
                   </div>
                   <div class="control-group">
                     <label class="control-label">Upload your Photo</label>
                     <div class="controls">
                            <input type="file"  id="photo" name="photo"  onchange="fileValidation()"/>
                     </div>
                   </div>
                   <div class="control-group">
                     <label class="control-label"></label>
                     <div class="controls">
                         <button type="submit" class="btn btn-success" onsubmit="doGet()">Submit</button>
                     </div>
                   </div>
                 </fieldset>
               </form>
            </div>   
        </section>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="javascript.js"></script> 
   </body>
</html>

