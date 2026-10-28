package l4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8023a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f8026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8028f;

    public q(t tVar) {
        this.f8024b = tVar;
        this.f8025c = tVar;
    }

    public final void a() {
        this.f8023a = 1;
        this.f8025c = this.f8024b;
        this.f8028f = 0;
    }

    public final boolean b() {
        m4.a aVarB = this.f8025c.f8042b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f4320d).get(iA + aVarB.f4317a) == 0) || this.f8027e == 65039;
    }
}
