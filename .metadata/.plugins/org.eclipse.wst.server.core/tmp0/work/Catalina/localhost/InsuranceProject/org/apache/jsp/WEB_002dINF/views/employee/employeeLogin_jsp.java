/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-09-12 19:35:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeeLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.6.RELEASE.jar", Long.valueOf(1535384741347L));
    _jspx_dependants.put("jar:file:/D:/InsuranceProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/InsuranceProject/WEB-INF/lib/spring-webmvc-5.0.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1525781272000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody;

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
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Employee Login</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"main.css\">  \r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style = \"background-image: url(https://cdn.pixabay.com/photo/2017/06/27/11/48/team-spirit-2447163_960_720.jpg);\">\r\n");
      out.write("<div class = \" frosted text-right\">\r\n");
      out.write("   <a href = \"/employeeLogin\" >Employee Login</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"jumbotron text-center banner frosted \" >\r\n");
      out.write("<img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0\" class=\"logo img-circle col-md-4 \" alt=\"hands holding a family\">\r\n");
      out.write("  <h1>Assure Insurance </h1>\r\n");
      out.write("  <p>You're In Good Hands with Assure Insurance</p> \r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"container frosted\" >\r\n");
      out.write("        \r\n");
      out.write(" ");
      if (_jspx_meth_sf_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_sf_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_sf_005fform_005f0_reused = false;
    try {
      _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005fform_005f0.setParent(null);
      // /WEB-INF/views/employee/employeeLogin.jsp(27,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setAction("employeeOverview");
      // /WEB-INF/views/employee/employeeLogin.jsp(27,1) null
      _jspx_th_sf_005fform_005f0.setDynamicAttribute(null, "class", "form-group");
      // /WEB-INF/views/employee/employeeLogin.jsp(27,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setModelAttribute("employee");
      int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
        if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write(" \t<div class=\"row\">\r\n");
            out.write(" <label class=\"control-label col-sm-2 col-lg-offset-4\" for=\"email\">Employee Email:</label>");
            if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write(" \t\t</div>\r\n");
            out.write(" \t\t<div class = \"row\">\r\n");
            out.write("   \t<label class=\"control-label col-sm-2 col-lg-offset-4\" for=\"password\">Password:</label>");
            if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("   \t</div>\r\n");
            out.write("   \t<div class = \"row\">\r\n");
            out.write("   \t\t<input class=\" col-sm-2 col-lg-offset-4\" type=submit value = \"login\"/> \r\n");
            out.write("   \t\t<input class=\" col-sm-2 \" type=\"reset\" value = \"clear\"/>\r\n");
            out.write("   \t\t</div>\r\n");
            out.write("   \t\t<div class = \"row\">\r\n");
            out.write("   \t\t<button class=\"control-label col-sm-2 col-lg-offset-5\" >Go Back</button>\r\n");
            out.write("   \t\t</div>\r\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction.reuse(_jspx_th_sf_005fform_005f0);
      _jspx_th_sf_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_sf_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f0_reused = false;
    try {
      _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/employee/employeeLogin.jsp(29,90) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f0.setPath("email");
      int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
        if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
      _jspx_th_sf_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f1_reused = false;
    try {
      _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/employee/employeeLogin.jsp(32,90) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f1.setPath("password");
      int[] _jspx_push_body_count_sf_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f1 = _jspx_th_sf_005finput_005f1.doStartTag();
        if (_jspx_th_sf_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
      _jspx_th_sf_005finput_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f1, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f1_reused);
    }
    return false;
  }
}
