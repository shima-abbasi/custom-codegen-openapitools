package com.shima.openapitools.endpoint;

import java.util.Map;
import java.util.Optional;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import com.shima.custom.codegen.openapitools.api.UserApi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 * Azure Function that handles a simple GET request.
 */

@Slf4j
@ApplicationScoped
public class ExampleGetApi {

  private final UserApi userApi;

  @Inject
  public ExampleGetApi(@RestClient UserApi userApi) {
    this.userApi = userApi;
  }

  @FunctionName("exampleGetApi")
  public HttpResponseMessage getExample
      (@HttpTrigger(name = "req",
          methods = {HttpMethod.GET},
          route = "test",
          authLevel = AuthorizationLevel.FUNCTION)
       HttpRequestMessage<Optional<String>> request) {

    final Map<String, String> headers = request.getHeaders();

    try {
      return handleRequest(request, headers);
    } catch (Exception e) {
      log.error("Error handling request: {}", e.getMessage());
      return request.createResponseBuilder(HttpStatus.INTERNAL_SERVER_ERROR).body("{ \"status\":\"" + e.getMessage() + "\" }").build();
    }
  }

  private HttpResponseMessage handleRequest(HttpRequestMessage<Optional<String>> request, Map<String, String> headers) {

    log.info("Request received");

    //TODO :Placeholder for custom logic

    Response response = userApi.getUsers(2, 1);

    return request.createResponseBuilder(HttpStatus.OK).body(response.getEntity()).build();
  }
}
