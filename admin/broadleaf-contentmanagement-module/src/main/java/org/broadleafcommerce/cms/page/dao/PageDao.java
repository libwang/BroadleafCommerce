/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.cms.page.dao;

import org.broadleafcommerce.cms.page.domain.Page;
import org.broadleafcommerce.cms.page.domain.PageTemplate;
import org.broadleafcommerce.common.locale.domain.Locale;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * Created by bpolster.
 */
public interface PageDao {

    public Page readPageById(Long id);

    public PageTemplate readPageTemplateById(Long id);
    
    /**
     * Saves the given {@link PageTemplate}
     * 
     * @param template the {@link PageTemplate} to save
     * @return the database-saved {@link PageTemplate}
     */
    public PageTemplate savePageTemplate(PageTemplate template);

    public Page updatePage(Page page);

    public void delete(Page page);

    public Page addPage(Page clonedPage);

    /**
     * Returns all pages, regardless of any sandbox they are apart of
     * @return all Pages configured in the system
     */
    public List<Page> readAllPages();
    
    /**
     * Retrieve a subset of all active Pages
     *
     * @param limit the maximum number of results
     * @param offset the starting point in the record set
     * @return
     */
    @Nonnull
    public List<Page> readAllActivePages(@Nonnull int limit, @Nonnull int offset);

    /**
     * Returns all page templates, regardless of any sandbox they are apart of
     * @return all {@link PageTemplate}s configured in the system
     */
    public List<PageTemplate> readAllPageTemplates();
    
    public List<Page> findPageByURI(Locale fullLocale, Locale languageOnlyLocale, String uri);

    public List<Page> findPageByURI(Locale locale, String uri);

    public void detachPage(Page page);
}
