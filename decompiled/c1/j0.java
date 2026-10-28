package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i7, String str) {
        super(1);
        this.f1946a = i7;
        this.f1947b = str;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f1946a;
        t8.z zVar = t8.z.f12851a;
        String str = this.f1947b;
        switch (i7) {
            case 0:
                y2.j jVar = (y2.j) obj;
                o9.u[] uVarArr = y2.t.f15077a;
                jVar.n(y2.r.f15050a, n3.l.I(str));
                y2.t.b(jVar, 5);
                break;
            case 1:
                o9.u[] uVarArr2 = y2.t.f15077a;
                ((y2.j) obj).n(y2.r.K, str);
                break;
            default:
                o9.u[] uVarArr3 = y2.t.f15077a;
                ((y2.j) obj).n(y2.r.f15050a, n3.l.I(str));
                break;
        }
        return zVar;
    }
}
