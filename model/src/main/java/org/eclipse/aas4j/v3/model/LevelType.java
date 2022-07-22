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

package org.eclipse.aas4j.v3.model;




import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;

/**
 * Enumeration of different level types within a DataSpecificationIEC61360. Contains Min, Max, Nom,
 * and Typ.
 */
@IRI("aas:LevelType")
public enum LevelType {

    /**
     * MAX according to IEC 61360 as an Identifier scheme for maximal levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LevelType/MAX")
    MAX,

    /**
     * MIN according to IEC 61360 as an Identifier scheme for minimal levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LevelType/MIN")
    MIN,

    /**
     * NOM according to IEC 61360 as an Identifier scheme for nominal levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LevelType/NOM")
    NOM,

    /**
     * TYP according to IEC 61360 as an Identifier scheme for typical levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LevelType/TYP")
    TYP;

}