package c;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f1697a = new a0(0);

    @Override // h9.a
    public final Object invoke() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new c0(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return b0.f1702a;
        }
    }
}
