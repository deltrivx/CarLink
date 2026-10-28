package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1.c f12422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f12423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f12424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f12428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1.c f12429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, l1.c cVar, y8.c cVar2) {
        super(2, cVar2);
        this.f12428h = g0Var;
        this.f12429i = cVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        f0 f0Var = new f0(this.f12428h, this.f12429i, cVar);
        f0Var.f12427g = obj;
        return f0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((yb.k) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        yb.k kVar;
        g0 g0Var;
        long[] jArr;
        int i7;
        l1.c cVar;
        int i10 = this.f12426f;
        if (i10 == 0) {
            t8.a.e(obj);
            kVar = (yb.k) this.f12427g;
            g0Var = this.f12428h;
            e0 e0Var = g0Var.f12434b;
            jArr = e0Var.f12413c;
            i7 = e0Var.f12415e;
            cVar = this.f12429i;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f12425e;
            jArr = this.f12424d;
            g0Var = this.f12423c;
            cVar = this.f12422b;
            kVar = (yb.k) this.f12427g;
            t8.a.e(obj);
        }
        if (i7 == Integer.MAX_VALUE) {
            return t8.z.f12851a;
        }
        int i11 = (int) ((jArr[i7] >> 31) & 2147483647L);
        cVar.f7972b = i7;
        Object obj2 = g0Var.f12434b.f12412b[i7];
        this.f12427g = kVar;
        this.f12422b = cVar;
        this.f12423c = g0Var;
        this.f12424d = jArr;
        this.f12425e = i11;
        this.f12426f = 1;
        kVar.b(obj2, this);
        return z8.a.f15774a;
    }
}
