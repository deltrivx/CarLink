package v;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a9.i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f13313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.t f13314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f13316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f13318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h9.k f13320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, m0 m0Var, long j5, h9.k kVar, y8.c cVar2) {
        super(1, cVar2);
        this.f13316d = cVar;
        this.f13317e = obj;
        this.f13318f = m0Var;
        this.f13319g = j5;
        this.f13320h = kVar;
    }

    @Override // a9.a
    public final y8.c create(y8.c cVar) {
        return new a(this.f13316d, this.f13317e, this.f13318f, this.f13319g, this.f13320h, cVar);
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        return ((a) create((y8.c) obj)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        k kVar;
        i9.t tVar;
        g gVar;
        m0 m0Var = this.f13318f;
        int i7 = this.f13315c;
        c cVar2 = this.f13316d;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = this.f13314b;
            kVar = this.f13313a;
            try {
                t8.a.e(obj);
                cVar = cVar2;
                if (tVar.f6684a) {
                    gVar = g.f13358a;
                } else {
                    gVar = g.f13359b;
                }
                c.b(cVar);
                return new h(kVar, gVar);
            } catch (CancellationException e7) {
                e = e7;
                cVar = cVar2;
                c.b(cVar);
                throw e;
            }
        }
        t8.a.e(obj);
        try {
            cVar2.f13326c.f13388c = (p) cVar2.f13324a.f13471a.invoke(this.f13317e);
            cVar2.f13328e.setValue(m0Var.f13405c);
            cVar2.f13327d.setValue(Boolean.TRUE);
            k kVar2 = cVar2.f13326c;
            k kVar3 = new k(kVar2.f13386a, kVar2.f13387b.getValue(), d.f(kVar2.f13388c), kVar2.f13389d, Long.MIN_VALUE, kVar2.f13391f);
            i9.t tVar2 = new i9.t();
            long j5 = this.f13319g;
            a8.z zVar = new a8.z(cVar2, kVar3, this.f13320h, tVar2, 6);
            cVar = cVar2;
            try {
                this.f13313a = kVar3;
                this.f13314b = tVar2;
                this.f13315c = 1;
                Object objC = d.c(kVar3, m0Var, j5, zVar, this);
                z8.a aVar = z8.a.f15774a;
                if (objC == aVar) {
                    return aVar;
                }
                kVar = kVar3;
                tVar = tVar2;
                if (tVar.f6684a) {
                    gVar = g.f13358a;
                } else {
                    gVar = g.f13359b;
                }
                c.b(cVar);
                return new h(kVar, gVar);
            } catch (CancellationException e10) {
                e = e10;
            }
        } catch (CancellationException e11) {
            e = e11;
            cVar = cVar2;
            c.b(cVar);
            throw e;
        }
        c.b(cVar);
        throw e;
    }
}
