package n8;

import android.content.SharedPreferences;
import b3.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.o f8898a = t8.a.d(new i0(23));

    public static boolean a(String str, boolean z10) {
        i9.l.e(str, "key");
        try {
            return c().getBoolean(str, z10);
        } catch (ClassCastException unused) {
            SharedPreferences sharedPreferencesC = c();
            i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
            editorEdit.remove(str);
            editorEdit.apply();
            return z10;
        }
    }

    public static int b(int i7, String str) {
        i9.l.e(str, "key");
        try {
            return c().getInt(str, i7);
        } catch (ClassCastException unused) {
            SharedPreferences sharedPreferencesC = c();
            i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
            editorEdit.remove(str);
            editorEdit.apply();
            return i7;
        }
    }

    public static SharedPreferences c() {
        return (SharedPreferences) f8898a.getValue();
    }

    public static String d(String str, String str2) {
        i9.l.e(str, "key");
        i9.l.e(str2, "defaultValue");
        try {
            return String.valueOf(c().getString(str, str2));
        } catch (ClassCastException unused) {
            SharedPreferences sharedPreferencesC = c();
            i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
            editorEdit.remove(str);
            editorEdit.apply();
            return str2;
        }
    }

    public static void e(String str, boolean z10) {
        i9.l.e(str, "key");
        SharedPreferences sharedPreferencesC = c();
        i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public static void f(int i7, String str) {
        i9.l.e(str, "key");
        SharedPreferences sharedPreferencesC = c();
        i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.putInt(str, i7);
        editorEdit.apply();
    }

    public static void g(String str, String str2) {
        i9.l.e(str, "key");
        i9.l.e(str2, "value");
        SharedPreferences sharedPreferencesC = c();
        i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void h(String str) {
        i9.l.e(str, "key");
        SharedPreferences sharedPreferencesC = c();
        i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }
}
