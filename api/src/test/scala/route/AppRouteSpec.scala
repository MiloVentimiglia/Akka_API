package route

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers
import util.RestAssuredUtils

class AppRouteSpec extends AnyFeatureSpec with GivenWhenThen with Matchers with RestAssuredUtils {

  Feature("Health Endpoint") {
    Scenario("/health endpoint should return 200") {
      When("I send a request to the /health endpoint")
      val response = apiGetRequest("/health")
      Then("I should receive a 200 response with message body \"Hello, World!\"")
      response.statusCode() shouldBe 200
      response.body().print() shouldBe "The API is up and running!"
    }
  }


}
