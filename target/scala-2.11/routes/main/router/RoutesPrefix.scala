
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/IDEA_project/play-scala/conf/routes
// @DATE:Sat Mar 04 19:49:32 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
