/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regulaforensics.docreader.client.model;

public class DocumentTypeRecognitionResult {

  /** Document type determined. The first element in candidates array is recognition result */
  public static final int OK = 0;

  /** Document type was not determined. Ongoing processing is not possible */
  public static final int UNKNOWN = 15;

  /**
   * To determine document type user should provide more images with different light sources (UV,
   * for example)
   */
  public static final int NEED_MORE_IMAGES = 29;
}
