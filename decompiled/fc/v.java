package fc;

import cc.l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f5598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc.l f5601d;

    public v(x xVar, long j5, Object obj, cc.l lVar) {
        this.f5598a = xVar;
        this.f5599b = j5;
        this.f5600c = obj;
        this.f5601d = lVar;
    }

    @Override // cc.l0
    public final void a() {
        x xVar = this.f5598a;
        synchronized (xVar) {
            if (this.f5599b < xVar.o()) {
                return;
            }
            Object[] objArr = xVar.f5612h;
            i9.l.b(objArr);
            long j5 = this.f5599b;
            if (objArr[((int) j5) & (objArr.length - 1)] != this) {
                return;
            }
            y.c(objArr, j5, y.f5616a);
            xVar.i();
        }
    }
}
