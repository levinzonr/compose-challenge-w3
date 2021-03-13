/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R


val latoFonts = FontFamily(
    listOf(
        Font(R.font.lato_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.bold, FontWeight.Bold, FontStyle.Normal),
    )
)

val kulim = FontFamily(
    listOf(
        Font(R.font.light, FontWeight.Light, FontStyle.Normal),
        Font(R.font.regular, FontWeight.Normal, FontStyle.Normal),
    )
)


private val defaultTypography = Typography()
val appTypography = Typography(
    h1 = defaultTypography.h1.copy(
        fontFamily = kulim,
        fontSize = 28.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = 1.15.sp
    ),
    h2 = defaultTypography.h2.copy(
        fontFamily = kulim,
        fontSize = 15.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.15.sp
    ),
    h3 = defaultTypography.h3.copy(
        fontFamily = latoFonts,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    ),
    h4 = defaultTypography.h4,
    h5 = defaultTypography.h5,
    h6 = defaultTypography.h6,
    subtitle1 = defaultTypography.subtitle1,
    subtitle2 = defaultTypography.subtitle2,
    body1 = defaultTypography.body1.copy(
        fontFamily = latoFonts,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    body2 = defaultTypography.body2,
    button = defaultTypography.button.copy(
        fontFamily = latoFonts,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.15.sp
    ),
    caption = defaultTypography.caption.copy(
        fontFamily = kulim,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.15.sp
    ),
    overline = defaultTypography.overline
)
