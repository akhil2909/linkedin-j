//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.11 at 11:52:24 AM GMT+05:00 
//


package com.google.code.linkedinapi.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}school-name"/>
 *         &lt;element ref="{}degree"/>
 *         &lt;element ref="{}start-date"/>
 *         &lt;element ref="{}end-date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Education {


    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSchoolName();

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSchoolName(String value);

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDegree();

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDegree(String value);

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    StartDate getStartDate();

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    void setStartDate(StartDate value);

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    Year getEndDate();

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    void setEndDate(Year value);

}
