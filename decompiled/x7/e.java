package x7;

import cc.y;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f14633a = i7;
        this.f14634b = fVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f14633a) {
            case 0:
                return new e(this.f14634b, cVar, 0);
            case 1:
                return new e(this.f14634b, cVar, 1);
            case 2:
                return new e(this.f14634b, cVar, 2);
            default:
                return new e(this.f14634b, cVar, 3);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f14633a) {
            case 0:
                e eVar = (e) create(yVar, cVar);
                z zVar = z.f12851a;
                eVar.invokeSuspend(zVar);
                return zVar;
            case 1:
                e eVar2 = (e) create(yVar, cVar);
                z zVar2 = z.f12851a;
                eVar2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                e eVar3 = (e) create(yVar, cVar);
                z zVar3 = z.f12851a;
                eVar3.invokeSuspend(zVar3);
                return zVar3;
            default:
                e eVar4 = (e) create(yVar, cVar);
                z zVar4 = z.f12851a;
                eVar4.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14633a;
        z zVar = z.f12851a;
        f fVar = this.f14634b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                f.c(fVar);
                break;
            case 1:
                t8.a.e(obj);
                f.b(fVar);
                break;
            case 2:
                t8.a.e(obj);
                f.c(fVar);
                break;
            default:
                t8.a.e(obj);
                f.b(fVar);
                break;
        }
        return zVar;
    }
}
