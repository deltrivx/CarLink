package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a9.i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f13321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, y8.c cVar2) {
        super(1, cVar2);
        this.f13321a = cVar;
        this.f13322b = obj;
    }

    @Override // a9.a
    public final y8.c create(y8.c cVar) {
        return new b(this.f13321a, this.f13322b, cVar);
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        b bVar = (b) create((y8.c) obj);
        t8.z zVar = t8.z.f12851a;
        bVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        c cVar = this.f13321a;
        c.b(cVar);
        Object objA = c.a(cVar, this.f13322b);
        cVar.f13326c.f13387b.setValue(objA);
        cVar.f13328e.setValue(objA);
        return t8.z.f12851a;
    }
}
