package nb;

/* JADX INFO: loaded from: classes.dex */
public final class t implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f9036b = new t(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9037a;

    public /* synthetic */ t(int i7) {
        this.f9037a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f9037a) {
            case 0:
                w wVar = (w) obj;
                i9.l.e(wVar, "it");
                return wVar.toString();
            default:
                wa.c cVar = (wa.c) obj;
                if (cVar != null) {
                    return Boolean.valueOf(!cVar.equals(u9.n.f13195y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
