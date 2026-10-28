package l8;

import x.o1;
import z.m1;
import z.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f8128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, float f10, float f11, y8.c cVar, int i7) {
        super(2, cVar);
        this.f8125a = i7;
        this.f8129e = obj;
        this.f8127c = f10;
        this.f8128d = f11;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f8125a) {
            case 0:
                return new d((o1) this.f8129e, this.f8127c, this.f8128d, cVar, 0);
            default:
                return new d((m1) this.f8129e, this.f8127c, this.f8128d, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f8125a) {
            case 0:
                break;
        }
        return ((d) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8125a) {
            case 0:
                int i7 = this.f8126b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    o1 o1Var = (o1) this.f8129e;
                    int i10 = (int) (this.f8127c * this.f8128d);
                    this.f8126b = 1;
                    Object objS = n3.l.S(o1Var, i10 - o1Var.f14445a.f(), this);
                    z8.a aVar = z8.a.f15774a;
                    if (objS == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            default:
                int i11 = this.f8126b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    t1 t1Var = ((m1) this.f8129e).E;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f8127c)) << 32) | (((long) Float.floatToRawIntBits(this.f8128d)) & 4294967295L);
                    this.f8126b = 1;
                    Object objA = androidx.compose.foundation.gestures.a.a(t1Var, jFloatToRawIntBits, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
        }
    }
}
