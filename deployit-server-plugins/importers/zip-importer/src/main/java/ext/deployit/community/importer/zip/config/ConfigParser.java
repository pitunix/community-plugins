/*
 * @(#)ConfigParser.java     22 Jul 2011
 *
 * Copyright © 2010 Andrew Phillips.
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package ext.deployit.community.importer.zip.config;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.Boolean.parseBoolean;

import java.util.Map;

import javax.annotation.Nonnull;

public class ConfigParser {
    private static final String SCAN_SUBDIRECTORIES_PROPERTY = "scanSubdirectories";
    private static final String DEFAULT_APP_VERSION_PROPERTY = "defaultAppVersion";

    public final boolean subdirectoryScanningEnabled;
    public final String defaultAppVersion;
    
    public ConfigParser(@Nonnull Map<String, String> config) {
        subdirectoryScanningEnabled = parseBoolean(config.get(SCAN_SUBDIRECTORIES_PROPERTY));
        defaultAppVersion = checkNotNull(config.get(DEFAULT_APP_VERSION_PROPERTY), DEFAULT_APP_VERSION_PROPERTY);
    }
}