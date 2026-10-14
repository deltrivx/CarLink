# R8 rules for CarLink. Keeps what Android and the native side reach by name;
# everything else is renamed and, where unused, removed.

# --- Android components declared in the manifest ---
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.Application

# --- Native entry points: these are looked up by name from C/C++ ---
-keepclasseswithmembernames class * {
    native <methods>;
}

# --- Serialized / reflective payloads ---
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# --- Keep custom views' constructors (inflated by name from XML) ---
-keepclassmembers class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# --- Keep annotation-driven members and enums ---
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# --- Third-party: keep what these libraries reach reflectively ---
-keep class org.jmdns.** { *; }
-dontwarn org.jmdns.**
-keep class javax.jmdns.** { *; }
-dontwarn javax.jmdns.**
-keep class androidx.** { *; }
-dontwarn androidx.**
-keep class com.google.android.** { *; }
-dontwarn com.google.android.**
-keep class com.fasterxml.** { *; }
-dontwarn com.fasterxml.**
-keepclassmembers class androidx.media3.** { *; }
-dontwarn androidx.media3.**

# --- Reporting: keep stack traces readable enough to act on ---
-keepattributes SourceFile, LineNumberTable
-renamesourcefileattribute SourceFile

# --- Strip logging in release; the report keeps its own lines ---
-assumenosideeffects class android.util.Log {
    public static int v(...);
    public static int d(...);
}
