// JAXB

package com.directv.hw.hadoop.oozie.bindings.distcp_action_0_1.binding

import java.util.{ArrayList, List}
import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlElement, XmlType}

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONFIGURATION", propOrder = Array("property"), namespace = "uri:oozie:distcp-action:0.1") object CONFIGURATION {


  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = Array("name", "value", "description"), namespace = "uri:oozie:distcp-action:0.1") class Property {
    @XmlElement(required = true) @BeanProperty var name: String = null
    @XmlElement(required = true) @BeanProperty var value: String = null
    @BeanProperty var description: String = null

  }

}

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONFIGURATION", propOrder = Array("property"), namespace = "uri:oozie:distcp-action:0.1") class CONFIGURATION {
  @XmlElement(required = true) @BeanProperty var property: List[CONFIGURATION.Property] = new ArrayList[CONFIGURATION.Property]

}
