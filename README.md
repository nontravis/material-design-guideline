# **「 MATERIAL DESIGN GUIDELINE 」**

![alt text](./picture/logo.png)


This library follow [Google Material guideline](https://material.io/) for Android Developers.

### TOPIC
* Install
* Default Color and Dimens
* Color resource names
* Icons
* Typography
* Metrics & keylines size
* Elevation


## 「 INSTALL 」

```
Comming soon...
```

> **NOTE**: this library use **md_** or **material_** prefix name

## 「 DEFAULT COLOR AND DIMENS 」

**Dimens**

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

**Base Color (for Dark theme)**

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

**Base Color (for Light theme)**

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

### COLOR

**Color (for Dark theme)**


|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|md_icon_color_active_dark|#ffffffff| 100% white |
|md_icon_color_inactive_dark|#4dffffff| 30% white |

**Color (for Light theme)**

|COLOR NAMES                    |VALUE  | PERCENT |
| ----------------------------- | :-----|:-------:|
|md_icon_color_active_light|#8a000000| 54% black|
|md_icon_color_inactive_light|#42000000| 26% black|


## [「 Typography 」](https://material.io/guidelines/style/typography.html#typography-typeface)

### SIZE

**English and English-like scripts**

  

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

ex. Chinese, Japanese, and Korean.


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

South and Southeast Asian and Middle Eastern languages, including Arabic, Hindi, and Thai.

  

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

### COLOR

**Text color (for Dark theme)**


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


**Text color (for Light theme)**


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

## [「 Metrics & keylines size 」](https://material.io/guidelines/layout/metrics-keylines.html)

 

|DIMEN NAMES                    |VALUE  |
| ----------------------------- | :----------:|
|md_status_bar_height|24dp|
|md_toolbar_height|56dp or 64dp (tablet)|
|md_sub_title_height|48dp|
|md_list_item_height|72dp|
|md_list_space|8dp|
|md_margin_content_start|72dp|
|md_margin_drawer_navigation|56dp|

## [「 Elevation 」](https://material.io/guidelines/material-design/elevation-shadows.html#elevation-shadows-elevation-android)

  

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


