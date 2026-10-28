package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10605a;

    public static final int a(int i7, long j5) {
        int i10 = b2.f10597b;
        return ((int) (j5 >> (i7 * 15))) & 32767;
    }

    public static long c(int i7, int i10, int i11, int i12) {
        return (((long) (i10 & 32767)) << 15) | ((long) (i7 & 32767)) | (((long) (i11 & 32767)) << 30) | (((long) (i12 & 32767)) << 45) | Long.MIN_VALUE;
    }

    @Override // p2.e
    public Object A(p2.f fVar) {
        return fVar.f10123a.invoke();
    }

    public int b() {
        switch (this.f10605a) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }
}
