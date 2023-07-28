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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * ScaleStrategy indicates the ScaleStrategy that will be employed to create and delete Pods in the CloneSet.
 */
@ApiModel(description = "ScaleStrategy indicates the ScaleStrategy that will be employed to create and delete Pods in the CloneSet.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1CloneSetScaleStrategy {
  @SerializedName("disablePVCReuse")
  private Boolean disablePVCReuse = null;

  @SerializedName("maxUnavailable")
  private IntOrString maxUnavailable = null;

  @SerializedName("podsToDelete")
  private List<String> podsToDelete = null;

  public KruiseAppsV1alpha1CloneSetScaleStrategy disablePVCReuse(Boolean disablePVCReuse) {
    this.disablePVCReuse = disablePVCReuse;
    return this;
  }

   /**
   * Indicate if cloneSet will reuse already existed pvc to rebuild a new pod
   * @return disablePVCReuse
  **/
  @ApiModelProperty(value = "Indicate if cloneSet will reuse already existed pvc to rebuild a new pod")
  public Boolean isDisablePVCReuse() {
    return disablePVCReuse;
  }

  public void setDisablePVCReuse(Boolean disablePVCReuse) {
    this.disablePVCReuse = disablePVCReuse;
  }

  public KruiseAppsV1alpha1CloneSetScaleStrategy maxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * The maximum number of pods that can be unavailable for scaled pods. This field can control the changes rate of replicas for CloneSet so as to minimize the impact for users&#39; service. The scale will fail if the number of unavailable pods were greater than this MaxUnavailable at scaling up. MaxUnavailable works only when scaling up.
   * @return maxUnavailable
  **/
  @ApiModelProperty(value = "The maximum number of pods that can be unavailable for scaled pods. This field can control the changes rate of replicas for CloneSet so as to minimize the impact for users' service. The scale will fail if the number of unavailable pods were greater than this MaxUnavailable at scaling up. MaxUnavailable works only when scaling up.")
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }

  public KruiseAppsV1alpha1CloneSetScaleStrategy podsToDelete(List<String> podsToDelete) {
    this.podsToDelete = podsToDelete;
    return this;
  }

  public KruiseAppsV1alpha1CloneSetScaleStrategy addPodsToDeleteItem(String podsToDeleteItem) {
    if (this.podsToDelete == null) {
      this.podsToDelete = new ArrayList<String>();
    }
    this.podsToDelete.add(podsToDeleteItem);
    return this;
  }

   /**
   * PodsToDelete is the names of Pod should be deleted. Note that this list will be truncated for non-existing pod names.
   * @return podsToDelete
  **/
  @ApiModelProperty(value = "PodsToDelete is the names of Pod should be deleted. Note that this list will be truncated for non-existing pod names.")
  public List<String> getPodsToDelete() {
    return podsToDelete;
  }

  public void setPodsToDelete(List<String> podsToDelete) {
    this.podsToDelete = podsToDelete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1CloneSetScaleStrategy)) {
      return false;
    }
    KruiseAppsV1alpha1CloneSetScaleStrategy ioKruiseAppsV1alpha1CloneSetSpecScaleStrategy = (KruiseAppsV1alpha1CloneSetScaleStrategy) o;
    return Objects.equals(this.disablePVCReuse, ioKruiseAppsV1alpha1CloneSetSpecScaleStrategy.disablePVCReuse) &&
        Objects.equals(this.maxUnavailable, ioKruiseAppsV1alpha1CloneSetSpecScaleStrategy.maxUnavailable) &&
        Objects.equals(this.podsToDelete, ioKruiseAppsV1alpha1CloneSetSpecScaleStrategy.podsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disablePVCReuse, maxUnavailable, podsToDelete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetSpecScaleStrategy {\n");
    
    sb.append("    disablePVCReuse: ").append(toIndentedString(disablePVCReuse)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    podsToDelete: ").append(toIndentedString(podsToDelete)).append("\n");
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

