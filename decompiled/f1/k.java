package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a9.h implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f5004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, y8.c cVar) {
        super(2, cVar);
        this.f5004g = lVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        k kVar = new k(this.f5004g, cVar);
        kVar.f5003f = obj;
        return kVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((yb.k) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        yb.k kVar;
        int i7;
        int i10;
        int i11;
        String strE;
        int i12;
        int i13;
        String str;
        l lVar = this.f5004g;
        s.d0 d0Var = lVar.f5007a;
        s.v vVar = lVar.f5009c;
        int i14 = this.f5002e;
        if (i14 == 0) {
            t8.a.e(obj);
            kVar = (yb.k) this.f5003f;
            i7 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f5001d;
            i10 = this.f5000c;
            i11 = this.f4999b;
            kVar = (yb.k) this.f5003f;
            t8.a.e(obj);
        }
        if (i11 >= Math.min(lVar.f5010d, vVar.f12509b)) {
            return t8.z.f12851a;
        }
        int i15 = i11 + 1;
        int iB = vVar.b(i11);
        switch (iB) {
            case 0:
                strE = "up";
                break;
            case 1:
                Object objE = d0Var.e(i10);
                i10++;
                strE = "down " + objE;
                break;
            case 2:
                strE = "remove " + vVar.b(i15) + ' ' + vVar.b(i11 + 2);
                i15 = i11 + 3;
                break;
            case 3:
                strE = "move " + vVar.b(i15) + ' ' + vVar.b(i11 + 2) + ' ' + vVar.b(i11 + 3);
                i15 = i11 + 4;
                break;
            case 4:
                strE = "clear";
                break;
            case 5:
                i12 = i11 + 2;
                int iB2 = vVar.b(i15);
                i13 = i10 + 1;
                str = "insertBottomUp " + iB2 + ' ' + d0Var.e(i10);
                int i16 = i12;
                strE = str;
                i15 = i16;
                i10 = i13;
                break;
            case 6:
                i12 = i11 + 2;
                int iB3 = vVar.b(i15);
                i13 = i10 + 1;
                str = "insertTopDown " + iB3 + ' ' + d0Var.e(i10);
                int i17 = i12;
                strE = str;
                i15 = i17;
                i10 = i13;
                break;
            case 7:
                int i18 = i10 + 1;
                Object objE2 = d0Var.e(i10);
                i9.l.c(objE2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                i9.b0.d(2, objE2);
                i10 += 2;
                strE = "apply " + ((h9.n) objE2) + ' ' + d0Var.e(i18);
                break;
            case 8:
                strE = "reuse " + lVar.f5008b.e(i7);
                i7++;
                break;
            default:
                strE = a2.f.E(iB, "unknown op: ");
                break;
        }
        this.f5003f = kVar;
        this.f4999b = i15;
        this.f5000c = i10;
        this.f5001d = i7;
        this.f5002e = 1;
        kVar.b(i11 + ": " + strE, this);
        return z8.a.f15774a;
    }
}
