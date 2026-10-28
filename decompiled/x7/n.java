package x7;

import cc.y;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f14674a = i7;
        this.f14675b = oVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f14674a) {
            case 0:
                return new n(this.f14675b, cVar, 0);
            case 1:
                return new n(this.f14675b, cVar, 1);
            default:
                return new n(this.f14675b, cVar, 2);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f14674a) {
            case 0:
                n nVar = (n) create(yVar, cVar);
                z zVar = z.f12851a;
                nVar.invokeSuspend(zVar);
                return zVar;
            case 1:
                n nVar2 = (n) create(yVar, cVar);
                z zVar2 = z.f12851a;
                nVar2.invokeSuspend(zVar2);
                return zVar2;
            default:
                n nVar3 = (n) create(yVar, cVar);
                z zVar3 = z.f12851a;
                nVar3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14674a;
        z zVar = z.f12851a;
        o oVar = this.f14675b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                o.b(oVar);
                break;
            case 1:
                t8.a.e(obj);
                o.a(oVar);
                break;
            default:
                t8.a.e(obj);
                o.b(oVar);
                break;
        }
        return zVar;
    }
}
