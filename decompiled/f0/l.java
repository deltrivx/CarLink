package f0;

import h0.a0;
import h0.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f4784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f4785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f4787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r1.f f4790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4792j;
    public final /* synthetic */ long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f4793l;

    public l(long j5, j jVar, x xVar, int i7, int i10, r1.f fVar, int i11, int i12, long j10, u uVar) {
        this.f4787e = xVar;
        this.f4788f = i7;
        this.f4789g = i10;
        this.f4790h = fVar;
        this.f4791i = i11;
        this.f4792j = i12;
        this.k = j10;
        this.f4793l = uVar;
        this.f4784b = jVar;
        this.f4785c = xVar;
        this.f4786d = n3.b.b(n3.a.h(j5), Integer.MAX_VALUE, 5);
    }

    public final p w0(int i7, long j5) {
        j jVar = this.f4784b;
        Object objB = jVar.b(i7);
        Object objJ = jVar.f4779b.j(i7);
        return new p(i7, v0(this.f4785c, i7, j5), this.f4790h, this.f4787e.f6405b.getLayoutDirection(), this.f4791i, this.f4792j, i7 == this.f4788f + (-1) ? 0 : this.f4789g, this.k, objB, objJ, this.f4793l.f4864n, j5);
    }
}
