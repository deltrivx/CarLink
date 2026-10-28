package o2;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import r2.h3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements f1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.h0 f9341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.v f9342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.support.v4.media.session.r f9343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s.h0 f9346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s.h0 f9347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f9348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f9349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s.h0 f9350j;
    public final j1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s.h0 f9351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1.e f9352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f9355p;

    public i0(q2.h0 h0Var, android.support.v4.media.session.r rVar) {
        this.f9341a = h0Var;
        this.f9343c = rVar;
        long[] jArr = s.o0.f12476a;
        this.f9346f = new s.h0();
        this.f9347g = new s.h0();
        this.f9348h = new d0(this);
        this.f9349i = new a0(this);
        this.f9350j = new s.h0();
        this.k = new j1();
        this.f9351l = new s.h0();
        this.f9352m = new h1.e(new Object[16]);
        this.f9355p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void a(b0 b0Var) {
        s.i0 i0Var;
        f1.n1 n1Var = b0Var.f9297f;
        if (n1Var != null) {
            n1Var.f5060h.set(f1.o1.f5069b);
            n1.i iVar = n1Var.f5062j;
            if (iVar.f8718d.h()) {
                i0Var = iVar.f8718d;
                s.i0 i0Var2 = s.p0.f12478a;
                iVar.f8718d = new s.i0();
                iVar.f8717c.h();
            } else {
                i0Var = null;
            }
            iVar.b();
            f1.y yVar = n1Var.f5053a;
            yVar.f5219q = null;
            if (i0Var != null) {
                yVar.f5223u.k = i0Var;
                yVar.f5225w = 2;
            }
            b0Var.f9297f = null;
            f1.y yVar2 = b0Var.f9294c;
            if (yVar2 != null) {
                yVar2.m();
            }
            b0Var.f9294c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // f1.j
    public final void b() {
        f1.y yVar;
        q2.h0 h0Var = this.f9341a;
        h0Var.f10681p = true;
        s.h0 h0Var2 = this.f9346f;
        Object[] objArr = h0Var2.f12439c;
        long[] jArr = h0Var2.f12437a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i7 != length) {
                        break;
                        break;
                    }
                    i7++;
                } else {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128 && (yVar = ((b0) objArr[(i7 << 3) + i11]).f9294c) != null) {
                            yVar.m();
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i7 != length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        h0Var.P();
        h0Var.f10681p = false;
        h0Var2.a();
        this.f9347g.a();
        this.f9354o = 0;
        this.f9353n = 0;
        this.f9350j.a();
        e();
    }

    @Override // f1.j
    public final void c() {
        f(true);
    }

    public final void d(int i7) {
        boolean z10;
        boolean z11 = false;
        this.f9353n = 0;
        List listO = this.f9341a.o();
        h1.b bVar = (h1.b) listO;
        int i10 = (((h1.e) bVar.f6413b).f6423c - this.f9354o) - 1;
        if (i7 <= i10) {
            this.k.clear();
            if (i7 <= i10) {
                int i11 = i7;
                while (true) {
                    Object objG = this.f9346f.g((q2.h0) bVar.get(i11));
                    i9.l.b(objG);
                    ((s.e0) this.k.f9361b).a(((b0) objG).f9292a);
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            android.support.v4.media.session.r rVar = this.f9343c;
            j1 j1Var = this.k;
            s.c0 c0Var = (s.c0) rVar.f605c;
            c0Var.a();
            s.e0 e0Var = (s.e0) j1Var.f9361b;
            Object[] objArr = e0Var.f12412b;
            long[] jArr = e0Var.f12413c;
            int i12 = e0Var.f12415e;
            while (i12 != Integer.MAX_VALUE) {
                int i13 = (int) ((jArr[i12] >> 31) & 2147483647L);
                Object obj = objArr[i12];
                Object objB = ((h0.t) rVar.f604b).b(obj);
                int iD = c0Var.d(objB);
                int i14 = iD >= 0 ? c0Var.f12399c[iD] : 0;
                if (i14 == 7) {
                    j1Var.remove(obj);
                } else {
                    c0Var.h(i14 + 1, objB);
                }
                i12 = i13;
            }
            p1.f fVarH = n4.e.h();
            h9.k kVarE = fVarH != null ? fVarH.e() : null;
            p1.f fVarK = n4.e.k(fVarH);
            z10 = false;
            while (i10 >= i7) {
                try {
                    q2.h0 h0Var = (q2.h0) ((h1.b) listO).get(i10);
                    Object objG2 = this.f9346f.g(h0Var);
                    i9.l.b(objG2);
                    b0 b0Var = (b0) objG2;
                    Object obj2 = b0Var.f9292a;
                    if (((s.e0) this.k.f9361b).c(obj2)) {
                        this.f9353n++;
                        if (((Boolean) b0Var.f9298g.getValue()).booleanValue()) {
                            q2.l0 l0Var = h0Var.F;
                            q2.y0 y0Var = l0Var.f10743p;
                            q2.f0 f0Var = q2.f0.f10640c;
                            y0Var.f10854l = f0Var;
                            q2.u0 u0Var = l0Var.f10744q;
                            if (u0Var != null) {
                                u0Var.f10814j = f0Var;
                            }
                            g(b0Var, false);
                            if (b0Var.f9299h) {
                                z10 = true;
                            }
                        }
                    } else {
                        q2.h0 h0Var2 = this.f9341a;
                        h0Var2.f10681p = true;
                        this.f9346f.k(h0Var);
                        f1.y yVar = b0Var.f9294c;
                        if (yVar != null) {
                            yVar.m();
                        }
                        this.f9341a.Q(i10, 1);
                        h0Var2.f10681p = false;
                    }
                    this.f9347g.k(obj2);
                    i10--;
                } catch (Throwable th) {
                    n4.e.r(fVarH, fVarK, kVarE);
                    throw th;
                }
            }
            n4.e.r(fVarH, fVarK, kVarE);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (p1.l.f10057c) {
                s.i0 i0Var = p1.l.f10064j.f10004h;
                if (i0Var != null && i0Var.h()) {
                    z11 = true;
                }
            }
            if (z11) {
                p1.l.a();
            }
        }
        e();
    }

    public final void e() {
        int i7 = ((h1.e) ((h1.b) this.f9341a.o()).f6413b).f6423c;
        s.h0 h0Var = this.f9346f;
        if (h0Var.f12441e != i7) {
            n2.a.a("Inconsistency between the count of nodes tracked by the state (" + h0Var.f12441e + ") and the children count on the SubcomposeLayout (" + i7 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i7 - this.f9353n) - this.f9354o < 0) {
            StringBuilder sbT = ob.a.t("Incorrect state. Total children ", ". Reusable children ", i7);
            sbT.append(this.f9353n);
            sbT.append(". Precomposed children ");
            sbT.append(this.f9354o);
            n2.a.a(sbT.toString());
        }
        s.h0 h0Var2 = this.f9350j;
        if (h0Var2.f12441e == this.f9354o) {
            return;
        }
        n2.a.a("Incorrect state. Precomposed children " + this.f9354o + ". Map size " + h0Var2.f12441e);
    }

    public final void f(boolean z10) {
        this.f9354o = 0;
        this.f9350j.a();
        List listO = this.f9341a.o();
        int i7 = ((h1.e) ((h1.b) listO).f6413b).f6423c;
        if (this.f9353n != i7) {
            this.f9353n = i7;
            p1.f fVarH = n4.e.h();
            h9.k kVarE = fVarH != null ? fVarH.e() : null;
            p1.f fVarK = n4.e.k(fVarH);
            for (int i10 = 0; i10 < i7; i10++) {
                try {
                    q2.h0 h0Var = (q2.h0) ((h1.b) listO).get(i10);
                    b0 b0Var = (b0) this.f9346f.g(h0Var);
                    if (b0Var != null && ((Boolean) b0Var.f9298g.getValue()).booleanValue()) {
                        q2.l0 l0Var = h0Var.F;
                        q2.y0 y0Var = l0Var.f10743p;
                        q2.f0 f0Var = q2.f0.f10640c;
                        y0Var.f10854l = f0Var;
                        q2.u0 u0Var = l0Var.f10744q;
                        if (u0Var != null) {
                            u0Var.f10814j = f0Var;
                        }
                        g(b0Var, z10);
                        b0Var.f9292a = d1.f9316a;
                    }
                } catch (Throwable th) {
                    n4.e.r(fVarH, fVarK, kVarE);
                    throw th;
                }
            }
            n4.e.r(fVarH, fVarK, kVarE);
            this.f9347g.a();
        }
        e();
    }

    public final void g(b0 b0Var, boolean z10) {
        f1.y yVar;
        if (z10 || !b0Var.f9299h) {
            b0Var.f9298g = f1.b.s(Boolean.FALSE);
        } else {
            b0Var.f9298g.setValue(Boolean.FALSE);
        }
        if (b0Var.f9297f != null) {
            a(b0Var);
            return;
        }
        if (z10) {
            f1.y yVar2 = b0Var.f9294c;
            if (yVar2 != null) {
                yVar2.l();
                return;
            }
            return;
        }
        q2.o1 outOfFrameExecutor = ((r2.u) q2.k0.a(this.f9341a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (b0Var.f9299h || (yVar = b0Var.f9294c) == null) {
                return;
            }
            yVar.l();
            return;
        }
        b1.a aVar = new b1.a(9, b0Var);
        Handler handler = ((r2.u) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new androidx.lifecycle.z(22, aVar));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00c8 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:60:0x00ac, B:64:0x00b9, B:76:0x00e3, B:78:0x00f5, B:81:0x0109, B:83:0x010d, B:89:0x0143, B:84:0x011a, B:85:0x0125, B:87:0x0129, B:88:0x0140, B:79:0x00f8, B:73:0x00c8, B:75:0x00d6, B:92:0x014d, B:93:0x0157), top: B:98:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:60:0x00ac, B:64:0x00b9, B:76:0x00e3, B:78:0x00f5, B:81:0x0109, B:83:0x010d, B:89:0x0143, B:84:0x011a, B:85:0x0125, B:87:0x0129, B:88:0x0140, B:79:0x00f8, B:73:0x00c8, B:75:0x00d6, B:92:0x014d, B:93:0x0157), top: B:98:0x00ac }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(q2.h0 h0Var, Object obj, boolean z10, h9.n nVar) {
        boolean z11;
        f1.y yVar;
        s.h0 h0Var2 = this.f9346f;
        Object objG = h0Var2.g(h0Var);
        Object obj2 = objG;
        if (objG == null) {
            n1.c cVar = h.f9331a;
            b0 b0Var = new b0();
            b0Var.f9292a = obj;
            b0Var.f9293b = cVar;
            b0Var.f9294c = null;
            b0Var.f9298g = f1.b.s(Boolean.TRUE);
            h0Var2.m(h0Var, b0Var);
            obj2 = b0Var;
        }
        b0 b0Var2 = (b0) obj2;
        boolean z12 = b0Var2.f9293b != nVar;
        if (b0Var2.f9297f != null) {
            if (z12) {
                a(b0Var2);
            } else {
                if (z10) {
                    return;
                }
                f1.n1 n1Var = b0Var2.f9297f;
                if (n1Var != null) {
                    p1.f fVarH = n4.e.h();
                    h9.k kVarE = fVarH != null ? fVarH.e() : null;
                    p1.f fVarK = n4.e.k(fVarH);
                    try {
                        q2.h0 h0Var3 = this.f9341a;
                        h0Var3.f10681p = true;
                        while (!n1Var.c()) {
                            n1Var.f(new b3.l0(5));
                        }
                        n1Var.a();
                        b0Var2.f9297f = null;
                        h0Var3.f10681p = false;
                        n4.e.r(fVarH, fVarK, kVarE);
                    } catch (Throwable th) {
                        n4.e.r(fVarH, fVarK, kVarE);
                        throw th;
                    }
                }
            }
        }
        f1.y yVar2 = b0Var2.f9294c;
        if (yVar2 != null) {
            synchronized (yVar2.f5207d) {
                z11 = yVar2.f5216n.f12441e > 0;
            }
        } else {
            z11 = true;
        }
        if (z12 || z11 || b0Var2.f9295d) {
            b0Var2.f9293b = nVar;
            if (b0Var2.f9297f != null) {
                n2.a.a("new subcompose call while paused composition is still active");
            }
            p1.f fVarH2 = n4.e.h();
            h9.k kVarE2 = fVarH2 != null ? fVarH2.e() : null;
            p1.f fVarK2 = n4.e.k(fVarH2);
            try {
                q2.h0 h0Var4 = this.f9341a;
                h0Var4.f10681p = true;
                f1.y yVar3 = b0Var2.f9294c;
                f1.v vVar = this.f9342b;
                if (vVar == null) {
                    n2.a.c("parent composition reference not set");
                    throw new cc.s();
                }
                int i7 = 3;
                if (yVar3 == null) {
                    if (z10) {
                        ViewGroup.LayoutParams layoutParams = h3.f11262a;
                        yVar = new f1.y(vVar, new a2.b(h0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = h3.f11262a;
                        yVar = new f1.y(vVar, new a2.b(h0Var));
                    }
                    yVar3 = yVar;
                } else {
                    if (yVar3.f5225w == 3) {
                        if (z10) {
                            ViewGroup.LayoutParams layoutParams3 = h3.f11262a;
                            yVar = new f1.y(vVar, new a2.b(h0Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = h3.f11262a;
                            yVar = new f1.y(vVar, new a2.b(h0Var));
                        }
                        yVar3 = yVar;
                    }
                }
                b0Var2.f9294c = yVar3;
                h9.n cVar2 = b0Var2.f9293b;
                if (((r2.u) q2.k0.a(this.f9341a)).getOutOfFrameExecutor() != null) {
                    b0Var2.f9299h = false;
                } else {
                    b0Var2.f9299h = true;
                    cVar2 = new n1.c(new c1.h(i7, b0Var2, cVar2), 1524156494, true);
                }
                if (z10) {
                    if (b0Var2.f9296e) {
                        yVar3.i();
                        yVar3.q();
                        b0Var2.f9297f = yVar3.k(true, cVar2);
                    } else {
                        b0Var2.f9297f = yVar3.k(yVar3.i(), cVar2);
                    }
                } else if (b0Var2.f9296e) {
                    yVar3.i();
                    yVar3.q();
                    f1.s sVar = yVar3.f5224v;
                    sVar.f5130z = 100;
                    sVar.f5129y = true;
                    yVar3.f5204a.a(yVar3, cVar2);
                    sVar.s();
                } else {
                    yVar3.B(cVar2);
                }
                b0Var2.f9296e = false;
                h0Var4.f10681p = false;
                n4.e.r(fVarH2, fVarK2, kVarE2);
                b0Var2.f9295d = false;
            } catch (Throwable th2) {
                n4.e.r(fVarH2, fVarK2, kVarE2);
                throw th2;
            }
        }
    }

    public final q2.h0 i(Object obj) {
        s.h0 h0Var;
        int i7;
        if (this.f9353n == 0) {
            return null;
        }
        q2.h0 h0Var2 = this.f9341a;
        h1.b bVar = (h1.b) h0Var2.o();
        int i10 = ((h1.e) bVar.f6413b).f6423c - this.f9354o;
        int i11 = i10 - this.f9353n;
        int i12 = i10 - 1;
        int i13 = i12;
        while (true) {
            h0Var = this.f9346f;
            if (i13 < i11) {
                i7 = -1;
                break;
            }
            Object objG = h0Var.g((q2.h0) bVar.get(i13));
            i9.l.b(objG);
            if (i9.l.a(((b0) objG).f9292a, obj)) {
                i7 = i13;
                break;
            }
            i13--;
        }
        if (i7 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                Object objG2 = h0Var.g((q2.h0) bVar.get(i12));
                i9.l.b(objG2);
                b0 b0Var = (b0) objG2;
                Object obj2 = b0Var.f9292a;
                if (obj2 != d1.f9316a) {
                    h0.t tVar = (h0.t) this.f9343c.f604b;
                    if (!i9.l.a(tVar.b(obj), tVar.b(obj2))) {
                        i12--;
                    }
                }
                b0Var.f9292a = obj;
                i13 = i12;
                i7 = i13;
                break;
            }
        }
        if (i7 == -1) {
            return null;
        }
        if (i13 != i11) {
            h0Var2.f10681p = true;
            h0Var2.M(i13, i11, 1);
            h0Var2.f10681p = false;
        }
        this.f9353n--;
        q2.h0 h0Var3 = (q2.h0) bVar.get(i11);
        Object objG3 = h0Var.g(h0Var3);
        i9.l.b(objG3);
        b0 b0Var2 = (b0) objG3;
        b0Var2.f9298g = f1.b.s(Boolean.TRUE);
        b0Var2.f9296e = true;
        b0Var2.f9295d = true;
        return h0Var3;
    }
}
