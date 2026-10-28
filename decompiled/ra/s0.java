package ra;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends xa.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s0 f12166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f12167u = new a(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f12168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f12173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12176j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s0 f12178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s0 f12180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f12183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12184s;

    static {
        s0 s0Var = new s0();
        f12166t = s0Var;
        s0Var.n();
    }

    public s0() {
        this.f12183r = (byte) -1;
        this.f12184s = -1;
        this.f12168b = xa.d.f14765a;
    }

    public s0(r0 r0Var) {
        super(r0Var);
        this.f12183r = (byte) -1;
        this.f12184s = -1;
        this.f12168b = r0Var.f14792a;
    }

    public s0(xa.e eVar, xa.g gVar) {
        this.f12183r = (byte) -1;
        this.f12184s = -1;
        n();
        xa.c cVar = new xa.c();
        d3.e eVarS = d3.e.s(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    a aVar = f12167u;
                    r0 r0VarO = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f12169c |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                            this.f12182q = eVar.k();
                            continue;
                        case 18:
                            if (!z11) {
                                this.f12170d = new ArrayList();
                                z11 = true;
                            }
                            this.f12170d.add(eVar.g(q0.f12134i, gVar));
                            continue;
                        case 24:
                            this.f12169c |= 1;
                            this.f12171e = eVar.l() != 0;
                            continue;
                        case 32:
                            this.f12169c |= 2;
                            this.f12172f = eVar.k();
                            continue;
                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                            if ((this.f12169c & 4) == 4) {
                                s0 s0Var = this.f12173g;
                                s0Var.getClass();
                                r0VarO = o(s0Var);
                            }
                            s0 s0Var2 = (s0) eVar.g(aVar, gVar);
                            this.f12173g = s0Var2;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var2);
                                this.f12173g = r0VarO.e();
                            }
                            this.f12169c |= 4;
                            continue;
                        case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                            this.f12169c |= 16;
                            this.f12175i = eVar.k();
                            continue;
                        case 56:
                            this.f12169c |= 32;
                            this.f12176j = eVar.k();
                            continue;
                        case ServiceTypes.MSG_VEHICLE_CONTROL_AREA_SEAT_ROW_2_RIGHT /* 64 */:
                            this.f12169c |= 8;
                            this.f12174h = eVar.k();
                            continue;
                        case 72:
                            this.f12169c |= 64;
                            this.k = eVar.k();
                            continue;
                        case 82:
                            if ((this.f12169c & 256) == 256) {
                                s0 s0Var3 = this.f12178m;
                                s0Var3.getClass();
                                r0VarO = o(s0Var3);
                            }
                            s0 s0Var4 = (s0) eVar.g(aVar, gVar);
                            this.f12178m = s0Var4;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var4);
                                this.f12178m = r0VarO.e();
                            }
                            this.f12169c |= 256;
                            continue;
                        case 88:
                            this.f12169c |= 512;
                            this.f12179n = eVar.k();
                            continue;
                        case 96:
                            this.f12169c |= 128;
                            this.f12177l = eVar.k();
                            continue;
                        case 106:
                            if ((this.f12169c & 1024) == 1024) {
                                s0 s0Var5 = this.f12180o;
                                s0Var5.getClass();
                                r0VarO = o(s0Var5);
                            }
                            s0 s0Var6 = (s0) eVar.g(aVar, gVar);
                            this.f12180o = s0Var6;
                            if (r0VarO != null) {
                                r0VarO.g(s0Var6);
                                this.f12180o = r0VarO.e();
                            }
                            this.f12169c |= 1024;
                            continue;
                        case 112:
                            this.f12169c |= 2048;
                            this.f12181p = eVar.k();
                            continue;
                        default:
                            if (!l(eVar, eVarS, gVar, iN)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11) {
                        this.f12170d = Collections.unmodifiableList(this.f12170d);
                    }
                    try {
                        eVarS.k();
                    } catch (IOException unused) {
                    } finally {
                        this.f12168b = cVar.c();
                    }
                    k();
                    throw th;
                }
            } catch (xa.q e7) {
                e7.f14823a = this;
                throw e7;
            } catch (IOException e10) {
                xa.q qVar = new xa.q(e10.getMessage());
                qVar.f14823a = this;
                throw qVar;
            }
        }
        if (z11) {
            this.f12170d = Collections.unmodifiableList(this.f12170d);
        }
        try {
            eVarS.k();
        } catch (IOException unused2) {
        } finally {
            this.f12168b = cVar.c();
        }
        k();
    }

    public static r0 o(s0 s0Var) {
        r0 r0VarF = r0.f();
        r0VarF.g(s0Var);
        return r0VarF;
    }

    @Override // xa.a
    public final int a() {
        int i7 = this.f12184s;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f12169c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096 ? d3.e.d(1, this.f12182q) : 0;
        for (int i10 = 0; i10 < this.f12170d.size(); i10++) {
            iD += d3.e.f(2, (xa.a) this.f12170d.get(i10));
        }
        if ((this.f12169c & 1) == 1) {
            iD += d3.e.j(3) + 1;
        }
        if ((this.f12169c & 2) == 2) {
            iD += d3.e.d(4, this.f12172f);
        }
        if ((this.f12169c & 4) == 4) {
            iD += d3.e.f(5, this.f12173g);
        }
        if ((this.f12169c & 16) == 16) {
            iD += d3.e.d(6, this.f12175i);
        }
        if ((this.f12169c & 32) == 32) {
            iD += d3.e.d(7, this.f12176j);
        }
        if ((this.f12169c & 8) == 8) {
            iD += d3.e.d(8, this.f12174h);
        }
        if ((this.f12169c & 64) == 64) {
            iD += d3.e.d(9, this.k);
        }
        if ((this.f12169c & 256) == 256) {
            iD += d3.e.f(10, this.f12178m);
        }
        if ((this.f12169c & 512) == 512) {
            iD += d3.e.d(11, this.f12179n);
        }
        if ((this.f12169c & 128) == 128) {
            iD += d3.e.d(12, this.f12177l);
        }
        if ((this.f12169c & 1024) == 1024) {
            iD += d3.e.f(13, this.f12180o);
        }
        if ((this.f12169c & 2048) == 2048) {
            iD += d3.e.d(14, this.f12181p);
        }
        int size = this.f12168b.size() + h() + iD;
        this.f12184s = size;
        return size;
    }

    @Override // xa.a
    public final xa.i b() {
        return r0.f();
    }

    @Override // xa.a
    public final void d(d3.e eVar) throws IOException {
        a();
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(this);
        if ((this.f12169c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            eVar.A(1, this.f12182q);
        }
        for (int i7 = 0; i7 < this.f12170d.size(); i7++) {
            eVar.C(2, (xa.a) this.f12170d.get(i7));
        }
        if ((this.f12169c & 1) == 1) {
            boolean z10 = this.f12171e;
            eVar.L(3, 0);
            eVar.E(z10 ? 1 : 0);
        }
        if ((this.f12169c & 2) == 2) {
            eVar.A(4, this.f12172f);
        }
        if ((this.f12169c & 4) == 4) {
            eVar.C(5, this.f12173g);
        }
        if ((this.f12169c & 16) == 16) {
            eVar.A(6, this.f12175i);
        }
        if ((this.f12169c & 32) == 32) {
            eVar.A(7, this.f12176j);
        }
        if ((this.f12169c & 8) == 8) {
            eVar.A(8, this.f12174h);
        }
        if ((this.f12169c & 64) == 64) {
            eVar.A(9, this.k);
        }
        if ((this.f12169c & 256) == 256) {
            eVar.C(10, this.f12178m);
        }
        if ((this.f12169c & 512) == 512) {
            eVar.A(11, this.f12179n);
        }
        if ((this.f12169c & 128) == 128) {
            eVar.A(12, this.f12177l);
        }
        if ((this.f12169c & 1024) == 1024) {
            eVar.C(13, this.f12180o);
        }
        if ((this.f12169c & 2048) == 2048) {
            eVar.A(14, this.f12181p);
        }
        rVar.P(Constants.MSG_RESPONSE_SUCCESS, eVar);
        eVar.F(this.f12168b);
    }

    @Override // xa.u
    public final xa.a getDefaultInstanceForType() {
        return f12166t;
    }

    @Override // xa.u
    public final boolean isInitialized() {
        byte b10 = this.f12183r;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f12170d.size(); i7++) {
            if (!((q0) this.f12170d.get(i7)).isInitialized()) {
                this.f12183r = (byte) 0;
                return false;
            }
        }
        if ((this.f12169c & 4) == 4 && !this.f12173g.isInitialized()) {
            this.f12183r = (byte) 0;
            return false;
        }
        if ((this.f12169c & 256) == 256 && !this.f12178m.isInitialized()) {
            this.f12183r = (byte) 0;
            return false;
        }
        if ((this.f12169c & 1024) == 1024 && !this.f12180o.isInitialized()) {
            this.f12183r = (byte) 0;
            return false;
        }
        if (g()) {
            this.f12183r = (byte) 1;
            return true;
        }
        this.f12183r = (byte) 0;
        return false;
    }

    public final void n() {
        this.f12170d = Collections.EMPTY_LIST;
        this.f12171e = false;
        this.f12172f = 0;
        s0 s0Var = f12166t;
        this.f12173g = s0Var;
        this.f12174h = 0;
        this.f12175i = 0;
        this.f12176j = 0;
        this.k = 0;
        this.f12177l = 0;
        this.f12178m = s0Var;
        this.f12179n = 0;
        this.f12180o = s0Var;
        this.f12181p = 0;
        this.f12182q = 0;
    }

    @Override // xa.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final r0 c() {
        return o(this);
    }
}
