<%@ include file="Connection.jsp"%>
<%@ page import="java.sql.*"%>
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	PreparedStatement ps = con.prepareStatement("insert into registration_jsp(name,email,password)values(?,?,?)");
	
	ps.setString(1, name);
	ps.setString(2, email);
	ps.setString(3, password);
	
	ps.executeUpdate();
	
	out.print("<P> Record Save Successfully");
	request.getRequestDispatcher("Index.jsp").include(request, response);
	
	con.close();
%>