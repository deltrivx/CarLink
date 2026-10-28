package b1;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import cc.b0;
import cc.y;
import java.util.ArrayList;
import k2.v;
import q2.h0;
import q2.j0;
import v.u;
import v.v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1183c = v.d.a(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1184d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1185e;

    /* JADX WARN: Multi-variable type inference failed */
    public q(h9.a aVar, boolean z10) {
        this.f1181a = z10;
        this.f1182b = (i9.n) aVar;
    }

    public boolean a(float f10, float f11) {
        ViewParent viewParentD;
        if (this.f1181a && (viewParentD = d(0)) != null) {
            try {
                return viewParentD.onNestedPreFling((NestedScrollView) this.f1184d, f10, f11);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentD + " does not implement interface method onNestedPreFling", e7);
            }
        }
        return false;
    }

    public boolean b(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentD;
        int i14;
        int i15;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1184d;
        if (this.f1181a && (viewParentD = d(i13)) != null) {
            if (i7 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f1185e) == null) {
                        this.f1185e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f1185e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentD instanceof e4.m) {
                    ((e4.m) viewParentD).i(nestedScrollView, i7, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentD instanceof e4.l) {
                        ((e4.l) viewParentD).a(nestedScrollView, i7, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentD.onNestedScroll(nestedScrollView, i7, i10, i11, i12);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentD + " does not implement interface method onNestedScroll", e7);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public void c(j0 j0Var, float f10, long j5) {
        float fFloatValue = ((Number) ((v.c) this.f1183c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = y1.q.b(fFloatValue, j5);
            if (!this.f1181a) {
                a2.f.r(j0Var, jB, f10, 0L, 124);
                return;
            }
            float fD = x1.e.d(j0Var.g());
            float fB = x1.e.b(j0Var.g());
            a2.b bVar = j0Var.f10720a.f16b;
            long J = bVar.J();
            bVar.z().h();
            try {
                ((a2.b) ((a2.d) bVar.f12b).f20b).z().l(0.0f, 0.0f, fD, fB, 1);
                a2.f.r(j0Var, jB, f10, 0L, 124);
            } finally {
                ob.a.y(bVar, J);
            }
        }
    }

    public ViewParent d(int i7) {
        if (i7 == 0) {
            return (ViewParent) this.f1182b;
        }
        if (i7 != 1) {
            return null;
        }
        return (ViewParent) this.f1183c;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [h9.a, i9.n] */
    public void e(b0.j jVar, y yVar) {
        float f10;
        ArrayList arrayList = (ArrayList) this.f1184d;
        boolean z10 = jVar instanceof b0.h;
        if (z10) {
            arrayList.add(jVar);
        } else if (jVar instanceof b0.i) {
            arrayList.remove(((b0.i) jVar).f1114a);
        } else if (jVar instanceof b0.d) {
            arrayList.add(jVar);
        } else if (jVar instanceof b0.e) {
            arrayList.remove(((b0.e) jVar).f1106a);
        } else if (jVar instanceof b0.b) {
            arrayList.add(jVar);
        } else if (jVar instanceof b0.c) {
            arrayList.remove(((b0.c) jVar).f1105a);
        } else if (!(jVar instanceof b0.a)) {
            return;
        } else {
            arrayList.remove(((b0.a) jVar).f1104a);
        }
        b0.j jVar2 = (b0.j) u8.p.t0(arrayList);
        if (i9.l.a((b0.j) this.f1185e, jVar2)) {
            return;
        }
        y8.c cVar = null;
        if (jVar2 != null) {
            g gVar = (g) ((i9.n) this.f1182b).invoke();
            if (z10) {
                f10 = gVar.f1156c;
            } else if (jVar instanceof b0.d) {
                f10 = gVar.f1155b;
            } else {
                f10 = jVar instanceof b0.b ? gVar.f1154a : 0.0f;
            }
            v0 v0Var = l.f1171a;
            if (!(jVar2 instanceof b0.h) && ((jVar2 instanceof b0.d) || (jVar2 instanceof b0.b))) {
                v0Var = new v0(45, u.f13467b, 2);
            }
            b0.s(yVar, null, new p(this, f10, v0Var, null), 3);
        } else {
            b0.j jVar3 = (b0.j) this.f1185e;
            v0 v0Var2 = l.f1171a;
            if (!(jVar3 instanceof b0.h) && !(jVar3 instanceof b0.d) && (jVar3 instanceof b0.b)) {
                v0Var2 = new v0(150, u.f13467b, 2);
            }
            b0.s(yVar, null, new b0.g(this, v0Var2, cVar, 2), 3);
        }
        this.f1185e = jVar2;
    }

    public int f(android.support.v4.media.session.r rVar, r2.u uVar, boolean z10) {
        int i7;
        boolean z11;
        int i10;
        int i11;
        k2.e eVar = (k2.e) this.f1183c;
        q2.r rVar2 = (q2.r) this.f1185e;
        if (this.f1181a) {
            return 0;
        }
        try {
            this.f1181a = true;
            k2.i iVarU = ((a2.d) this.f1184d).u(rVar, uVar);
            s.q qVar = (s.q) iVarU.f7219b;
            int iH = qVar.h();
            while (true) {
                if (i7 >= iH) {
                    z11 = true;
                    break;
                }
                v vVar = (v) qVar.i(i7);
                i7 = (vVar.f7281d || vVar.f7285h) ? 0 : i7 + 1;
                z11 = false;
                break;
            }
            int iH2 = qVar.h();
            for (int i12 = 0; i12 < iH2; i12++) {
                v vVar2 = (v) qVar.i(i12);
                if (z11 || k2.u.a(vVar2)) {
                    ((h0) this.f1182b).A(vVar2.f7280c, (q2.r) this.f1185e, vVar2.f7286i, true);
                    if (!rVar2.f10785a.g()) {
                        eVar.a(vVar2.f7278a, rVar2, k2.u.a(vVar2));
                        rVar2.clear();
                    }
                }
            }
            boolean zD = eVar.d(iVarU, z10);
            if (iVarU.f7218a) {
                i10 = 0;
                break;
            }
            int iH3 = qVar.h();
            int i13 = 0;
            while (true) {
                if (i13 >= iH3) {
                    i10 = 0;
                    break;
                }
                v vVar3 = (v) qVar.i(i13);
                if (!x1.b.b(k2.u.f(vVar3, true), 0L) && vVar3.b()) {
                    i10 = 1;
                    break;
                }
                i13++;
            }
            int iH4 = qVar.h();
            for (int i14 = 0; i14 < iH4; i14++) {
                if (((v) qVar.i(i14)).b()) {
                    i11 = 1;
                    return (zD ? 1 : 0) | (i10 << 1) | (i11 << 2);
                }
            }
            i11 = 0;
            return (zD ? 1 : 0) | (i10 << 1) | (i11 << 2);
        } finally {
            this.f1181a = false;
        }
    }
}
