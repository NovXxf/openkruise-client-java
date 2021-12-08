/*
 * Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TargetReference contains enough information to let you identify an workload
 */
@ApiModel(description = "TargetReference contains enough information to let you identify an workload")

public class KruiseAppsV1alpha1TargetReference {
  @SerializedName("apiVersion")
  private String apiVersion = "";

  @SerializedName("kind")
  private String kind = "";

  @SerializedName("name")
  private String name = "";

  public KruiseAppsV1alpha1TargetReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public KruiseAppsV1alpha1TargetReference kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of the referent.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public KruiseAppsV1alpha1TargetReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the referent.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1TargetReference kruiseAppsV1alpha1TargetReference = (KruiseAppsV1alpha1TargetReference) o;
    return Objects.equals(this.apiVersion, kruiseAppsV1alpha1TargetReference.apiVersion) &&
        Objects.equals(this.kind, kruiseAppsV1alpha1TargetReference.kind) &&
        Objects.equals(this.name, kruiseAppsV1alpha1TargetReference.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1TargetReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

