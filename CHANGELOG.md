<!-- Keep a Changelog guide -> https://keepachangelog.com -->
## [Unreleased]
### Added

### Changed

### Deprecated

### Removed

### Fixed

### Security

## [1.0.4-idea22]
### Changed
- Reduce plugin size and bump dependencies

## [1.0.3-idea22]
### Added
- Support 2022.2.1

### Fixed
- `LD-API-Version: 20210729` header added to all requests to LaunchDarkly. This fixes LaunchDarkly API issues.

## [1.0.2-idea22]
### Changed
- Minor UI Changes

### Fixed
- Fix for hover edge case

## [1.0.1-idea22]
### Added
- Support 2022.1

## [1.0.0-idea21]
### Fixed
- Erroneous hover information over flag keys

## [0.5.1-idea22]
### Fixed
- Invalid layout function in plugin settings

## [0.5.0-idea22]
### Added
- Quick links panel

### Changed
- Merged non-project settings into one Advanced section

### Removed
- Project override settings

### Fixed
- Code completion for flag keys

## [0.4.0-idea22]
### Fixed
- Top info node showing project/environment info errored when opening in browser.
- Better error handling for API failures
- Fixed rotated icon in dark theme mode

### Changed
- Right-click context item `Toggle Flag` is now more limited on which nodes it is attached to.

### Added
- Update Preferences to have a `Get Projects` button to fetch projects after adding API Key.

## [0.3.8]
### Changed
- Project override no longer supports a separate API key
- Update build compatibility
- Wrap get flags API call in try/catch

### Fixed
- NPE error when switching environments and trying to open in browser

## [0.3.4]

## [0.3.3]
### Fixed
- Verify feature store setup is always on background thread.

## [0.3.2]
### Fixed
- Revert Notifications Class until 2021.2
- Fix check for coderefs config file

## [0.3.2] - 2021-02-28

### Fixed

### Fixed

## [0.3.1]
### Fixed
- Using only Project Overrides Configuration would throw an error
- Use InvokeLater for any threads affecting the UI
- Check for coderefs.yaml to exist before scheduling to run

### Fixed

### Added
- Support for 2021 EAP

## [0.3.1] - 2021-02-25

### Added

## [0.3.0]
### Fixed
- When selecting a project in Project Override settings it would revert to first in list
- Hover throwing NPE if flags were not loaded

### Fixed

### Changed
- Load flags for flag panel in background thread
- Do not show SVG on hover until YouTrack issue is fixed

### Changed

### Added
- Code References will be downloaded and run based setting interval

## [0.3.0] - 2021-02-23

### Added

## [0.2.0]
### Fixed
- Debug logging that was left in the code

### Fixed

### Added
- Code References will be downloaded and run based setting interval

## [0.2.0] - 2021-01-06

### Added

## [0.1.12]
### Fixed
- Handle stream connections in separate thread

### Fixed

### Fixed

### Changed
- DocumentationProvider should work for all languages now, not just JVM

## [0.1.12] - 2020-12-29

### Changed

### Changed

## [0.1.11-alpha]
### Fixed
- Handling stream connection not being available

### Fixed

### Changed
- Icons for Toggle State have been updated
- DocumentationProvider should work for all languages now, not just JVM

## [0.1.11-alpha] - 2020-12-17

### Changed

## [0.1.10-alpha]
### Removed
- External Documentation override

### Removed

### Added
- External link inside of DocumentationHover

## [0.1.10-alpha] - 2020-12-14

### Added

## [0.1.9-alpha]
### Removed
- Defaults from treeview

### Removed

### Added
- External link for hovers
- Show default rule rollout percentage on hover

### Added

### Changed
- Hover layout

## [0.1.9-alpha] - 2020-12-09

### Changed

## [0.1.8-alpha]
### Changed
- Minor updates to Java Documentation Hover Provider
- Searching treeview will include matches on flag key

## [0.1.8-alpha] - 2020-12-04

### Changed

## [0.1.7-alpha]
### Changed
- Enable build range for 2020.3 EAP

## [0.1.7-alpha] - 2020-10-14

### Changed

## [0.1.6-alpha] - 2020-10-07
### Fixed
- Use application level setting for baseUri if none present for project
- Add Invoke later for tree build

### Added
- Ability to toggle Fallthrough variation and Off variation

## [0.1.5-alpha] - 2020-10-07
### Fixed
- Changelog
- Make Java Dependencies Optional
- Remove deprecated override

## [0.1.4]
### Added
- Initial Toolwindow and Treeview to view all of your LaunchDarkly Feature Flags
- Ability to Toggle flags from the Treeview
- Open in Browser from any specific flag