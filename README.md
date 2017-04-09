# **「 MATERIAL DESIGN GUIDELINE 」**

![alt text](./picture/logo.png)


This library follows [Google Material guideline](https://material.io/) for Android Developers.


It's layout principle library include important XML Resource that help Android developer easy to put layout in
your new project or project want to follows material design principle.


### TOPIC
* Demo app
* Install
* Default Color and Dimens
* Color resource names
* Icons
* Typography
* Text XML Style
* Metrics & keylines size
* Elevation
* Elevation Anim

## 「 DEMO APPLICATION 」

<a href="https://play.google.com/store/apps/details?id=th.co.thekhaeng.materialstyletemplate" target="_blank">
<img src="https://storage.googleapis.com/support-kms-prod/D90D94331E54D2005CC8CEE352FF98ECF639" height="60" width="200">
</a>


## 「 INSTALL 」

Maven
```
<dependency>
  <groupId>com.github.thekhaeng</groupId>
  <artifactId>material-design-guideline</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

Gradle
```
compile ('com.github.thekhaeng:material-design-guideline:1.0.0') {
    exclude group: 'com.android.support', module: 'support-annotations'
}
```

> **NOTE**: this library use **md_** or **material_** prefix name

## 「 DEFAULT COLOR AND DIMENS 」

Help you to add **margin** or **padding** or **size** to your XML faster. You can override it if you want to custom.

> **NOTE:** base on material design principle **+4dp** **+8dp** **+16dp** or **+24dp**

### Dimens

|DIMEN NAMES                    |VALUE  |
| ----------------------------- | -----:|
|**Padding and Margin** |
|default_dialog_round_corner_large | 8dp
|default_dialog_round_corner        | 4dp
|default_dialog_round_corner_small  | 2dp
|default_padding_margin_extra_small | 2dp
|default_padding_margin_small       | 4dp
|default_padding_margin             | 8dp
|default_padding_margin_large       | 16dp
|default_padding_margin_extra_large | 24dp
|default_padding_margin_extra_extra_large | 48dp
|**Icon size** |
|default_icon_size_extra_small      | 12dp
|default_icon_size_small            | 16dp
|default_icon_size                  | 24dp
|default_icon_size_large            | 36dp
|default_icon_size_extra_large      | 48dp
|default_icon_size_extra_extra_large | 56dp
|**Stroke size** |
|default_stroke                     | 2dp
|default_stroke_small               | 1dp
|**Divider size** |
|default_divider_size               | 1dp

### Base Color (for Dark theme)

Recommend you don't use it directly.

**ex**
```
<color name="your_background_overlay">@color/default_color_black_alpha_50</color>
```

|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|default_color_white_alpha_10|#ffffffff| 10% white |
|default_color_white_alpha_20|#33ffffff| 20% white |
|default_color_white_alpha_30|#4Dffffff| 30% white |
|default_color_white_alpha_40|#66ffffff| 40% white |
|default_color_white_alpha_50|#80ffffff| 50% white |
|default_color_white_alpha_60|#99ffffff| 60% white |
|default_color_white_alpha_70|#B3ffffff| 70% white |
|default_color_white_alpha_80|#CCffffff| 80% white |
|default_color_white_alpha_90|#E6ffffff| 90% white |

### Base Color (for Light theme)

|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|default_color_black_alpha_10|#ffffffff| 10% black |
|default_color_black_alpha_20|#33ffffff| 20% black |
|default_color_black_alpha_30|#4Dffffff| 30% black |
|default_color_black_alpha_40|#66ffffff| 40% black |
|default_color_black_alpha_50|#80ffffff| 50% black |
|default_color_black_alpha_60|#99ffffff| 60% black |
|default_color_black_alpha_70|#B3ffffff| 70% black |
|default_color_black_alpha_80|#CCffffff| 80% black |
|default_color_black_alpha_90|#E6ffffff| 90% black |

## [「 COLOR RESOURCE NAMES 」](https://material.io/guidelines/style/color.html#color-color-palette)

You can use both **XML** or **Java class**.

 XML: ``` R.id.md_red400 ```

 Java class: ``` MaterialColor.RED400 ```


* Red
* Pink
* Purple
* Deep purple
* Indigo
* Blue
* Lightblue
* Cyan
* Teal
* Green
* Light green
* Lime
* Yellow
* Amber
* Orange
* Deep orange
* Brown
* Grey
* Blue grey
* Black and white


## [「 ICONS 」](https://material.io/guidelines/style/icons.html)

### Size

|DIMEN NAMES                    |VALUE  |
| ----------------------------- | -----:|
|md_icon_touch_size | 48dp
|md_icon_size | 24dp
|md_avatar_size | 40dp
|md_button_height | 36dp

### COLOR (for Dark theme)

|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|md_icon_color_active_dark|#ffffffff| 100% white |
|md_icon_color_inactive_dark|#4dffffff| 30% white |

### COLOR (for Light theme)

|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|md_icon_color_active_light|#8a000000| 54% black|
|md_icon_color_inactive_light|#42000000| 26% black|


### ALPHA (for Dark theme)

|DIMEN NAMES                    |FLOAT  |
| ----------------------------- | :-----|
|md_alpha_icon_active_dark|1.0|
|md_alpha_icon_inactive_dark|0.30|

### ALPHA (for Light theme)

|DIMEN NAMES                    |FLOAT  |
| ----------------------------- | :-----|
|md_alpha_icon_active_light|0.54|
|md_alpha_icon_inactive_light|0.26|



## [「 Typography 」](https://material.io/guidelines/style/typography.html#typography-typeface)

<img src="https://storage.googleapis.com/material-design/publish/material_v_11/assets/0Bzhp5Z4wHba3N3d4REJ0enZqd2M/style_typography_style1.png" height="746" width="1000">

### SIZE

**English and English-like scripts (default)**


|DIMEN NAMES                    | TEXT STYLE  |VALUE  |
| ----------------------------- | :----------:| -----:|
|md_text_size_display_4_light   | light       | 112sp |
|md_text_size_display_3_regular | **regular**     | 56sp  |
|md_text_size_display_2_regular | **regular**     | 45sp  |
|md_text_size_display_1_regular | **regular**     | 34sp  |
|md_text_headline_regular       | **regular**     | 24sp  |
|md_text_title_medium           | *medium*      | 20sp  |
|md_text_subheading_regular     | **regular**     | 16sp  |
|md_text_body_regular           | **regular**     | 14sp  |
|md_text_body_medium            | *medium*      | 14sp  |
|md_text_caption_regular        | **regular**     | 12sp  |
|md_text_button_medium          | *medium*      | 14sp  |


**Dense scripts**

ex. 中国 (chinese), 日本の (japan), and 한국의 (korean).

use [Noto CJK Font](https://www.google.com/get/noto/help/cjk/)


|DIMEN NAMES                          | TEXT STYLE  |VALUE  |
| ----------------------------------- | :----------:| -----:|
|md_dense_text_size_display_4_light   | light       | 112sp |
|md_dense_text_size_display_3_regular | **regular**     | 56sp  |
|md_dense_text_size_display_2_regular | **regular**     | 45sp  |
|md_dense_text_size_display_1_regular | **regular**     | 34sp  |
|md_dense_text_headline_regular       | **regular**     | 24sp  |
|md_dense_text_title_medium           | *medium*      | 21sp  |
|md_dense_text_subheading_regular     | **regular**     | 17sp  |
|md_dense_text_body_regular           | **regular**     | 15sp  |
|md_dense_text_body_medium            | *medium*      | 15sp  |
|md_dense_text_caption_regular        | **regular**     | 13sp  |
|md_dense_text_button_medium          | *medium*      | 15sp  |

**Tall scripts**

South and Southeast Asian and Middle Eastern languages,

including اللغة العربية (arabic), हिन्दी (hindi), and ภาษาไทย (thai).

use [Noto Font](https://www.google.com/get/noto/)

|DIMEN NAMES                    | TEXT STYLE  |VALUE  |
| ----------------------------- | :----------:| -----:|
|md_tall_text_size_display_4_regular   | **regular**       | 112sp |
|md_tall_text_size_display_3_regular | **regular**     | 56sp  |
|md_tall_text_size_display_2_regular | **regular**     | 45sp  |
|md_tall_text_size_display_1_regular | **regular**     | 34sp  |
|md_tall_text_headline_regular       | **regular**     | 24sp  |
|md_tall_text_title_bold           | **BOLD**      | 21sp  |
|md_tall_text_subheading_regular     | **regular**     | 17sp  |
|md_text_body_regular           | **regular**     | 15sp  |
|md_tall_text_body_bold            | **BOLD**      | 15sp  |
|md_tall_text_body_regular        | **regular**     | 13sp  |
|md_tall_text_button_bold          | **BOLD**      | 15sp  |

### COLOR (for Dark theme)


|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|md_text_color_primary_dark|#ffffffff|100% white|
|md_text_color_secondary_dark|#b3ffffff| 70% white|
|md_text_color_disabled_dark|#80ffffff|50% white |
|md_text_color_divider_dark|#1fffffff| 12% white |
|md_text_color_display_4_dark|secondary|
|md_text_color_display_2_dark|secondary|
|md_text_color_display_3_dark|secondary|
|md_text_color_display_1_dark|secondary|
|md_text_color_headline_dark|**primary**|
|md_text_color_title_dark|**primary**|
|md_text_color_subheading_dark|**primary**|
|md_text_color_body_2_dark|**primary**|
|md_text_color_body_1_dark|**primary**|
|md_text_color_caption_dark|secondary|
|md_text_color_menu_dark|**primary**|
|md_text_color_button_dark|**primary**|


### COLOR (for Light theme)

|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|md_text_color_primary_light|#de000000|87% black|
|md_text_color_secondary_light|#8a000000|54% black|
|md_text_color_disabled_light|#61000000|38% black|
|md_text_color_divider_light|#1f000000|12% black|
|md_text_color_display_4_light| secondary|
|md_text_color_display_2_light| secondary|
|md_text_color_display_3_light| secondary|
|md_text_color_display_1_light| secondary|
|md_text_color_headline_light| **primary**|
|md_text_color_title_light| **primary**|
|md_text_color_subheading_light| **primary**|
|md_text_color_body_2_light| **primary**|
|md_text_color_body_1_light| **primary**|
|md_text_color_caption_light| secondary|
|md_text_color_menu_light| **primary**|
|md_text_color_button_light| **primary**|



### ALPHA (for Dark theme)
|DIMEN NAMES                    |FLOAT  |
| ----------------------------- | :-----|
|md_alpha_text_primary_dark|1.0|
|md_alpha_text_secondary_dark|0.70|
|md_alpha_text_disable_dark|0.50|
|md_alpha_divider_dark|0.12|



### ALPHA (for Light theme)
|DIMEN NAMES                    |FLOAT  |
| ----------------------------- | :-----|
|md_alpha_text_primary_light|0.87|
|md_alpha_text_secondary_light|0.54|
|md_alpha_text_disable_light|0.38|
|md_alpha_divider_light|0.12|


## Text XML Style

**Usage example**

```
<TextView
    ...
    style="@style/MaterialTextView.LightTheme.Subheading.Regular"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Regular 16sp"
    ... />
```

### Style XML
```
    MaterialTextView.LightTheme.Display4.Light
    MaterialTextView.LightTheme.Display3.Regular
    MaterialTextView.LightTheme.Display2.Regular
    MaterialTextView.LightTheme.Display1.Regular
    MaterialTextView.LightTheme.Headline.Regular
    MaterialTextView.LightTheme.Title.Medium
    MaterialTextView.LightTheme.Subheading.Regular
    MaterialTextView.LightTheme.Body.Regular
    MaterialTextView.LightTheme.Body.Medium
    MaterialTextView.LightTheme.Caption.Regular
    MaterialTextView.LightTheme.Button.Medium

    MaterialTextView.DarkTheme.Display4.Light
    MaterialTextView.DarkTheme.Display3.Regular
    MaterialTextView.DarkTheme.Display2.Regular
    MaterialTextView.DarkTheme.Display1.Regular
    MaterialTextView.DarkTheme.Headline.Regular
    MaterialTextView.DarkTheme.Title.Medium
    MaterialTextView.DarkTheme.Subheading.Regular
    MaterialTextView.DarkTheme.Body.Regular
    MaterialTextView.DarkTheme.Body.Medium
    MaterialTextView.DarkTheme.Caption.Regular
    MaterialTextView.DarkTheme.Button.Medium
```

**NOTE:** if you use **Dense** or **Tall scripts** font you must own custom it.


## [「 Metrics & keylines size 」](https://material.io/guidelines/layout/metrics-keylines.html)

 
|DIMEN NAMES                    |VALUE  |
| ----------------------------- | :----------:|
|md_status_bar_height|24dp|
|md_toolbar_height|56dp or 64dp (tablet)|
|md_sub_title_height|48dp|
|md_list_item_height|72dp|
|md_list_space|8dp|
|md_margin_content|16dp|
|md_margin_content_from_screen_edge|72dp|
|md_margin_drawer_navigation|56dp|

## [「 Elevation 」](https://material.io/guidelines/material-design/elevation-shadows.html#elevation-shadows-elevation-android)

<img src="https://storage.googleapis.com/material-design/publish/material_v_11/assets/0Bzhp5Z4wHba3VG9SaVpNbkpHb2s/whatismaterial_3d_elevation2.png" height="413" width="1000">

|DIMEN NAMES                    | ELEVATION |
| ----------------------------- | :----------:|
|md_elevation_dialog|24dp|
|md_elevation_picker|24dp|
|md_elevation_navigation_drawer|16dp|
|md_elevation_right_drawer|16dp|
|md_elevation_bottom_sheet|16dp|
|md_elevation_fab_pressed|12dp|
|md_elevation_submenu_4|12dp|
|md_elevation_submenu_3|11dp|
|md_elevation_submenu_2|10dp|
|md_elevation_submenu_1|9dp|
|md_elevation_menu|8dp|
|md_elevation_button_pressed|8dp|
|md_elevation_card_pressed|8dp|
|md_elevation_fab|6dp|
|md_elevation_snackbar|6dp|
|md_elevation_toolbar|4dp|
|md_elevation_refresh_indicator|3dp|
|md_elevation_quick_entry_scrolled|3dp|
|md_elevation_search_bar_scrolled|3dp|
|md_elevation_card|2dp|
|md_elevation_button|2dp|
|md_elevation_quick_entry|2dp|
|md_elevation_search_bar|2dp|
|md_elevation_switch|1dp|


## [「 Elevation Anim 」](https://material.io/guidelines/material-design/elevation-shadows.html#elevation-shadows-elevation-android)

**NOTE:** This animation support API 21+

**Usage example**

```
<View
    ...
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:clickable="true"
    android:stateListAnimator="@drawable/md_selector_anim_cardview_elevation"
    ... />
```


**Drawable names**

```
R.drawable.md_selector_anim_button_elevation
R.drawable.md_selector_anim_cardview_elevation
```

<img src="https://storage.googleapis.com/material-design/publish/material_v_11/assets/0B-Ef4kCjUzkPSy1NQUtNdW5idXc/whatismaterial_3d_elevation_component02.png" height="277" width="1000">



### Special thank
https://github.com/mcginty/material-colors

# Licence

Copyright 2017 TheKhaeng

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.


### Developed By

![alt text](./picture/thekhaeng_logo.png)

Follow [facebook.com/thekhaeng.io](https://www.facebook.com/thekhaeng.io) on Facebook page.
or [@nonthawit](https://medium.com/@nonthawit) at my Medium blog. :)

For contact, shoot me an email at nonthawit.thekhaeng@gmail.com


