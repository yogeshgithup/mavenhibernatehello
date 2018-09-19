<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
    <form action="StudentInsertServlet" method="post">
        <input type="text" id="name" name="name" placeholder="name"/><br>
        <input type="password" id="password" name="password" placeholder="password"/><br>
        <input type="text" id="cno" name="cno" placeholder="contact no"/><br>
        <input type="text" id="cpi" name="cpi" placeholder="cpi"/><br>
        <input type="text" id="spi" name="spi" placeholder="spi"/><br>
        <input type="submit" name="btsave" value="save">
        
    </form>
    </body>
</html>
