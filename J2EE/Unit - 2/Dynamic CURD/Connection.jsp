<%@ page import="java.sql.*" %>
<%! Connection con; %>
<%! Statement st; %>
<%
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","deep");
		System.out.print("Coonect");
	}catch(Exception exception){
		System.out.println(exception);
	}
%>