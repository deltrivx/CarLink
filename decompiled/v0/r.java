package v0;

import android.os.Trace;
import b3.h0;
import b3.n0;
import b3.o0;
import b3.r0;
import cc.s;
import java.util.HashMap;
import java.util.List;
import l0.q0;
import o2.l0;
import o2.v0;
import o9.u;
import q2.j0;
import q2.p0;
import q2.x;
import q2.y1;
import u8.w;
import y1.k0;
import y2.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends r1.o implements x, q2.o, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f13577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r0 f13578p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f3.d f13579q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13580r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13582t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13583u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y1.r f13584v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashMap f13585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f13586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f13587y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q f13588z;

    public final e A0() {
        if (this.f13586x == null) {
            this.f13586x = new e(this.f13577o, this.f13578p, this.f13579q, this.f13580r, this.f13581s, this.f13582t, this.f13583u);
        }
        e eVar = this.f13586x;
        i9.l.b(eVar);
        return eVar;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v0.o] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // q2.y1
    public final void Y(y2.j jVar) {
        o oVar = this.f13587y;
        final int i7 = 0;
        ?? r8 = oVar;
        if (oVar == null) {
            ?? r10 = new h9.k(this) { // from class: v0.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f13570b;

                {
                    this.f13570b = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
                @Override // h9.k
                public final Object invoke(Object obj) {
                    n3.c cVar;
                    o0 o0Var;
                    boolean z10;
                    switch (i7) {
                        case 0:
                            List list = (List) obj;
                            r rVar = this.f13570b;
                            e eVarA0 = rVar.A0();
                            r0 r0Var = rVar.f13578p;
                            y1.r rVar2 = rVar.f13584v;
                            r0 r0VarE = r0.e(r0Var, rVar2 != null ? rVar2.a() : y1.q.f14958m, 0L, null, 0L, 0, 0L, 16777214);
                            n3.o oVar2 = eVarA0.f13524o;
                            o0 o0Var2 = null;
                            if (oVar2 == null || (cVar = eVarA0.f13519i) == null) {
                                o0Var = null;
                            } else {
                                b3.h hVar = new b3.h(eVarA0.f13511a);
                                if (eVarA0.f13520j == null || eVarA0.f13523n == null) {
                                    o0Var = null;
                                } else {
                                    long j5 = eVarA0.f13525p & (-8589934589L);
                                    int i10 = eVarA0.f13516f;
                                    boolean z11 = eVarA0.f13515e;
                                    int i11 = eVarA0.f13514d;
                                    f3.d dVar = eVarA0.f13513c;
                                    w wVar = w.f13122a;
                                    o0Var = new o0(new n0(hVar, r0VarE, wVar, i10, z11, i11, cVar, oVar2, dVar, j5), new b3.p(new b3.r(hVar, r0VarE, wVar, cVar, dVar), j5, eVarA0.f13516f, eVarA0.f13514d), eVarA0.f13521l);
                                }
                            }
                            if (o0Var != null) {
                                list.add(o0Var);
                                o0Var2 = o0Var;
                            }
                            return Boolean.valueOf(o0Var2 != null);
                        case 1:
                            String str = ((b3.h) obj).f1353b;
                            r rVar3 = this.f13570b;
                            q qVar = rVar3.f13588z;
                            if (qVar == null) {
                                q qVar2 = new q(rVar3.f13577o, str);
                                e eVar = new e(str, rVar3.f13578p, rVar3.f13579q, rVar3.f13580r, rVar3.f13581s, rVar3.f13582t, rVar3.f13583u);
                                eVar.d(rVar3.A0().f13519i);
                                qVar2.f13576d = eVar;
                                rVar3.f13588z = qVar2;
                            } else if (!i9.l.a(str, qVar.f13574b)) {
                                qVar.f13574b = str;
                                e eVar2 = qVar.f13576d;
                                if (eVar2 != null) {
                                    r0 r0Var2 = rVar3.f13578p;
                                    f3.d dVar2 = rVar3.f13579q;
                                    int i12 = rVar3.f13580r;
                                    boolean z12 = rVar3.f13581s;
                                    int i13 = rVar3.f13582t;
                                    int i14 = rVar3.f13583u;
                                    eVar2.f13511a = str;
                                    eVar2.f13512b = r0Var2;
                                    eVar2.f13513c = dVar2;
                                    eVar2.f13514d = i12;
                                    eVar2.f13515e = z12;
                                    eVar2.f13516f = i13;
                                    eVar2.f13517g = i14;
                                    eVar2.f13528s = (eVar2.f13528s << 2) | 2;
                                    eVar2.c();
                                }
                            }
                            q2.f.n(rVar3);
                            q2.f.m(rVar3);
                            q2.f.l(rVar3);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            r rVar4 = this.f13570b;
                            q qVar3 = rVar4.f13588z;
                            if (qVar3 == null) {
                                z10 = false;
                            } else {
                                qVar3.f13575c = zBooleanValue;
                                q2.f.n(rVar4);
                                q2.f.m(rVar4);
                                q2.f.l(rVar4);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.f13587y = r10;
            r8 = r10;
        }
        b3.h hVar = new b3.h(this.f13577o);
        u[] uVarArr = t.f15077a;
        jVar.n(y2.r.A, n3.l.I(hVar));
        q qVar = this.f13588z;
        if (qVar != null) {
            boolean z10 = qVar.f13575c;
            y2.u uVar = y2.r.C;
            u[] uVarArr2 = t.f15077a;
            u uVar2 = uVarArr2[16];
            uVar.a(jVar, Boolean.valueOf(z10));
            b3.h hVar2 = new b3.h(qVar.f13574b);
            y2.u uVar3 = y2.r.B;
            u uVar4 = uVarArr2[15];
            uVar3.a(jVar, hVar2);
        }
        final int i10 = 1;
        jVar.n(y2.i.k, new y2.a(null, new h9.k(this) { // from class: v0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f13570b;

            {
                this.f13570b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
            @Override // h9.k
            public final Object invoke(Object obj) {
                n3.c cVar;
                o0 o0Var;
                boolean z11;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        r rVar = this.f13570b;
                        e eVarA0 = rVar.A0();
                        r0 r0Var = rVar.f13578p;
                        y1.r rVar2 = rVar.f13584v;
                        r0 r0VarE = r0.e(r0Var, rVar2 != null ? rVar2.a() : y1.q.f14958m, 0L, null, 0L, 0, 0L, 16777214);
                        n3.o oVar2 = eVarA0.f13524o;
                        o0 o0Var2 = null;
                        if (oVar2 == null || (cVar = eVarA0.f13519i) == null) {
                            o0Var = null;
                        } else {
                            b3.h hVar3 = new b3.h(eVarA0.f13511a);
                            if (eVarA0.f13520j == null || eVarA0.f13523n == null) {
                                o0Var = null;
                            } else {
                                long j5 = eVarA0.f13525p & (-8589934589L);
                                int i11 = eVarA0.f13516f;
                                boolean z12 = eVarA0.f13515e;
                                int i12 = eVarA0.f13514d;
                                f3.d dVar = eVarA0.f13513c;
                                w wVar = w.f13122a;
                                o0Var = new o0(new n0(hVar3, r0VarE, wVar, i11, z12, i12, cVar, oVar2, dVar, j5), new b3.p(new b3.r(hVar3, r0VarE, wVar, cVar, dVar), j5, eVarA0.f13516f, eVarA0.f13514d), eVarA0.f13521l);
                            }
                        }
                        if (o0Var != null) {
                            list.add(o0Var);
                            o0Var2 = o0Var;
                        }
                        return Boolean.valueOf(o0Var2 != null);
                    case 1:
                        String str = ((b3.h) obj).f1353b;
                        r rVar3 = this.f13570b;
                        q qVar2 = rVar3.f13588z;
                        if (qVar2 == null) {
                            q qVar3 = new q(rVar3.f13577o, str);
                            e eVar = new e(str, rVar3.f13578p, rVar3.f13579q, rVar3.f13580r, rVar3.f13581s, rVar3.f13582t, rVar3.f13583u);
                            eVar.d(rVar3.A0().f13519i);
                            qVar3.f13576d = eVar;
                            rVar3.f13588z = qVar3;
                        } else if (!i9.l.a(str, qVar2.f13574b)) {
                            qVar2.f13574b = str;
                            e eVar2 = qVar2.f13576d;
                            if (eVar2 != null) {
                                r0 r0Var2 = rVar3.f13578p;
                                f3.d dVar2 = rVar3.f13579q;
                                int i13 = rVar3.f13580r;
                                boolean z13 = rVar3.f13581s;
                                int i14 = rVar3.f13582t;
                                int i15 = rVar3.f13583u;
                                eVar2.f13511a = str;
                                eVar2.f13512b = r0Var2;
                                eVar2.f13513c = dVar2;
                                eVar2.f13514d = i13;
                                eVar2.f13515e = z13;
                                eVar2.f13516f = i14;
                                eVar2.f13517g = i15;
                                eVar2.f13528s = (eVar2.f13528s << 2) | 2;
                                eVar2.c();
                            }
                        }
                        q2.f.n(rVar3);
                        q2.f.m(rVar3);
                        q2.f.l(rVar3);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        r rVar4 = this.f13570b;
                        q qVar4 = rVar4.f13588z;
                        if (qVar4 == null) {
                            z11 = false;
                        } else {
                            qVar4.f13575c = zBooleanValue;
                            q2.f.n(rVar4);
                            q2.f.m(rVar4);
                            q2.f.l(rVar4);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        final int i11 = 2;
        jVar.n(y2.i.f14996l, new y2.a(null, new h9.k(this) { // from class: v0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f13570b;

            {
                this.f13570b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
            @Override // h9.k
            public final Object invoke(Object obj) {
                n3.c cVar;
                o0 o0Var;
                boolean z11;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        r rVar = this.f13570b;
                        e eVarA0 = rVar.A0();
                        r0 r0Var = rVar.f13578p;
                        y1.r rVar2 = rVar.f13584v;
                        r0 r0VarE = r0.e(r0Var, rVar2 != null ? rVar2.a() : y1.q.f14958m, 0L, null, 0L, 0, 0L, 16777214);
                        n3.o oVar2 = eVarA0.f13524o;
                        o0 o0Var2 = null;
                        if (oVar2 == null || (cVar = eVarA0.f13519i) == null) {
                            o0Var = null;
                        } else {
                            b3.h hVar3 = new b3.h(eVarA0.f13511a);
                            if (eVarA0.f13520j == null || eVarA0.f13523n == null) {
                                o0Var = null;
                            } else {
                                long j5 = eVarA0.f13525p & (-8589934589L);
                                int i12 = eVarA0.f13516f;
                                boolean z12 = eVarA0.f13515e;
                                int i13 = eVarA0.f13514d;
                                f3.d dVar = eVarA0.f13513c;
                                w wVar = w.f13122a;
                                o0Var = new o0(new n0(hVar3, r0VarE, wVar, i12, z12, i13, cVar, oVar2, dVar, j5), new b3.p(new b3.r(hVar3, r0VarE, wVar, cVar, dVar), j5, eVarA0.f13516f, eVarA0.f13514d), eVarA0.f13521l);
                            }
                        }
                        if (o0Var != null) {
                            list.add(o0Var);
                            o0Var2 = o0Var;
                        }
                        return Boolean.valueOf(o0Var2 != null);
                    case 1:
                        String str = ((b3.h) obj).f1353b;
                        r rVar3 = this.f13570b;
                        q qVar2 = rVar3.f13588z;
                        if (qVar2 == null) {
                            q qVar3 = new q(rVar3.f13577o, str);
                            e eVar = new e(str, rVar3.f13578p, rVar3.f13579q, rVar3.f13580r, rVar3.f13581s, rVar3.f13582t, rVar3.f13583u);
                            eVar.d(rVar3.A0().f13519i);
                            qVar3.f13576d = eVar;
                            rVar3.f13588z = qVar3;
                        } else if (!i9.l.a(str, qVar2.f13574b)) {
                            qVar2.f13574b = str;
                            e eVar2 = qVar2.f13576d;
                            if (eVar2 != null) {
                                r0 r0Var2 = rVar3.f13578p;
                                f3.d dVar2 = rVar3.f13579q;
                                int i14 = rVar3.f13580r;
                                boolean z13 = rVar3.f13581s;
                                int i15 = rVar3.f13582t;
                                int i16 = rVar3.f13583u;
                                eVar2.f13511a = str;
                                eVar2.f13512b = r0Var2;
                                eVar2.f13513c = dVar2;
                                eVar2.f13514d = i14;
                                eVar2.f13515e = z13;
                                eVar2.f13516f = i15;
                                eVar2.f13517g = i16;
                                eVar2.f13528s = (eVar2.f13528s << 2) | 2;
                                eVar2.c();
                            }
                        }
                        q2.f.n(rVar3);
                        q2.f.m(rVar3);
                        q2.f.l(rVar3);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        r rVar4 = this.f13570b;
                        q qVar4 = rVar4.f13588z;
                        if (qVar4 == null) {
                            z11 = false;
                        } else {
                            qVar4.f13575c = zBooleanValue;
                            q2.f.n(rVar4);
                            q2.f.m(rVar4);
                            q2.f.l(rVar4);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        jVar.n(y2.i.f14997m, new y2.a(null, new p(0, this)));
        t.a(jVar, r8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, l0 l0Var, long j5) {
        e eVarA0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            q qVar = this.f13588z;
            if (qVar == null) {
                eVarA0 = A0();
            } else {
                if (!qVar.f13575c) {
                    qVar = null;
                }
                if (qVar == null || (eVarA0 = qVar.f13576d) == null) {
                    eVarA0 = A0();
                }
            }
            eVarA0.d(o0Var);
            boolean zB = eVarA0.b(j5, o0Var.getLayoutDirection());
            b3.u uVar = eVarA0.f13523n;
            if (uVar != null) {
                uVar.a();
            }
            b3.b bVar = eVarA0.f13520j;
            i9.l.b(bVar);
            c3.n nVar = bVar.f1310d;
            long j10 = eVarA0.f13521l;
            if (zB) {
                q2.f.t(this, 2).N0();
                HashMap map = this.f13585w;
                if (map == null) {
                    map = new HashMap(2);
                    this.f13585w = map;
                }
                map.put(o2.c.f9302a, Integer.valueOf(Math.round(nVar.d(0))));
                map.put(o2.c.f9303b, Integer.valueOf(Math.round(nVar.d(nVar.f2409g - 1))));
            }
            int i7 = (int) (j10 >> 32);
            int i10 = (int) (j10 & 4294967295L);
            v0 v0VarU = l0Var.u(g5.a.D(i7, i7, i10, i10));
            HashMap map2 = this.f13585w;
            i9.l.b(map2);
            return o0Var.i(i7, i10, map2, new d0.i(v0VarU, 8));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // q2.x
    public final int c(p0 p0Var, l0 l0Var, int i7) {
        e eVarA0;
        q qVar = this.f13588z;
        if (qVar == null) {
            eVarA0 = A0();
        } else {
            if (!qVar.f13575c) {
                qVar = null;
            }
            if (qVar == null || (eVarA0 = qVar.f13576d) == null) {
                eVarA0 = A0();
            }
        }
        eVarA0.d(p0Var);
        return q0.k(eVarA0.e(p0Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // q2.x
    public final int d(p0 p0Var, l0 l0Var, int i7) {
        e eVarA0;
        q qVar = this.f13588z;
        if (qVar == null) {
            eVarA0 = A0();
        } else {
            if (!qVar.f13575c) {
                qVar = null;
            }
            if (qVar == null || (eVarA0 = qVar.f13576d) == null) {
                eVarA0 = A0();
            }
        }
        eVarA0.d(p0Var);
        return eVarA0.a(i7, p0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // q2.x
    public final int e(p0 p0Var, l0 l0Var, int i7) {
        e eVarA0;
        q qVar = this.f13588z;
        if (qVar == null) {
            eVarA0 = A0();
        } else {
            if (!qVar.f13575c) {
                qVar = null;
            }
            if (qVar == null || (eVarA0 = qVar.f13576d) == null) {
                eVarA0 = A0();
            }
        }
        eVarA0.d(p0Var);
        return eVarA0.a(i7, p0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // q2.x
    public final int f(p0 p0Var, l0 l0Var, int i7) {
        e eVarA0;
        q qVar = this.f13588z;
        if (qVar == null) {
            eVarA0 = A0();
        } else {
            if (!qVar.f13575c) {
                qVar = null;
            }
            if (qVar == null || (eVarA0 = qVar.f13576d) == null) {
                eVarA0 = A0();
            }
        }
        eVarA0.d(p0Var);
        return q0.k(eVarA0.e(p0Var.getLayoutDirection()).d());
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // q2.o
    public final void x(j0 j0Var) {
        e eVarA0;
        if (this.f11129n) {
            q qVar = this.f13588z;
            if (qVar == null) {
                eVarA0 = A0();
            } else {
                if (!qVar.f13575c) {
                    qVar = null;
                }
                if (qVar == null || (eVarA0 = qVar.f13576d) == null) {
                    eVarA0 = A0();
                }
            }
            b3.b bVar = eVarA0.f13520j;
            if (bVar == null) {
                c0.b.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f13586x + ", textSubstitution=" + this.f13588z + ')');
                throw new s();
            }
            y1.o oVarZ = j0Var.f10720a.f16b.z();
            boolean z10 = eVarA0.k;
            if (z10) {
                long j5 = eVarA0.f13521l;
                oVarZ.h();
                oVarZ.l(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L), 1);
            }
            try {
                h0 h0Var = this.f13578p.f1438a;
                m3.l lVar = h0Var.f1367m;
                if (lVar == null) {
                    lVar = m3.l.f8420b;
                }
                m3.l lVar2 = lVar;
                k0 k0Var = h0Var.f1368n;
                if (k0Var == null) {
                    k0Var = k0.f14924d;
                }
                k0 k0Var2 = k0Var;
                a2.h hVar = h0Var.f1370p;
                if (hVar == null) {
                    hVar = a2.j.f23a;
                }
                a2.h hVar2 = hVar;
                y1.m mVarE = h0Var.f1356a.e();
                if (mVarE != null) {
                    bVar.g(oVarZ, mVarE, this.f13578p.f1438a.f1356a.a(), k0Var2, lVar2, hVar2);
                } else {
                    y1.r rVar = this.f13584v;
                    long jA = rVar != null ? rVar.a() : y1.q.f14958m;
                    if (jA == 16) {
                        jA = this.f13578p.b() != 16 ? this.f13578p.b() : y1.q.f14948b;
                    }
                    bVar.f(oVarZ, jA, k0Var2, lVar2, hVar2);
                }
            } finally {
                if (z10) {
                    oVarZ.r();
                }
            }
        }
    }
}
