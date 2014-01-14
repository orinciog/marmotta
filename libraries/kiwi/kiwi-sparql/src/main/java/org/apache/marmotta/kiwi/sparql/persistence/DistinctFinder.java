/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.marmotta.kiwi.sparql.persistence;

import org.openrdf.query.algebra.Distinct;
import org.openrdf.query.algebra.Reduced;
import org.openrdf.query.algebra.TupleExpr;
import org.openrdf.query.algebra.helpers.QueryModelVisitorBase;

/**
* Find distinct/reduced in a tuple expression.
*
* @author Sebastian Schaffert (sschaffert@apache.org)
*/
class DistinctFinder extends QueryModelVisitorBase<RuntimeException> {

    boolean distinct = false;

    DistinctFinder(TupleExpr expr) {
        expr.visit(this);
    }

    @Override
    public void meet(Distinct node) throws RuntimeException {
        distinct = true;
    }

    @Override
    public void meet(Reduced node) throws RuntimeException {
        distinct = true;
    }
}
