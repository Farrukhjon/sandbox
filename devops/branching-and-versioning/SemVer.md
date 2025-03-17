# SemVer versioning agreement for shared libs/API

## Major.Minor.Patch versioning format and their meaning

- MAJOR
    - increment when backward-incompatible changes are made in a lib/API
    - above implies, that major increment in all using it apps (downstream apps)
- MINOR
    - increment when backwards-compatible functionality is added
    - above implies, that changes don't brake anything in all downstream apps
    - it does not include bug fixes
- PATCH
    - increment when backwards-compatible bug fixes are made
    - above implies, when this incremented in a release, make sure not include a new functionality