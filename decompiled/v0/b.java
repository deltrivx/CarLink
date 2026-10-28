package v0;

import b3.g0;
import b3.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f13485h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3.o f13486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f13487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3.d f13488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f3.d f13489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f13490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13491f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13492g = Float.NaN;

    public b(n3.o oVar, r0 r0Var, n3.d dVar, f3.d dVar2) {
        this.f13486a = oVar;
        this.f13487b = r0Var;
        this.f13488c = dVar;
        this.f13489d = dVar2;
        this.f13490e = g0.h(r0Var, oVar);
    }

    public final long a(int i7, long j5) {
        int i10;
        float f10 = this.f13492g;
        float f11 = this.f13491f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = c.f13493a;
            long jB = n3.b.b(0, 0, 15);
            r0 r0Var = this.f13490e;
            n3.d dVar = this.f13488c;
            float fB = g0.a(str, r0Var, jB, dVar, this.f13489d, 1, 96).b();
            float fB2 = g0.a(c.f13494b, this.f13490e, n3.b.b(0, 0, 15), dVar, this.f13489d, 2, 96).b() - fB;
            this.f13492g = fB;
            this.f13491f = fB2;
            f11 = fB2;
            f10 = fB;
        }
        if (i7 != 1) {
            int iRound = Math.round((f11 * (i7 - 1)) + f10);
            i10 = iRound >= 0 ? iRound : 0;
            int iG = n3.a.g(j5);
            if (i10 > iG) {
                i10 = iG;
            }
        } else {
            i10 = n3.a.i(j5);
        }
        return n3.b.a(n3.a.j(j5), n3.a.h(j5), i10, n3.a.g(j5));
    }
}
