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
                var person = {
                    name: "yoyo",
                    emails: ["qaz@mail.com", "wsx@mail.com"],
                    tel: "1231213",
                    birthYear: 200,
                    birthMonth: 10,
                    birthDay: 28
                };
                $.ajax("webapi/person", {
                    type: "POST",
                    contentType: "application/json",
                    data: JSON.stringify(person)
                });
            });



        </script>
    </head>
    <body>
        <form action="webapi/person" method="POST">
            Name: <input type="text" name="name" value="" /><br/>
            Email: <input type="email" name="emails" value="" /><br/>
            Email: <input type="email" name="emails" value="" /><br/>
            Email: <input type="email" name="emails" value="" /><br/>
            Email: <input type="email" name="emails" value="" /><br/>
            Email: <input type="email" name="emails" value="" /><br/>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
