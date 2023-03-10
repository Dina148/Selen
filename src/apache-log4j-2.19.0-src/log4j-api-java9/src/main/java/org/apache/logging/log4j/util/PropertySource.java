/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.util;

import java.lang.invoke.MethodHandles;
import java.util.stream.Stream;

/**
 * This is a dummy class and is only here to allow module-info.java to compile. It will not
 * be copied into the log4j-api module.
 */
public interface PropertySource {

    /**
     * This method's only purpose is to test {@link ServiceLoaderUtil} from inside the module.
     */
    public static Stream<PropertySource> loadPropertySources() {
        return ServiceLoaderUtil.loadServices(PropertySource.class, MethodHandles.lookup());
    }
}
