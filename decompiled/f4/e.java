package f4;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5285a;

    public /* synthetic */ e(Object obj) {
        this.f5285a = obj;
    }

    public void a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            i4.b.i(i4.j.m(this.f5285a), str);
        }
    }
}
