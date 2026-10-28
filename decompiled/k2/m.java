package k2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.e f7252a = new h1.e(new l[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.d0 f7253b = new s.d0(10);

    public boolean a(s.q qVar, o2.w wVar, i iVar, boolean z10) {
        h1.e eVar = this.f7252a;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        boolean z11 = false;
        for (int i10 = 0; i10 < i7; i10++) {
            z11 = ((l) objArr[i10]).a(qVar, wVar, iVar, z10) || z11;
        }
        return z11;
    }

    public void b(i iVar) {
        h1.e eVar = this.f7252a;
        int i7 = eVar.f6423c;
        while (true) {
            i7--;
            if (-1 >= i7) {
                return;
            }
            if (((l) eVar.f6421a[i7]).f7239d.f6794b == 0) {
                eVar.l(i7);
            }
        }
    }
}
