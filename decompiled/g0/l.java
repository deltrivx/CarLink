package g0;

import h0.a0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.x f5662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0.x f5664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f5665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5668i;

    public l(i iVar, h0.x xVar, int i7, v vVar, int i10, int i11, long j5) {
        this.f5664e = xVar;
        this.f5665f = vVar;
        this.f5666g = i10;
        this.f5667h = i11;
        this.f5668i = j5;
        this.f5661b = iVar;
        this.f5662c = xVar;
        this.f5663d = i7;
    }

    public final o w0(int i7, long j5, int i10, int i11, int i12) {
        int i13;
        i iVar = this.f5661b;
        Object objB = iVar.b(i7);
        Object objJ = iVar.f5647b.j(i7);
        List listV0 = v0(this.f5662c, i7, j5);
        if (n3.a.f(j5)) {
            i13 = n3.a.j(j5);
        } else {
            if (!n3.a.e(j5)) {
                c0.b.a("does not have fixed height");
            }
            i13 = n3.a.i(j5);
        }
        int i14 = i13;
        n3.o layoutDirection = this.f5664e.f6405b.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.b bVar = this.f5665f.f5749m;
        return new o(i7, objB, i14, i12, layoutDirection, this.f5666g, this.f5667h, listV0, this.f5668i, objJ, bVar, j5, i10, i11);
    }
}
