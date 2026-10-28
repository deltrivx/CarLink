package w0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2.w f13885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f13887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nb.u f13888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s.y f13889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f13890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13892j;
    public int k;

    public q0(long j5, long j10, o2.w wVar, boolean z10, z zVar, nb.u uVar) {
        this.f13883a = j5;
        this.f13884b = j10;
        this.f13885c = wVar;
        this.f13886d = z10;
        this.f13887e = zVar;
        this.f13888f = uVar;
        int i7 = s.n.f12473a;
        this.f13889g = new s.y(6);
        this.f13890h = new ArrayList();
        this.f13891i = -1;
        this.f13892j = -1;
        this.k = -1;
    }

    public final int a(int i7, l lVar, l lVar2) {
        if (i7 == -1) {
            int iOrdinal = y0.x(lVar, lVar2).ordinal();
            if (iOrdinal == 0) {
                return this.k - 1;
            }
            if (iOrdinal == 1) {
                return this.k;
            }
            if (iOrdinal != 2) {
                throw new cc.s();
            }
        }
        return i7;
    }
}
