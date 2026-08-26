<%@ include file="Connection.jsp"%>
<%@ page import="java.sql.*"%>
<%
	String sid = request.getParameter("id");
	int id = Integer.parseInt(sid);
	
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	PreparedStatement ps = con.prepareStatement("UPDATE registration_jsp SET name=?, email=?, password=? WHERE id=?");
	
	ps.setString(1, name);
	ps.setString(2, email);
	ps.setString(3, password);
	ps.setInt(4, id);
	
	ps.executeUpdate();
	
	con.close();
	response.sendRedirect("Display.jsp");	
%>