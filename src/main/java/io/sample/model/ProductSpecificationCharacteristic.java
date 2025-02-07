package io.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.sample.model.ProductSpecificationCharacteristicRelationship;
import io.sample.model.ProductSpecificationCharacteristicValue;
import io.sample.model.TimePeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
 */
@ApiModel(description = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-28T13:08:23.907Z")


public class ProductSpecificationCharacteristic   {
  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("configurable")
  private Boolean configurable = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("extensible")
  private Boolean extensible = null;

  @JsonProperty("isUnique")
  private Boolean isUnique = null;

  @JsonProperty("maxCardinality")
  private Integer maxCardinality = null;

  @JsonProperty("minCardinality")
  private Integer minCardinality = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("productSpecCharRelationship")
  @Valid
  private List<ProductSpecificationCharacteristicRelationship> productSpecCharRelationship = null;

  @JsonProperty("productSpecCharacteristicValue")
  @Valid
  private List<ProductSpecificationCharacteristicValue> productSpecCharacteristicValue = null;

  @JsonProperty("regex")
  private String regex = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("valueType")
  private String valueType = null;

  public ProductSpecificationCharacteristic baseType(String baseType) {
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

  public ProductSpecificationCharacteristic schemaLocation(String schemaLocation) {
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

  public ProductSpecificationCharacteristic type(String type) {
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

  public ProductSpecificationCharacteristic configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  /**
   * If true, the Boolean indicates that the ProductSpecificationCharacteristic is configurable
   * @return configurable
  **/
  @ApiModelProperty(value = "If true, the Boolean indicates that the ProductSpecificationCharacteristic is configurable")


  public Boolean isConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  public ProductSpecificationCharacteristic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail what the ProductSpecificationCharacteristic is
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains in detail what the ProductSpecificationCharacteristic is")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSpecificationCharacteristic extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a product
   * @return extensible
  **/
  @ApiModelProperty(value = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a product")


  public Boolean isExtensible() {
    return extensible;
  }

  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  public ProductSpecificationCharacteristic isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"
   * @return isUnique
  **/
  @ApiModelProperty(value = "An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"")


  public Boolean isIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public ProductSpecificationCharacteristic maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality
   * @return maxCardinality
  **/
  @ApiModelProperty(value = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality")


  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public ProductSpecificationCharacteristic minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality
   * @return minCardinality
  **/
  @ApiModelProperty(value = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality")


  public Integer getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  public ProductSpecificationCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the ProductSpecificationCharacteristic
   * @return name
  **/
  @ApiModelProperty(value = "Name of the ProductSpecificationCharacteristic")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationCharacteristic productSpecCharRelationship(List<ProductSpecificationCharacteristicRelationship> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
    return this;
  }

  public ProductSpecificationCharacteristic addProductSpecCharRelationshipItem(ProductSpecificationCharacteristicRelationship productSpecCharRelationshipItem) {
    if (this.productSpecCharRelationship == null) {
      this.productSpecCharRelationship = new ArrayList<ProductSpecificationCharacteristicRelationship>();
    }
    this.productSpecCharRelationship.add(productSpecCharRelationshipItem);
    return this;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   * @return productSpecCharRelationship
  **/
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.")

  @Valid

  public List<ProductSpecificationCharacteristicRelationship> getProductSpecCharRelationship() {
    return productSpecCharRelationship;
  }

  public void setProductSpecCharRelationship(List<ProductSpecificationCharacteristicRelationship> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
  }

  public ProductSpecificationCharacteristic productSpecCharacteristicValue(List<ProductSpecificationCharacteristicValue> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
    return this;
  }

  public ProductSpecificationCharacteristic addProductSpecCharacteristicValueItem(ProductSpecificationCharacteristicValue productSpecCharacteristicValueItem) {
    if (this.productSpecCharacteristicValue == null) {
      this.productSpecCharacteristicValue = new ArrayList<ProductSpecificationCharacteristicValue>();
    }
    this.productSpecCharacteristicValue.add(productSpecCharacteristicValueItem);
    return this;
  }

  /**
   * A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.
   * @return productSpecCharacteristicValue
  **/
  @ApiModelProperty(value = "A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.")

  @Valid

  public List<ProductSpecificationCharacteristicValue> getProductSpecCharacteristicValue() {
    return productSpecCharacteristicValue;
  }

  public void setProductSpecCharacteristicValue(List<ProductSpecificationCharacteristicValue> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
  }

  public ProductSpecificationCharacteristic regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value
   * @return regex
  **/
  @ApiModelProperty(value = "A rule or principle represented in regular expression used to derive the value of a characteristic value")


  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public ProductSpecificationCharacteristic validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the ProductSpecificationCharacteristic is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which the ProductSpecificationCharacteristic is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductSpecificationCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   * @return valueType
  **/
  @ApiModelProperty(value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationCharacteristic productSpecificationCharacteristic = (ProductSpecificationCharacteristic) o;
    return Objects.equals(this.baseType, productSpecificationCharacteristic.baseType) &&
        Objects.equals(this.schemaLocation, productSpecificationCharacteristic.schemaLocation) &&
        Objects.equals(this.type, productSpecificationCharacteristic.type) &&
        Objects.equals(this.configurable, productSpecificationCharacteristic.configurable) &&
        Objects.equals(this.description, productSpecificationCharacteristic.description) &&
        Objects.equals(this.extensible, productSpecificationCharacteristic.extensible) &&
        Objects.equals(this.isUnique, productSpecificationCharacteristic.isUnique) &&
        Objects.equals(this.maxCardinality, productSpecificationCharacteristic.maxCardinality) &&
        Objects.equals(this.minCardinality, productSpecificationCharacteristic.minCardinality) &&
        Objects.equals(this.name, productSpecificationCharacteristic.name) &&
        Objects.equals(this.productSpecCharRelationship, productSpecificationCharacteristic.productSpecCharRelationship) &&
        Objects.equals(this.productSpecCharacteristicValue, productSpecificationCharacteristic.productSpecCharacteristicValue) &&
        Objects.equals(this.regex, productSpecificationCharacteristic.regex) &&
        Objects.equals(this.validFor, productSpecificationCharacteristic.validFor) &&
        Objects.equals(this.valueType, productSpecificationCharacteristic.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, productSpecCharRelationship, productSpecCharacteristicValue, regex, validFor, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristic {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productSpecCharRelationship: ").append(toIndentedString(productSpecCharRelationship)).append("\n");
    sb.append("    productSpecCharacteristicValue: ").append(toIndentedString(productSpecCharacteristicValue)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

