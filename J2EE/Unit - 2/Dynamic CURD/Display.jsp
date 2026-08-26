<%@ include file="Connection.jsp" %>
<%@ page import="java.sql.*" %>
<%! int id; %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
	<%! 
		ResultSet rs;
		Statement pst;
	%>
	<a href="Index.jsp">Add New Records</a>
	<%
	try{
		pst = con.createStatement();
		rs = pst.executeQuery("select * from registration_jsp");
	%>
	<center><h1>Registration Details</h1></center>
	<table border="2" align="center">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Password</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<%
			while(rs.next()){
				id = rs.getInt(1);
		%>
		<tr>
			<td><%= rs.getInt(1) %></td>
			<td><%= rs.getString(2) %></td>
			<td><%= rs.getString(3) %></td>
			<td><%= rs.getString(4) %></td>
			<td><a href="Update.jsp?id=<%=id%>">Edit</a></td>
			<td><a href="Delete.jsp?id=<%=id%>">Delete</a></td>
		</tr>
		<%
			}
			
			rs.close();
			st.close();
			con.close();
		%>
	</table>
	<%
		}catch(Exception e){out.println(e);}
	%>
</body>
</html>