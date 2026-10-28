package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f1703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f1704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f1705c;

    public c0(Field field, Field field2, Field field3) {
        this.f1703a = field;
        this.f1704b = field2;
        this.f1705c = field3;
    }

    @Override // c.z
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f1705c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // c.z
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f1703a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // c.z
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f1704b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
