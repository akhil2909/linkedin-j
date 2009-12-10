//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.10 at 07:27:01 PM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Activity;
import com.google.code.linkedinapi.schema.NetworkUpdateContentType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timestamp",
    "contentType",
    "body"
})
@XmlRootElement(name = "activity")
public class ActivityImpl
    implements Activity
{

    @XmlElement(required = true)
    protected BigInteger timestamp;
    @XmlElement(name = "content-type", required = true)
    protected NetworkUpdateContentType contentType;
    @XmlElement(required = true)
    protected String body;
    @XmlAttribute(required = true)
    protected String locale;

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger value) {
        this.timestamp = value;
    }

    public NetworkUpdateContentType getContentType() {
        return contentType;
    }

    public void setContentType(NetworkUpdateContentType value) {
        this.contentType = value;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String value) {
        this.body = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String value) {
        this.locale = value;
    }

}
