/*
 * Copyright 2017 - 2019 Hotspring Ventures Ltd.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.treatwell.immutables.styles.features;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class SerializableByJackson implements StyleFeature {

    @Override
    public String getHumanReadableFeatureName() {
        return "All generated instances are serializable by Jackson";
    }

    @Override
    public void assertFeature(Class<?> style, Class<?> annotated, Class<?> generated) {
        assertThat(style.getAnnotation(JsonSerialize.class)).withFailMessage(
                "Styles that guarantee serializability by Jackson must be annotated with @JsonSerialize!"
        ).isNotNull();
    }

}
