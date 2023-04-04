# kmm-with-composite-build

This is a KMM project, which includes a library project in subfolder `KMMLibraryProject`.
`KMMLibraryProject` consists of a single module `kmmlibrarymodule`.
`KMMLibraryProject` in included into the main project via `includeBuild("KMMLibraryProject")` in `settings.gradle.kts`.

- Branch `main` illustrates how module `shared` tries to depend on `kmmlibrarymodule` but the import can't be resolved.
- Branch `dependency-in-androidApp-works` shows that module `androidApp` can successfully depend on and use `kmmlibrarymodule`.

### Troubleshooting: SDK location not found

This might have occurred because `KMMLibraryProject` is integrated as
a [composite build](https://docs.gradle.org/current/userguide/composite_builds.html).

The entire error message says:
"SDK location not found. Define location with an ANDROID_SDK_ROOT environment variable or by setting
the sdk.dir path in your project's local properties file at '$projectDir/$androidkit-folder-name/local.properties'."
So you have 2 options to fix this:

- Copy the file `local.properties` from your project root directory into the direct subfolder `KMMLibraryProject`.
- Set environment variable `ANDROID_SDK_ROOT`
