package z;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f15517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.h f15518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f15519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f15520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j2.d f15522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1 f15523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0.p f15524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15526j = 1;
    public d1 k = androidx.compose.foundation.gestures.a.f794b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r1 f15527l = new r1(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s0.d f15528m = new s0.d(11, this);

    public t1(n1 n1Var, x.h hVar, h hVar2, x0 x0Var, boolean z10, j2.d dVar, m1 m1Var, v0.p pVar) {
        this.f15517a = n1Var;
        this.f15518b = hVar;
        this.f15519c = hVar2;
        this.f15520d = x0Var;
        this.f15521e = z10;
        this.f15522f = dVar;
        this.f15523g = m1Var;
        this.f15524h = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j5, a9.c cVar) {
        o1 o1Var;
        t1 t1Var;
        Throwable th;
        i9.w wVar;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i7 = o1Var.f15440d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                o1Var.f15440d = i7 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object obj = o1Var.f15438b;
        int i10 = o1Var.f15440d;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = o1Var.f15437a;
            try {
                t8.a.e(obj);
                t1Var = this;
                t1Var.f15525i = false;
                return new n3.t(wVar.f6687a);
            } catch (Throwable th2) {
                th = th2;
                t1Var = this;
                t1Var.f15525i = false;
                throw th;
            }
        }
        t8.a.e(obj);
        i9.w wVar2 = new i9.w();
        wVar2.f6687a = j5;
        this.f15525i = true;
        try {
            x.v0 v0Var = x.v0.f14491a;
            t1Var = this;
            try {
                q1 q1Var = new q1(t1Var, wVar2, j5, null);
                o1Var.f15437a = wVar2;
                o1Var.f15440d = 1;
                Object objF = f(v0Var, q1Var, o1Var);
                z8.a aVar = z8.a.f15774a;
                if (objF == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                t1Var.f15525i = false;
                return new n3.t(wVar.f6687a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                t1Var.f15525i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            t1Var = this;
        }
    }

    public final Object b(long j5, boolean z10, a9.i iVar) {
        t8.z zVar = t8.z.f12851a;
        if (z10 && this.f15519c != null) {
            return zVar;
        }
        long jA = n3.t.a(j5, 0.0f, 0.0f, this.f15520d == x0.f15592b ? 1 : 2);
        s1 s1Var = new s1(this, null);
        x.h hVar = this.f15518b;
        z8.a aVar = z8.a.f15774a;
        if (hVar == null || !(this.f15517a.d() || this.f15517a.b())) {
            s1 s1Var2 = new s1(this, iVar);
            s1Var2.f15501c = jA;
            Object objInvokeSuspend = s1Var2.invokeSuspend(zVar);
            if (objInvokeSuspend == aVar) {
                return objInvokeSuspend;
            }
        } else {
            Object objB = hVar.b(jA, s1Var, iVar);
            if (objB == aVar) {
                return objB;
            }
        }
        return zVar;
    }

    public final long c(d1 d1Var, long j5, int i7) {
        j2.g gVar = this.f15522f.f6901a;
        j2.g gVar2 = null;
        j2.g gVar3 = (gVar == null || !gVar.f11129n) ? null : (j2.g) q2.f.j(gVar);
        long jG = gVar3 != null ? gVar3.G(i7, j5) : 0L;
        long jG2 = x1.b.g(j5, jG);
        long jE = e(h(d1Var.a(g(e(this.f15520d == x0.f15592b ? x1.b.a(jG2, 0.0f, 1) : x1.b.a(jG2, 0.0f, 2))))));
        m1 m1Var = this.f15523g;
        if (m1Var.f11129n) {
            ViewTreeObserver viewTreeObserver = ((r2.u) q2.f.w(m1Var)).getViewTreeObserver();
            try {
                if (r2.u.T0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    r2.u.T0 = declaredMethod;
                }
                Method method = r2.u.T0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jG3 = x1.b.g(jG2, jE);
        j2.g gVar4 = this.f15522f.f6901a;
        if (gVar4 != null && gVar4.f11129n) {
            gVar2 = (j2.g) q2.f.j(gVar4);
        }
        j2.g gVar5 = gVar2;
        return x1.b.h(x1.b.h(jG, jE), gVar5 != null ? gVar5.f0(jE, jG3, i7) : 0L);
    }

    public final float d(float f10) {
        return this.f15521e ? f10 * (-1) : f10;
    }

    public final long e(long j5) {
        return this.f15521e ? x1.b.i(-1.0f, j5) : j5;
    }

    public final Object f(x.v0 v0Var, h9.n nVar, a9.c cVar) {
        Object objC = this.f15517a.c(v0Var, new b1.f(this, nVar, (y8.c) null, 19), cVar);
        return objC == z8.a.f15774a ? objC : t8.z.f12851a;
    }

    public final float g(long j5) {
        return Float.intBitsToFloat((int) (this.f15520d == x0.f15592b ? j5 >> 32 : j5 & 4294967295L));
    }

    public final long h(float f10) {
        long jFloatToRawIntBits;
        long j5;
        if (f10 == 0.0f) {
            return 0L;
        }
        if (this.f15520d == x0.f15592b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j5 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j5 = jFloatToRawIntBits3 << 32;
        }
        return j5 | (4294967295L & jFloatToRawIntBits);
    }
}
