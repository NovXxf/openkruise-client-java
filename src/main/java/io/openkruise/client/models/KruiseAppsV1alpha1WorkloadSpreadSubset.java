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
import io.kubernetes.client.openapi.models.V1NodeSelectorTerm;
import io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.kubernetes.client.proto.Runtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * WorkloadSpreadSubset defines the details of a subset.
 */
@ApiModel(description = "WorkloadSpreadSubset defines the details of a subset.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1WorkloadSpreadSubset {
  @SerializedName("maxReplicas")
  private IntOrString maxReplicas = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("patch")
  private Runtime.RawExtension patch = null;

  @SerializedName("preferredNodeSelectorTerms")
  private List<V1PreferredSchedulingTerm> preferredNodeSelectorTerms = null;

  @SerializedName("requiredNodeSelectorTerm")
  private V1NodeSelectorTerm requiredNodeSelectorTerm = null;

  @SerializedName("tolerations")
  private List<V1Toleration> tolerations = null;

  public KruiseAppsV1alpha1WorkloadSpreadSubset maxReplicas(IntOrString maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * MaxReplicas indicates the desired max replicas of this subset.
   * @return maxReplicas
  **/
  @ApiModelProperty(value = "MaxReplicas indicates the desired max replicas of this subset.")
  public IntOrString getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(IntOrString maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name should be unique between all of the subsets under one WorkloadSpread.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name should be unique between all of the subsets under one WorkloadSpread.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset patch(Runtime.RawExtension patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Patch indicates patching podTemplate to the Pod.
   * @return patch
  **/
  @ApiModelProperty(value = "Patch indicates patching podTemplate to the Pod.")
  public Runtime.RawExtension getPatch() {
    return patch;
  }

  public void setPatch(Runtime.RawExtension patch) {
    this.patch = patch;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset preferredNodeSelectorTerms(List<V1PreferredSchedulingTerm> preferredNodeSelectorTerms) {
    this.preferredNodeSelectorTerms = preferredNodeSelectorTerms;
    return this;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset addPreferredNodeSelectorTermsItem(V1PreferredSchedulingTerm preferredNodeSelectorTermsItem) {
    if (this.preferredNodeSelectorTerms == null) {
      this.preferredNodeSelectorTerms = new ArrayList<V1PreferredSchedulingTerm>();
    }
    this.preferredNodeSelectorTerms.add(preferredNodeSelectorTermsItem);
    return this;
  }

   /**
   * Indicates the node preferred selector to form the subset.
   * @return preferredNodeSelectorTerms
  **/
  @ApiModelProperty(value = "Indicates the node preferred selector to form the subset.")
  public List<V1PreferredSchedulingTerm> getPreferredNodeSelectorTerms() {
    return preferredNodeSelectorTerms;
  }

  public void setPreferredNodeSelectorTerms(List<V1PreferredSchedulingTerm> preferredNodeSelectorTerms) {
    this.preferredNodeSelectorTerms = preferredNodeSelectorTerms;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset requiredNodeSelectorTerm(V1NodeSelectorTerm requiredNodeSelectorTerm) {
    this.requiredNodeSelectorTerm = requiredNodeSelectorTerm;
    return this;
  }

   /**
   * Get requiredNodeSelectorTerm
   * @return requiredNodeSelectorTerm
  **/
  @ApiModelProperty(value = "")
  public V1NodeSelectorTerm getRequiredNodeSelectorTerm() {
    return requiredNodeSelectorTerm;
  }

  public void setRequiredNodeSelectorTerm(V1NodeSelectorTerm requiredNodeSelectorTerm) {
    this.requiredNodeSelectorTerm = requiredNodeSelectorTerm;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSubset addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Indicates the tolerations the pods under this subset have.
   * @return tolerations
  **/
  @ApiModelProperty(value = "Indicates the tolerations the pods under this subset have.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1WorkloadSpreadSubset)) {
      return false;
    }
    KruiseAppsV1alpha1WorkloadSpreadSubset ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets = (KruiseAppsV1alpha1WorkloadSpreadSubset) o;
    return Objects.equals(this.maxReplicas, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.maxReplicas) &&
        Objects.equals(this.name, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.name) &&
        Objects.equals(this.patch, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.patch) &&
        Objects.equals(this.preferredNodeSelectorTerms, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.preferredNodeSelectorTerms) &&
        Objects.equals(this.requiredNodeSelectorTerm, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.requiredNodeSelectorTerm) &&
        Objects.equals(this.tolerations, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, name, patch, preferredNodeSelectorTerms, requiredNodeSelectorTerm, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1WorkloadSpreadSpecSubsets {\n");
    
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    preferredNodeSelectorTerms: ").append(toIndentedString(preferredNodeSelectorTerms)).append("\n");
    sb.append("    requiredNodeSelectorTerm: ").append(toIndentedString(requiredNodeSelectorTerm)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

