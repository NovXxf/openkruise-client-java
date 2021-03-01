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
import io.openkruise.client.models.KruiseAppsPubLifecycleHook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Lifecycle contains the hooks for Pod lifecycle.
 */
@ApiModel(description = "Lifecycle contains the hooks for Pod lifecycle.")

public class KruiseAppsPubLifecycle {
  @SerializedName("inPlaceUpdate")
  private KruiseAppsPubLifecycleHook inPlaceUpdate = null;

  @SerializedName("preDelete")
  private KruiseAppsPubLifecycleHook preDelete = null;

  public KruiseAppsPubLifecycle inPlaceUpdate(KruiseAppsPubLifecycleHook inPlaceUpdate) {
    this.inPlaceUpdate = inPlaceUpdate;
    return this;
  }

   /**
   * InPlaceUpdate is the hook before Pod to update and after Pod has been updated.
   * @return inPlaceUpdate
  **/
  @ApiModelProperty(value = "InPlaceUpdate is the hook before Pod to update and after Pod has been updated.")
  public KruiseAppsPubLifecycleHook getInPlaceUpdate() {
    return inPlaceUpdate;
  }

  public void setInPlaceUpdate(KruiseAppsPubLifecycleHook inPlaceUpdate) {
    this.inPlaceUpdate = inPlaceUpdate;
  }

  public KruiseAppsPubLifecycle preDelete(KruiseAppsPubLifecycleHook preDelete) {
    this.preDelete = preDelete;
    return this;
  }

   /**
   * PreDelete is the hook before Pod to be deleted.
   * @return preDelete
  **/
  @ApiModelProperty(value = "PreDelete is the hook before Pod to be deleted.")
  public KruiseAppsPubLifecycleHook getPreDelete() {
    return preDelete;
  }

  public void setPreDelete(KruiseAppsPubLifecycleHook preDelete) {
    this.preDelete = preDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsPubLifecycle kruiseAppsPubLifecycle = (KruiseAppsPubLifecycle) o;
    return Objects.equals(this.inPlaceUpdate, kruiseAppsPubLifecycle.inPlaceUpdate) &&
        Objects.equals(this.preDelete, kruiseAppsPubLifecycle.preDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inPlaceUpdate, preDelete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsPubLifecycle {\n");
    
    sb.append("    inPlaceUpdate: ").append(toIndentedString(inPlaceUpdate)).append("\n");
    sb.append("    preDelete: ").append(toIndentedString(preDelete)).append("\n");
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
