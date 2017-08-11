# AndroidUtils

## Integration

```
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io"}
    }
}

dependencies {
    // ...
    compile 'com.github.chihane.AndroidUtils:utils:{release_version}'
    // Optional
    compile 'com.github.chihane.AndroidUtils:utils-rx:{release_version}'
}
```