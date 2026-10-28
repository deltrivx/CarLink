package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9438d = x0.f9444a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9439e = 0;

    public v0() {
        long j5 = 0;
        this.f9437c = (j5 & 4294967295L) | (j5 << 32);
    }

    public int I() {
        return (int) (this.f9437c & 4294967295L);
    }

    public int K() {
        return (int) (this.f9437c >> 32);
    }

    public final void N() {
        this.f9435a = n3.r.m((int) (this.f9437c >> 32), n3.a.j(this.f9438d), n3.a.h(this.f9438d));
        int iM = n3.r.m((int) (this.f9437c & 4294967295L), n3.a.i(this.f9438d), n3.a.g(this.f9438d));
        this.f9436b = iM;
        int i7 = this.f9435a;
        long j5 = this.f9437c;
        this.f9439e = (((long) ((i7 - ((int) (j5 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM - ((int) (j5 & 4294967295L))) / 2)));
    }

    public abstract void T(long j5, float f10, h9.k kVar);

    public final void U(long j5) {
        if (n3.m.a(this.f9437c, j5)) {
            return;
        }
        this.f9437c = j5;
        N();
    }

    public final void X(long j5) {
        if (n3.a.b(this.f9438d, j5)) {
            return;
        }
        this.f9438d = j5;
        N();
    }

    public /* synthetic */ Object w() {
        return null;
    }
}
