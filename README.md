# kmm-with-composite-build
This is a KMM project, which includes a composite build. 

### Troubleshooting: SDK location not found

This might have occurred because `KMMLibraryProject` is integrated as
a [composite build](https://docs.gradle.org/current/userguide/composite_builds.html).

The entire error message says:
"SDK location not found. Define location with an ANDROID_SDK_ROOT environment variable or by setting
the sdk.dir path in your project's local properties file at '$projectDir/$androidkit-folder-name/local.properties'."
So you have 2 options to fix this:

- Copy the file `local.properties` from your project root directory into the direct subfolder `KMMLibraryProject`.
- Set environment variable `ANDROID_SDK_ROOT`
