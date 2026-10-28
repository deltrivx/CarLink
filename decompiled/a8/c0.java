package a8;

import b8.n2;
import com.muyetuge.carlifevehicle.activity.MainActivity;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i7, y8.c cVar, int i10) {
        super(i7, cVar);
        this.f94a = i10;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f94a) {
            case 0:
                return new c0(2, cVar, 0);
            case 1:
                return new c0(2, cVar, 1);
            case 2:
                return new c0(2, cVar, 2);
            case 3:
                return new c0(2, cVar, 3);
            case 4:
                return new c0(2, cVar, 4);
            case 5:
                return new c0(2, cVar, 5);
            case 6:
                return new c0(2, cVar, 6);
            case 7:
                return new c0(2, cVar, 7);
            case 8:
                return new c0(2, cVar, 8);
            case 9:
                return new c0(2, cVar, 9);
            case 10:
                return new c0(2, cVar, 10);
            case 11:
                return new c0(2, cVar, 11);
            case 12:
                return new c0(2, cVar, 12);
            case 13:
                c0 c0Var = new c0(2, cVar, 13);
                c0Var.f95b = ((Number) obj).intValue();
                return c0Var;
            case 14:
                return new c0(2, cVar, 14);
            default:
                return new c0(2, cVar, 15);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f94a) {
            case 0:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 1:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 2:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 3:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 4:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 5:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 6:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 7:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 8:
                return ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 9:
                return ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 10:
                return ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 11:
                return ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 12:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 13:
                return ((c0) create(Integer.valueOf(((Number) obj).intValue()), (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 14:
                return ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                ((c0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        int i7 = this.f94a;
        int i10 = 6;
        Object[] objArr = 0;
        t8.z zVar = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        int i11 = 1;
        switch (i7) {
            case 0:
                int i12 = this.f95b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar = d8.v.f3844c;
                b0 b0Var = b0.f79b;
                this.f95b = 1;
                xVar.getClass();
                fc.x.j(xVar, b0Var, this);
                return aVar;
            case 1:
                int i13 = this.f95b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar2 = d8.v.f3844c;
                b0 b0Var2 = b0.f80c;
                this.f95b = 1;
                xVar2.getClass();
                fc.x.j(xVar2, b0Var2, this);
                return aVar;
            case 2:
                int i14 = this.f95b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar3 = d8.v.f3844c;
                b0 b0Var3 = b0.f81d;
                this.f95b = 1;
                xVar3.getClass();
                fc.x.j(xVar3, b0Var3, this);
                return aVar;
            case 3:
                int i15 = this.f95b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar4 = d8.v.f3844c;
                b0 b0Var4 = b0.f82e;
                this.f95b = 1;
                xVar4.getClass();
                fc.x.j(xVar4, b0Var4, this);
                return aVar;
            case 4:
                int i16 = this.f95b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar5 = d8.v.f3844c;
                b0 b0Var5 = b0.f83f;
                this.f95b = 1;
                xVar5.getClass();
                fc.x.j(xVar5, b0Var5, this);
                return aVar;
            case 5:
                int i17 = this.f95b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar6 = d8.v.f3844c;
                this.f95b = 1;
                xVar6.getClass();
                fc.x.j(xVar6, m1.f177a, this);
                return aVar;
            case 6:
                int i18 = this.f95b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar7 = d8.v.f3844c;
                this.f95b = 1;
                xVar7.getClass();
                fc.x.j(xVar7, o1.f188a, this);
                return aVar;
            case 7:
                int i19 = this.f95b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.x xVar8 = d8.v.f3844c;
                b0 b0Var6 = b0.f84g;
                this.f95b = 1;
                xVar8.getClass();
                fc.x.j(xVar8, b0Var6, this);
                return aVar;
            case 8:
                int i20 = this.f95b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                fc.d dVarD = fc.y.d(new s1(o7.u.f9520p, objArr == true ? 1 : 0));
                b0 b0Var7 = b0.f85h;
                this.f95b = 1;
                Object objL = dVarD.l(new r1(new r1(b0Var7, i10), i11), this);
                if (objL != aVar) {
                    objL = zVar;
                }
                if (objL != aVar) {
                    objL = zVar;
                }
                return objL == aVar ? aVar : zVar;
            case 9:
                int i21 = this.f95b;
                if (i21 == 0) {
                    t8.a.e(obj);
                    this.f95b = 1;
                    if (cc.b0.h(10000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                b8.f2.f1584d = false;
                return zVar;
            case 10:
                int i22 = this.f95b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                fc.d dVarD2 = fc.y.d(new s1(o7.u.f9520p, i11));
                this.f95b = 1;
                Object objL2 = dVarD2.l(new r1(new r1(e8.t.f4623a, i10), 3), this);
                if (objL2 != aVar) {
                    objL2 = zVar;
                }
                if (objL2 != aVar) {
                    objL2 = zVar;
                }
                return objL2 == aVar ? aVar : zVar;
            case 11:
                int i23 = this.f95b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                fc.d dVarD3 = fc.y.d(new s1(o7.u.f9520p, 2));
                this.f95b = 1;
                Object objL3 = dVarD3.l(new r1(new r1(e8.h0.f4550a, i10), 5), this);
                if (objL3 != aVar) {
                    objL3 = zVar;
                }
                if (objL3 != aVar) {
                    objL3 = zVar;
                }
                return objL3 == aVar ? aVar : zVar;
            case 12:
                int i24 = this.f95b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                n8.s sVar = new n8.s();
                n2.Companion.getClass();
                fc.h0 h0Var = n2.f1622h;
                e8.x0 x0Var = new e8.x0(sVar);
                this.f95b = 1;
                h0Var.l(x0Var, this);
                return aVar;
            case 13:
                t8.a.e(obj);
                return Boolean.valueOf(this.f95b > 0);
            case 14:
                int i25 = this.f95b;
                if (i25 == 0) {
                    t8.a.e(obj);
                    fc.h0 h0Var2 = o7.u.f9519o;
                    fc.h0 h0Var3 = o7.u.f9519o;
                    do {
                        value = h0Var3.getValue();
                    } while (!h0Var3.f(value, o7.u.a((o7.u) value, null, "连接成功", 0, null, 0, null, 0, null, null, null, 65531)));
                    this.f95b = 1;
                    if (cc.b0.h(1000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                fc.h0 h0Var4 = o7.u.f9519o;
                fc.h0 h0Var5 = o7.u.f9519o;
                do {
                    value2 = h0Var5.getValue();
                } while (!h0Var5.f(value2, o7.u.a((o7.u) value2, o7.v.f9536c, null, 0, null, 0, null, 0, null, null, null, 65533)));
                return zVar;
            default:
                int i26 = this.f95b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                fc.h0 h0Var6 = MainActivity.f2913z;
                this.f95b = 1;
                h0Var6.l(s7.c.f12586a, this);
                return aVar;
        }
    }
}
