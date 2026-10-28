package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements y1.l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f14367b = new g0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f14368c = new g0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14369a;

    public /* synthetic */ g0(int i7) {
        this.f14369a = i7;
    }

    @Override // y1.l0
    public final y1.h0 a(long j5, n3.o oVar, n3.c cVar) {
        switch (this.f14369a) {
            case 0:
                float fA0 = cVar.a0(t.f14476a);
                return new y1.c0(new x1.c(0.0f, -fA0, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)) + fA0));
            default:
                float fA1 = cVar.a0(t.f14476a);
                return new y1.c0(new x1.c(-fA1, 0.0f, Float.intBitsToFloat((int) (j5 >> 32)) + fA1, Float.intBitsToFloat((int) (j5 & 4294967295L))));
        }
    }
}
