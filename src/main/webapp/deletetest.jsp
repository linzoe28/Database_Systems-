<%-- 
    Document   : newjsp
    Created on : Mar 5, 2019, 6:51:29 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script
            src="https://code.jquery.com/jquery-3.3.1.js"
            integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
        crossorigin="anonymous"></script>
        <script>
            /* $.ajax("webapi/person/lendle", {
             success: function(d){
             console.log(d);
             }
             });*/
            $(document).ready(function () {
            
                $.ajax("webapi/person/123", {
                    type: "DELETE",
                });
            });



        </script>
    </head>
    <body>
    
    </body>
</html>
