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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * CloneSetStatus defines the observed state of CloneSet
 */
@ApiModel(description = "CloneSetStatus defines the observed state of CloneSet")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1CloneSetStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("collisionCount")
  private Integer collisionCount = null;

  @SerializedName("conditions")
  private List<KruiseAppsV1alpha1CloneSetCondition> conditions = null;

  @SerializedName("currentRevision")
  private String currentRevision = null;

  @SerializedName("expectedUpdatedReplicas")
  private Integer expectedUpdatedReplicas = null;

  @SerializedName("labelSelector")
  private String labelSelector = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyReplicas")
  private Integer readyReplicas = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("updateRevision")
  private String updateRevision = null;

  @SerializedName("updatedAvailableReplicas")
  private Integer updatedAvailableReplicas = null;

  @SerializedName("updatedReadyReplicas")
  private Integer updatedReadyReplicas = null;

  @SerializedName("updatedReplicas")
  private Integer updatedReplicas = null;

  public KruiseAppsV1alpha1CloneSetStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * AvailableReplicas is the number of Pods created by the CloneSet controller that have a Ready Condition for at least minReadySeconds.
   * @return availableReplicas
  **/
  @ApiModelProperty(required = true, value = "AvailableReplicas is the number of Pods created by the CloneSet controller that have a Ready Condition for at least minReadySeconds.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public KruiseAppsV1alpha1CloneSetStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * CollisionCount is the count of hash collisions for the CloneSet. The CloneSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @ApiModelProperty(value = "CollisionCount is the count of hash collisions for the CloneSet. The CloneSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public KruiseAppsV1alpha1CloneSetStatus conditions(List<KruiseAppsV1alpha1CloneSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public KruiseAppsV1alpha1CloneSetStatus addConditionsItem(KruiseAppsV1alpha1CloneSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<KruiseAppsV1alpha1CloneSetCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions represents the latest available observations of a CloneSet&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions represents the latest available observations of a CloneSet's current state.")
  public List<KruiseAppsV1alpha1CloneSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<KruiseAppsV1alpha1CloneSetCondition> conditions) {
    this.conditions = conditions;
  }

  public KruiseAppsV1alpha1CloneSetStatus currentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

   /**
   * currentRevision, if not empty, indicates the current revision version of the CloneSet.
   * @return currentRevision
  **/
  @ApiModelProperty(value = "currentRevision, if not empty, indicates the current revision version of the CloneSet.")
  public String getCurrentRevision() {
    return currentRevision;
  }

  public void setCurrentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
  }

  public KruiseAppsV1alpha1CloneSetStatus expectedUpdatedReplicas(Integer expectedUpdatedReplicas) {
    this.expectedUpdatedReplicas = expectedUpdatedReplicas;
    return this;
  }

   /**
   * ExpectedUpdatedReplicas is the number of Pods that should be updated by CloneSet controller. This field is calculated via Replicas - Partition.
   * @return expectedUpdatedReplicas
  **/
  @ApiModelProperty(value = "ExpectedUpdatedReplicas is the number of Pods that should be updated by CloneSet controller. This field is calculated via Replicas - Partition.")
  public Integer getExpectedUpdatedReplicas() {
    return expectedUpdatedReplicas;
  }

  public void setExpectedUpdatedReplicas(Integer expectedUpdatedReplicas) {
    this.expectedUpdatedReplicas = expectedUpdatedReplicas;
  }

  public KruiseAppsV1alpha1CloneSetStatus labelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * LabelSelector is label selectors for query over pods that should match the replica count used by HPA.
   * @return labelSelector
  **/
  @ApiModelProperty(value = "LabelSelector is label selectors for query over pods that should match the replica count used by HPA.")
  public String getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
  }

  public KruiseAppsV1alpha1CloneSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration is the most recent generation observed for this CloneSet. It corresponds to the CloneSet&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "ObservedGeneration is the most recent generation observed for this CloneSet. It corresponds to the CloneSet's generation, which is updated on mutation by the API Server.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public KruiseAppsV1alpha1CloneSetStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * ReadyReplicas is the number of Pods created by the CloneSet controller that have a Ready Condition.
   * @return readyReplicas
  **/
  @ApiModelProperty(required = true, value = "ReadyReplicas is the number of Pods created by the CloneSet controller that have a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public KruiseAppsV1alpha1CloneSetStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the number of Pods created by the CloneSet controller.
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "Replicas is the number of Pods created by the CloneSet controller.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public KruiseAppsV1alpha1CloneSetStatus updateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
    return this;
  }

   /**
   * UpdateRevision, if not empty, indicates the latest revision of the CloneSet.
   * @return updateRevision
  **/
  @ApiModelProperty(value = "UpdateRevision, if not empty, indicates the latest revision of the CloneSet.")
  public String getUpdateRevision() {
    return updateRevision;
  }

  public void setUpdateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
  }

  public KruiseAppsV1alpha1CloneSetStatus updatedAvailableReplicas(Integer updatedAvailableReplicas) {
    this.updatedAvailableReplicas = updatedAvailableReplicas;
    return this;
  }

   /**
   * UpdatedAvailableReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision and have a Ready Condition for at least minReadySeconds.
   * @return updatedAvailableReplicas
  **/
  @ApiModelProperty(required = true, value = "UpdatedAvailableReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision and have a Ready Condition for at least minReadySeconds.")
  public Integer getUpdatedAvailableReplicas() {
    return updatedAvailableReplicas;
  }

  public void setUpdatedAvailableReplicas(Integer updatedAvailableReplicas) {
    this.updatedAvailableReplicas = updatedAvailableReplicas;
  }

  public KruiseAppsV1alpha1CloneSetStatus updatedReadyReplicas(Integer updatedReadyReplicas) {
    this.updatedReadyReplicas = updatedReadyReplicas;
    return this;
  }

   /**
   * UpdatedReadyReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision and have a Ready Condition.
   * @return updatedReadyReplicas
  **/
  @ApiModelProperty(required = true, value = "UpdatedReadyReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision and have a Ready Condition.")
  public Integer getUpdatedReadyReplicas() {
    return updatedReadyReplicas;
  }

  public void setUpdatedReadyReplicas(Integer updatedReadyReplicas) {
    this.updatedReadyReplicas = updatedReadyReplicas;
  }

  public KruiseAppsV1alpha1CloneSetStatus updatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * UpdatedReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision.
   * @return updatedReplicas
  **/
  @ApiModelProperty(required = true, value = "UpdatedReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision.")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1CloneSetStatus)) {
      return false;
    }
    KruiseAppsV1alpha1CloneSetStatus ioKruiseAppsV1alpha1CloneSetStatus = (KruiseAppsV1alpha1CloneSetStatus) o;
    return Objects.equals(this.availableReplicas, ioKruiseAppsV1alpha1CloneSetStatus.availableReplicas) &&
        Objects.equals(this.collisionCount, ioKruiseAppsV1alpha1CloneSetStatus.collisionCount) &&
        Objects.equals(this.conditions, ioKruiseAppsV1alpha1CloneSetStatus.conditions) &&
        Objects.equals(this.currentRevision, ioKruiseAppsV1alpha1CloneSetStatus.currentRevision) &&
        Objects.equals(this.expectedUpdatedReplicas, ioKruiseAppsV1alpha1CloneSetStatus.expectedUpdatedReplicas) &&
        Objects.equals(this.labelSelector, ioKruiseAppsV1alpha1CloneSetStatus.labelSelector) &&
        Objects.equals(this.observedGeneration, ioKruiseAppsV1alpha1CloneSetStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, ioKruiseAppsV1alpha1CloneSetStatus.readyReplicas) &&
        Objects.equals(this.replicas, ioKruiseAppsV1alpha1CloneSetStatus.replicas) &&
        Objects.equals(this.updateRevision, ioKruiseAppsV1alpha1CloneSetStatus.updateRevision) &&
        Objects.equals(this.updatedAvailableReplicas, ioKruiseAppsV1alpha1CloneSetStatus.updatedAvailableReplicas) &&
        Objects.equals(this.updatedReadyReplicas, ioKruiseAppsV1alpha1CloneSetStatus.updatedReadyReplicas) &&
        Objects.equals(this.updatedReplicas, ioKruiseAppsV1alpha1CloneSetStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, conditions, currentRevision, expectedUpdatedReplicas, labelSelector, observedGeneration, readyReplicas, replicas, updateRevision, updatedAvailableReplicas, updatedReadyReplicas, updatedReplicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    expectedUpdatedReplicas: ").append(toIndentedString(expectedUpdatedReplicas)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    updateRevision: ").append(toIndentedString(updateRevision)).append("\n");
    sb.append("    updatedAvailableReplicas: ").append(toIndentedString(updatedAvailableReplicas)).append("\n");
    sb.append("    updatedReadyReplicas: ").append(toIndentedString(updatedReadyReplicas)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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

