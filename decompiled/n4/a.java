package n4;

import android.text.Editable;
import l4.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8767a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f8768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f8769c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f8769c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
