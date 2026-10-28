package rc;

import i9.y;
import i9.z;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import o9.e0;
import pc.q0;
import pc.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements qc.h, oc.b, oc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12311a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.b f12313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oa.r f12315e;

    public a(qc.b bVar, String str) {
        this.f12313c = bVar;
        this.f12314d = str;
        this.f12315e = bVar.f11033a;
    }

    @Override // oc.b
    public final double A() {
        return H(R());
    }

    public abstract qc.j B(String str);

    public final qc.j C() {
        qc.j jVarB;
        String str = (String) u8.p.t0(this.f12311a);
        return (str == null || (jVarB = B(str)) == null) ? Q() : jVarB;
    }

    public final Object D(mc.a aVar) {
        i9.l.e(aVar, "deserializer");
        if (!(aVar instanceof mc.d)) {
            return aVar.c(this);
        }
        qc.b bVar = this.f12313c;
        bVar.f11033a.getClass();
        mc.d dVar = (mc.d) aVar;
        String strH = j.h(dVar.d(), bVar);
        qc.j jVarC = C();
        String strH2 = dVar.d().h();
        if (!(jVarC instanceof qc.u)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.u.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarC.getClass()).l());
            sb2.append(" as the serialized body of ");
            sb2.append(strH2);
            sb2.append(" at element: ");
            sb2.append(S());
            throw j.e(sb2.toString(), jVarC.toString(), -1);
        }
        qc.u uVar = (qc.u) jVarC;
        qc.j jVar = (qc.j) uVar.get(strH);
        String strC = null;
        if (jVar != null) {
            qc.y yVarA = qc.k.a(jVar);
            if (!(yVarA instanceof qc.r)) {
                strC = yVarA.c();
            }
        }
        try {
            return j.m(bVar, strH, uVar, e0.u((mc.d) aVar, this, strC));
        } catch (mc.e e7) {
            String message = e7.getMessage();
            i9.l.b(message);
            throw j.e(message, uVar.toString(), -1);
        }
    }

    public final boolean E(Object obj) {
        Boolean bool;
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of boolean at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            x xVar = qc.k.f11042a;
            String strC = yVar.c();
            String[] strArr = u.f12368a;
            i9.l.e(strC, "<this>");
            if (strC.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strC.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            U(yVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            U(yVar, "boolean", str);
            throw null;
        }
    }

    public final byte F(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of byte at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            long jB = qc.k.b(yVar);
            Byte bValueOf = (-128 > jB || jB > 127) ? null : Byte.valueOf((byte) jB);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            U(yVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            U(yVar, "byte", str);
            throw null;
        }
    }

    public final char G(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of char at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            String strC = yVar.c();
            i9.l.e(strC, "<this>");
            int length = strC.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strC.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            U(yVar, "char", str);
            throw null;
        }
    }

    public final double H(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of double at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            x xVar = qc.k.f11042a;
            double d10 = Double.parseDouble(yVar.c());
            this.f12313c.f11033a.getClass();
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            throw j.a(Double.valueOf(d10), str, C().toString());
        } catch (IllegalArgumentException unused) {
            U(yVar, "double", str);
            throw null;
        }
    }

    public final float I(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of float at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            x xVar = qc.k.f11042a;
            float f10 = Float.parseFloat(yVar.c());
            this.f12313c.f11033a.getClass();
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            throw j.a(Float.valueOf(f10), str, C().toString());
        } catch (IllegalArgumentException unused) {
            U(yVar, "float", str);
            throw null;
        }
    }

    public final oc.b J(Object obj, nc.e eVar) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        i9.l.e(eVar, "inlineDescriptor");
        if (!t.a(eVar)) {
            this.f12311a.add(str);
            return this;
        }
        qc.j jVarB = B(str);
        String strH = eVar.h();
        if (jVarB instanceof qc.y) {
            String strC = ((qc.y) jVarB).c();
            qc.b bVar = this.f12313c;
            i9.l.e(bVar, "json");
            i9.l.e(strC, "source");
            bVar.f11033a.getClass();
            return new g(new ja.e(strC), bVar);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        z zVar = y.f6689a;
        sb2.append(zVar.b(qc.y.class).l());
        sb2.append(", but had ");
        sb2.append(zVar.b(jVarB.getClass()).l());
        sb2.append(" as the serialized body of ");
        sb2.append(strH);
        sb2.append(" at element: ");
        sb2.append(T(str));
        throw j.e(sb2.toString(), jVarB.toString(), -1);
    }

    public final int K(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of int at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            long jB = qc.k.b(yVar);
            Integer numValueOf = (-2147483648L > jB || jB > 2147483647L) ? null : Integer.valueOf((int) jB);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            U(yVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            U(yVar, "int", str);
            throw null;
        }
    }

    public final long L(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (jVarB instanceof qc.y) {
            qc.y yVar = (qc.y) jVarB;
            try {
                return qc.k.b(yVar);
            } catch (IllegalArgumentException unused) {
                U(yVar, "long", str);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        z zVar = y.f6689a;
        sb2.append(zVar.b(qc.y.class).l());
        sb2.append(", but had ");
        sb2.append(zVar.b(jVarB.getClass()).l());
        sb2.append(" as the serialized body of long at element: ");
        sb2.append(T(str));
        throw j.e(sb2.toString(), jVarB.toString(), -1);
    }

    public final short M(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of short at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        try {
            long jB = qc.k.b(yVar);
            Short shValueOf = (-32768 > jB || jB > 32767) ? null : Short.valueOf((short) jB);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            U(yVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            U(yVar, "short", str);
            throw null;
        }
    }

    public final String N(Object obj) {
        String str = (String) obj;
        i9.l.e(str, "tag");
        qc.j jVarB = B(str);
        if (!(jVarB instanceof qc.y)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.y.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarB.getClass()).l());
            sb2.append(" as the serialized body of string at element: ");
            sb2.append(T(str));
            throw j.e(sb2.toString(), jVarB.toString(), -1);
        }
        qc.y yVar = (qc.y) jVarB;
        if (!(yVar instanceof qc.o)) {
            throw j.e("Expected string value for a non-null key '" + str + "', got null literal instead at element: " + T(str), C().toString(), -1);
        }
        qc.o oVar = (qc.o) yVar;
        if (oVar.f11046a) {
            return oVar.f11047b;
        }
        this.f12313c.f11033a.getClass();
        throw j.e("String literal for key '" + str + "' should be quoted at element: " + T(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", C().toString(), -1);
    }

    public String O(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return eVar.l(i7);
    }

    public final String P(nc.e eVar, int i7) {
        i9.l.e(eVar, "<this>");
        String strO = O(eVar, i7);
        i9.l.e(strO, "nestedName");
        return strO;
    }

    public abstract qc.j Q();

    public final Object R() {
        ArrayList arrayList = this.f12311a;
        Object objRemove = arrayList.remove(n3.l.A(arrayList));
        this.f12312b = true;
        return objRemove;
    }

    public final String S() {
        ArrayList arrayList = this.f12311a;
        return arrayList.isEmpty() ? "$" : u8.p.q0(arrayList, ".", "$.", null, null, 60);
    }

    public final String T(String str) {
        i9.l.e(str, "currentTag");
        return S() + '.' + str;
    }

    public final void U(qc.y yVar, String str, String str2) {
        throw j.e("Failed to parse literal '" + yVar + "' as " + (zb.q.o0(str, "i") ? "an " : "a ").concat(str) + " value at element: " + T(str2), C().toString(), -1);
    }

    @Override // oc.a
    public final long a(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return L(P(eVar, i7));
    }

    @Override // oc.b
    public final boolean b() {
        return E(R());
    }

    @Override // oc.b
    public final char c() {
        return G(R());
    }

    @Override // oc.a
    public final double d(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return H(P(eVar, i7));
    }

    @Override // oc.a
    public final byte e(q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return F(P(q0Var, i7));
    }

    @Override // oc.a
    public final short f(q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return M(P(q0Var, i7));
    }

    @Override // qc.h
    public final qc.j g() {
        return C();
    }

    @Override // oc.b
    public final int h() {
        return K(R());
    }

    @Override // oc.a
    public final float i(q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return I(P(q0Var, i7));
    }

    @Override // oc.a
    public final n4.e j() {
        return this.f12313c.f11034b;
    }

    @Override // oc.a
    public final oc.b k(q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return J(P(q0Var, i7), q0Var.n(i7));
    }

    @Override // oc.b
    public final String l() {
        return N(R());
    }

    @Override // oc.b
    public oc.a m(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        qc.j jVarC = C();
        n4.h hVarF = eVar.f();
        boolean zA = i9.l.a(hVarF, nc.i.f9091d);
        qc.b bVar = this.f12313c;
        if (zA || (hVarF instanceof nc.b)) {
            String strH = eVar.h();
            if (jVarC instanceof qc.d) {
                return new n(bVar, (qc.d) jVarC);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            z zVar = y.f6689a;
            sb2.append(zVar.b(qc.d.class).l());
            sb2.append(", but had ");
            sb2.append(zVar.b(jVarC.getClass()).l());
            sb2.append(" as the serialized body of ");
            sb2.append(strH);
            sb2.append(" at element: ");
            sb2.append(S());
            throw j.e(sb2.toString(), jVarC.toString(), -1);
        }
        if (!i9.l.a(hVarF, nc.i.f9092e)) {
            String strH2 = eVar.h();
            if (jVarC instanceof qc.u) {
                return new m(bVar, (qc.u) jVarC, this.f12314d, 8);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            z zVar2 = y.f6689a;
            sb3.append(zVar2.b(qc.u.class).l());
            sb3.append(", but had ");
            sb3.append(zVar2.b(jVarC.getClass()).l());
            sb3.append(" as the serialized body of ");
            sb3.append(strH2);
            sb3.append(" at element: ");
            sb3.append(S());
            throw j.e(sb3.toString(), jVarC.toString(), -1);
        }
        nc.e eVarF = j.f(eVar.n(0), bVar.f11034b);
        n4.h hVarF2 = eVarF.f();
        if (!(hVarF2 instanceof nc.d) && !i9.l.a(hVarF2, nc.h.f9089c)) {
            bVar.f11033a.getClass();
            throw j.c(eVarF);
        }
        String strH3 = eVar.h();
        if (jVarC instanceof qc.u) {
            return new o(bVar, (qc.u) jVarC);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        z zVar3 = y.f6689a;
        sb4.append(zVar3.b(qc.u.class).l());
        sb4.append(", but had ");
        sb4.append(zVar3.b(jVarC.getClass()).l());
        sb4.append(" as the serialized body of ");
        sb4.append(strH3);
        sb4.append(" at element: ");
        sb4.append(S());
        throw j.e(sb4.toString(), jVarC.toString(), -1);
    }

    @Override // oc.b
    public final long n() {
        return L(R());
    }

    @Override // oc.b
    public boolean o() {
        return !(C() instanceof qc.r);
    }

    @Override // oc.a
    public void p(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
    }

    @Override // oc.a
    public final boolean q(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return E(P(eVar, i7));
    }

    @Override // oc.b
    public final oc.b r(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        if (u8.p.t0(this.f12311a) != null) {
            return J(R(), eVar);
        }
        return new l(this.f12313c, Q(), this.f12314d).r(eVar);
    }

    @Override // oc.a
    public final String s(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return N(P(eVar, i7));
    }

    @Override // oc.a
    public final Object t(nc.e eVar, int i7, mc.a aVar, Object obj) {
        i9.l.e(eVar, "descriptor");
        i9.l.e(aVar, "deserializer");
        this.f12311a.add(P(eVar, i7));
        Object objD = D(aVar);
        if (!this.f12312b) {
            R();
        }
        this.f12312b = false;
        return objD;
    }

    @Override // oc.a
    public final int u(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return K(P(eVar, i7));
    }

    @Override // oc.a
    public final char v(q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return G(P(q0Var, i7));
    }

    @Override // oc.b
    public final byte x() {
        return F(R());
    }

    @Override // oc.b
    public final short y() {
        return M(R());
    }

    @Override // oc.b
    public final float z() {
        return I(R());
    }
}
