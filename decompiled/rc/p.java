package rc;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a9.h implements h9.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ t8.b f12340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j.g f12341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j.g gVar, y8.c cVar) {
        super(3, cVar);
        this.f12341d = gVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.f12341d, (y8.c) obj3);
        pVar.f12340c = (t8.b) obj;
        return pVar.invokeSuspend(z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        j.g gVar = this.f12341d;
        ja.e eVar = (ja.e) gVar.f6795c;
        t8.b bVar = this.f12340c;
        int i7 = this.f12339b;
        if (i7 == 0) {
            t8.a.e(obj);
            byte bQ = eVar.q();
            if (bQ == 1) {
                return gVar.h(true);
            }
            if (bQ == 0) {
                return gVar.h(false);
            }
            if (bQ != 6) {
                if (bQ == 8) {
                    return gVar.g();
                }
                ja.e.n(eVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f12340c = null;
            this.f12339b = 1;
            obj = j.g.a(gVar, bVar, this);
            z8.a aVar = z8.a.f15774a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        return (qc.j) obj;
    }
}
