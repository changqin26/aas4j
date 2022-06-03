/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.adminshell.aas.v3.rc02.model.impl;

import io.adminshell.aas.v3.rc02.model.EventPayload;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.annotations.IRI;
import io.adminshell.aas.v3.rc02.model.builder.EventPayloadBuilder;

import java.util.Objects;

/**
 * Default implementation of package EventPayload
 * 
 * Defines the necessary information of an event instance sent out or received.
 */

@IRI("aas:EventPayload")
public class DefaultEventPayload implements EventPayload {

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/observableReference")
    protected Reference observableReference;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/observableSemanticId")
    protected Reference observableSemanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/payload")
    protected String payload;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/source")
    protected Reference source;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/sourceSemanticId")
    protected Reference sourceSemanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/subjectId")
    protected Reference subjectId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/timeStamp")
    protected String timeStamp;

    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/topic")
    protected String topic;

    public DefaultEventPayload() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.source,
            this.sourceSemanticId,
            this.observableReference,
            this.observableSemanticId,
            this.topic,
            this.subjectId,
            this.timeStamp,
            this.payload);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultEventPayload other = (DefaultEventPayload) obj;
            return Objects.equals(this.source, other.source) &&
                Objects.equals(this.sourceSemanticId, other.sourceSemanticId) &&
                Objects.equals(this.observableReference, other.observableReference) &&
                Objects.equals(this.observableSemanticId, other.observableSemanticId) &&
                Objects.equals(this.topic, other.topic) &&
                Objects.equals(this.subjectId, other.subjectId) &&
                Objects.equals(this.timeStamp, other.timeStamp) &&
                Objects.equals(this.payload, other.payload);
        }
    }

    @Override
    public Reference getSource() {
        return source;
    }

    @Override
    public void setSource(Reference source) {
        this.source = source;
    }

    @Override
    public Reference getSourceSemanticId() {
        return sourceSemanticId;
    }

    @Override
    public void setSourceSemanticId(Reference sourceSemanticId) {
        this.sourceSemanticId = sourceSemanticId;
    }

    @Override
    public Reference getObservableReference() {
        return observableReference;
    }

    @Override
    public void setObservableReference(Reference observableReference) {
        this.observableReference = observableReference;
    }

    @Override
    public Reference getObservableSemanticId() {
        return observableSemanticId;
    }

    @Override
    public void setObservableSemanticId(Reference observableSemanticId) {
        this.observableSemanticId = observableSemanticId;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public Reference getSubjectId() {
        return subjectId;
    }

    @Override
    public void setSubjectId(Reference subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String getPayload() {
        return payload;
    }

    @Override
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * This builder class can be used to construct a DefaultEventPayload bean.
     */
    public static class Builder extends EventPayloadBuilder<DefaultEventPayload, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEventPayload newBuildingInstance() {
            return new DefaultEventPayload();
        }
    }
}
