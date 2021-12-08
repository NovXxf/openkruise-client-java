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
import io.kubernetes.client.openapi.models.V1ContainerPort;
import io.kubernetes.client.openapi.models.V1Handler;
import io.openkruise.client.models.KruiseAppsV1alpha1ContainerRecreateRequestContainerContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ContainerRecreateRequestContainer defines the container that need to recreate.
 */
@ApiModel(description = "ContainerRecreateRequestContainer defines the container that need to recreate.")

public class KruiseAppsV1alpha1ContainerRecreateRequestContainer {
  @SerializedName("name")
  private String name = "";

  @SerializedName("ports")
  private List<V1ContainerPort> ports = null;

  @SerializedName("preStop")
  private V1Handler preStop = null;

  @SerializedName("statusContext")
  private KruiseAppsV1alpha1ContainerRecreateRequestContainerContext statusContext = null;

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the container that need to recreate. It must be existing in the real pod.Spec.Containers.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the container that need to recreate. It must be existing in the real pod.Spec.Containers.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer ports(List<V1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ContainerPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Ports is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only.
   * @return ports
  **/
  @ApiModelProperty(value = "Ports is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only.")
  public List<V1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer preStop(V1Handler preStop) {
    this.preStop = preStop;
    return this;
  }

   /**
   * PreStop is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only.
   * @return preStop
  **/
  @ApiModelProperty(value = "PreStop is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only.")
  public V1Handler getPreStop() {
    return preStop;
  }

  public void setPreStop(V1Handler preStop) {
    this.preStop = preStop;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer statusContext(KruiseAppsV1alpha1ContainerRecreateRequestContainerContext statusContext) {
    this.statusContext = statusContext;
    return this;
  }

   /**
   * StatusContext is synced from the real Pod status during this ContainerRecreateRequest creating. Populated by the system. Read-only.
   * @return statusContext
  **/
  @ApiModelProperty(value = "StatusContext is synced from the real Pod status during this ContainerRecreateRequest creating. Populated by the system. Read-only.")
  public KruiseAppsV1alpha1ContainerRecreateRequestContainerContext getStatusContext() {
    return statusContext;
  }

  public void setStatusContext(KruiseAppsV1alpha1ContainerRecreateRequestContainerContext statusContext) {
    this.statusContext = statusContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ContainerRecreateRequestContainer kruiseAppsV1alpha1ContainerRecreateRequestContainer = (KruiseAppsV1alpha1ContainerRecreateRequestContainer) o;
    return Objects.equals(this.name, kruiseAppsV1alpha1ContainerRecreateRequestContainer.name) &&
        Objects.equals(this.ports, kruiseAppsV1alpha1ContainerRecreateRequestContainer.ports) &&
        Objects.equals(this.preStop, kruiseAppsV1alpha1ContainerRecreateRequestContainer.preStop) &&
        Objects.equals(this.statusContext, kruiseAppsV1alpha1ContainerRecreateRequestContainer.statusContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ports, preStop, statusContext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ContainerRecreateRequestContainer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
    sb.append("    statusContext: ").append(toIndentedString(statusContext)).append("\n");
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

