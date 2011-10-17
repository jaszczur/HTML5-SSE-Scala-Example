import javax.servlet.http._

class PushServlet extends HttpServlet {
  private val random = new util.Random()

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse) = {
    resp.setContentType("text/event-stream")
    resp.setCharacterEncoding("utf-8")

    val out = resp.getWriter()
    out.print("data:")
    out.println(generateData)
    out.flush()
  }

 private def generateData() = String.valueOf(random.nextInt(100) + 1)
}

