// JAXB

package com.directv.hw.hadoop.oozie.bindings.workflow_0_4_5.binding

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAttribute, XmlType}

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "END", namespace = "uri:oozie:workflow:0.4.5") class END {
  @XmlAttribute(name = "name", required = true)
  @BeanProperty var name: String = null

}
