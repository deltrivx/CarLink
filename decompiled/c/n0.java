package c;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f1770a = new n0(1);

    @Override // h9.k
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        i9.l.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
