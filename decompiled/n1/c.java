package n1;

import f1.w1;
import h9.m;
import h9.n;
import h9.o;
import h9.p;
import h9.q;
import h9.r;
import h9.s;
import h9.t;
import h9.u;
import i9.b0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n, o, p, q, r, s, t, u, h9.b, h9.c, h9.d, h9.e, h9.f, h9.g, h9.h, h9.i, h9.j, h9.l, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w1 f8706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f8707e;

    public c(Object obj, int i7, boolean z10) {
        this.f8703a = i7;
        this.f8704b = z10;
        this.f8705c = obj;
    }

    @Override // h9.p
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (f1.s) obj3, ((Number) obj4).intValue());
    }

    @Override // h9.q
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h((s0.b) obj, obj2, obj3, (f1.s) obj4, ((Number) obj5).intValue());
    }

    public final Object e(int i7, f1.s sVar) {
        sVar.Y(this.f8703a);
        i(sVar);
        int iA = i7 | (sVar.f(this) ? h.a(2, 0) : h.a(1, 0));
        Object obj = this.f8705c;
        i9.l.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.d(2, obj);
        Object objInvoke = ((n) obj).invoke(sVar, Integer.valueOf(iA));
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b(2, this, c.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object f(Object obj, f1.s sVar, int i7) {
        sVar.Y(this.f8703a);
        i(sVar);
        int iA = sVar.f(this) ? h.a(2, 1) : h.a(1, 1);
        Object obj2 = this.f8705c;
        i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.d(3, obj2);
        Object objInvoke = ((o) obj2).invoke(obj, sVar, Integer.valueOf(iA | i7));
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 6, this, obj);
        }
        return objInvoke;
    }

    public final Object g(Object obj, Object obj2, f1.s sVar, int i7) {
        sVar.Y(this.f8703a);
        i(sVar);
        int iA = sVar.f(this) ? h.a(2, 2) : h.a(1, 2);
        Object obj3 = this.f8705c;
        i9.l.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.d(4, obj3);
        Object objA = ((p) obj3).a(obj, obj2, sVar, Integer.valueOf(iA | i7));
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h0.u(this, obj, obj2, i7, 3);
        }
        return objA;
    }

    public final Object h(s0.b bVar, Object obj, Object obj2, f1.s sVar, int i7) {
        sVar.Y(this.f8703a);
        i(sVar);
        int iA = sVar.f(this) ? h.a(2, 3) : h.a(1, 3);
        Object obj3 = this.f8705c;
        i9.l.c(obj3, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.d(5, obj3);
        Object objD = ((q) obj3).d(bVar, obj, obj2, sVar, Integer.valueOf(iA | i7));
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c8.q(this, bVar, obj, obj2, i7, 1);
        }
        return objD;
    }

    public final void i(f1.s sVar) {
        w1 w1VarW;
        if (!this.f8704b || (w1VarW = sVar.w()) == null) {
            return;
        }
        sVar.getClass();
        w1VarW.f5190b |= 1;
        if (h.f(this.f8706d, w1VarW)) {
            this.f8706d = w1VarW;
            return;
        }
        ArrayList arrayList = this.f8707e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f8707e = arrayList2;
            arrayList2.add(w1VarW);
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (h.f((w1) arrayList.get(i7), w1VarW)) {
                arrayList.set(i7, w1VarW);
                return;
            }
        }
        arrayList.add(w1VarW);
    }

    @Override // h9.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return e(((Number) obj2).intValue(), (f1.s) obj);
    }

    @Override // h9.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return f(obj, (f1.s) obj2, ((Number) obj3).intValue());
    }
}
