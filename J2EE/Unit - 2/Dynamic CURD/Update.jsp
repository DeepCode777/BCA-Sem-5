<%@ include file="Connection.jsp" %>
<%@ page import="java.sql.*" %>
<%! int Id; 
	String Name,Email,Password;
%>
<%
	out.print("<h1>Update Records</h1>");
	String sid = request.getParameter("id");
	int id = Integer.parseInt(sid);
	PreparedStatement ps = con.prepareStatement("SELECT * FROM registration_jsp WHERE id = ?");
	ps.setInt(1, id);
	
	ResultSet rs = ps.executeQuery();
	if(rs.next()){
		id = rs.getInt(1);
		Name = rs.getString(2);
		Email = rs.getString(3);
		Password = rs.getString(4);
		
		
	}
%>
<html>
<head><title>Upadate Page</title></head>
<body>
	<form action="updateRecords.jsp" method="post">
		<table>
			  <tr>
			    <th>Info.</th>
			    <th>Update</th>
			  </tr>
			  <tr>
			    <td></td>
			    <td><input type="hidden" name="id" value="<%= id %>"></td>
			  </tr>
			  <tr>
			  	<td>Name : </td>
			    <td><input type="text" name="name" value="<%= Name %>"></td>
			  </tr>
			  <tr>
			  	<td>Email : </td>
			    <td><input type="text" name="email" value="<%= Email %>"></td>
			  </tr>
			  <tr>
			  	<td>Password : </td>
			    <td><input type="text" name="password" value="<%= Password %>"></td>
			  </tr>
			  <tr>
			    <td colspan="2"><input type="submit" name="name" value="Update Record"></td>
			  </tr>
		</table>

	</form>
</body>
</html>