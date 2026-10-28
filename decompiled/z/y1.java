package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f15602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(a1 a1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f15601a = i7;
        this.f15602b = a1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15601a) {
            case 0:
                return new y1(this.f15602b, cVar, 0);
            case 1:
                return new y1(this.f15602b, cVar, 1);
            case 2:
                return new y1(this.f15602b, cVar, 2);
            case 3:
                return new y1(this.f15602b, cVar, 3);
            case 4:
                return new y1(this.f15602b, cVar, 4);
            case 5:
                return new y1(this.f15602b, cVar, 5);
            case 6:
                return new y1(this.f15602b, cVar, 6);
            default:
                return new y1(this.f15602b, cVar, 7);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15601a) {
            case 0:
                y1 y1Var = (y1) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                y1Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                y1 y1Var2 = (y1) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                y1Var2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                y1 y1Var3 = (y1) create(yVar, cVar);
                t8.z zVar3 = t8.z.f12851a;
                y1Var3.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                y1 y1Var4 = (y1) create(yVar, cVar);
                t8.z zVar4 = t8.z.f12851a;
                y1Var4.invokeSuspend(zVar4);
                return zVar4;
            case 4:
                y1 y1Var5 = (y1) create(yVar, cVar);
                t8.z zVar5 = t8.z.f12851a;
                y1Var5.invokeSuspend(zVar5);
                return zVar5;
            case 5:
                y1 y1Var6 = (y1) create(yVar, cVar);
                t8.z zVar6 = t8.z.f12851a;
                y1Var6.invokeSuspend(zVar6);
                return zVar6;
            case 6:
                y1 y1Var7 = (y1) create(yVar, cVar);
                t8.z zVar7 = t8.z.f12851a;
                y1Var7.invokeSuspend(zVar7);
                return zVar7;
            default:
                y1 y1Var8 = (y1) create(yVar, cVar);
                t8.z zVar8 = t8.z.f12851a;
                y1Var8.invokeSuspend(zVar8);
                return zVar8;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f15601a;
        t8.z zVar = t8.z.f12851a;
        a1 a1Var = this.f15602b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                a1Var.b();
                break;
            case 1:
                t8.a.e(obj);
                a1Var.c();
                break;
            case 2:
                t8.a.e(obj);
                a1Var.c();
                break;
            case 3:
                t8.a.e(obj);
                a1Var.b();
                break;
            case 4:
                t8.a.e(obj);
                a1Var.c();
                break;
            case 5:
                t8.a.e(obj);
                a1Var.c();
                break;
            case 6:
                t8.a.e(obj);
                a1Var.b();
                break;
            default:
                t8.a.e(obj);
                a1Var.c();
                break;
        }
        return zVar;
    }
}
