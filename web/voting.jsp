<%-- 
    Document   : voting
    Created on : Jan 24, 2024, 9:40:58 AM
    Author     : 91908
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP PAGE</h1>
        <% 

          String name;
            int age,resp;
            
            name= request.getParameter("name");
            age = Integer.parseInt(request.getParameter("age"));
            
            
     
    try {
	first.Vote_Service service = new first.Vote_Service();
	first.Vote port = service.getVotePort();
	 // TODO initialize WS operation arguments here
	
	// TODO process result here
	resp= port.vote(name, age);
	 if(resp==1 ){
                out.print("Eligible to vote");
            }else{
                out.print("Not eligible to vote");
            }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
