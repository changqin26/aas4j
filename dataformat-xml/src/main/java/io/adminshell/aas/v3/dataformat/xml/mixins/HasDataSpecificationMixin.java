/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.dataformat.xml.mixins;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.adminshell.aas.v3.dataformat.xml.AasXmlNamespaceContext;
// TODO import io.adminshell.aas.v3.dataformat.xml.deserialization.EmbeddedDataSpecificationsDeserializer;
// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;

public interface HasDataSpecificationMixin {

    // TODO fix the EmbeddedDataSpecification issue
/*    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "embeddedDataSpecification")
    @JsonDeserialize(using = EmbeddedDataSpecificationsDeserializer.class)
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "embeddedDataSpecification")
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications);

 */
}
