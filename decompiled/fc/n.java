package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ e f5580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a9.i f5582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a9.i iVar, y8.c cVar, int i7) {
        super(3, cVar);
        this.f5578a = i7;
        this.f5582e = iVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj;
        switch (this.f5578a) {
            case 0:
                n nVar = new n((i) this.f5582e, (y8.c) obj3, 0);
                nVar.f5580c = eVar;
                nVar.f5581d = obj2;
                return nVar.invokeSuspend(t8.z.f12851a);
            default:
                n nVar2 = new n((e8.y) this.f5582e, (y8.c) obj3, 1);
                nVar2.f5580c = eVar;
                nVar2.f5581d = (Object[]) obj2;
                return nVar2.invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        e eVar2;
        switch (this.f5578a) {
            case 0:
                int i7 = this.f5579b;
                z8.a aVar = z8.a.f15774a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        eVar = this.f5580c;
                        t8.a.e(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                eVar = this.f5580c;
                Object obj2 = this.f5581d;
                i iVar = (i) this.f5582e;
                this.f5580c = eVar;
                this.f5579b = 1;
                obj = iVar.invoke(obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
                this.f5580c = null;
                this.f5579b = 2;
                if (eVar.h(obj, this) == aVar) {
                    return aVar;
                }
                return t8.z.f12851a;
            default:
                int i10 = this.f5579b;
                z8.a aVar2 = z8.a.f15774a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        eVar2 = this.f5580c;
                        t8.a.e(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                eVar2 = this.f5580c;
                Object[] objArr = (Object[]) this.f5581d;
                e8.y yVar = (e8.y) this.f5582e;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                this.f5580c = eVar2;
                this.f5579b = 1;
                obj = yVar.invoke(obj3, obj4, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                this.f5580c = null;
                this.f5579b = 2;
                if (eVar2.h(obj, this) == aVar2) {
                    return aVar2;
                }
                return t8.z.f12851a;
        }
    }
}
