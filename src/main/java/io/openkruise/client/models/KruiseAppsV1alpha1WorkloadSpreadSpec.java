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
import io.openkruise.client.models.KruiseAppsV1alpha1TargetReference;
import io.openkruise.client.models.KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy;
import io.openkruise.client.models.KruiseAppsV1alpha1WorkloadSpreadSubset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkloadSpreadSpec defines the desired state of WorkloadSpread.
 */
@ApiModel(description = "WorkloadSpreadSpec defines the desired state of WorkloadSpread.")

public class KruiseAppsV1alpha1WorkloadSpreadSpec {
  @SerializedName("scheduleStrategy")
  private KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy scheduleStrategy = null;

  @SerializedName("subsets")
  private List<KruiseAppsV1alpha1WorkloadSpreadSubset> subsets = new ArrayList<KruiseAppsV1alpha1WorkloadSpreadSubset>();

  @SerializedName("targetRef")
  private KruiseAppsV1alpha1TargetReference targetRef = null;

  public KruiseAppsV1alpha1WorkloadSpreadSpec scheduleStrategy(KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy scheduleStrategy) {
    this.scheduleStrategy = scheduleStrategy;
    return this;
  }

   /**
   * ScheduleStrategy indicates the strategy the WorkloadSpread used to preform the schedule between each of subsets.
   * @return scheduleStrategy
  **/
  @ApiModelProperty(value = "ScheduleStrategy indicates the strategy the WorkloadSpread used to preform the schedule between each of subsets.")
  public KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy getScheduleStrategy() {
    return scheduleStrategy;
  }

  public void setScheduleStrategy(KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy scheduleStrategy) {
    this.scheduleStrategy = scheduleStrategy;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpec subsets(List<KruiseAppsV1alpha1WorkloadSpreadSubset> subsets) {
    this.subsets = subsets;
    return this;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpec addSubsetsItem(KruiseAppsV1alpha1WorkloadSpreadSubset subsetsItem) {
    this.subsets.add(subsetsItem);
    return this;
  }

   /**
   * Subsets describes the pods distribution details between each of subsets.
   * @return subsets
  **/
  @ApiModelProperty(required = true, value = "Subsets describes the pods distribution details between each of subsets.")
  public List<KruiseAppsV1alpha1WorkloadSpreadSubset> getSubsets() {
    return subsets;
  }

  public void setSubsets(List<KruiseAppsV1alpha1WorkloadSpreadSubset> subsets) {
    this.subsets = subsets;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpec targetRef(KruiseAppsV1alpha1TargetReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }

   /**
   * TargetReference is the target workload that WorkloadSpread want to control.
   * @return targetRef
  **/
  @ApiModelProperty(required = true, value = "TargetReference is the target workload that WorkloadSpread want to control.")
  public KruiseAppsV1alpha1TargetReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(KruiseAppsV1alpha1TargetReference targetRef) {
    this.targetRef = targetRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1WorkloadSpreadSpec kruiseAppsV1alpha1WorkloadSpreadSpec = (KruiseAppsV1alpha1WorkloadSpreadSpec) o;
    return Objects.equals(this.scheduleStrategy, kruiseAppsV1alpha1WorkloadSpreadSpec.scheduleStrategy) &&
        Objects.equals(this.subsets, kruiseAppsV1alpha1WorkloadSpreadSpec.subsets) &&
        Objects.equals(this.targetRef, kruiseAppsV1alpha1WorkloadSpreadSpec.targetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleStrategy, subsets, targetRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1WorkloadSpreadSpec {\n");
    
    sb.append("    scheduleStrategy: ").append(toIndentedString(scheduleStrategy)).append("\n");
    sb.append("    subsets: ").append(toIndentedString(subsets)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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

