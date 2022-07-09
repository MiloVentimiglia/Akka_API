package route

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import com.typesafe.scalalogging.LazyLogging
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.{GET, Path, Produces}


trait HealthEndpointRoutes extends LazyLogging{

  @Path("/health")
  @GET
  @Produces(Array(MediaType.APPLICATION_JSON))
  @Operation(
    summary = "Return API running",
    description = "Returns a 200 response code indicating the API is running",
    responses = Array(
      new ApiResponse(responseCode = "200", description = "Service up and running response"),
      new ApiResponse(responseCode = "500", description = "Internal server error"))
  )
  def healthPoint: Route = path("health") {
    get {
      complete(StatusCodes.OK -> "The API is up and running!")
    }
  }

}

