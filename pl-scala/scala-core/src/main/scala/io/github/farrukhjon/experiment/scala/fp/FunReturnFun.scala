package io.github.farrukhjon.experiment.scala.fp

object FunReturnFun {

  // function urlBuilderFun(String, Boolean) returns other function: (String, String) => String
  def urlBuilderFun(domainName: String, ssl: Boolean): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  def main(args: Array[String]): Unit = {
    val getUrlFun = urlBuilderFun(ssl = true, domainName = "io.github.farukhjon")
    val urlRepoId1 = getUrlFun("repositories", "id=1") //  yields https://io.github.farukhjon/repositories?id=1
    print(s"urlRepoId1 = $urlRepoId1")
  }

}
