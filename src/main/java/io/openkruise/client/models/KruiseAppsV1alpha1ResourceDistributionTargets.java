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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.openkruise.client.models.KruiseAppsV1alpha1ResourceDistributionTargetNamespaces;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceDistributionTargets defines the targets of Resource. Four options are provided to select target namespaces.
 */
@ApiModel(description = "ResourceDistributionTargets defines the targets of Resource. Four options are provided to select target namespaces.")

public class KruiseAppsV1alpha1ResourceDistributionTargets {
  @SerializedName("allNamespaces")
  private Boolean allNamespaces = null;

  @SerializedName("excludedNamespaces")
  private KruiseAppsV1alpha1ResourceDistributionTargetNamespaces excludedNamespaces = null;

  @SerializedName("includedNamespaces")
  private KruiseAppsV1alpha1ResourceDistributionTargetNamespaces includedNamespaces = null;

  @SerializedName("namespaceLabelSelector")
  private V1LabelSelector namespaceLabelSelector = null;

  public KruiseAppsV1alpha1ResourceDistributionTargets allNamespaces(Boolean allNamespaces) {
    this.allNamespaces = allNamespaces;
    return this;
  }

   /**
   * If AllNamespaces is true, Resource will be distributed to the all namespaces (except some forbidden namespaces, such as \&quot;kube-system\&quot; and \&quot;kube-public\&quot;).
   * @return allNamespaces
  **/
  @ApiModelProperty(value = "If AllNamespaces is true, Resource will be distributed to the all namespaces (except some forbidden namespaces, such as \"kube-system\" and \"kube-public\").")
  public Boolean isAllNamespaces() {
    return allNamespaces;
  }

  public void setAllNamespaces(Boolean allNamespaces) {
    this.allNamespaces = allNamespaces;
  }

  public KruiseAppsV1alpha1ResourceDistributionTargets excludedNamespaces(KruiseAppsV1alpha1ResourceDistributionTargetNamespaces excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
    return this;
  }

   /**
   * If ExcludedNamespaces is not empty, Resource will never be distributed to the listed namespaces. ExcludedNamespaces has the highest priority.
   * @return excludedNamespaces
  **/
  @ApiModelProperty(value = "If ExcludedNamespaces is not empty, Resource will never be distributed to the listed namespaces. ExcludedNamespaces has the highest priority.")
  public KruiseAppsV1alpha1ResourceDistributionTargetNamespaces getExcludedNamespaces() {
    return excludedNamespaces;
  }

  public void setExcludedNamespaces(KruiseAppsV1alpha1ResourceDistributionTargetNamespaces excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
  }

  public KruiseAppsV1alpha1ResourceDistributionTargets includedNamespaces(KruiseAppsV1alpha1ResourceDistributionTargetNamespaces includedNamespaces) {
    this.includedNamespaces = includedNamespaces;
    return this;
  }

   /**
   * If IncludedNamespaces is not empty, Resource will be distributed to the listed namespaces.
   * @return includedNamespaces
  **/
  @ApiModelProperty(value = "If IncludedNamespaces is not empty, Resource will be distributed to the listed namespaces.")
  public KruiseAppsV1alpha1ResourceDistributionTargetNamespaces getIncludedNamespaces() {
    return includedNamespaces;
  }

  public void setIncludedNamespaces(KruiseAppsV1alpha1ResourceDistributionTargetNamespaces includedNamespaces) {
    this.includedNamespaces = includedNamespaces;
  }

  public KruiseAppsV1alpha1ResourceDistributionTargets namespaceLabelSelector(V1LabelSelector namespaceLabelSelector) {
    this.namespaceLabelSelector = namespaceLabelSelector;
    return this;
  }

   /**
   * If NamespaceLabelSelector is not empty, Resource will be distributed to the matched namespaces.
   * @return namespaceLabelSelector
  **/
  @ApiModelProperty(value = "If NamespaceLabelSelector is not empty, Resource will be distributed to the matched namespaces.")
  public V1LabelSelector getNamespaceLabelSelector() {
    return namespaceLabelSelector;
  }

  public void setNamespaceLabelSelector(V1LabelSelector namespaceLabelSelector) {
    this.namespaceLabelSelector = namespaceLabelSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ResourceDistributionTargets kruiseAppsV1alpha1ResourceDistributionTargets = (KruiseAppsV1alpha1ResourceDistributionTargets) o;
    return Objects.equals(this.allNamespaces, kruiseAppsV1alpha1ResourceDistributionTargets.allNamespaces) &&
        Objects.equals(this.excludedNamespaces, kruiseAppsV1alpha1ResourceDistributionTargets.excludedNamespaces) &&
        Objects.equals(this.includedNamespaces, kruiseAppsV1alpha1ResourceDistributionTargets.includedNamespaces) &&
        Objects.equals(this.namespaceLabelSelector, kruiseAppsV1alpha1ResourceDistributionTargets.namespaceLabelSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allNamespaces, excludedNamespaces, includedNamespaces, namespaceLabelSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ResourceDistributionTargets {\n");
    
    sb.append("    allNamespaces: ").append(toIndentedString(allNamespaces)).append("\n");
    sb.append("    excludedNamespaces: ").append(toIndentedString(excludedNamespaces)).append("\n");
    sb.append("    includedNamespaces: ").append(toIndentedString(includedNamespaces)).append("\n");
    sb.append("    namespaceLabelSelector: ").append(toIndentedString(namespaceLabelSelector)).append("\n");
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

