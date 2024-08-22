<%@ page import="Bankpackage.UserDetails" %>
<%@ page import="java.io.IOException" %>

<%
    String action = request.getParameter("action");
    if ("login".equals(action)) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserDetails user = new UserDetails();
        user.setEmail(email);
        user.setPassword(password);
        if (user.authenticateUser()) {
            session.setAttribute("user", user);
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("login.jsp?error=true");
        }
    } else if ("register".equals(action)) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        UserDetails user = new UserDetails();
        user.setName(name);
        user.setAddress(address);
        user.setCity(city);
        user.setEmail(email);
        user.setPhone(phone);
        user.setPassword(password);
        user.insertUser();
        response.sendRedirect("login.jsp");
    }
%>
