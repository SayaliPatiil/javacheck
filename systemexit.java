package javacodechecker;
public class RedirectWithoutExit {
public void bad(HttpServletRequest request, HttpServletResponse response) throws Exception {
IO.writeLine("line before redirect");
IO.writeLine("line before redirect");
response.sendRedirect("/test");
}
}
