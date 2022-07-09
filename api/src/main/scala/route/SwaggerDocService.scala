package route

import com.github.swagger.akka.model.Info
import com.github.swagger.akka.ui.SwaggerHttpWithUiService
import io.swagger.v3.oas.models.ExternalDocumentation

object SwaggerDocService extends SwaggerHttpWithUiService {

  override val apiClasses: Set[Class[_]] = Set(classOf[HealthEndpointRoutes])
  override val host: String = "localhost:8080"
  override val info: Info = Info(version = "1.0")
  override val externalDocs: Option[ExternalDocumentation] = Some(
    new ExternalDocumentation()
      .description("Core Docs")
      .url("http://acme.com/docs")
  )
  //override val securitySchemeDefinitions = Map("basicAuth" -> new BasicAuthDefinition())
  override val unwantedDefinitions: Seq[String] = Seq("Function1", "Function1RequestContextFutureRouteResult")

}
