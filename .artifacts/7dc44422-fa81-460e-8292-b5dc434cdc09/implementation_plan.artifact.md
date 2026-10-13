# Implementation Plan - 30 Days of Wellness App

Build the "30 Days of Wellness" app as specified in the Unit 3 Pathway Project. The app displays 30 days of wellness tips in a scrollable vertical list (`LazyColumn`), following Material Design 3 guidelines with a green wellness color theme, custom typography, clean card layouts, day indicators, images, and descriptions.

## User Review Required

> [!NOTE]
> The app will feature 30 unique wellness tips (one for each day of the month), complete with day badges, titles, descriptions, and image representations using Material 3 styling and a soothing green wellness color theme.

## Proposed Changes

### Data and Model
#### [NEW] [WellnessTip.kt](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/java/com/example/lab6/model/WellnessTip.kt)
- Define data class `WellnessTip` containing `day: Int`, `titleRes: Int` (or String), `descriptionRes: Int`, and `imageRes: Int`.

#### [NEW] [WellnessRepository.kt](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/java/com/example/lab6/model/WellnessRepository.kt)
- Provide a data source with 30 distinct wellness tips and associated string resources / images.

### Resources & Theming
#### [MODIFY] [strings.xml](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/res/values/strings.xml)
- Add app name ("30 Days of Wellness") and title/description string resources for all 30 days.

#### [MODIFY] [Color.kt](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/java/com/example/lab6/ui/theme/Color.kt)
- Define green wellness color palette for light and dark themes (Primary green, surface, background, etc.).

#### [MODIFY] [Theme.kt](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/java/com/example/lab6/ui/theme/Theme.kt)
- Apply the wellness color scheme to `Lab6Theme`.

### UI Components & Screen
#### [NEW] [WellnessScreen.kt](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/java/com/example/lab6/ui/WellnessScreen.kt)
- Implement `TopAppBar` with title "30 Days of Wellness".
- Implement `LazyColumn` for scrolling through 30 days.
- Implement `WellnessCard` composable for each tip featuring day number badge, title/summary, image, and detailed description text.

#### [MODIFY] [MainActivity.kt](file:///C:/Users/yakin/AndroidStudioProjects/lab6/app/src/main/java/com/example/lab6/MainActivity.kt)
- Update `MainActivity` to host `WellnessScreen` inside `Lab6Theme`.

## Verification Plan

### Automated Tests
- Build project using `gradle_build` to ensure compilation with no errors.

### Manual Verification
- Deploy to emulator / device or review compose preview to check UI rendering, scrolling through 30 cards, day indicators, images, and green wellness theme in both light and dark modes.
