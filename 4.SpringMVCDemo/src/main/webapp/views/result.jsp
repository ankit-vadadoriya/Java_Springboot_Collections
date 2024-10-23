<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta charset="utf-8">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div class="container">
            <div class="box text-center text-danger">
                <div class="login-form">
                    <h2>Welcome</h2>

                    <%-- <h2>Result is : <%= session.getAttribute("result") %> </h2> --%>
                    <%-- or --%>
                    <p> ${alien} </p>
                    <p> Hello <b>${alien.aname}</b>, your ID is <b><u>${alien.aid}</u></b></p>

                    <p>Your course is ${course}, enjoy!<p>

                    <form action="/">
                        <input type="submit" value="Back" class="btn btn-danger">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>