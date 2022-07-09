import akka.http.scaladsl.Http
import com.typesafe.scalalogging.LazyLogging
import config.AppConfig.appConfig.http._
import route.Routes
import scala.util.{Failure, Success}


object Application extends App with Routes with LazyLogging{

  Http()
    .newServerAt(host, port)
    .bindFlow(routes)
    .onComplete {
      case Success(_) =>
        logger.info(s"App running on $host:$port")
      case Failure(ex) =>
        logger.info(s"App failed to start:\n${ex.getMessage}")
    }

}
