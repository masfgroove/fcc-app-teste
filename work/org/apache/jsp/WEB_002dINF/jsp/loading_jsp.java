/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-05-27 01:27:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loading_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<style>\r\n");
      out.write("\t.loader {\r\n");
      out.write("/* \t    display: inline-block;\r\n");
      out.write("\t    position: relative;\r\n");
      out.write(" */\t    \r\n");
      out.write("\t\tposition: fixed; \t\t\r\n");
      out.write("\t\twidth: 64px;\r\n");
      out.write("\t    height: 64px;\r\n");
      out.write("\t    position: fixed;\r\n");
      out.write("\t    z-index: 999;\r\n");
      out.write("\t    overflow: visible;\r\n");
      out.write("\t    margin: auto;\r\n");
      out.write("\t    top: 0;\r\n");
      out.write("\t    left: 0;\r\n");
      out.write("\t    bottom: 0;\r\n");
      out.write("\t    right: 0;\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div {\r\n");
      out.write("\t    animation: lds-roller 1.2s cubic-bezier(0.5, 0, 0.5, 1) infinite;\r\n");
      out.write("\t    transform-origin: 32px 32px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:after {\r\n");
      out.write("\t    content: \" \";\r\n");
      out.write("\t    display: block;\r\n");
      out.write("\t    position: absolute;\r\n");
      out.write("\t    width: 6px;\r\n");
      out.write("\t    height: 6px;\r\n");
      out.write("\t    border-radius: 50%;\r\n");
      out.write("\t    background: #8f292f;\r\n");
      out.write("\t    margin: -3px 0 0 -3px;\r\n");
      out.write("\t    \r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(1) {\r\n");
      out.write("\t    animation-delay: -0.036s;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(1):after {\r\n");
      out.write("\t    top: 50px;\r\n");
      out.write("\t    left: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(2) {\r\n");
      out.write("\t    animation-delay: -0.072s;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(2):after {\r\n");
      out.write("\t    top: 54px;\r\n");
      out.write("\t    left: 45px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(3) {\r\n");
      out.write("\t    animation-delay: -0.108s;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(3):after {\r\n");
      out.write("\t    top: 57px;\r\n");
      out.write("\t    left: 39px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(4) {\r\n");
      out.write("\t    animation-delay: -0.144s;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(4):after {\r\n");
      out.write("\t    top: 58px;\r\n");
      out.write("\t    left: 32px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loader div:nth-child(5) {\r\n");
      out.write("\t    animation-delay: -0.18s;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(5):after {\r\n");
      out.write("\t    top: 57px;\r\n");
      out.write("\t    left: 25px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(6) {\r\n");
      out.write("\t    animation-delay: -0.216s;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(6):after {\r\n");
      out.write("\t    top: 54px;\r\n");
      out.write("\t    left: 19px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(7) {\r\n");
      out.write("\t    animation-delay: -0.252s;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(7):after {\r\n");
      out.write("\t    top: 50px;\r\n");
      out.write("\t    left: 14px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(8) {\r\n");
      out.write("\t    animation-delay: -0.288s;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loader div:nth-child(8):after {\r\n");
      out.write("\t    top: 45px;\r\n");
      out.write("\t    left: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t@keyframes lds-roller {\r\n");
      out.write("\t    0% {\r\n");
      out.write("\t        transform: rotate(0deg);\r\n");
      out.write("\t    }\r\n");
      out.write("\t    100% {\r\n");
      out.write("\t        transform: rotate(360deg);\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t#loading {\r\n");
      out.write("\t    display: block;\r\n");
      out.write("\t    position: fixed;\r\n");
      out.write("\t    top: 0;\r\n");
      out.write("\t    left: 0;\r\n");
      out.write("\t    z-index: 100;\r\n");
      out.write("\t    width: 100%;\r\n");
      out.write("\t    height: 100%;\r\n");
      out.write("\t    background-color: rgba(192, 192, 192, 0.8);\r\n");
      out.write("\t    background-repeat: no-repeat;\r\n");
      out.write("\t    background-position: center;\r\n");
      out.write("\t}\t\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\r\n");
      out.write("    function onReady(callback) {\r\n");
      out.write("        var intervalId = window.setInterval(function() {\r\n");
      out.write("            if (document.getElementsByTagName('body')[0] !== undefined) {\r\n");
      out.write("            \twindow.clearInterval(intervalId);\r\n");
      out.write("            \tcallback.call(this);\r\n");
      out.write("        \t}\r\n");
      out.write("        }, 100);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function setVisible(selector, visible) {\r\n");
      out.write("        document.querySelector(selector).style.display = visible ? 'block' : 'none';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    onReady(function() {\r\n");
      out.write("        setVisible('body', true);\r\n");
      out.write("        setVisible('#loading', false);\r\n");
      out.write("    });\r\n");
      out.write("        \r\n");
      out.write("    function onLoad() {\r\n");
      out.write("    \tshowLoading()\r\n");
      out.write("    };\r\n");
      out.write("    \r\n");
      out.write("    function showLoading(){\r\n");
      out.write("    \tif (document.querySelector('#loading').style.display === 'none') {\r\n");
      out.write("\t\t\tsetVisible('#loading', true);\r\n");
      out.write("\t\t}\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    function hideLoading() {\r\n");
      out.write("    \tsetVisible('#loading', false);\r\n");
      out.write("    };\r\n");
      out.write("</script>   \r\n");
      out.write("\r\n");
      out.write("<div id=\"loading\">\r\n");
      out.write("\t<div class=\"loader\">\r\n");
      out.write("\t\t<div></div> <div></div> <div></div> <div></div> \r\n");
      out.write("\t\t<div></div> <div></div> <div></div> <div></div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</div>\r\n");
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
