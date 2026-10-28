package k7;

import cc.b0;
import cc.y;
import t8.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lc.a f7362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i7, y8.c cVar, boolean z10) {
        super(2, cVar);
        this.f7366e = z10;
        this.f7367f = i7;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new i(this.f7367f, cVar, this.f7366e);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((y) obj, (y8.c) obj2)).invokeSuspend(z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        int i7;
        lc.a aVar;
        lc.a aVar2;
        Throwable th;
        boolean z11;
        int i10 = this.f7365d;
        z8.a aVar3 = z8.a.f15774a;
        try {
            if (i10 == 0) {
                t8.a.e(obj);
                lc.c cVar = n.f7379f;
                this.f7362a = cVar;
                boolean z12 = this.f7366e;
                this.f7363b = z12;
                int i11 = this.f7367f;
                this.f7364c = i11;
                this.f7365d = 1;
                if (cVar.d(this) != aVar3) {
                    z10 = z12;
                    i7 = i11;
                    aVar = cVar;
                }
                return aVar3;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = this.f7364c;
                z11 = this.f7363b;
                aVar2 = this.f7362a;
                try {
                    t8.a.e(obj);
                    aVar2 = aVar2;
                    n.f7376c = b0.s(n.f7378e, null, new l(i7, null, z11), 3);
                    ((lc.c) aVar2).f(null);
                    return z.f12851a;
                } catch (Throwable th2) {
                    th = th2;
                    ((lc.c) aVar2).f(null);
                    throw th;
                }
            }
            i7 = this.f7364c;
            z10 = this.f7363b;
            lc.a aVar4 = this.f7362a;
            t8.a.e(obj);
            aVar = aVar4;
            o oVar = n.f7374a;
            this.f7362a = aVar;
            this.f7363b = z10;
            this.f7364c = i7;
            this.f7365d = 2;
            if (n.f(this) != aVar3) {
                z11 = z10;
                aVar2 = aVar;
                n.f7376c = b0.s(n.f7378e, null, new l(i7, null, z11), 3);
                ((lc.c) aVar2).f(null);
                return z.f12851a;
            }
            return aVar3;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            ((lc.c) aVar2).f(null);
            throw th;
        }
    }
}
