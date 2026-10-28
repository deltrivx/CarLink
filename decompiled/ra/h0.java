package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f11972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f11974j;
    public s0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f11976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f11977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a1 f11978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f11981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f11982s;

    public static h0 f() {
        h0 h0Var = new h0();
        h0Var.f11969e = 518;
        h0Var.f11970f = 2054;
        s0 s0Var = s0.f12166t;
        h0Var.f11972h = s0Var;
        List list = Collections.EMPTY_LIST;
        h0Var.f11974j = list;
        h0Var.k = s0Var;
        h0Var.f11976m = list;
        h0Var.f11977n = list;
        h0Var.f11978o = a1.f11822l;
        h0Var.f11981r = list;
        h0Var.f11982s = list;
        return h0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        i0 i0VarE = e();
        if (i0VarE.isInitialized()) {
            return i0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        i0 i0Var = null;
        try {
            try {
                i0.f12006w.getClass();
                g(new i0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                i0 i0Var2 = (i0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    i0Var = i0Var2;
                    if (i0Var != null) {
                        g(i0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (i0Var != null) {
                g(i0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((i0) nVar);
        return this;
    }

    public final Object clone() {
        h0 h0VarF = f();
        h0VarF.g(e());
        return h0VarF;
    }

    public final i0 e() {
        i0 i0Var = new i0(this);
        int i7 = this.f11968d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        i0Var.f12009d = this.f11969e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        i0Var.f12010e = this.f11970f;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        i0Var.f12011f = this.f11971g;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        i0Var.f12012g = this.f11972h;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        i0Var.f12013h = this.f11973i;
        if ((i7 & 32) == 32) {
            this.f11974j = Collections.unmodifiableList(this.f11974j);
            this.f11968d &= -33;
        }
        i0Var.f12014i = this.f11974j;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        i0Var.f12015j = this.k;
        if ((i7 & 128) == 128) {
            i10 |= 64;
        }
        i0Var.k = this.f11975l;
        if ((this.f11968d & 256) == 256) {
            this.f11976m = Collections.unmodifiableList(this.f11976m);
            this.f11968d &= -257;
        }
        i0Var.f12016l = this.f11976m;
        if ((this.f11968d & 512) == 512) {
            this.f11977n = Collections.unmodifiableList(this.f11977n);
            this.f11968d &= -513;
        }
        i0Var.f12017m = this.f11977n;
        if ((i7 & 1024) == 1024) {
            i10 |= 128;
        }
        i0Var.f12019o = this.f11978o;
        if ((i7 & 2048) == 2048) {
            i10 |= 256;
        }
        i0Var.f12020p = this.f11979p;
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 4096) {
            i10 |= 512;
        }
        i0Var.f12021q = this.f11980q;
        if ((this.f11968d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 8192) {
            this.f11981r = Collections.unmodifiableList(this.f11981r);
            this.f11968d &= -8193;
        }
        i0Var.f12022r = this.f11981r;
        if ((this.f11968d & 16384) == 16384) {
            this.f11982s = Collections.unmodifiableList(this.f11982s);
            this.f11968d &= -16385;
        }
        i0Var.f12023s = this.f11982s;
        i0Var.f12008c = i10;
        return i0Var;
    }

    public final void g(i0 i0Var) {
        a1 a1Var;
        s0 s0Var;
        s0 s0Var2;
        if (i0Var == i0.f12005v) {
            return;
        }
        int i7 = i0Var.f12008c;
        if ((i7 & 1) == 1) {
            int i10 = i0Var.f12009d;
            this.f11968d = 1 | this.f11968d;
            this.f11969e = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = i0Var.f12010e;
            this.f11968d = 2 | this.f11968d;
            this.f11970f = i11;
        }
        if ((i7 & 4) == 4) {
            int i12 = i0Var.f12011f;
            this.f11968d = 4 | this.f11968d;
            this.f11971g = i12;
        }
        if ((i7 & 8) == 8) {
            s0 s0Var3 = i0Var.f12012g;
            if ((this.f11968d & 8) != 8 || (s0Var2 = this.f11972h) == s0.f12166t) {
                this.f11972h = s0Var3;
            } else {
                r0 r0VarO = s0.o(s0Var2);
                r0VarO.g(s0Var3);
                this.f11972h = r0VarO.e();
            }
            this.f11968d |= 8;
        }
        if ((i0Var.f12008c & 16) == 16) {
            int i13 = i0Var.f12013h;
            this.f11968d = 16 | this.f11968d;
            this.f11973i = i13;
        }
        if (!i0Var.f12014i.isEmpty()) {
            if (this.f11974j.isEmpty()) {
                this.f11974j = i0Var.f12014i;
                this.f11968d &= -33;
            } else {
                if ((this.f11968d & 32) != 32) {
                    this.f11974j = new ArrayList(this.f11974j);
                    this.f11968d |= 32;
                }
                this.f11974j.addAll(i0Var.f12014i);
            }
        }
        if ((i0Var.f12008c & 32) == 32) {
            s0 s0Var4 = i0Var.f12015j;
            if ((this.f11968d & 64) != 64 || (s0Var = this.k) == s0.f12166t) {
                this.k = s0Var4;
            } else {
                r0 r0VarO2 = s0.o(s0Var);
                r0VarO2.g(s0Var4);
                this.k = r0VarO2.e();
            }
            this.f11968d |= 64;
        }
        if ((i0Var.f12008c & 64) == 64) {
            int i14 = i0Var.k;
            this.f11968d |= 128;
            this.f11975l = i14;
        }
        if (!i0Var.f12016l.isEmpty()) {
            if (this.f11976m.isEmpty()) {
                this.f11976m = i0Var.f12016l;
                this.f11968d &= -257;
            } else {
                if ((this.f11968d & 256) != 256) {
                    this.f11976m = new ArrayList(this.f11976m);
                    this.f11968d |= 256;
                }
                this.f11976m.addAll(i0Var.f12016l);
            }
        }
        if (!i0Var.f12017m.isEmpty()) {
            if (this.f11977n.isEmpty()) {
                this.f11977n = i0Var.f12017m;
                this.f11968d &= -513;
            } else {
                if ((this.f11968d & 512) != 512) {
                    this.f11977n = new ArrayList(this.f11977n);
                    this.f11968d |= 512;
                }
                this.f11977n.addAll(i0Var.f12017m);
            }
        }
        if ((i0Var.f12008c & 128) == 128) {
            a1 a1Var2 = i0Var.f12019o;
            if ((this.f11968d & 1024) != 1024 || (a1Var = this.f11978o) == a1.f11822l) {
                this.f11978o = a1Var2;
            } else {
                z0 z0Var = new z0();
                s0 s0Var5 = s0.f12166t;
                z0Var.f12304g = s0Var5;
                z0Var.f12306i = s0Var5;
                z0Var.f(a1Var);
                z0Var.f(a1Var2);
                this.f11978o = z0Var.e();
            }
            this.f11968d |= 1024;
        }
        int i15 = i0Var.f12008c;
        if ((i15 & 256) == 256) {
            int i16 = i0Var.f12020p;
            this.f11968d |= 2048;
            this.f11979p = i16;
        }
        if ((i15 & 512) == 512) {
            int i17 = i0Var.f12021q;
            this.f11968d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            this.f11980q = i17;
        }
        if (!i0Var.f12022r.isEmpty()) {
            if (this.f11981r.isEmpty()) {
                this.f11981r = i0Var.f12022r;
                this.f11968d &= -8193;
            } else {
                if ((this.f11968d & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 8192) {
                    this.f11981r = new ArrayList(this.f11981r);
                    this.f11968d |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                }
                this.f11981r.addAll(i0Var.f12022r);
            }
        }
        if (!i0Var.f12023s.isEmpty()) {
            if (this.f11982s.isEmpty()) {
                this.f11982s = i0Var.f12023s;
                this.f11968d &= -16385;
            } else {
                if ((this.f11968d & 16384) != 16384) {
                    this.f11982s = new ArrayList(this.f11982s);
                    this.f11968d |= 16384;
                }
                this.f11982s.addAll(i0Var.f12023s);
            }
        }
        d(i0Var);
        this.f14792a = this.f14792a.d(i0Var.f12007b);
    }
}
