/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 *
 * @param <T> The type of data that is deserialized from response body
 */
public class ApiResponse<T> {
  private final int statusCode;
  private final Map<String, List<String>> headers;
  private final T data;

  /**
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers) {
    this(statusCode, headers, null);
  }

  /**
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   * @param data The object deserialized from response bod
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.data = data;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public T getData() {
    return data;
  }
}
