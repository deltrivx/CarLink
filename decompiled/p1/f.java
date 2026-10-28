package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f10030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10033d;

    public f(long j5, j jVar) {
        int iE;
        int iNumberOfTrailingZeros;
        this.f10030a = jVar;
        this.f10031b = j5;
        o7.q qVar = l.f10055a;
        if (j5 != 0) {
            j jVarD = d();
            long j10 = jVarD.f10050c;
            long[] jArr = jVarD.f10051d;
            if (jArr != null) {
                j5 = jArr[0];
            } else {
                long j11 = jVarD.f10049b;
                if (j11 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                } else {
                    long j12 = jVarD.f10048a;
                    if (j12 != 0) {
                        j10 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j5 = ((long) iNumberOfTrailingZeros) + j10;
            }
            synchronized (l.f10057c) {
                iE = l.f10060f.e(j5);
            }
        } else {
            iE = -1;
        }
        this.f10033d = iE;
    }

    public static void q(f fVar) {
        l.f10056b.X(fVar);
    }

    public final void a() {
        synchronized (l.f10057c) {
            b();
            p();
        }
    }

    public void b() {
        l.f10058d = l.f10058d.d(g());
    }

    public abstract void c();

    public j d() {
        return this.f10030a;
    }

    public abstract h9.k e();

    public abstract boolean f();

    public long g() {
        return this.f10031b;
    }

    public int h() {
        return 0;
    }

    public abstract h9.k i();

    public final f j() {
        a2.b bVar = l.f10056b;
        f fVar = (f) bVar.y();
        bVar.X(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(z zVar);

    public final void o() {
        int i7 = this.f10033d;
        if (i7 >= 0) {
            l.v(i7);
            this.f10033d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f10030a = jVar;
    }

    public void s(long j5) {
        this.f10031b = j5;
    }

    public void t(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(h9.k kVar);
}
