/*
* Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * ContainerRecreateRequestStatus defines the observed state of ContainerRecreateRequest
 */
@ApiModel(description = "ContainerRecreateRequestStatus defines the observed state of ContainerRecreateRequest")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ContainerRecreateRequestStatus {
  @SerializedName("completionTime")
  private OffsetDateTime completionTime = null;

  @SerializedName("containerRecreateStates")
  private List<KruiseAppsV1alpha1ContainerRecreateRequestContainerRecreateState> containerRecreateStates = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("phase")
  private String phase = null;

  public KruiseAppsV1alpha1ContainerRecreateRequestStatus completionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Represents time when the ContainerRecreateRequest was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Represents time when the ContainerRecreateRequest was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStatus containerRecreateStates(List<KruiseAppsV1alpha1ContainerRecreateRequestContainerRecreateState> containerRecreateStates) {
    this.containerRecreateStates = containerRecreateStates;
    return this;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStatus addContainerRecreateStatesItem(KruiseAppsV1alpha1ContainerRecreateRequestContainerRecreateState containerRecreateStatesItem) {
    if (this.containerRecreateStates == null) {
      this.containerRecreateStates = new ArrayList<KruiseAppsV1alpha1ContainerRecreateRequestContainerRecreateState>();
    }
    this.containerRecreateStates.add(containerRecreateStatesItem);
    return this;
  }

   /**
   * ContainerRecreateStates contains the recreation states of the containers.
   * @return containerRecreateStates
  **/
  @ApiModelProperty(value = "ContainerRecreateStates contains the recreation states of the containers.")
  public List<KruiseAppsV1alpha1ContainerRecreateRequestContainerRecreateState> getContainerRecreateStates() {
    return containerRecreateStates;
  }

  public void setContainerRecreateStates(List<KruiseAppsV1alpha1ContainerRecreateRequestContainerRecreateState> containerRecreateStates) {
    this.containerRecreateStates = containerRecreateStates;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about this ContainerRecreateRequest.
   * @return message
  **/
  @ApiModelProperty(value = "A human readable message indicating details about this ContainerRecreateRequest.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase of this ContainerRecreateRequest, e.g. Pending, Recreating, Completed
   * @return phase
  **/
  @ApiModelProperty(required = true, value = "Phase of this ContainerRecreateRequest, e.g. Pending, Recreating, Completed")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1ContainerRecreateRequestStatus)) {
      return false;
    }
    KruiseAppsV1alpha1ContainerRecreateRequestStatus ioKruiseAppsV1alpha1ContainerRecreateRequestStatus = (KruiseAppsV1alpha1ContainerRecreateRequestStatus) o;
    return Objects.equals(this.completionTime, ioKruiseAppsV1alpha1ContainerRecreateRequestStatus.completionTime) &&
        Objects.equals(this.containerRecreateStates, ioKruiseAppsV1alpha1ContainerRecreateRequestStatus.containerRecreateStates) &&
        Objects.equals(this.message, ioKruiseAppsV1alpha1ContainerRecreateRequestStatus.message) &&
        Objects.equals(this.phase, ioKruiseAppsV1alpha1ContainerRecreateRequestStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, containerRecreateStates, message, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ContainerRecreateRequestStatus {\n");
    
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    containerRecreateStates: ").append(toIndentedString(containerRecreateStates)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

