/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.brownbear, R.string.bear_name_1, 14, R.string.bear_name_1),
    Dog(R.drawable.grizzlybear, R.string.bear_name_2, 16, R.string.bear_description_2),
    Dog(R.drawable.kodiakbear, R.string.bear_name_3, 28, R.string.bear_description_3),
    Dog(R.drawable.panda, R.string.bear_name_4, 17, R.string.bear_description_4),
    Dog(R.drawable.sunbear, R.string.bear_name_5, 18, R.string.bear_description_5),
    Dog(R.drawable.kermodebear, R.string.bear_name_6, 22, R.string.bear_description_6),
    Dog(R.drawable.tibetanbear, R.string.bear_name_7, 11, R.string.bear_description_7),
    Dog(R.drawable.slothbear, R.string.bear_name_8, 11, R.string.bear_description_8),
    Dog(R.drawable.polarbear, R.string.bear_name_9, 31, R.string.bear_description_9)
)
