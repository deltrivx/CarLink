package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xa.j {
    public List A;
    public f1 B;
    public List C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f11987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f11988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f11989j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f11990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f11991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f11992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f11993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f11994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f11995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f11996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f11997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11998t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s0 f11999u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f12001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f12002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f12003y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y0 f12004z;

    public static i f() {
        i iVar = new i();
        iVar.f11984e = 6;
        List list = Collections.EMPTY_LIST;
        iVar.f11987h = list;
        iVar.f11988i = list;
        iVar.f11989j = list;
        iVar.k = list;
        iVar.f11990l = list;
        iVar.f11991m = list;
        iVar.f11992n = list;
        iVar.f11993o = list;
        iVar.f11994p = list;
        iVar.f11995q = list;
        iVar.f11996r = list;
        iVar.f11997s = list;
        iVar.f11999u = s0.f12166t;
        iVar.f12001w = list;
        iVar.f12002x = list;
        iVar.f12003y = list;
        iVar.f12004z = y0.f12278g;
        iVar.A = list;
        iVar.B = f1.f11939e;
        iVar.C = list;
        return iVar;
    }

    @Override // xa.i
    public final xa.a a() {
        k kVarE = e();
        if (kVarE.isInitialized()) {
            return kVarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        k kVar = null;
        try {
            try {
                k.L.getClass();
                g(new k(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                k kVar2 = (k) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    kVar = kVar2;
                    if (kVar != null) {
                        g(kVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (kVar != null) {
                g(kVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((k) nVar);
        return this;
    }

    public final Object clone() {
        i iVarF = f();
        iVarF.g(e());
        return iVarF;
    }

    public final k e() {
        k kVar = new k(this);
        int i7 = this.f11983d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        kVar.f12039d = this.f11984e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        kVar.f12040e = this.f11985f;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        kVar.f12041f = this.f11986g;
        if ((i7 & 8) == 8) {
            this.f11987h = Collections.unmodifiableList(this.f11987h);
            this.f11983d &= -9;
        }
        kVar.f12042g = this.f11987h;
        if ((this.f11983d & 16) == 16) {
            this.f11988i = Collections.unmodifiableList(this.f11988i);
            this.f11983d &= -17;
        }
        kVar.f12043h = this.f11988i;
        if ((this.f11983d & 32) == 32) {
            this.f11989j = Collections.unmodifiableList(this.f11989j);
            this.f11983d &= -33;
        }
        kVar.f12044i = this.f11989j;
        if ((this.f11983d & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
            this.f11983d &= -65;
        }
        kVar.k = this.k;
        if ((this.f11983d & 128) == 128) {
            this.f11990l = Collections.unmodifiableList(this.f11990l);
            this.f11983d &= -129;
        }
        kVar.f12047m = this.f11990l;
        if ((this.f11983d & 256) == 256) {
            this.f11991m = Collections.unmodifiableList(this.f11991m);
            this.f11983d &= -257;
        }
        kVar.f12048n = this.f11991m;
        if ((this.f11983d & 512) == 512) {
            this.f11992n = Collections.unmodifiableList(this.f11992n);
            this.f11983d &= -513;
        }
        kVar.f12050p = this.f11992n;
        if ((this.f11983d & 1024) == 1024) {
            this.f11993o = Collections.unmodifiableList(this.f11993o);
            this.f11983d &= -1025;
        }
        kVar.f12051q = this.f11993o;
        if ((this.f11983d & 2048) == 2048) {
            this.f11994p = Collections.unmodifiableList(this.f11994p);
            this.f11983d &= -2049;
        }
        kVar.f12052r = this.f11994p;
        if ((this.f11983d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            this.f11995q = Collections.unmodifiableList(this.f11995q);
            this.f11983d &= -4097;
        }
        kVar.f12053s = this.f11995q;
        if ((this.f11983d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
            this.f11996r = Collections.unmodifiableList(this.f11996r);
            this.f11983d &= -8193;
        }
        kVar.f12054t = this.f11996r;
        if ((this.f11983d & 16384) == 16384) {
            this.f11997s = Collections.unmodifiableList(this.f11997s);
            this.f11983d &= -16385;
        }
        kVar.f12055u = this.f11997s;
        if ((i7 & 32768) == 32768) {
            i10 |= 8;
        }
        kVar.f12057w = this.f11998t;
        if ((i7 & 65536) == 65536) {
            i10 |= 16;
        }
        kVar.f12058x = this.f11999u;
        if ((i7 & 131072) == 131072) {
            i10 |= 32;
        }
        kVar.f12059y = this.f12000v;
        if ((this.f11983d & 262144) == 262144) {
            this.f12001w = Collections.unmodifiableList(this.f12001w);
            this.f11983d &= -262145;
        }
        kVar.f12060z = this.f12001w;
        if ((this.f11983d & 524288) == 524288) {
            this.f12002x = Collections.unmodifiableList(this.f12002x);
            this.f11983d &= -524289;
        }
        kVar.B = this.f12002x;
        if ((this.f11983d & 1048576) == 1048576) {
            this.f12003y = Collections.unmodifiableList(this.f12003y);
            this.f11983d &= -1048577;
        }
        kVar.C = this.f12003y;
        if ((i7 & 2097152) == 2097152) {
            i10 |= 64;
        }
        kVar.E = this.f12004z;
        if ((this.f11983d & 4194304) == 4194304) {
            this.A = Collections.unmodifiableList(this.A);
            this.f11983d &= -4194305;
        }
        kVar.F = this.A;
        if ((i7 & 8388608) == 8388608) {
            i10 |= 128;
        }
        kVar.G = this.B;
        if ((this.f11983d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL) == 16777216) {
            this.C = Collections.unmodifiableList(this.C);
            this.f11983d &= -16777217;
        }
        kVar.H = this.C;
        kVar.f12038c = i10;
        return kVar;
    }

    public final void g(k kVar) {
        f1 f1Var;
        y0 y0Var;
        s0 s0Var;
        if (kVar == k.K) {
            return;
        }
        int i7 = kVar.f12038c;
        if ((i7 & 1) == 1) {
            int i10 = kVar.f12039d;
            this.f11983d = 1 | this.f11983d;
            this.f11984e = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = kVar.f12040e;
            this.f11983d = 2 | this.f11983d;
            this.f11985f = i11;
        }
        if ((i7 & 4) == 4) {
            int i12 = kVar.f12041f;
            this.f11983d = 4 | this.f11983d;
            this.f11986g = i12;
        }
        if (!kVar.f12042g.isEmpty()) {
            if (this.f11987h.isEmpty()) {
                this.f11987h = kVar.f12042g;
                this.f11983d &= -9;
            } else {
                if ((this.f11983d & 8) != 8) {
                    this.f11987h = new ArrayList(this.f11987h);
                    this.f11983d |= 8;
                }
                this.f11987h.addAll(kVar.f12042g);
            }
        }
        if (!kVar.f12043h.isEmpty()) {
            if (this.f11988i.isEmpty()) {
                this.f11988i = kVar.f12043h;
                this.f11983d &= -17;
            } else {
                if ((this.f11983d & 16) != 16) {
                    this.f11988i = new ArrayList(this.f11988i);
                    this.f11983d |= 16;
                }
                this.f11988i.addAll(kVar.f12043h);
            }
        }
        if (!kVar.f12044i.isEmpty()) {
            if (this.f11989j.isEmpty()) {
                this.f11989j = kVar.f12044i;
                this.f11983d &= -33;
            } else {
                if ((this.f11983d & 32) != 32) {
                    this.f11989j = new ArrayList(this.f11989j);
                    this.f11983d |= 32;
                }
                this.f11989j.addAll(kVar.f12044i);
            }
        }
        if (!kVar.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = kVar.k;
                this.f11983d &= -65;
            } else {
                if ((this.f11983d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.f11983d |= 64;
                }
                this.k.addAll(kVar.k);
            }
        }
        if (!kVar.f12047m.isEmpty()) {
            if (this.f11990l.isEmpty()) {
                this.f11990l = kVar.f12047m;
                this.f11983d &= -129;
            } else {
                if ((this.f11983d & 128) != 128) {
                    this.f11990l = new ArrayList(this.f11990l);
                    this.f11983d |= 128;
                }
                this.f11990l.addAll(kVar.f12047m);
            }
        }
        if (!kVar.f12048n.isEmpty()) {
            if (this.f11991m.isEmpty()) {
                this.f11991m = kVar.f12048n;
                this.f11983d &= -257;
            } else {
                if ((this.f11983d & 256) != 256) {
                    this.f11991m = new ArrayList(this.f11991m);
                    this.f11983d |= 256;
                }
                this.f11991m.addAll(kVar.f12048n);
            }
        }
        if (!kVar.f12050p.isEmpty()) {
            if (this.f11992n.isEmpty()) {
                this.f11992n = kVar.f12050p;
                this.f11983d &= -513;
            } else {
                if ((this.f11983d & 512) != 512) {
                    this.f11992n = new ArrayList(this.f11992n);
                    this.f11983d |= 512;
                }
                this.f11992n.addAll(kVar.f12050p);
            }
        }
        if (!kVar.f12051q.isEmpty()) {
            if (this.f11993o.isEmpty()) {
                this.f11993o = kVar.f12051q;
                this.f11983d &= -1025;
            } else {
                if ((this.f11983d & 1024) != 1024) {
                    this.f11993o = new ArrayList(this.f11993o);
                    this.f11983d |= 1024;
                }
                this.f11993o.addAll(kVar.f12051q);
            }
        }
        if (!kVar.f12052r.isEmpty()) {
            if (this.f11994p.isEmpty()) {
                this.f11994p = kVar.f12052r;
                this.f11983d &= -2049;
            } else {
                if ((this.f11983d & 2048) != 2048) {
                    this.f11994p = new ArrayList(this.f11994p);
                    this.f11983d |= 2048;
                }
                this.f11994p.addAll(kVar.f12052r);
            }
        }
        if (!kVar.f12053s.isEmpty()) {
            if (this.f11995q.isEmpty()) {
                this.f11995q = kVar.f12053s;
                this.f11983d &= -4097;
            } else {
                if ((this.f11983d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 4096) {
                    this.f11995q = new ArrayList(this.f11995q);
                    this.f11983d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                }
                this.f11995q.addAll(kVar.f12053s);
            }
        }
        if (!kVar.f12054t.isEmpty()) {
            if (this.f11996r.isEmpty()) {
                this.f11996r = kVar.f12054t;
                this.f11983d &= -8193;
            } else {
                if ((this.f11983d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 8192) {
                    this.f11996r = new ArrayList(this.f11996r);
                    this.f11983d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                }
                this.f11996r.addAll(kVar.f12054t);
            }
        }
        if (!kVar.f12055u.isEmpty()) {
            if (this.f11997s.isEmpty()) {
                this.f11997s = kVar.f12055u;
                this.f11983d &= -16385;
            } else {
                if ((this.f11983d & 16384) != 16384) {
                    this.f11997s = new ArrayList(this.f11997s);
                    this.f11983d |= 16384;
                }
                this.f11997s.addAll(kVar.f12055u);
            }
        }
        int i13 = kVar.f12038c;
        if ((i13 & 8) == 8) {
            int i14 = kVar.f12057w;
            this.f11983d |= 32768;
            this.f11998t = i14;
        }
        if ((i13 & 16) == 16) {
            s0 s0Var2 = kVar.f12058x;
            if ((this.f11983d & 65536) != 65536 || (s0Var = this.f11999u) == s0.f12166t) {
                this.f11999u = s0Var2;
            } else {
                r0 r0VarO = s0.o(s0Var);
                r0VarO.g(s0Var2);
                this.f11999u = r0VarO.e();
            }
            this.f11983d |= 65536;
        }
        if ((kVar.f12038c & 32) == 32) {
            int i15 = kVar.f12059y;
            this.f11983d |= 131072;
            this.f12000v = i15;
        }
        if (!kVar.f12060z.isEmpty()) {
            if (this.f12001w.isEmpty()) {
                this.f12001w = kVar.f12060z;
                this.f11983d &= -262145;
            } else {
                if ((this.f11983d & 262144) != 262144) {
                    this.f12001w = new ArrayList(this.f12001w);
                    this.f11983d |= 262144;
                }
                this.f12001w.addAll(kVar.f12060z);
            }
        }
        if (!kVar.B.isEmpty()) {
            if (this.f12002x.isEmpty()) {
                this.f12002x = kVar.B;
                this.f11983d &= -524289;
            } else {
                if ((this.f11983d & 524288) != 524288) {
                    this.f12002x = new ArrayList(this.f12002x);
                    this.f11983d |= 524288;
                }
                this.f12002x.addAll(kVar.B);
            }
        }
        if (!kVar.C.isEmpty()) {
            if (this.f12003y.isEmpty()) {
                this.f12003y = kVar.C;
                this.f11983d &= -1048577;
            } else {
                if ((this.f11983d & 1048576) != 1048576) {
                    this.f12003y = new ArrayList(this.f12003y);
                    this.f11983d |= 1048576;
                }
                this.f12003y.addAll(kVar.C);
            }
        }
        if ((kVar.f12038c & 64) == 64) {
            y0 y0Var2 = kVar.E;
            if ((this.f11983d & 2097152) != 2097152 || (y0Var = this.f12004z) == y0.f12278g) {
                this.f12004z = y0Var2;
            } else {
                g gVarG = y0.g(y0Var);
                gVarG.h(y0Var2);
                this.f12004z = gVarG.e();
            }
            this.f11983d |= 2097152;
        }
        if (!kVar.F.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = kVar.F;
                this.f11983d &= -4194305;
            } else {
                if ((this.f11983d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.f11983d |= 4194304;
                }
                this.A.addAll(kVar.F);
            }
        }
        if ((kVar.f12038c & 128) == 128) {
            f1 f1Var2 = kVar.G;
            if ((this.f11983d & 8388608) != 8388608 || (f1Var = this.B) == f1.f11939e) {
                this.B = f1Var2;
            } else {
                o oVar = new o(2);
                oVar.f12111d = Collections.EMPTY_LIST;
                oVar.k(f1Var);
                oVar.k(f1Var2);
                this.B = oVar.g();
            }
            this.f11983d |= 8388608;
        }
        if (!kVar.H.isEmpty()) {
            if (this.C.isEmpty()) {
                this.C = kVar.H;
                this.f11983d &= -16777217;
            } else {
                if ((this.f11983d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL) != 16777216) {
                    this.C = new ArrayList(this.C);
                    this.f11983d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL;
                }
                this.C.addAll(kVar.H);
            }
        }
        d(kVar);
        this.f14792a = this.f14792a.d(kVar.f12037b);
    }
}
