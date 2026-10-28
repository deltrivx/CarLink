package c8;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import b8.m2;
import b8.n2;
import c1.h2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.g0;
import e4.l0;
import f1.b1;
import f1.c2;
import f1.x1;
import fc.h0;
import h0.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import l0.z0;
import l8.j0;
import l8.n0;
import o2.u0;
import o2.v0;
import r2.e1;
import s.i0;
import v.p0;
import v.r0;
import v.s0;
import w0.d1;
import w0.w0;
import z.g2;
import z.r1;
import z.t1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2532c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.f2530a = i7;
        this.f2531b = obj;
        this.f2532c = obj2;
    }

    public /* synthetic */ p(int i7, Object obj, Object obj2, boolean z10) {
        this.f2530a = i7;
        this.f2532c = obj;
        this.f2531b = obj2;
    }

    public /* synthetic */ p(w0.o oVar, s.a0 a0Var, w0.z zVar) {
        this.f2530a = 18;
        this.f2531b = a0Var;
        this.f2532c = zVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean z10;
        w0.z zVar;
        int i7 = -1;
        int i10 = 6;
        int i11 = 7;
        int i12 = 2;
        y8.c cVar = null;
        int i13 = 0;
        int i14 = 1;
        switch (this.f2530a) {
            case 0:
                p1.p pVar = (p1.p) this.f2531b;
                b1 b1Var = (b1) this.f2532c;
                n2 n2Var = (n2) obj;
                i9.l.e(n2Var, "it");
                ListIterator listIterator = pVar.listIterator();
                int i15 = 0;
                while (true) {
                    p1.v vVar = (p1.v) listIterator;
                    if (vVar.hasNext()) {
                        if (((n2) vVar.next()).f1623a == n2Var.f1623a) {
                            i7 = i15;
                        } else {
                            i15++;
                        }
                    }
                }
                if (i7 >= 0) {
                    pVar.set(i7, n2Var);
                } else {
                    pVar.add(n2Var);
                }
                b1Var.setValue(null);
                hc.c cVar2 = n8.c.f8897a;
                n8.c.j(0, "保存成功");
                return t8.z.f12851a;
            case 1:
                n2 n2Var2 = (n2) this.f2532c;
                p1.p pVar2 = (p1.p) this.f2531b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ListIterator listIterator2 = pVar2.listIterator();
                while (true) {
                    p1.v vVar2 = (p1.v) listIterator2;
                    if (vVar2.hasNext()) {
                        if (((n2) vVar2.next()).f1623a == n2Var2.f1623a) {
                            i7 = i13;
                        } else {
                            i13++;
                        }
                    }
                }
                if (i7 >= 0) {
                    pVar2.set(i7, n2.a((n2) pVar2.get(i7), null, null, null, zBooleanValue, 15));
                }
                return t8.z.f12851a;
            case 2:
                d0.f0 f0Var = (d0.f0) this.f2531b;
                v0 v0Var = (v0) this.f2532c;
                u0 u0Var = (u0) obj;
                if (f0Var.f3560q) {
                    float f10 = f0Var.f3558o;
                    u0Var.getClass();
                    u0.j(u0Var, v0Var, a2.f.j(f10, u0Var), a2.f.j(f0Var.f3559p, u0Var));
                } else {
                    float f11 = f0Var.f3558o;
                    u0Var.getClass();
                    u0.f(u0Var, v0Var, a2.f.j(f11, u0Var), a2.f.j(f0Var.f3559p, u0Var));
                }
                return t8.z.f12851a;
            case 3:
                g0 g0Var = (g0) this.f2531b;
                v0 v0Var2 = (v0) this.f2532c;
                u0 u0Var2 = (u0) obj;
                if (g0Var.f3565s) {
                    float f12 = g0Var.f3561o;
                    u0Var2.getClass();
                    u0.j(u0Var2, v0Var2, a2.f.j(f12, u0Var2), a2.f.j(g0Var.f3562p, u0Var2));
                } else {
                    float f13 = g0Var.f3561o;
                    u0Var2.getClass();
                    u0.f(u0Var2, v0Var2, a2.f.j(f13, u0Var2), a2.f.j(g0Var.f3562p, u0Var2));
                }
                return t8.z.f12851a;
            case 4:
                d0.v0 v0Var3 = (d0.v0) this.f2531b;
                View view = (View) this.f2532c;
                d0.y yVar = v0Var3.f3660t;
                if (v0Var3.f3659s == 0) {
                    WeakHashMap weakHashMap = l0.f4369a;
                    e4.e0.i(view, yVar);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(yVar);
                    l0.l(view, yVar);
                }
                v0Var3.f3659s++;
                return new d0.u0(i13, v0Var3, view);
            case 5:
                ((dc.d) this.f2531b).f3903c.removeCallbacks((b4.a) this.f2532c);
                return t8.z.f12851a;
            case 6:
                h9.k kVar = (h9.k) this.f2531b;
                e8.w wVar = (e8.w) this.f2532c;
                j0 j0Var = (j0) obj;
                i9.l.e(j0Var, "it");
                String str = wVar.f4642a;
                String str2 = wVar.f4643b;
                e8.j jVar = e8.k.f4567d;
                String str3 = j0Var.f8198c;
                int i16 = Integer.parseInt(str3);
                n0 n0Var = j0Var.f8197b;
                int iA = n0Var.a();
                jVar.getClass();
                kVar.invoke(new m2(str, str2, ob.a.B(str2, e8.j.b(i16, iA)), new b8.d(Integer.parseInt(str3), n0Var.a())));
                return t8.z.f12851a;
            case 7:
                f1.y yVar2 = (f1.y) this.f2531b;
                i0 i0Var = (i0) this.f2532c;
                yVar2.A(obj);
                if (i0Var != null) {
                    i0Var.a(obj);
                }
                return t8.z.f12851a;
            case 8:
                c2 c2Var = (c2) this.f2531b;
                Throwable th = (Throwable) this.f2532c;
                Throwable th2 = (Throwable) obj;
                synchronized (c2Var.f4904b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                t8.a.a(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c2Var.f4906d = th;
                    h0 h0Var = c2Var.f4921t;
                    x1 x1Var = x1.f5197a;
                    h0Var.getClass();
                    h0Var.j(null, x1Var);
                }
                return t8.z.f12851a;
            case 9:
                g0.s sVar = (g0.s) this.f2531b;
                g0.m mVar = (g0.m) this.f2532c;
                b4.l lVarB = sVar.b(((Integer) obj).intValue());
                int i17 = lVarB.f1501a;
                List list = lVarB.f1502b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i18 = 0;
                while (i13 < size) {
                    int i19 = (int) ((g0.b) list.get(i13)).f5623a;
                    arrayList.add(new t8.j(Integer.valueOf(i17), new n3.a(mVar.a(i18, i19))));
                    i17++;
                    i18 += i19;
                    i13++;
                }
                return arrayList;
            case 10:
                g0.m mVar2 = (g0.m) this.f2531b;
                g0.l lVar = (g0.l) this.f2532c;
                int iIntValue = ((Integer) obj).intValue();
                g0.s sVar2 = mVar2.f5673e;
                int i20 = sVar2.f5728i;
                int iE = sVar2.e(iIntValue);
                return lVar.w0(iIntValue, mVar2.a(0, iE), 0, iE, lVar.f5663d);
            case 11:
                q0 q0Var = (q0) this.f2531b;
                Object obj2 = this.f2532c;
                q0Var.f6359c.i(obj2);
                return new d0.u0(1, q0Var, obj2);
            case 12:
                return new q0((o1.f) this.f2531b, (Map) obj, (o1.d) this.f2532c);
            case 13:
                return new d0.u0(i12, (b1) this.f2532c, (b0.k) this.f2531b);
            case 14:
                h9.k kVar2 = (h9.k) this.f2531b;
                i9.x xVar = (i9.x) this.f2532c;
                j0 j0Var2 = (j0) obj;
                i9.l.e(j0Var2, "it");
                if (kVar2 != null) {
                    kVar2.invoke(j0Var2);
                }
                h9.k kVar3 = (h9.k) xVar.f6688a;
                if (kVar3 != null) {
                    kVar3.invoke(j0Var2);
                }
                return t8.z.f12851a;
            case 15:
                p1.p pVar3 = (p1.p) this.f2531b;
                p1.p pVar4 = (p1.p) this.f2532c;
                f0.g gVar = (f0.g) obj;
                i9.l.e(gVar, "$this$LazyColumn");
                gVar.f4770b.a(pVar3.size(), new f0.f(f0.q.f4837a, new n1.c(new o7.t(pVar3, pVar4), -307321278, true)));
                return t8.z.f12851a;
            case 16:
                cc.b0.s((cc.y) this.f2531b, null, new b1.p((s0) this.f2532c, null), 1);
                return new r0();
            case 17:
                s0 s0Var = (s0) this.f2531b;
                p0 p0Var = (p0) this.f2532c;
                s0Var.f13456g.add(p0Var);
                return new d0.u0(i10, s0Var, p0Var);
            case 18:
                w0.w wVar2 = (w0.w) obj;
                w0.o.n((s.a0) this.f2531b, (w0.z) this.f2532c, wVar2, 0, wVar2.f13978f.f1408a.f1393a.f1353b.length());
                return t8.z.f12851a;
            case 19:
                cc.b0.s((cc.y) this.f2531b, null, new b0.g((e1) this.f2532c, (b3.h) obj, cVar, 21), 1);
                return t8.z.f12851a;
            case 20:
                w0 w0Var = (w0) this.f2531b;
                h9.k kVar4 = (h9.k) this.f2532c;
                w0.z zVar2 = (w0.z) obj;
                w0Var.m(zVar2);
                kVar4.invoke(zVar2);
                return t8.z.f12851a;
            case 21:
                w0 w0Var2 = (w0) this.f2531b;
                Context context = (Context) this.f2532c;
                n0.a aVar = (n0.a) obj;
                aVar.a();
                s.d0 d0Var = aVar.f8700a;
                z0 z0Var = z0.Autofill;
                boolean zI = w0Var2.i();
                w0.f0 f0Var2 = new w0.f0(w0Var2, 5);
                Resources resources = context.getResources();
                w0.z0 z0Var2 = new w0.z0(f0Var2, null, 0);
                if (zI) {
                    d0Var.a(new o0.d(o0.e.f9256b, resources.getString(R.string.copy), R.attr.actionModeCopyDrawable, z0Var2));
                }
                z0 z0Var3 = z0.Autofill;
                d1 d1Var = w0Var2.f13979a;
                ArrayList arrayListC = d1Var.c(w0Var2.k());
                if (!arrayListC.isEmpty()) {
                    int size2 = arrayListC.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 < size2) {
                            w0.p pVar5 = (w0.p) arrayListC.get(i21);
                            b3.h hVarD = pVar5.d();
                            z10 = hVarD.f1353b.length() == 0 || ((zVar = (w0.z) d1Var.a().e(pVar5.f13874a)) != null && Math.abs(zVar.f14018a.f14010b - zVar.f14019b.f14010b) == hVarD.f1353b.length());
                            i21++;
                            size2 = size2;
                        }
                    }
                }
                w0.f0 f0Var3 = new w0.f0(w0Var2, i10);
                w0.f0 f0Var4 = new w0.f0(w0Var2, i11);
                Resources resources2 = context.getResources();
                w0.z0 z0Var4 = new w0.z0(f0Var4, f0Var3, 0);
                if (!z10) {
                    d0Var.a(new o0.d(o0.e.f9258d, resources2.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, z0Var4));
                }
                aVar.a();
                return t8.z.f12851a;
            case 22:
                androidx.lifecycle.v vVar3 = (androidx.lifecycle.v) this.f2531b;
                b1 b1Var2 = (b1) this.f2532c;
                i9.l.e((f1.i0) obj, "$this$DisposableEffect");
                c.h hVar = new c.h(i14, vVar3, b1Var2);
                vVar3.a(hVar);
                return new d0.u0(i11, vVar3, hVar);
            case 23:
                y1.h hVar2 = (y1.h) this.f2531b;
                y1.m mVar3 = (y1.m) this.f2532c;
                q2.j0 j0Var3 = (q2.j0) obj;
                j0Var3.b();
                a2.f.t(j0Var3, hVar2, mVar3, 0.0f, null, 60);
                return t8.z.f12851a;
            case 24:
                y1.b0 b0Var = (y1.b0) this.f2531b;
                y1.m mVar4 = (y1.m) this.f2532c;
                q2.j0 j0Var4 = (q2.j0) obj;
                j0Var4.b();
                a2.f.t(j0Var4, b0Var.f14878e, mVar4, 0.0f, null, 60);
                return t8.z.f12851a;
            case 25:
                ((b0.k) this.f2531b).b((b0.j) this.f2532c);
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                ((h0.k) this.f2531b).f6332a.k((z.e) this.f2532c);
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                h2 h2Var = (h2) this.f2531b;
                z.j0 j0Var5 = (z.j0) this.f2532c;
                long jI = x1.b.i(j0Var5.E ? -1.0f : 1.0f, ((z.l) obj).f15428a);
                x0 x0Var = j0Var5.A;
                z.g0 g0Var2 = z.h0.f15396a;
                h2Var.f1910a.a(Float.intBitsToFloat(x0Var == x0.f15591a ? (int) (jI & 4294967295L) : (int) (jI >> 32)));
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                r1 r1Var = (r1) this.f2531b;
                t1 t1Var = (t1) this.f2532c;
                long j5 = ((z.l) obj).f15428a;
                r1Var.a(1, t1Var.f15520d == x0.f15592b ? x1.b.a(j5, 0.0f, 1) : x1.b.a(j5, 0.0f, 2));
                return t8.z.f12851a;
            default:
                g2 g2Var = (g2) this.f2531b;
                h9.k kVar5 = (h9.k) this.f2532c;
                ((Long) obj).longValue();
                float f14 = g2Var.f15394e;
                g2Var.f15394e = 0.0f;
                kVar5.invoke(Float.valueOf(f14));
                return t8.z.f12851a;
        }
    }
}
