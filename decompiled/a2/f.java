package a2;

import androidx.compose.foundation.layout.LayoutWeightElement;
import b3.b0;
import com.google.protobuf.u;
import f0.o;
import f1.s;
import h0.h0;
import i9.l;
import java.util.ArrayList;
import java.util.List;
import n3.q;
import o2.l0;
import o2.m0;
import o2.q0;
import o2.r;
import o2.t;
import o2.v;
import o2.y;
import q2.p0;
import r1.m;
import r1.p;
import y1.e0;
import y1.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static int A(int i7, int i10, int i11) {
        return u.c0(i7) + i10 + i11;
    }

    public static int B(int i7, int i10, int i11, int i12) {
        return u.e0(i7) + i10 + i11 + i12;
    }

    public static Object C(s sVar, boolean z10, int i7) {
        sVar.p(z10);
        sVar.W(i7);
        return sVar.K();
    }

    public static String D(int i7, int i10, String str, String str2) {
        return str + i7 + str2 + i10;
    }

    public static String E(int i7, String str) {
        return str + i7;
    }

    public static String F(String str, String str2, int i7) {
        return str + i7 + str2;
    }

    public static String G(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String H(StringBuilder sb2, int i7, char c10) {
        sb2.append(i7);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String I(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static t8.j J(n9.a aVar, Integer num, s sVar, int i7) {
        t8.j jVar = new t8.j(aVar, num);
        sVar.W(i7);
        return jVar;
    }

    public static void K(int i7, int i10, int i11, int i12, int i13) {
        i2.c.k(i7);
        i2.c.k(i10);
        i2.c.k(i11);
        i2.c.k(i12);
        i2.c.k(i13);
    }

    public static void L(int i7, s sVar, m mVar, s sVar2) {
        d0.c.a(sVar2, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(i7, sVar)));
    }

    public static /* synthetic */ void M(int i7, String str) {
        if (i7 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = l.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            l.i(nullPointerException, l.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void N(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void O(int i7, String str) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(ob.a.B(str, " must not be null"));
        l.i(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static h0 P(d dVar, int i7) {
        f0.u uVar = (f0.u) dVar.f20b;
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            o oVar = (o) uVar.f4857f.getValue();
            return uVar.f4866p.a(i7, oVar.f4815j, uVar.f4855d, new b0(i7, oVar));
        } finally {
            n4.e.r(fVarH, fVarK, kVarE);
        }
    }

    public static p Q() {
        if (1.0f <= 0.0d) {
            e0.a.a("invalid weight; must be greater than zero");
        }
        return new LayoutWeightElement(1.0f, true);
    }

    public static int a(y yVar, p0 p0Var, l0 l0Var, int i7) {
        return yVar.b(new v(p0Var, p0Var.getLayoutDirection()), new o2.k(l0Var, o2.p0.f9406b, q0.f9416b, 1), n3.b.b(i7, 0, 13)).getHeight();
    }

    public static int b(m0 m0Var, r rVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new o2.k((l0) list.get(i10), o2.s.f9420b, t.f9425b, 0));
        }
        return m0Var.c(new v(rVar, rVar.getLayoutDirection()), arrayList, n3.b.b(i7, 0, 13)).getHeight();
    }

    public static int c(y yVar, p0 p0Var, l0 l0Var, int i7) {
        return yVar.b(new v(p0Var, p0Var.getLayoutDirection()), new o2.k(l0Var, o2.p0.f9406b, q0.f9415a, 1), n3.b.b(0, i7, 7)).getWidth();
    }

    public static int d(m0 m0Var, r rVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new o2.k((l0) list.get(i10), o2.s.f9420b, t.f9424a, 0));
        }
        return m0Var.c(new v(rVar, rVar.getLayoutDirection()), arrayList, n3.b.b(0, i7, 7)).getWidth();
    }

    public static m3.o e(m3.o oVar, m3.o oVar2) {
        boolean z10 = oVar2 instanceof m3.b;
        if (!z10 || !(oVar instanceof m3.b)) {
            if (!z10 || (oVar instanceof m3.b)) {
                return (z10 || !(oVar instanceof m3.b)) ? oVar2.d(new a5.e(13, oVar)) : oVar;
            }
            return oVar2;
        }
        m3.b bVar = (m3.b) oVar2;
        j0 j0Var = bVar.f8402a;
        float f10 = bVar.f8403b;
        if (Float.isNaN(f10)) {
            f10 = ((m3.b) oVar).f8403b;
        }
        return new m3.b(j0Var, f10);
    }

    public static int f(y yVar, p0 p0Var, l0 l0Var, int i7) {
        return yVar.b(new v(p0Var, p0Var.getLayoutDirection()), new o2.k(l0Var, o2.p0.f9405a, q0.f9416b, 1), n3.b.b(i7, 0, 13)).getHeight();
    }

    public static int g(m0 m0Var, r rVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new o2.k((l0) list.get(i10), o2.s.f9419a, t.f9425b, 0));
        }
        return m0Var.c(new v(rVar, rVar.getLayoutDirection()), arrayList, n3.b.b(i7, 0, 13)).getHeight();
    }

    public static int h(y yVar, p0 p0Var, l0 l0Var, int i7) {
        return yVar.b(new v(p0Var, p0Var.getLayoutDirection()), new o2.k(l0Var, o2.p0.f9405a, q0.f9415a, 1), n3.b.b(0, i7, 7)).getWidth();
    }

    public static int i(m0 m0Var, r rVar, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new o2.k((l0) list.get(i10), o2.s.f9419a, t.f9424a, 0));
        }
        return m0Var.c(new v(rVar, rVar.getLayoutDirection()), arrayList, n3.b.b(0, i7, 7)).getWidth();
    }

    public static int j(float f10, n3.c cVar) {
        float fR = cVar.R(f10);
        if (Float.isInfinite(fR)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fR);
    }

    public static float k(long j5, n3.c cVar) {
        float fC;
        float fO;
        if (!n3.s.a(q.b(j5), 4294967296L)) {
            n3.i.b("Only Sp can convert to Px");
        }
        float[] fArr = o3.b.f9451a;
        if (cVar.O() >= 1.03f) {
            o3.a aVarA = o3.b.a(cVar.O());
            fC = q.c(j5);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fO = cVar.O();
        } else {
            fC = q.c(j5);
            fO = cVar.O();
        }
        return fO * fC;
    }

    public static long l(long j5, n3.c cVar) {
        if (j5 != 9205357640488583168L) {
            return k9.a.b(cVar.L(Float.intBitsToFloat((int) (j5 >> 32))), cVar.L(Float.intBitsToFloat((int) (j5 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float m(long j5, n3.c cVar) {
        if (!n3.s.a(q.b(j5), 4294967296L)) {
            n3.i.b("Only Sp can convert to Px");
        }
        return cVar.R(cVar.s(j5));
    }

    public static long n(long j5, n3.c cVar) {
        if (j5 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fR = cVar.R(n3.h.b(j5));
        float fR2 = cVar.R(n3.h.a(j5));
        return (((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & 4294967295L);
    }

    public static long o(float f10, n3.c cVar) {
        float[] fArr = o3.b.f9451a;
        if (cVar.O() < 1.03f) {
            return n3.r.K(f10 / cVar.O(), 4294967296L);
        }
        o3.a aVarA = o3.b.a(cVar.O());
        return n3.r.K(aVarA != null ? aVarA.a(f10) : f10 / cVar.O(), 4294967296L);
    }

    public static long p(long j5, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ void r(g gVar, long j5, float f10, long j10, int i7) {
        if ((i7 & 4) != 0) {
            j10 = gVar.c0();
        }
        gVar.P(f10, j5, j10);
    }

    public static void s(g gVar, y1.f fVar, long j5, long j10, float f10, y1.k kVar, int i7, int i10) {
        gVar.q(fVar, 0L, j5, (i10 & 16) != 0 ? j5 : j10, (i10 & 32) != 0 ? 1.0f : f10, kVar, (i10 & 512) != 0 ? 1 : i7);
    }

    public static /* synthetic */ void t(g gVar, e0 e0Var, y1.m mVar, float f10, k kVar, int i7) {
        float f11 = (i7 & 4) != 0 ? 1.0f : f10;
        h hVar = kVar;
        if ((i7 & 8) != 0) {
            hVar = j.f23a;
        }
        gVar.S(e0Var, mVar, f11, hVar, (i7 & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void u(g gVar, e0 e0Var, long j5, k kVar, int i7) {
        h hVar = kVar;
        if ((i7 & 8) != 0) {
            hVar = j.f23a;
        }
        gVar.V(e0Var, j5, hVar);
    }

    public static /* synthetic */ void v(q2.j0 j0Var, y1.m mVar, long j5, long j10, float f10, h hVar, int i7) {
        if ((i7 & 2) != 0) {
            j5 = 0;
        }
        long j11 = j5;
        if ((i7 & 4) != 0) {
            j10 = p(j0Var.g(), j11);
        }
        j0Var.d(mVar, j11, j10, (i7 & 8) != 0 ? 1.0f : f10, (i7 & 16) != 0 ? j.f23a : hVar);
    }

    public static /* synthetic */ void w(g gVar, long j5, long j10, long j11, int i7) {
        if ((i7 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i7 & 4) != 0) {
            j11 = p(gVar.g(), j12);
        }
        gVar.Z(j5, j12, j11, (i7 & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void x(q2.j0 j0Var, y1.m mVar, long j5, long j10, long j11, h hVar, int i7) {
        if ((i7 & 2) != 0) {
            j5 = 0;
        }
        long j12 = j5;
        j0Var.e(mVar, j12, (i7 & 4) != 0 ? p(j0Var.g(), j12) : j10, j11, 1.0f, (i7 & 32) != 0 ? j.f23a : hVar);
    }

    public static /* synthetic */ boolean z(int i7) {
        if (i7 == 1 || i7 == 2) {
            return false;
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        throw null;
    }
}
