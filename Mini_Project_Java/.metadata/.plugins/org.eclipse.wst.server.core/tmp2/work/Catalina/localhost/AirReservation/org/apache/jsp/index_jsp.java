/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.59
 * Generated at: 2022-03-17 13:08:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/slider.jsp", Long.valueOf(1647512434000L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1647512434000L));
    _jspx_dependants.put("/css/style.css", Long.valueOf(1647512434000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647512434000L));
    _jspx_dependants.put("jar:file:/E:/Work/JavaProject/Java_Mini_Project/Mini_Project_Java/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/AirReservation/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1647512434000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Airline Reservation System</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("<!-- fontawesome icons -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\n");
      out.write("	integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\"\n");
      out.write("	crossorigin=\"anonymous\" />\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<style>");
      out.write("@charset \"ISO-8859-1\";\n");
      out.write("\n");
      out.write("#icon {\n");
      out.write("	color: #F012BE;\n");
      out.write("	text-shadow: 3px 3px 5px #FF0000, 0 3px 5px #0000FF;\n");
      out.write("	font-size: 45px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-link {\n");
      out.write("	font-size: 20px;\n");
      out.write("	margin: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bodyImage {\n");
      out.write("	width: 100%;\n");
      out.write("	height: 500px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer {\n");
      out.write("	position: fixed;\n");
      out.write("	bottom: 0;\n");
      out.write("	width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".glyphicon {\n");
      out.write("	margin-bottom: 10px;\n");
      out.write("	margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("small {\n");
      out.write("	display: block;\n");
      out.write("	line-height: 1.428571429;\n");
      out.write("	color: #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom {\n");
      out.write("	padding: 0 20px;\n");
      out.write("	margin-bottom: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("	border-radius: 50%;\n");
      out.write("	width: 32px;\n");
      out.write("	height: 32px;\n");
      out.write("	line-height: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn5 {\n");
      out.write("	background-color: #4CAF50;\n");
      out.write("	border: none;\n");
      out.write("	color: white;\n");
      out.write("	padding: 16px 32px;\n");
      out.write("	text-align: center;\n");
      out.write("	text-decoration: none;\n");
      out.write("	display: inline-block;\n");
      out.write("	font-size: 16px;\n");
      out.write("	margin: 4px 2px;\n");
      out.write("	transition-duration: 0.4s;\n");
      out.write("	cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn6 {\n");
      out.write("	background-color: white;\n");
      out.write("	color: black;\n");
      out.write("	border: 2px solid #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn6:hover {\n");
      out.write("	background-color: #4CAF50;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn7 {\n");
      out.write("	background-color: white;\n");
      out.write("	color: black;\n");
      out.write("	border: 2px solid #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn7:hover {\n");
      out.write("	background-color: #4CAF50;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn8 {\n");
      out.write("	background-color: white;\n");
      out.write("	color: black;\n");
      out.write("	border: 2px solid #008CBA;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn8:hover {\n");
      out.write("	background-color: #008CBA;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-title {\n");
      out.write("	display: inline;\n");
      out.write("	font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".checkbox.pull-right {\n");
      out.write("	margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pl-ziro {\n");
      out.write("	padding-left: 0px;\n");
      out.write("}");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<!-- Header Section -->\n");
      out.write("	<div>\n");
      out.write("		");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("	<div class=\"container-fluid\">\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("			data-bs-target=\"#navbarTogglerDemo03\"\n");
      out.write("			aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\"\n");
      out.write("			aria-label=\"Toggle navigation\">\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("		</button>\n");
      out.write("		<a class=\"navbar-brand\" href=\"/AirlineReservationSystem\"><i\n");
      out.write("			class=\"fas fa-plane-departure\" id=\"icon\"></i></a>\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\n");
      out.write("					aria-current=\"page\" href=\"index.jsp\"><i\n");
      out.write("						class=\"fas fa-home text-primary\"></i>&nbsp;Home</a></li>\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-white\" href=\"flight\"><i\n");
      out.write("						class=\"fas fa-plane text-info\"></i>&nbsp;Flight</a></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-white\"\n");
      out.write("					href=\"registeruser.jsp\"><i class=\"fas fa-sign-in-alt\"\n");
      out.write("						style=\"color: #70ffff;\"></i>&nbsp;Login</a></li>\n");
      out.write("\n");
      out.write("				");

				String message = (String) session.getAttribute("username");

				if (message != null) {
					// show the alert msg
				
      out.write("\n");
      out.write("\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link text-white\"\n");
      out.write("					href=\"/AirlineReservationSystem/logout\"><i class=\"fas fa-sign-out-alt\"\n");
      out.write("						style=\"color: #70ffff;\"></i>&nbsp;Logout</a></li>\n");
      out.write("\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<!-- Body Section -->\n");
      out.write("	<div>\n");
      out.write("		");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"carouselExampleDark\" class=\"carousel carousel-dark slide\"\n");
      out.write("	data-bs-ride=\"carousel\">\n");
      out.write("	<div class=\"carousel-indicators\">\n");
      out.write("		<button type=\"button\" data-bs-target=\"#carouselExampleDark\"\n");
      out.write("			data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\n");
      out.write("			aria-label=\"Slide 1\"></button>\n");
      out.write("		<button type=\"button\" data-bs-target=\"#carouselExampleDark\"\n");
      out.write("			data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("		<button type=\"button\" data-bs-target=\"#carouselExampleDark\"\n");
      out.write("			data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("		<button type=\"button\" data-bs-target=\"#carouselExampleDark\"\n");
      out.write("			data-bs-slide-to=\"3\" aria-label=\"Slide 4\"></button>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"carousel-inner\">\n");
      out.write("		<div class=\"carousel-item active\" data-bs-interval=\"10000\">\n");
      out.write("			<img class=\"bodyImage\"\n");
      out.write("				src=\"https://miro.medium.com/max/5778/1*ne8pqysxw4k1EJ_asfwS5w.jpeg\"\n");
      out.write("				class=\"d-block w-100\" alt=\"...\">\n");
      out.write("			<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("				<h5 class=\"text-white\"\n");
      out.write("					style=\"text-shadow: 3px 3px 5px #FF0000, 0 3px 5px #0000FF;\">Welcome\n");
      out.write("					to Airline Reservation System</h5>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"carousel-item\" data-bs-interval=\"2000\">\n");
      out.write("			<img class=\"bodyImage\"\n");
      out.write("				src=\"https://www.imore.com/sites/imore.com/files/styles/xlarge/public/field/image/2017/02/airplane-flight-sunset.jpg?itok=8iUtkHU-\"\n");
      out.write("				class=\"d-block w-100\" alt=\"...\">\n");
      out.write("			<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("				<h5 class=\"text-white\">Book a Ticket</h5>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"carousel-item\">\n");
      out.write("			<img class=\"bodyImage\"\n");
      out.write("				src=\"https://images.unsplash.com/photo-1592569237690-69813b318567?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aGVsaWNvcHRlcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80\"\n");
      out.write("				class=\"d-block w-100\" alt=\"...\">\n");
      out.write("			<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("				<h5>Make a World Tour</h5>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"carousel-item\">\n");
      out.write("			<img class=\"bodyImage\"\n");
      out.write("				src=\"https://thedesignair.files.wordpress.com/2012/05/flydubai-plane-over-palm.jpg?w=800\"\n");
      out.write("				class=\"d-block w-100\" alt=\"...\">\n");
      out.write("			<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("				<h5 class=\"text-black\">Enjoy your life by traveling</h5>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<button class=\"carousel-control-prev\" type=\"button\"\n");
      out.write("		data-bs-target=\"#carouselExampleDark\" data-bs-slide=\"prev\">\n");
      out.write("		<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("			class=\"visually-hidden\">Previous</span>\n");
      out.write("	</button>\n");
      out.write("	<button class=\"carousel-control-next\" type=\"button\"\n");
      out.write("		data-bs-target=\"#carouselExampleDark\" data-bs-slide=\"next\">\n");
      out.write("		<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("			class=\"visually-hidden\">Next</span>\n");
      out.write("	</button>\n");
      out.write("</div>");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<!-- Footer Section -->\n");
      out.write("	<div>\n");
      out.write("		");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"footer mt-auto py-3 bg-dark\">\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"text-center\">\n");
      out.write("			<span class=\"text-white\"><i class=\"far fa-copyright\"></i>&nbsp;Copyright\n");
      out.write("				2021&nbsp;|&nbsp;Airline Reservation System&nbsp;|</span> <a\n");
      out.write("				href=\"https://github.com/NirajThagunna\" target=\"_blank\"\n");
      out.write("				rel=\"noopener noreferrer\" style=\"text-decoration: none;\"><i\n");
      out.write("				class=\"fab fa-github\"></i>&nbsp;Github <span style=\"color: white\">|&nbsp;</span></a>\n");
      out.write("			<a href=\"https://www.linkedin.com/in/niraj-thagunna/\" target=\"_blank\"\n");
      out.write("				rel=\"noopener noreferrer\" style=\"text-decoration: none;\"><i\n");
      out.write("				class=\"fab fa-linkedin\"></i>&nbsp;LinkedIn</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<!-- JavaScript Code -->\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("		integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\n");
      out.write("		crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
