package v;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.g1;
import f1.k1;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    static {
        t8.a.c(t8.i.f12828b, new n8.f(26));
    }

    public static final void a(s0 s0Var, p0 p0Var, Object obj, Object obj2, v vVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(867041821);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(s0Var) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(p0Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= (i7 & 512) == 0 ? sVar.f(obj) : sVar.h(obj) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 0 ? sVar.f(obj2) : sVar.h(obj2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= (32768 & i7) == 0 ? sVar.f(vVar) : sVar.h(vVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if (!sVar.N(i10 & 1, (i10 & 9363) != 9362)) {
            sVar.Q();
        } else if (((Boolean) s0Var.f13458i.getValue()).booleanValue()) {
            p0Var.f13424b.setValue(obj2);
            p0Var.f13425c.setValue(vVar);
            if (!i9.l.a(p0Var.b().f13406d, obj) || !i9.l.a(p0Var.b().f13405c, obj2)) {
                p0Var.c(obj, false);
            }
        } else {
            boolean z10 = p0Var.f13429g;
            k1 k1Var = p0Var.f13427e;
            k1 k1Var2 = p0Var.f13424b;
            k1 k1Var3 = p0Var.f13430h;
            g1 g1Var = p0Var.f13428f;
            if ((!z10 || !obj2.equals(null)) && (!i9.l.a(k1Var2.getValue(), obj2) || g1Var.f() != -1.0f)) {
                k1Var2.setValue(obj2);
                p0Var.f13425c.setValue(vVar);
                p0Var.c(g1Var.f() == -3.0f ? obj2 : k1Var3.getValue(), !((Boolean) k1Var.getValue()).booleanValue());
                k1Var.setValue(Boolean.valueOf(g1Var.f() == -3.0f));
                if (g1Var.f() >= 0.0f) {
                    k1Var3.setValue(p0Var.b().f((long) (g1Var.f() * p0Var.b().b())));
                } else if (g1Var.f() == -3.0f) {
                    k1Var3.setValue(obj2);
                }
                p0Var.f13429g = false;
                g1Var.g(-1.0f);
            }
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new t0(s0Var, p0Var, obj, obj2, vVar, i7, 0);
        }
    }

    public static final p0 b(s0 s0Var, Object obj, Object obj2, v vVar, w0 w0Var, f1.s sVar, int i7) {
        boolean zF = sVar.f(s0Var);
        Object objK = sVar.K();
        Object obj3 = f1.n.f5051a;
        if (zF || objK == obj3) {
            p1.f fVarH = n4.e.h();
            h9.k kVarE = fVarH != null ? fVarH.e() : null;
            p1.f fVarK = n4.e.k(fVarH);
            try {
                p pVar = (p) w0Var.f13471a.invoke(obj2);
                pVar.d();
                objK = new p0(s0Var, obj, pVar, w0Var);
                n4.e.r(fVarH, fVarK, kVarE);
                sVar.h0(objK);
            } catch (Throwable th) {
                n4.e.r(fVarH, fVarK, kVarE);
                throw th;
            }
        }
        p0 p0Var = (p0) objK;
        a(s0Var, p0Var, obj, obj2, vVar, sVar, 0);
        boolean zF2 = sVar.f(s0Var) | sVar.f(p0Var);
        Object objK2 = sVar.K();
        if (zF2 || objK2 == obj3) {
            objK2 = new c8.p(17, s0Var, p0Var);
            sVar.h0(objK2);
        }
        f1.b.c(p0Var, (h9.k) objK2, sVar);
        return p0Var;
    }

    public static final s0 c(Enum r8, f1.s sVar, int i7, int i10) {
        Object objK = sVar.K();
        f1.w0 w0Var = f1.n.f5051a;
        if (objK == w0Var) {
            objK = new s0(r8);
            sVar.h0(objK);
        }
        s0 s0Var = (s0) objK;
        s0Var.a(r8, sVar, (i7 & 14) | (i7 & 8) | 48);
        Object objK2 = sVar.K();
        if (objK2 == w0Var) {
            objK2 = new s0.d(6, s0Var);
            sVar.h0(objK2);
        }
        f1.b.c(s0Var, (h9.k) objK2, sVar);
        return s0Var;
    }
}
