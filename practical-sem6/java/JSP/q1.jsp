<%@page contentType = "text/html; charset = UTF-8"%>
<%@page import = "java.util.*"%>

<%
int item1 = Integer.parseInt(request.getParameter("n1"));
int item2 = Integer.parseInt(request.getParameter("n2"));
int item3 = Integer.parseInt(request.getParameter("n3"));

double price1 = 550.0;
double price2 = 120.0;
double price3 = 100.0;

double total = (item1 * price1) + (item2 * price2) + (item3 * price3);

session.setAttribute("total",total);
%>

<html>
 <head></head>
 <body>
  <h1>Total</h1>
  <p><%= total %></p>
 </body>
</html>
