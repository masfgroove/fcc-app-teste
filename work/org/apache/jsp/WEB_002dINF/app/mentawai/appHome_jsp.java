/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-05-22 18:43:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.app.mentawai;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class appHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/mentawai.jar", Long.valueOf(1669647482990L));
    _jspx_dependants.put("jar:file:/C:/web/doc/fcc-app-teste/WEB-INF/lib/mentawai.jar!/META-INF/taglib.tld", Long.valueOf(1358451386000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmtw_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fmtw_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmtw_005fout_0026_005fvalue_005fnobody.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- BUG10 uso incorreto da taglib jsp:include -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/Head.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.fieldset {\r\n");
      out.write("\t\t    border:           1px solid #ddd;\r\n");
      out.write("\t\t    margin:           0;\r\n");
      out.write("\t\t    padding:          0 1.4em 1.4em;\r\n");
      out.write("\t\t    background-color: white;\r\n");
      out.write("\t\t    height:           auto; \r\n");
      out.write("\t\t    overflow:         auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\tlegend {\r\n");
      out.write("\t\t    font-size:     1em;\r\n");
      out.write("\t\t    font-weight:   bold;\r\n");
      out.write("\t\t    padding:       0 10px;\r\n");
      out.write("\t\t    width:         auto;\r\n");
      out.write("\t\t    margin-bottom: 5px;\r\n");
      out.write("\t\t    border-width:  0px;\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\" id=\"principal\" >\r\n");
      out.write("\t\t<div class=\"titulo\" style=\"margin-left: 0\">\r\n");
      out.write("\t\t\t<table style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\" >\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<fieldset class=\"fieldset\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<legend style=\"margin-bottom: 10px\"><b>Mentawai:</b></legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t \t\t\t\t\t\t\t \t\t <ul>\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t  <li>\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t  <!-- BUG11 inicialização incorreta da tag <a> -->\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t  <a href=\"https://mentawaiblogphotography.photo.blog/2020/01/22/introducao-ao-framework-mentawai/\" target=\"_blank\">Framework Mentawai</a>\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t </ul>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<fieldset class=\"fieldset\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<legend style=\"margin-bottom: 10px\"><b>Componentes/Tags:</b></legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- BUG12 uso incorreto da taglib mtw:out -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_mtw_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\t\t\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_mtw_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mtw:out
    org.mentawai.tag.Out _jspx_th_mtw_005fout_005f0 = (org.mentawai.tag.Out) _005fjspx_005ftagPool_005fmtw_005fout_0026_005fvalue_005fnobody.get(org.mentawai.tag.Out.class);
    boolean _jspx_th_mtw_005fout_005f0_reused = false;
    try {
      _jspx_th_mtw_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_mtw_005fout_005f0.setParent(null);
      // /WEB-INF/app/mentawai/appHome.jsp(58,9) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_mtw_005fout_005f0.setValue("mtwTaglib");
      int _jspx_eval_mtw_005fout_005f0 = _jspx_th_mtw_005fout_005f0.doStartTag();
      if (_jspx_th_mtw_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fmtw_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_mtw_005fout_005f0);
      _jspx_th_mtw_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_mtw_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_mtw_005fout_005f0_reused);
    }
    return false;
  }
}
