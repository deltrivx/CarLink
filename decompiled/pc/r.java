package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f10496a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10497b = new s0("kotlin.time.Duration", nc.c.k);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        long j5 = ((ac.a) obj).f509a;
        int i7 = ac.a.f508d;
        StringBuilder sb2 = new StringBuilder();
        if (j5 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jG = j5 < 0 ? ac.a.g(j5) : j5;
        long jF = ac.a.f(jG, ac.c.HOURS);
        boolean z10 = false;
        int iF = ac.a.d(jG) ? 0 : (int) (ac.a.f(jG, ac.c.MINUTES) % ((long) 60));
        int iF2 = ac.a.d(jG) ? 0 : (int) (ac.a.f(jG, ac.c.SECONDS) % ((long) 60));
        int iC = ac.a.c(jG);
        if (ac.a.d(j5)) {
            jF = 9999999999999L;
        }
        boolean z11 = jF != 0;
        boolean z12 = (iF2 == 0 && iC == 0) ? false : true;
        if (iF != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jF);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iF);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            ac.a.b(sb2, iF2, iC, 9, "S", true);
        }
        sVar.r(sb2.toString());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        int i7 = ac.a.f508d;
        String strL = bVar.l();
        i9.l.e(strL, "value");
        try {
            return new ac.a(ac.f.a(strL));
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(a2.f.G("Invalid ISO duration string format: '", strL, "'."), e7);
        }
    }

    @Override // mc.a
    public final nc.e d() {
        return f10497b;
    }
}
