package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f12290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f12292j;
    public s0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f12294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f12295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f12296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y0 f12297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f12298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f12299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f12300s;

    public static z f() {
        z zVar = new z();
        zVar.f12287e = 6;
        zVar.f12288f = 6;
        s0 s0Var = s0.f12166t;
        zVar.f12290h = s0Var;
        List list = Collections.EMPTY_LIST;
        zVar.f12292j = list;
        zVar.k = s0Var;
        zVar.f12294m = list;
        zVar.f12295n = list;
        zVar.f12296o = list;
        zVar.f12297p = y0.f12278g;
        zVar.f12298q = list;
        zVar.f12299r = p.f12116e;
        zVar.f12300s = list;
        return zVar;
    }

    @Override // xa.i
    public final xa.a a() {
        a0 a0VarE = e();
        if (a0VarE.isInitialized()) {
            return a0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        a0 a0Var = null;
        try {
            try {
                a0.f11802w.getClass();
                g(new a0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                a0 a0Var2 = (a0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    a0Var = a0Var2;
                    if (a0Var != null) {
                        g(a0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (a0Var != null) {
                g(a0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((a0) nVar);
        return this;
    }

    public final Object clone() {
        z zVarF = f();
        zVarF.g(e());
        return zVarF;
    }

    public final a0 e() {
        a0 a0Var = new a0(this);
        int i7 = this.f12286d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        a0Var.f11805d = this.f12287e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        a0Var.f11806e = this.f12288f;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        a0Var.f11807f = this.f12289g;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        a0Var.f11808g = this.f12290h;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        a0Var.f11809h = this.f12291i;
        if ((i7 & 32) == 32) {
            this.f12292j = Collections.unmodifiableList(this.f12292j);
            this.f12286d &= -33;
        }
        a0Var.f11810i = this.f12292j;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        a0Var.f11811j = this.k;
        if ((i7 & 128) == 128) {
            i10 |= 64;
        }
        a0Var.k = this.f12293l;
        if ((this.f12286d & 256) == 256) {
            this.f12294m = Collections.unmodifiableList(this.f12294m);
            this.f12286d &= -257;
        }
        a0Var.f11812l = this.f12294m;
        if ((this.f12286d & 512) == 512) {
            this.f12295n = Collections.unmodifiableList(this.f12295n);
            this.f12286d &= -513;
        }
        a0Var.f11813m = this.f12295n;
        if ((this.f12286d & 1024) == 1024) {
            this.f12296o = Collections.unmodifiableList(this.f12296o);
            this.f12286d &= -1025;
        }
        a0Var.f11815o = this.f12296o;
        if ((i7 & 2048) == 2048) {
            i10 |= 128;
        }
        a0Var.f11816p = this.f12297p;
        if ((this.f12286d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            this.f12298q = Collections.unmodifiableList(this.f12298q);
            this.f12286d &= -4097;
        }
        a0Var.f11817q = this.f12298q;
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
            i10 |= 256;
        }
        a0Var.f11818r = this.f12299r;
        if ((this.f12286d & 16384) == 16384) {
            this.f12300s = Collections.unmodifiableList(this.f12300s);
            this.f12286d &= -16385;
        }
        a0Var.f11819s = this.f12300s;
        a0Var.f11804c = i10;
        return a0Var;
    }

    public final void g(a0 a0Var) {
        p pVar;
        y0 y0Var;
        s0 s0Var;
        s0 s0Var2;
        if (a0Var == a0.f11801v) {
            return;
        }
        int i7 = a0Var.f11804c;
        if ((i7 & 1) == 1) {
            int i10 = a0Var.f11805d;
            this.f12286d = 1 | this.f12286d;
            this.f12287e = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = a0Var.f11806e;
            this.f12286d = 2 | this.f12286d;
            this.f12288f = i11;
        }
        if ((i7 & 4) == 4) {
            int i12 = a0Var.f11807f;
            this.f12286d = 4 | this.f12286d;
            this.f12289g = i12;
        }
        if ((i7 & 8) == 8) {
            s0 s0Var3 = a0Var.f11808g;
            if ((this.f12286d & 8) != 8 || (s0Var2 = this.f12290h) == s0.f12166t) {
                this.f12290h = s0Var3;
            } else {
                r0 r0VarO = s0.o(s0Var2);
                r0VarO.g(s0Var3);
                this.f12290h = r0VarO.e();
            }
            this.f12286d |= 8;
        }
        if ((a0Var.f11804c & 16) == 16) {
            int i13 = a0Var.f11809h;
            this.f12286d = 16 | this.f12286d;
            this.f12291i = i13;
        }
        if (!a0Var.f11810i.isEmpty()) {
            if (this.f12292j.isEmpty()) {
                this.f12292j = a0Var.f11810i;
                this.f12286d &= -33;
            } else {
                if ((this.f12286d & 32) != 32) {
                    this.f12292j = new ArrayList(this.f12292j);
                    this.f12286d |= 32;
                }
                this.f12292j.addAll(a0Var.f11810i);
            }
        }
        if ((a0Var.f11804c & 32) == 32) {
            s0 s0Var4 = a0Var.f11811j;
            if ((this.f12286d & 64) != 64 || (s0Var = this.k) == s0.f12166t) {
                this.k = s0Var4;
            } else {
                r0 r0VarO2 = s0.o(s0Var);
                r0VarO2.g(s0Var4);
                this.k = r0VarO2.e();
            }
            this.f12286d |= 64;
        }
        if ((a0Var.f11804c & 64) == 64) {
            int i14 = a0Var.k;
            this.f12286d |= 128;
            this.f12293l = i14;
        }
        if (!a0Var.f11812l.isEmpty()) {
            if (this.f12294m.isEmpty()) {
                this.f12294m = a0Var.f11812l;
                this.f12286d &= -257;
            } else {
                if ((this.f12286d & 256) != 256) {
                    this.f12294m = new ArrayList(this.f12294m);
                    this.f12286d |= 256;
                }
                this.f12294m.addAll(a0Var.f11812l);
            }
        }
        if (!a0Var.f11813m.isEmpty()) {
            if (this.f12295n.isEmpty()) {
                this.f12295n = a0Var.f11813m;
                this.f12286d &= -513;
            } else {
                if ((this.f12286d & 512) != 512) {
                    this.f12295n = new ArrayList(this.f12295n);
                    this.f12286d |= 512;
                }
                this.f12295n.addAll(a0Var.f11813m);
            }
        }
        if (!a0Var.f11815o.isEmpty()) {
            if (this.f12296o.isEmpty()) {
                this.f12296o = a0Var.f11815o;
                this.f12286d &= -1025;
            } else {
                if ((this.f12286d & 1024) != 1024) {
                    this.f12296o = new ArrayList(this.f12296o);
                    this.f12286d |= 1024;
                }
                this.f12296o.addAll(a0Var.f11815o);
            }
        }
        if ((a0Var.f11804c & 128) == 128) {
            y0 y0Var2 = a0Var.f11816p;
            if ((this.f12286d & 2048) != 2048 || (y0Var = this.f12297p) == y0.f12278g) {
                this.f12297p = y0Var2;
            } else {
                g gVarG = y0.g(y0Var);
                gVarG.h(y0Var2);
                this.f12297p = gVarG.e();
            }
            this.f12286d |= 2048;
        }
        if (!a0Var.f11817q.isEmpty()) {
            if (this.f12298q.isEmpty()) {
                this.f12298q = a0Var.f11817q;
                this.f12286d &= -4097;
            } else {
                if ((this.f12286d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 4096) {
                    this.f12298q = new ArrayList(this.f12298q);
                    this.f12286d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                }
                this.f12298q.addAll(a0Var.f11817q);
            }
        }
        if ((a0Var.f11804c & 256) == 256) {
            p pVar2 = a0Var.f11818r;
            if ((this.f12286d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 8192 || (pVar = this.f12299r) == p.f12116e) {
                this.f12299r = pVar2;
            } else {
                o oVar = new o(0);
                oVar.f12111d = Collections.EMPTY_LIST;
                oVar.h(pVar);
                oVar.h(pVar2);
                this.f12299r = oVar.d();
            }
            this.f12286d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if (!a0Var.f11819s.isEmpty()) {
            if (this.f12300s.isEmpty()) {
                this.f12300s = a0Var.f11819s;
                this.f12286d &= -16385;
            } else {
                if ((this.f12286d & 16384) != 16384) {
                    this.f12300s = new ArrayList(this.f12300s);
                    this.f12286d |= 16384;
                }
                this.f12300s.addAll(a0Var.f11819s);
            }
        }
        d(a0Var);
        this.f14792a = this.f14792a.d(a0Var.f11803b);
    }
}
