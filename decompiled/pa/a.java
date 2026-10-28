package pa;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10319b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10320c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10321a;

    public /* synthetic */ a(int i7) {
        this.f10321a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) obj;
        p pVar = (p) obj2;
        switch (this.f10321a) {
            case 0:
                i9.l.e(cVar, "$this$loadConstantFromProperty");
                i9.l.e(pVar, "it");
                return cVar.f10328c.get(pVar);
            default:
                i9.l.e(cVar, "$this$loadConstantFromProperty");
                i9.l.e(pVar, "it");
                return cVar.f10327b.get(pVar);
        }
    }
}
