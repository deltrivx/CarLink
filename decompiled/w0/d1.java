package w0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u0.k f13761l = new u0.k(18, new g0.g(13), new u7.d(25));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13763b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.a0 f13764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f13765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f13766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j3.c f13767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f13768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0 f13769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f13770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f13771j;
    public final f1.k1 k;

    public d1(long j5) {
        s.a0 a0Var = s.o.f12475a;
        this.f13764c = new s.a0();
        this.f13765d = new AtomicLong(j5);
        s.a0 a0Var2 = s.o.f12475a;
        i9.l.c(a0Var2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.k = f1.b.s(a0Var2);
    }

    public final s.a0 a() {
        return (s.a0) this.k.getValue();
    }

    public final boolean b(o2.w wVar, long j5, long j10, a0 a0Var, boolean z10) {
        u0 u0Var = this.f13768g;
        if (u0Var == null) {
            return true;
        }
        w0 w0Var = u0Var.f13964a;
        long jB = w0Var.b(wVar, j5);
        long jB2 = w0Var.b(wVar, j10);
        w0Var.l(z10);
        return w0Var.o(jB, jB2, false, a0Var);
    }

    public final ArrayList c(o2.w wVar) {
        boolean z10 = this.f13762a;
        ArrayList arrayList = this.f13763b;
        if (!z10) {
            u8.t.b0(arrayList, new c1(0, new b3.a(25, wVar)));
            this.f13762a = true;
        }
        return arrayList;
    }

    public final void d(p pVar) {
        long j5 = pVar.f13874a;
        s.a0 a0Var = this.f13764c;
        if (a0Var.b(j5)) {
            this.f13763b.remove(pVar);
            long j10 = pVar.f13874a;
            a0Var.g(j10);
            e0 e0Var = this.f13771j;
            if (e0Var != null) {
                e0Var.invoke(Long.valueOf(j10));
            }
        }
    }
}
