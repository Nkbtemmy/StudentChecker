<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <div class="blockquote-wrapper">
               <div class="blockquote">
                 <h1>
                   Welcome to University of Rwanda Platform that help Students who forget to bring their school Id to enter in campus
                  </h1>
                 <h4>&mdash;We are here for you</h4>
               </div>
            </div>
        </section>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="javascript.js"></script> 
   </body>
</html>
