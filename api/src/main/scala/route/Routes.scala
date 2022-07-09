package route

import akka.actor.ActorSystem
import ch.megard.akka.http.cors.scaladsl.CorsDirectives.cors
import akka.http.scaladsl.server.{Route, RouteConcatenation}
import route.SwaggerDocService

import scala.concurrent.ExecutionContext

trait Routes extends HealthEndpointRoutes with RouteConcatenation{

  implicit val system: ActorSystem        = ActorSystem("my-mega-actor-system")
  implicit val executor: ExecutionContext = system.dispatcher

  val routes: Route = cors() (healthPoint ~ SwaggerDocService.routes)

}
