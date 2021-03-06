package org.huamuzhen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "query", propOrder = {
		"attribute","value","operator"
})
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonAutoDetect(value=JsonMethod.NONE)
public class SingleQuery extends Query{
	
	@XmlElement
	@JsonProperty
	public String attribute;
	
	@XmlElement
	@JsonProperty
	public String value;
	
	@XmlElement
	@JsonProperty
	public Operator operator;

	
	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "SingleQuery [attribute=" + attribute + ", value=" + value
				+ ", operator=" + operator + "]";
	}

}
