package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f12198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f12199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0 f12201j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f12202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f12203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f12204n;

    public static t0 f() {
        t0 t0Var = new t0();
        t0Var.f12196e = 6;
        List list = Collections.EMPTY_LIST;
        t0Var.f12198g = list;
        s0 s0Var = s0.f12166t;
        t0Var.f12199h = s0Var;
        t0Var.f12201j = s0Var;
        t0Var.f12202l = list;
        t0Var.f12203m = list;
        t0Var.f12204n = list;
        return t0Var;
    }

    @Override // xa.i
    public final xa.a a() {
        u0 u0VarE = e();
        if (u0VarE.isInitialized()) {
            return u0VarE;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        u0 u0Var = null;
        try {
            try {
                u0.f12208q.getClass();
                g(new u0(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                u0 u0Var2 = (u0) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    u0Var = u0Var2;
                    if (u0Var != null) {
                        g(u0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (u0Var != null) {
                g(u0Var);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        g((u0) nVar);
        return this;
    }

    public final Object clone() {
        t0 t0VarF = f();
        t0VarF.g(e());
        return t0VarF;
    }

    public final u0 e() {
        u0 u0Var = new u0(this);
        int i7 = this.f12195d;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        u0Var.f12211d = this.f12196e;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        u0Var.f12212e = this.f12197f;
        if ((i7 & 4) == 4) {
            this.f12198g = Collections.unmodifiableList(this.f12198g);
            this.f12195d &= -5;
        }
        u0Var.f12213f = this.f12198g;
        if ((i7 & 8) == 8) {
            i10 |= 4;
        }
        u0Var.f12214g = this.f12199h;
        if ((i7 & 16) == 16) {
            i10 |= 8;
        }
        u0Var.f12215h = this.f12200i;
        if ((i7 & 32) == 32) {
            i10 |= 16;
        }
        u0Var.f12216i = this.f12201j;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        u0Var.f12217j = this.k;
        if ((this.f12195d & 128) == 128) {
            this.f12202l = Collections.unmodifiableList(this.f12202l);
            this.f12195d &= -129;
        }
        u0Var.k = this.f12202l;
        if ((this.f12195d & 256) == 256) {
            this.f12203m = Collections.unmodifiableList(this.f12203m);
            this.f12195d &= -257;
        }
        u0Var.f12218l = this.f12203m;
        if ((this.f12195d & 512) == 512) {
            this.f12204n = Collections.unmodifiableList(this.f12204n);
            this.f12195d &= -513;
        }
        u0Var.f12219m = this.f12204n;
        u0Var.f12210c = i10;
        return u0Var;
    }

    public final void g(u0 u0Var) {
        s0 s0Var;
        s0 s0Var2;
        if (u0Var == u0.f12207p) {
            return;
        }
        int i7 = u0Var.f12210c;
        if ((i7 & 1) == 1) {
            int i10 = u0Var.f12211d;
            this.f12195d = 1 | this.f12195d;
            this.f12196e = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = u0Var.f12212e;
            this.f12195d = 2 | this.f12195d;
            this.f12197f = i11;
        }
        if (!u0Var.f12213f.isEmpty()) {
            if (this.f12198g.isEmpty()) {
                this.f12198g = u0Var.f12213f;
                this.f12195d &= -5;
            } else {
                if ((this.f12195d & 4) != 4) {
                    this.f12198g = new ArrayList(this.f12198g);
                    this.f12195d |= 4;
                }
                this.f12198g.addAll(u0Var.f12213f);
            }
        }
        if ((u0Var.f12210c & 4) == 4) {
            s0 s0Var3 = u0Var.f12214g;
            if ((this.f12195d & 8) != 8 || (s0Var2 = this.f12199h) == s0.f12166t) {
                this.f12199h = s0Var3;
            } else {
                r0 r0VarO = s0.o(s0Var2);
                r0VarO.g(s0Var3);
                this.f12199h = r0VarO.e();
            }
            this.f12195d |= 8;
        }
        int i12 = u0Var.f12210c;
        if ((i12 & 8) == 8) {
            int i13 = u0Var.f12215h;
            this.f12195d |= 16;
            this.f12200i = i13;
        }
        if ((i12 & 16) == 16) {
            s0 s0Var4 = u0Var.f12216i;
            if ((this.f12195d & 32) != 32 || (s0Var = this.f12201j) == s0.f12166t) {
                this.f12201j = s0Var4;
            } else {
                r0 r0VarO2 = s0.o(s0Var);
                r0VarO2.g(s0Var4);
                this.f12201j = r0VarO2.e();
            }
            this.f12195d |= 32;
        }
        if ((u0Var.f12210c & 32) == 32) {
            int i14 = u0Var.f12217j;
            this.f12195d |= 64;
            this.k = i14;
        }
        if (!u0Var.k.isEmpty()) {
            if (this.f12202l.isEmpty()) {
                this.f12202l = u0Var.k;
                this.f12195d &= -129;
            } else {
                if ((this.f12195d & 128) != 128) {
                    this.f12202l = new ArrayList(this.f12202l);
                    this.f12195d |= 128;
                }
                this.f12202l.addAll(u0Var.k);
            }
        }
        if (!u0Var.f12218l.isEmpty()) {
            if (this.f12203m.isEmpty()) {
                this.f12203m = u0Var.f12218l;
                this.f12195d &= -257;
            } else {
                if ((this.f12195d & 256) != 256) {
                    this.f12203m = new ArrayList(this.f12203m);
                    this.f12195d |= 256;
                }
                this.f12203m.addAll(u0Var.f12218l);
            }
        }
        if (!u0Var.f12219m.isEmpty()) {
            if (this.f12204n.isEmpty()) {
                this.f12204n = u0Var.f12219m;
                this.f12195d &= -513;
            } else {
                if ((this.f12195d & 512) != 512) {
                    this.f12204n = new ArrayList(this.f12204n);
                    this.f12195d |= 512;
                }
                this.f12204n.addAll(u0Var.f12219m);
            }
        }
        d(u0Var);
        this.f14792a = this.f14792a.d(u0Var.f12209b);
    }
}
