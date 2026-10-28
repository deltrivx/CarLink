package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2837e;

    public /* synthetic */ q() {
        this.f2833a = 2;
    }

    public q(p pVar) {
        this.f2833a = 0;
        this.f2836d = 0;
        u0.a(pVar, "input");
        this.f2837e = pVar;
        pVar.f2829b = this;
    }

    public q(g1.l0 l0Var) {
        this.f2833a = 1;
        this.f2837e = l0Var;
    }

    public static void A(int i7) throws w0 {
        if ((i7 & 7) != 0) {
            throw w0.f();
        }
    }

    public static void z(int i7) throws w0 {
        if ((i7 & 3) != 0) {
            throw w0.f();
        }
    }

    public int a() {
        return this.f2836d - this.f2835c;
    }

    public int b() {
        int i7 = this.f2836d;
        if (i7 != 0) {
            this.f2834b = i7;
            this.f2836d = 0;
        } else {
            this.f2834b = ((p) this.f2837e).z();
        }
        int i10 = this.f2834b;
        if (i10 == 0 || i10 == this.f2835c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public int c(int i7) {
        return ((g1.l0) this.f2837e).f5798i[this.f2835c + i7];
    }

    public Object d(int i7) {
        return ((g1.l0) this.f2837e).k[this.f2836d + i7];
    }

    public void e(Object obj, x1 x1Var, y yVar) {
        int i7 = this.f2835c;
        this.f2835c = ((this.f2834b >>> 3) << 3) | 4;
        try {
            x1Var.c(obj, this, yVar);
            if (this.f2834b != this.f2835c) {
                throw w0.f();
            }
            this.f2835c = i7;
        } catch (Throwable th) {
            this.f2835c = i7;
            throw th;
        }
    }

    public void f(Object obj, x1 x1Var, y yVar) throws w0 {
        p pVar = (p) this.f2837e;
        int iA = pVar.A();
        if (pVar.f2828a >= 100) {
            throw new w0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int i7 = pVar.i(iA);
        pVar.f2828a++;
        x1Var.c(obj, this, yVar);
        pVar.a(0);
        pVar.f2828a--;
        pVar.h(i7);
    }

    public void g(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof g)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Boolean.valueOf(pVar.j()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Boolean.valueOf(pVar.j()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        g gVar = (g) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                gVar.d(pVar.j());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            gVar.d(pVar.j());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public l h() throws v0 {
        y(2);
        return ((p) this.f2837e).k();
    }

    public void i(List list) throws v0 {
        int iZ;
        p pVar = (p) this.f2837e;
        if ((this.f2834b & 7) != 2) {
            throw w0.c();
        }
        do {
            list.add(h());
            if (pVar.e()) {
                return;
            } else {
                iZ = pVar.z();
            }
        } while (iZ == this.f2834b);
        this.f2836d = iZ;
    }

    public void j(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof v)) {
            int i7 = this.f2834b & 7;
            if (i7 == 1) {
                do {
                    list.add(Double.valueOf(pVar.l()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iA = pVar.A();
            A(iA);
            int iD = pVar.d() + iA;
            do {
                list.add(Double.valueOf(pVar.l()));
            } while (pVar.d() < iD);
            return;
        }
        v vVar = (v) list;
        int i10 = this.f2834b & 7;
        if (i10 == 1) {
            do {
                vVar.d(pVar.l());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iA2 = pVar.A();
        A(iA2);
        int iD2 = pVar.d() + iA2;
        do {
            vVar.d(pVar.l());
        } while (pVar.d() < iD2);
    }

    public void k(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof k0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.m()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Integer.valueOf(pVar.m()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                k0Var.d(pVar.m());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            k0Var.d(pVar.m());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public void l(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof k0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 2) {
                int iA = pVar.A();
                z(iA);
                int iD = pVar.d() + iA;
                do {
                    list.add(Integer.valueOf(pVar.n()));
                } while (pVar.d() < iD);
                return;
            }
            if (i7 != 5) {
                throw w0.c();
            }
            do {
                list.add(Integer.valueOf(pVar.n()));
                if (pVar.e()) {
                    return;
                } else {
                    iZ = pVar.z();
                }
            } while (iZ == this.f2834b);
            this.f2836d = iZ;
            return;
        }
        k0 k0Var = (k0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 2) {
            int iA2 = pVar.A();
            z(iA2);
            int iD2 = pVar.d() + iA2;
            do {
                k0Var.d(pVar.n());
            } while (pVar.d() < iD2);
            return;
        }
        if (i10 != 5) {
            throw w0.c();
        }
        do {
            k0Var.d(pVar.n());
            if (pVar.e()) {
                return;
            } else {
                iZ2 = pVar.z();
            }
        } while (iZ2 == this.f2834b);
        this.f2836d = iZ2;
    }

    public void m(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof d1)) {
            int i7 = this.f2834b & 7;
            if (i7 == 1) {
                do {
                    list.add(Long.valueOf(pVar.o()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iA = pVar.A();
            A(iA);
            int iD = pVar.d() + iA;
            do {
                list.add(Long.valueOf(pVar.o()));
            } while (pVar.d() < iD);
            return;
        }
        d1 d1Var = (d1) list;
        int i10 = this.f2834b & 7;
        if (i10 == 1) {
            do {
                d1Var.d(pVar.o());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iA2 = pVar.A();
        A(iA2);
        int iD2 = pVar.d() + iA2;
        do {
            d1Var.d(pVar.o());
        } while (pVar.d() < iD2);
    }

    public void n(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof c0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 2) {
                int iA = pVar.A();
                z(iA);
                int iD = pVar.d() + iA;
                do {
                    list.add(Float.valueOf(pVar.p()));
                } while (pVar.d() < iD);
                return;
            }
            if (i7 != 5) {
                throw w0.c();
            }
            do {
                list.add(Float.valueOf(pVar.p()));
                if (pVar.e()) {
                    return;
                } else {
                    iZ = pVar.z();
                }
            } while (iZ == this.f2834b);
            this.f2836d = iZ;
            return;
        }
        c0 c0Var = (c0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 2) {
            int iA2 = pVar.A();
            z(iA2);
            int iD2 = pVar.d() + iA2;
            do {
                c0Var.d(pVar.p());
            } while (pVar.d() < iD2);
            return;
        }
        if (i10 != 5) {
            throw w0.c();
        }
        do {
            c0Var.d(pVar.p());
            if (pVar.e()) {
                return;
            } else {
                iZ2 = pVar.z();
            }
        } while (iZ2 == this.f2834b);
        this.f2836d = iZ2;
    }

    public void o(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof k0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.q()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Integer.valueOf(pVar.q()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                k0Var.d(pVar.q());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            k0Var.d(pVar.q());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public void p(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof d1)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(pVar.r()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Long.valueOf(pVar.r()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        d1 d1Var = (d1) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                d1Var.d(pVar.r());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            d1Var.d(pVar.r());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public void q(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof k0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 2) {
                int iA = pVar.A();
                z(iA);
                int iD = pVar.d() + iA;
                do {
                    list.add(Integer.valueOf(pVar.t()));
                } while (pVar.d() < iD);
                return;
            }
            if (i7 != 5) {
                throw w0.c();
            }
            do {
                list.add(Integer.valueOf(pVar.t()));
                if (pVar.e()) {
                    return;
                } else {
                    iZ = pVar.z();
                }
            } while (iZ == this.f2834b);
            this.f2836d = iZ;
            return;
        }
        k0 k0Var = (k0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 2) {
            int iA2 = pVar.A();
            z(iA2);
            int iD2 = pVar.d() + iA2;
            do {
                k0Var.d(pVar.t());
            } while (pVar.d() < iD2);
            return;
        }
        if (i10 != 5) {
            throw w0.c();
        }
        do {
            k0Var.d(pVar.t());
            if (pVar.e()) {
                return;
            } else {
                iZ2 = pVar.z();
            }
        } while (iZ2 == this.f2834b);
        this.f2836d = iZ2;
    }

    public void r(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof d1)) {
            int i7 = this.f2834b & 7;
            if (i7 == 1) {
                do {
                    list.add(Long.valueOf(pVar.u()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iA = pVar.A();
            A(iA);
            int iD = pVar.d() + iA;
            do {
                list.add(Long.valueOf(pVar.u()));
            } while (pVar.d() < iD);
            return;
        }
        d1 d1Var = (d1) list;
        int i10 = this.f2834b & 7;
        if (i10 == 1) {
            do {
                d1Var.d(pVar.u());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iA2 = pVar.A();
        A(iA2);
        int iD2 = pVar.d() + iA2;
        do {
            d1Var.d(pVar.u());
        } while (pVar.d() < iD2);
    }

    public void s(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof k0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.v()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Integer.valueOf(pVar.v()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                k0Var.d(pVar.v());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            k0Var.d(pVar.v());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public void t(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof d1)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(pVar.w()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Long.valueOf(pVar.w()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        d1 d1Var = (d1) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                d1Var.d(pVar.w());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            d1Var.d(pVar.w());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public String toString() {
        switch (this.f2833a) {
            case 2:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(List list, boolean z10) throws v0 {
        String strX;
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if ((this.f2834b & 7) != 2) {
            throw w0.c();
        }
        if ((list instanceof z0) && !z10) {
            z0 z0Var = (z0) list;
            do {
                z0Var.f(h());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        do {
            if (z10) {
                y(2);
                strX = pVar.y();
            } else {
                y(2);
                strX = pVar.x();
            }
            list.add(strX);
            if (pVar.e()) {
                return;
            } else {
                iZ = pVar.z();
            }
        } while (iZ == this.f2834b);
        this.f2836d = iZ;
    }

    public void v(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof k0)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.A()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Integer.valueOf(pVar.A()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                k0Var.d(pVar.A());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            k0Var.d(pVar.A());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public void w(List list) throws w0 {
        int iZ;
        int iZ2;
        p pVar = (p) this.f2837e;
        if (!(list instanceof d1)) {
            int i7 = this.f2834b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(pVar.B()));
                    if (pVar.e()) {
                        return;
                    } else {
                        iZ = pVar.z();
                    }
                } while (iZ == this.f2834b);
                this.f2836d = iZ;
                return;
            }
            if (i7 != 2) {
                throw w0.c();
            }
            int iD = pVar.d() + pVar.A();
            do {
                list.add(Long.valueOf(pVar.B()));
            } while (pVar.d() < iD);
            x(iD);
            return;
        }
        d1 d1Var = (d1) list;
        int i10 = this.f2834b & 7;
        if (i10 == 0) {
            do {
                d1Var.d(pVar.B());
                if (pVar.e()) {
                    return;
                } else {
                    iZ2 = pVar.z();
                }
            } while (iZ2 == this.f2834b);
            this.f2836d = iZ2;
            return;
        }
        if (i10 != 2) {
            throw w0.c();
        }
        int iD2 = pVar.d() + pVar.A();
        do {
            d1Var.d(pVar.B());
        } while (pVar.d() < iD2);
        x(iD2);
    }

    public void x(int i7) throws w0 {
        if (((p) this.f2837e).d() != i7) {
            throw w0.g();
        }
    }

    public void y(int i7) throws v0 {
        if ((this.f2834b & 7) != i7) {
            throw w0.c();
        }
    }
}
