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
import org.joda.time.DateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SyncStatus is summary of the status of all images pulling tasks on the node.
 */
@ApiModel(description = "SyncStatus is summary of the status of all images pulling tasks on the node.")

public class KruiseAppsV1alpha1SyncStatus {
  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("syncAt")
  private DateTime syncAt = null;

  public KruiseAppsV1alpha1SyncStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KruiseAppsV1alpha1SyncStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public KruiseAppsV1alpha1SyncStatus syncAt(DateTime syncAt) {
    this.syncAt = syncAt;
    return this;
  }

   /**
   * Get syncAt
   * @return syncAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getSyncAt() {
    return syncAt;
  }

  public void setSyncAt(DateTime syncAt) {
    this.syncAt = syncAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SyncStatus kruiseAppsV1alpha1SyncStatus = (KruiseAppsV1alpha1SyncStatus) o;
    return Objects.equals(this.message, kruiseAppsV1alpha1SyncStatus.message) &&
        Objects.equals(this.status, kruiseAppsV1alpha1SyncStatus.status) &&
        Objects.equals(this.syncAt, kruiseAppsV1alpha1SyncStatus.syncAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, status, syncAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SyncStatus {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    syncAt: ").append(toIndentedString(syncAt)).append("\n");
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
