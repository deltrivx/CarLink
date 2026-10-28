package p7;

import f1.b1;
import f1.n;
import f1.s;
import f1.w0;
import f1.w1;
import java.io.IOException;
import n3.l;
import n8.f;
import o7.o;
import v7.e;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10318a = "";

    @Override // v7.e
    public final void a() throws IOException {
        hc.c cVar = n8.c.f8897a;
        n8.c.c(new f(10));
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        l.c(sVar);
    }

    @Override // v7.e
    public final h d() {
        return h.f13652c;
    }

    @Override // v7.e
    public final int e() {
        return 0;
    }

    @Override // v7.e
    public final int f() {
        return 999;
    }

    @Override // v7.e
    public final String g() {
        return this.f10318a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        sVar.Y(-1603555569);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVar = b.f10312a;
            n1.c cVar2 = b.f10313b;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o(b1Var, 2);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVar, cVar2, false, (h9.a) objK2, sVar, 3126, 4);
            sVar.W(876367234);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.W(5004770);
                Object objK3 = sVar.K();
                if (objK3 == w0Var) {
                    objK3 = new o(b1Var, 3);
                    sVar.h0(objK3);
                }
                sVar.p(false);
                l.b((h9.a) objK3, null, b.f10314c, sVar, 390, 2);
            }
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            sVar.p(false);
            n1.c cVar3 = b.f10315d;
            n1.c cVar4 = b.f10316e;
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new o(b1Var2, 4);
                sVar.h0(objK4);
            }
            sVar.p(false);
            a.a.h(cVar3, cVar4, false, (h9.a) objK4, sVar, 3510, 0);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.W(5004770);
                Object objK5 = sVar.K();
                if (objK5 == w0Var) {
                    objK5 = new o(b1Var2, 5);
                    sVar.h0(objK5);
                }
                sVar.p(false);
                l.b((h9.a) objK5, null, b.f10317f, sVar, 390, 2);
            }
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 20, this);
        }
    }
}
