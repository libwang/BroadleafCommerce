/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.web.form.component;

import org.broadleafcommerce.openadmin.web.rulebuilder.dto.DataWrapper;

/**
 * @author Elbert Bautista (elbertbautista)
 */
public class RuleBuilder {

    protected String fieldName;
    protected String friendlyName;
    protected String fieldBuilder;
    protected DataWrapper dataWrapper;
    protected String json;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getFieldBuilder() {
        return fieldBuilder;
    }

    public void setFieldBuilder(String fieldBuilder) {
        this.fieldBuilder = fieldBuilder;
    }

    public DataWrapper getDataWrapper() {
        return dataWrapper;
    }

    public void setDataWrapper(DataWrapper dataWrapper) {
        this.dataWrapper = dataWrapper;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}