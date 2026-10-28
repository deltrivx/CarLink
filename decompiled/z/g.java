package z;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i9.u f15382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.k f15383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f15385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f15386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f15387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f10, h hVar, p1 p1Var, y8.c cVar) {
        super(2, cVar);
        this.f15385d = f10;
        this.f15386e = hVar;
        this.f15387f = p1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new g(this.f15385d, this.f15386e, this.f15387f, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        v.k kVar;
        i9.u uVar;
        v.k kVar2;
        int i7 = this.f15384c;
        if (i7 == 0) {
            t8.a.e(obj);
            f10 = this.f15385d;
            if (Math.abs(f10) > 1.0f) {
                i9.u uVar2 = new i9.u();
                uVar2.f6685a = f10;
                i9.u uVar3 = new i9.u();
                v.k kVarB = v.d.b(f10, 28);
                try {
                    h hVar = this.f15386e;
                    v.s sVar = hVar.f15395a;
                    a8.z zVar = new a8.z(uVar3, this.f15387f, uVar2, hVar, 7);
                    this.f15382a = uVar2;
                    this.f15383b = kVarB;
                    this.f15384c = 1;
                    kVar = kVarB;
                    try {
                        Object objC = v.d.c(kVar, new v.r(sVar, v.d.f13345j, kVarB.f13387b.getValue(), kVarB.f13388c), Long.MIN_VALUE, zVar, this);
                        Object obj2 = z8.a.f15774a;
                        if (objC != obj2) {
                            objC = t8.z.f12851a;
                        }
                        if (objC == obj2) {
                            return obj2;
                        }
                        uVar = uVar2;
                        f10 = uVar.f6685a;
                    } catch (CancellationException unused) {
                        uVar = uVar2;
                        kVar2 = kVar;
                        uVar.f6685a = ((Number) kVar2.f13386a.f13472b.invoke(kVar2.f13388c)).floatValue();
                    }
                } catch (CancellationException unused2) {
                    kVar = kVarB;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar2 = this.f15383b;
            uVar = this.f15382a;
            try {
                t8.a.e(obj);
            } catch (CancellationException unused3) {
                uVar.f6685a = ((Number) kVar2.f13386a.f13472b.invoke(kVar2.f13388c)).floatValue();
            }
            f10 = uVar.f6685a;
        }
        return new Float(f10);
    }
}
