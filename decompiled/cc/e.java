package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2610b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0[] f2611a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.f2611a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }
}
