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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RuntimeContainerHashes contains the hashes of such container.
 */
@ApiModel(description = "RuntimeContainerHashes contains the hashes of such container.")

public class KruiseAppsPubRuntimeContainerHashes {
  @SerializedName("extractedEnvFromMetadataHash")
  private Long extractedEnvFromMetadataHash = null;

  @SerializedName("plainHash")
  private Long plainHash = 0l;

  public KruiseAppsPubRuntimeContainerHashes extractedEnvFromMetadataHash(Long extractedEnvFromMetadataHash) {
    this.extractedEnvFromMetadataHash = extractedEnvFromMetadataHash;
    return this;
  }

   /**
   * ExtractedEnvFromMetadataHash is the hash that calculated from pod.spec.container[x], whose envs from annotations/labels have already been extracted to the real values.
   * @return extractedEnvFromMetadataHash
  **/
  @ApiModelProperty(value = "ExtractedEnvFromMetadataHash is the hash that calculated from pod.spec.container[x], whose envs from annotations/labels have already been extracted to the real values.")
  public Long getExtractedEnvFromMetadataHash() {
    return extractedEnvFromMetadataHash;
  }

  public void setExtractedEnvFromMetadataHash(Long extractedEnvFromMetadataHash) {
    this.extractedEnvFromMetadataHash = extractedEnvFromMetadataHash;
  }

  public KruiseAppsPubRuntimeContainerHashes plainHash(Long plainHash) {
    this.plainHash = plainHash;
    return this;
  }

   /**
   * PlainHash is the hash that directly calculated from pod.spec.container[x]. Usually it is calculated by Kubelet and will be in annotation of each runtime container.
   * @return plainHash
  **/
  @ApiModelProperty(required = true, value = "PlainHash is the hash that directly calculated from pod.spec.container[x]. Usually it is calculated by Kubelet and will be in annotation of each runtime container.")
  public Long getPlainHash() {
    return plainHash;
  }

  public void setPlainHash(Long plainHash) {
    this.plainHash = plainHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsPubRuntimeContainerHashes kruiseAppsPubRuntimeContainerHashes = (KruiseAppsPubRuntimeContainerHashes) o;
    return Objects.equals(this.extractedEnvFromMetadataHash, kruiseAppsPubRuntimeContainerHashes.extractedEnvFromMetadataHash) &&
        Objects.equals(this.plainHash, kruiseAppsPubRuntimeContainerHashes.plainHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extractedEnvFromMetadataHash, plainHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsPubRuntimeContainerHashes {\n");
    
    sb.append("    extractedEnvFromMetadataHash: ").append(toIndentedString(extractedEnvFromMetadataHash)).append("\n");
    sb.append("    plainHash: ").append(toIndentedString(plainHash)).append("\n");
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

