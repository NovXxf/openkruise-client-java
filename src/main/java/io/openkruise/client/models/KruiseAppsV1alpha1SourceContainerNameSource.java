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
import io.kubernetes.client.openapi.models.V1ObjectFieldSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * KruiseAppsV1alpha1SourceContainerNameSource
 */

public class KruiseAppsV1alpha1SourceContainerNameSource {
  @SerializedName("fieldRef")
  private V1ObjectFieldSelector fieldRef = null;

  public KruiseAppsV1alpha1SourceContainerNameSource fieldRef(V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Selects a field of the pod: supports metadata.name, &#x60;metadata.labels[&#39;&lt;KEY&gt;&#39;]&#x60;, &#x60;metadata.annotations[&#39;&lt;KEY&gt;&#39;]&#x60;,
   * @return fieldRef
  **/
  @ApiModelProperty(value = "Selects a field of the pod: supports metadata.name, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`,")
  public V1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SourceContainerNameSource kruiseAppsV1alpha1SourceContainerNameSource = (KruiseAppsV1alpha1SourceContainerNameSource) o;
    return Objects.equals(this.fieldRef, kruiseAppsV1alpha1SourceContainerNameSource.fieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SourceContainerNameSource {\n");
    
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
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

