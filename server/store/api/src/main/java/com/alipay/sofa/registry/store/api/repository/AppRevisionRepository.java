/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.registry.store.api.repository;

import com.alipay.sofa.registry.common.model.store.AppRevision;
import com.alipay.sofa.registry.store.api.driver.RegistryRepository;

/**
 *
 * @author xiaojian.xj
 * @version $Id: AppRevisionRepository.java, v 0.1 2021年01月17日 13:54 xiaojian.xj Exp $
 */
public interface AppRevisionRepository extends RegistryRepository {

    @Override
    default Class<?> getInterfaceClass() {
        return AppRevisionRepository.class;
    }

    /**
     * persistence appRevision
     * @param appRevision
     */
    public void register(AppRevision appRevision) throws Exception;

    /**
     * refresh
     */
    public void refresh(String dataCenter);

    /**
     * get AppRevision
     * @param dataCenter
     * @param revision
     * @return
     */
    public AppRevision queryRevision(String dataCenter, String revision);

    public AppRevision heartbeat(String dataCenter, String revision);
}