/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class SecurityFeatureType {

  public static final int BLANK = 0;

  public static final int FILL = 1;

  public static final int PHOTO = 2;

  public static final int MRZ = 3;

  public static final int FALSE_LUMINESCENCE = 4;

  public static final int HOLO_SIMPLE = 5;

  public static final int HOLO_VERIFY_STATIC = 6;

  public static final int HOLO_VERIFY_MULTI_STATIC = 7;

  public static final int HOLO_VERIFY_DYNAMIC = 8;

  public static final int PATTERN_NOT_INTERRUPTED = 9;

  public static final int PATTERN_NOT_SHIFTED = 10;

  public static final int PATTERN_SAME_COLORS = 11;

  public static final int PATTERN_IR_INVISIBLE = 12;

  public static final int PHOTO_SIZE_CHECK = 13;

  public static final int PORTRAIT_COMPARISON_VS_GHOST = 14;

  public static final int PORTRAIT_COMPARISON_VS_RFID = 15;

  public static final int PORTRAIT_COMPARISON_VS_VISUAL = 16;

  public static final int BARCODE = 17;

  public static final int PATTERN_DIFFERENT_LINES_THICKNESS = 18;

  public static final int PORTRAIT_COMPARISON_VS_CAMERA = 19;

  public static final int PORTRAIT_COMPARISON_RFID_VS_CAMERA = 20;

  public static final int GHOST_PHOTO = 21;

  public static final int CLEAR_GHOST_PHOTO = 22;

  public static final int INVISIBLE_OBJECT = 23;

  public static final int LOW_CONTRAST_OBJECT = 24;

  public static final int PHOTO_COLOR = 25;

  public static final int PHOTO_SHAPE = 26;

  public static final int PHOTO_CORNERS = 27;

  public static final int PORTRAIT_COMPARISON_EXT_VS_VISUAL = 29;

  public static final int PORTRAIT_COMPARISON_EXT_VS_RFID = 30;

  public static final int PORTRAIT_COMPARISON_EXT_VS_CAMERA = 31;
}
