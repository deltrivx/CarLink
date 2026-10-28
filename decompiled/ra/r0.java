package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f12151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12153j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s0 f12156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s0 f12158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12160r;

    public static r0 f() {
        r0 r0Var = new r0();
        r0Var.f12148e = Collections.EMPTY_LIST;
        s0 s0Var = s0.f12166t;
        r0Var.f12151h = s0Var;
        r0Var.f12156n = s0Var;
        r0Var.f12158p = s0Var;
        return r0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        s0 s0VarE = e();
        if (s0VarE.isInitialized()) {
            return s0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        s0 s0Var = null;
        try {
            try {
                s0.f12167u.getClass();
                g(new s0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                s0 s0Var2 = (s0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    s0Var = s0Var2;
                    if (s0Var != null) {
                        g(s0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (s0Var != null) {
                g(s0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((s0) nVar);
        return this;
    }

    public final Object clone() {
        r0 r0VarF = f();
        r0VarF.g(e());
        return r0VarF;
    }

    public final s0 e() {
        s0 s0Var = new s0(this);
        int i7 = this.f12147d;
        if ((i7 & 1) == 1) {
            this.f12148e = Collections.unmodifiableList(this.f12148e);
            this.f12147d &= -2;
        }
        s0Var.f12170d = this.f12148e;
        int i10 = (i7 & 2) != 2 ? 0 : 1;
        s0Var.f12171e = this.f12149f;
        if ((i7 & 4) == 4) {
            i10 |= 2;
        }
        s0Var.f12172f = this.f12150g;
        if ((i7 & 8) == 8) {
            i10 |= 4;
        }
        s0Var.f12173g = this.f12151h;
        if ((i7 & 16) == 16) {
            i10 |= 8;
        }
        s0Var.f12174h = this.f12152i;
        if ((i7 & 32) == 32) {
            i10 |= 16;
        }
        s0Var.f12175i = this.f12153j;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        s0Var.f12176j = this.k;
        if ((i7 & 128) == 128) {
            i10 |= 64;
        }
        s0Var.k = this.f12154l;
        if ((i7 & 256) == 256) {
            i10 |= 128;
        }
        s0Var.f12177l = this.f12155m;
        if ((i7 & 512) == 512) {
            i10 |= 256;
        }
        s0Var.f12178m = this.f12156n;
        if ((i7 & 1024) == 1024) {
            i10 |= 512;
        }
        s0Var.f12179n = this.f12157o;
        if ((i7 & 2048) == 2048) {
            i10 |= 1024;
        }
        s0Var.f12180o = this.f12158p;
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            i10 |= 2048;
        }
        s0Var.f12181p = this.f12159q;
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        }
        s0Var.f12182q = this.f12160r;
        s0Var.f12169c = i10;
        return s0Var;
    }

    public final r0 g(s0 s0Var) {
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5 = s0.f12166t;
        if (s0Var == s0Var5) {
            return this;
        }
        if (!s0Var.f12170d.isEmpty()) {
            if (this.f12148e.isEmpty()) {
                this.f12148e = s0Var.f12170d;
                this.f12147d &= -2;
            } else {
                if ((this.f12147d & 1) != 1) {
                    this.f12148e = new ArrayList(this.f12148e);
                    this.f12147d |= 1;
                }
                this.f12148e.addAll(s0Var.f12170d);
            }
        }
        int i7 = s0Var.f12169c;
        if ((i7 & 1) == 1) {
            boolean z10 = s0Var.f12171e;
            this.f12147d |= 2;
            this.f12149f = z10;
        }
        if ((i7 & 2) == 2) {
            int i10 = s0Var.f12172f;
            this.f12147d |= 4;
            this.f12150g = i10;
        }
        if ((i7 & 4) == 4) {
            s0 s0Var6 = s0Var.f12173g;
            if ((this.f12147d & 8) != 8 || (s0Var4 = this.f12151h) == s0Var5) {
                this.f12151h = s0Var6;
            } else {
                r0 r0VarO = s0.o(s0Var4);
                r0VarO.g(s0Var6);
                this.f12151h = r0VarO.e();
            }
            this.f12147d |= 8;
        }
        int i11 = s0Var.f12169c;
        if ((i11 & 8) == 8) {
            int i12 = s0Var.f12174h;
            this.f12147d |= 16;
            this.f12152i = i12;
        }
        if ((i11 & 16) == 16) {
            int i13 = s0Var.f12175i;
            this.f12147d |= 32;
            this.f12153j = i13;
        }
        if ((i11 & 32) == 32) {
            int i14 = s0Var.f12176j;
            this.f12147d |= 64;
            this.k = i14;
        }
        if ((i11 & 64) == 64) {
            int i15 = s0Var.k;
            this.f12147d |= 128;
            this.f12154l = i15;
        }
        if ((i11 & 128) == 128) {
            int i16 = s0Var.f12177l;
            this.f12147d |= 256;
            this.f12155m = i16;
        }
        if ((i11 & 256) == 256) {
            s0 s0Var7 = s0Var.f12178m;
            if ((this.f12147d & 512) != 512 || (s0Var3 = this.f12156n) == s0Var5) {
                this.f12156n = s0Var7;
            } else {
                r0 r0VarO2 = s0.o(s0Var3);
                r0VarO2.g(s0Var7);
                this.f12156n = r0VarO2.e();
            }
            this.f12147d |= 512;
        }
        int i17 = s0Var.f12169c;
        if ((i17 & 512) == 512) {
            int i18 = s0Var.f12179n;
            this.f12147d |= 1024;
            this.f12157o = i18;
        }
        if ((i17 & 1024) == 1024) {
            s0 s0Var8 = s0Var.f12180o;
            if ((this.f12147d & 2048) != 2048 || (s0Var2 = this.f12158p) == s0Var5) {
                this.f12158p = s0Var8;
            } else {
                r0 r0VarO3 = s0.o(s0Var2);
                r0VarO3.g(s0Var8);
                this.f12158p = r0VarO3.e();
            }
            this.f12147d |= 2048;
        }
        int i19 = s0Var.f12169c;
        if ((i19 & 2048) == 2048) {
            int i20 = s0Var.f12181p;
            this.f12147d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            this.f12159q = i20;
        }
        if ((i19 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            int i21 = s0Var.f12182q;
            this.f12147d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            this.f12160r = i21;
        }
        d(s0Var);
        this.f14792a = this.f14792a.d(s0Var.f12168b);
        return this;
    }
}
