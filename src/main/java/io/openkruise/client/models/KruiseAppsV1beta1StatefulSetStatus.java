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
 * StatefulSetStatus defines the observed state of StatefulSet
 */
@ApiModel(description = "StatefulSetStatus defines the observed state of StatefulSet")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1beta1StatefulSetStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("collisionCount")
  private Integer collisionCount = null;

  @SerializedName("conditions")
  private List<KruiseAppsV1alpha1StatefulSetCondition> conditions = null;

  @SerializedName("currentReplicas")
  private Integer currentReplicas = null;

  @SerializedName("currentRevision")
  private String currentRevision = null;

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

  public KruiseAppsV1beta1StatefulSetStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * AvailableReplicas is the number of Pods created by the StatefulSet controller that have been ready for minReadySeconds.
   * @return availableReplicas
  **/
  @ApiModelProperty(required = true, value = "AvailableReplicas is the number of Pods created by the StatefulSet controller that have been ready for minReadySeconds.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public KruiseAppsV1beta1StatefulSetStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @ApiModelProperty(value = "collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public KruiseAppsV1beta1StatefulSetStatus conditions(List<KruiseAppsV1alpha1StatefulSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public KruiseAppsV1beta1StatefulSetStatus addConditionsItem(KruiseAppsV1alpha1StatefulSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<KruiseAppsV1alpha1StatefulSetCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a statefulset&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Represents the latest available observations of a statefulset's current state.")
  public List<KruiseAppsV1alpha1StatefulSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<KruiseAppsV1alpha1StatefulSetCondition> conditions) {
    this.conditions = conditions;
  }

  public KruiseAppsV1beta1StatefulSetStatus currentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

   /**
   * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
   * @return currentReplicas
  **/
  @ApiModelProperty(required = true, value = "currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }

  public KruiseAppsV1beta1StatefulSetStatus currentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

   /**
   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
   * @return currentRevision
  **/
  @ApiModelProperty(value = "currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).")
  public String getCurrentRevision() {
    return currentRevision;
  }

  public void setCurrentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
  }

  public KruiseAppsV1beta1StatefulSetStatus labelSelector(String labelSelector) {
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

  public KruiseAppsV1beta1StatefulSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public KruiseAppsV1beta1StatefulSetStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
   * @return readyReplicas
  **/
  @ApiModelProperty(required = true, value = "readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public KruiseAppsV1beta1StatefulSetStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * replicas is the number of Pods created by the StatefulSet controller.
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "replicas is the number of Pods created by the StatefulSet controller.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public KruiseAppsV1beta1StatefulSetStatus updateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
    return this;
  }

   /**
   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
   * @return updateRevision
  **/
  @ApiModelProperty(value = "updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)")
  public String getUpdateRevision() {
    return updateRevision;
  }

  public void setUpdateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
  }

  public KruiseAppsV1beta1StatefulSetStatus updatedAvailableReplicas(Integer updatedAvailableReplicas) {
    this.updatedAvailableReplicas = updatedAvailableReplicas;
    return this;
  }

   /**
   * updatedAvailableReplicas is the number of updated Pods created by the StatefulSet controller that have a Ready condition for atleast minReadySeconds.
   * @return updatedAvailableReplicas
  **/
  @ApiModelProperty(value = "updatedAvailableReplicas is the number of updated Pods created by the StatefulSet controller that have a Ready condition for atleast minReadySeconds.")
  public Integer getUpdatedAvailableReplicas() {
    return updatedAvailableReplicas;
  }

  public void setUpdatedAvailableReplicas(Integer updatedAvailableReplicas) {
    this.updatedAvailableReplicas = updatedAvailableReplicas;
  }

  public KruiseAppsV1beta1StatefulSetStatus updatedReadyReplicas(Integer updatedReadyReplicas) {
    this.updatedReadyReplicas = updatedReadyReplicas;
    return this;
  }

   /**
   * updatedReadyReplicas is the number of updated Pods created by the StatefulSet controller that have a Ready Condition.
   * @return updatedReadyReplicas
  **/
  @ApiModelProperty(value = "updatedReadyReplicas is the number of updated Pods created by the StatefulSet controller that have a Ready Condition.")
  public Integer getUpdatedReadyReplicas() {
    return updatedReadyReplicas;
  }

  public void setUpdatedReadyReplicas(Integer updatedReadyReplicas) {
    this.updatedReadyReplicas = updatedReadyReplicas;
  }

  public KruiseAppsV1beta1StatefulSetStatus updatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
   * @return updatedReplicas
  **/
  @ApiModelProperty(required = true, value = "updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.")
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
    if (!(o instanceof KruiseAppsV1beta1StatefulSetStatus)) {
      return false;
    }
    KruiseAppsV1beta1StatefulSetStatus ioKruiseAppsV1beta1StatefulSetStatus = (KruiseAppsV1beta1StatefulSetStatus) o;
    return Objects.equals(this.availableReplicas, ioKruiseAppsV1beta1StatefulSetStatus.availableReplicas) &&
        Objects.equals(this.collisionCount, ioKruiseAppsV1beta1StatefulSetStatus.collisionCount) &&
        Objects.equals(this.conditions, ioKruiseAppsV1beta1StatefulSetStatus.conditions) &&
        Objects.equals(this.currentReplicas, ioKruiseAppsV1beta1StatefulSetStatus.currentReplicas) &&
        Objects.equals(this.currentRevision, ioKruiseAppsV1beta1StatefulSetStatus.currentRevision) &&
        Objects.equals(this.labelSelector, ioKruiseAppsV1beta1StatefulSetStatus.labelSelector) &&
        Objects.equals(this.observedGeneration, ioKruiseAppsV1beta1StatefulSetStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, ioKruiseAppsV1beta1StatefulSetStatus.readyReplicas) &&
        Objects.equals(this.replicas, ioKruiseAppsV1beta1StatefulSetStatus.replicas) &&
        Objects.equals(this.updateRevision, ioKruiseAppsV1beta1StatefulSetStatus.updateRevision) &&
        Objects.equals(this.updatedAvailableReplicas, ioKruiseAppsV1beta1StatefulSetStatus.updatedAvailableReplicas) &&
        Objects.equals(this.updatedReadyReplicas, ioKruiseAppsV1beta1StatefulSetStatus.updatedReadyReplicas) &&
        Objects.equals(this.updatedReplicas, ioKruiseAppsV1beta1StatefulSetStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, conditions, currentReplicas, currentRevision, labelSelector, observedGeneration, readyReplicas, replicas, updateRevision, updatedAvailableReplicas, updatedReadyReplicas, updatedReplicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1beta1StatefulSetStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
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

