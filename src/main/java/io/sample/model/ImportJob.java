package io.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.sample.model.JobStateType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a task used to import resources from a file
 */
@ApiModel(description = "Represents a task used to import resources from a file")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-28T13:08:23.907Z")


public class ImportJob   {
  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("completionDate")
  private OffsetDateTime completionDate = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("errorLog")
  private String errorLog = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("status")
  private JobStateType status = null;

  @JsonProperty("url")
  private String url = null;

  public ImportJob baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ImportJob schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ImportJob type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ImportJob completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date at which the job was completed
   * @return completionDate
  **/
  @ApiModelProperty(value = "Date at which the job was completed")

  @Valid

  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public ImportJob contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Indicates the format of the imported data
   * @return contentType
  **/
  @ApiModelProperty(value = "Indicates the format of the imported data")


  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ImportJob creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date at which the job was created
   * @return creationDate
  **/
  @ApiModelProperty(value = "Date at which the job was created")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ImportJob errorLog(String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

  /**
   * Reason for failure if status is failed
   * @return errorLog
  **/
  @ApiModelProperty(value = "Reason for failure if status is failed")


  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }

  public ImportJob href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the import job
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the import job")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ImportJob id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the import job
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the import job")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ImportJob path(String path) {
    this.path = path;
    return this;
  }

  /**
   * URL of the root resource where the content of the file specified by the import job must be applied
   * @return path
  **/
  @ApiModelProperty(value = "URL of the root resource where the content of the file specified by the import job must be applied")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ImportJob status(JobStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the import job (not started, running, succeeded, failed)
   * @return status
  **/
  @ApiModelProperty(value = "Status of the import job (not started, running, succeeded, failed)")

  @Valid

  public JobStateType getStatus() {
    return status;
  }

  public void setStatus(JobStateType status) {
    this.status = status;
  }

  public ImportJob url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the file containing the data to be imported
   * @return url
  **/
  @ApiModelProperty(value = "URL of the file containing the data to be imported")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJob importJob = (ImportJob) o;
    return Objects.equals(this.baseType, importJob.baseType) &&
        Objects.equals(this.schemaLocation, importJob.schemaLocation) &&
        Objects.equals(this.type, importJob.type) &&
        Objects.equals(this.completionDate, importJob.completionDate) &&
        Objects.equals(this.contentType, importJob.contentType) &&
        Objects.equals(this.creationDate, importJob.creationDate) &&
        Objects.equals(this.errorLog, importJob.errorLog) &&
        Objects.equals(this.href, importJob.href) &&
        Objects.equals(this.id, importJob.id) &&
        Objects.equals(this.path, importJob.path) &&
        Objects.equals(this.status, importJob.status) &&
        Objects.equals(this.url, importJob.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, completionDate, contentType, creationDate, errorLog, href, id, path, status, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJob {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

