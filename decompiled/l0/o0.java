package l0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p.g2;
import p.x2;
import q2.z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class o0 implements l4.i, mb.m, g2, o.x, o.k, p.z0, x9.n0, x9.s, x9.m, v.x0, wb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7772b;

    public o0(float f10, float f11) {
        this.f7771a = 24;
        this.f7772b = new v.x(f10, f11, 0.01f);
    }

    public o0(float f10, float f11, v.p pVar) {
        this.f7771a = 26;
        int i7 = v.y0.f13479a;
        this.f7772b = new da.a(14, pVar != null ? new o0(pVar, f10, f11) : new o0(f10, f11));
    }

    public o0(int i7) {
        this.f7771a = i7;
        switch (i7) {
            case 18:
                this.f7772b = new ConcurrentHashMap(16);
                break;
            default:
                this.f7772b = new z1(q2.f.f10637a);
                break;
        }
    }

    public /* synthetic */ o0(int i7, Object obj) {
        this.f7771a = i7;
        this.f7772b = obj;
    }

    public /* synthetic */ o0(int i7, boolean z10) {
        this.f7771a = i7;
    }

    public o0(Context context) {
        this.f7771a = 1;
        this.f7772b = context.getApplicationContext();
    }

    public o0(EditText editText) {
        this.f7771a = 3;
        this.f7772b = new android.support.v4.media.session.r(editText);
    }

    public o0(TextView textView) {
        this.f7771a = 4;
        this.f7772b = new n4.i(textView);
    }

    public o0(n3.c cVar) {
        this.f7771a = 20;
        this.f7772b = new u.e(u.h.f12965a, cVar);
    }

    public o0(v.p pVar, float f10, float f11) {
        this.f7771a = 23;
        int iB = pVar.b();
        v.x[] xVarArr = new v.x[iB];
        for (int i7 = 0; i7 < iB; i7++) {
            xVarArr[i7] = new v.x(f10, f11, pVar.a(i7));
        }
        this.f7772b = xVarArr;
    }

    public o0(long[] jArr) {
        s.z zVar;
        this.f7771a = 10;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            zVar = new s.z(jArrCopyOf.length);
            int i7 = zVar.f12523b;
            if (i7 < 0) {
                t.a.d("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i7;
                long[] jArr2 = zVar.f12522a;
                if (jArr2.length < length) {
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    i9.l.d(jArrCopyOf2, "copyOf(...)");
                    zVar.f12522a = jArrCopyOf2;
                }
                long[] jArr3 = zVar.f12522a;
                int i10 = zVar.f12523b;
                if (i7 != i10) {
                    u8.l.o0(jArr3, jArr3, jArrCopyOf.length + i7, i7, i10);
                }
                u8.l.o0(jArrCopyOf, jArr3, i7, 0, jArrCopyOf.length);
                zVar.f12523b += jArrCopyOf.length;
            }
        } else {
            zVar = new s.z(16);
        }
        this.f7772b = zVar;
    }

    @Override // x9.m
    public Object A(aa.y0 y0Var, Object obj) {
        return null;
    }

    @Override // p.z0
    public void B(int i7) {
    }

    @Override // x9.m
    public Object C(aa.j0 j0Var, Object obj) {
        return null;
    }

    @Override // x9.s
    public x9.s D() {
        return this;
    }

    @Override // v.x0
    public v.p F(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f7772b).F(j5, pVar, pVar2, pVar3);
    }

    @Override // x9.m
    public Object G(aa.r0 r0Var, Object obj) {
        return l(r0Var, obj);
    }

    @Override // x9.s
    public x9.s H() {
        return this;
    }

    @Override // x9.m
    public Object I(aa.q0 q0Var, Object obj) {
        return l(q0Var, obj);
    }

    @Override // o.x
    public boolean J(o.m mVar) {
        p.k kVar = (p.k) this.f7772b;
        if (mVar == kVar.f9800c) {
            return false;
        }
        ((o.e0) mVar).A.getClass();
        kVar.getClass();
        o.x xVar = kVar.f9802e;
        if (xVar != null) {
            return xVar.J(mVar);
        }
        return false;
    }

    @Override // l4.i
    public void K(k9.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new l4.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new l4.l(this, aVar, threadPoolExecutor, 0));
    }

    @Override // p.z0
    public void L(int i7) {
    }

    @Override // x9.m
    public Object M(aa.p0 p0Var, Object obj) {
        r9.e0 e0Var = (r9.e0) this.f7772b;
        i9.l.e(p0Var, "descriptor");
        int i7 = (p0Var.f417t != null ? 1 : 0) + (p0Var.f418u != null ? 1 : 0);
        if (p0Var.f404f) {
            if (i7 == 0) {
                return new r9.i0(e0Var, p0Var);
            }
            if (i7 == 1) {
                return new r9.k0(e0Var, p0Var);
            }
            if (i7 == 2) {
                return new r9.m0(e0Var, p0Var);
            }
        } else {
            if (i7 == 0) {
                return new r9.y0(e0Var, p0Var);
            }
            if (i7 == 1) {
                return new r9.b1(e0Var, p0Var);
            }
            if (i7 == 2) {
                return new r9.e1(e0Var, p0Var);
            }
        }
        throw new cc.a0(2, "Unsupported property: " + p0Var);
    }

    @Override // x9.m
    public Object N(aa.c0 c0Var, Object obj) {
        return null;
    }

    @Override // x9.m
    public Object O(aa.m mVar, Object obj) {
        return l(mVar, obj);
    }

    @Override // x9.s
    public x9.s P(wa.e eVar) {
        i9.l.e(eVar, "name");
        return this;
    }

    @Override // p.z0
    public void Q(int i7, float f10) {
    }

    @Override // o.k
    public void R(o.m mVar) {
        x2 x2Var = ((ActionMenuView) this.f7772b).f694u;
        if (x2Var != null) {
            x2Var.R(mVar);
        }
    }

    @Override // x9.s
    public x9.s S() {
        return this;
    }

    @Override // v.x0
    public v.p T(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f7772b).T(j5, pVar, pVar2, pVar3);
    }

    public void U(q2.h0 h0Var) {
        if (!h0Var.I()) {
            n2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((z1) this.f7772b).add(h0Var);
    }

    public void V(int[] iArr, int i7) throws v5.c {
        int[] iArr2;
        int[] iArr3;
        int iC;
        int i10;
        v5.a aVar = (v5.a) this.f7772b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i11 = 1;
            while (i11 < length && iArr[i11] == 0) {
                i11++;
            }
            if (i11 == length) {
                iArr2 = new int[]{0};
            } else {
                int i12 = length - i11;
                int[] iArr4 = new int[i12];
                System.arraycopy(iArr, i11, iArr4, 0, i12);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i7];
        boolean z10 = true;
        for (int i13 = 0; i13 < i7; i13++) {
            int i14 = aVar.f13616a[aVar.f13622g + i13];
            if (i14 == 0) {
                i10 = iArr2[iArr2.length - 1];
            } else {
                if (i14 == 1) {
                    iC = 0;
                    for (int i15 : iArr2) {
                        v5.a aVar2 = v5.a.f13609h;
                        iC ^= i15;
                    }
                } else {
                    iC = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i16 = 1; i16 < length2; i16++) {
                        iC = aVar.c(i14, iC) ^ iArr2[i16];
                    }
                }
                i10 = iC;
            }
            iArr5[(i7 - 1) - i13] = i10;
            if (i10 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        v5.b bVar = new v5.b(aVar, iArr5);
        v5.b bVarA = aVar.a(i7, 1);
        v5.b bVar2 = aVar.f13618c;
        if (bVarA.d() >= bVar.d()) {
            bVarA = bVar;
            bVar = bVarA;
        }
        v5.b bVar3 = aVar.f13619d;
        v5.b bVar4 = bVarA;
        v5.b bVarA2 = bVar;
        v5.b bVar5 = bVar4;
        v5.b bVar6 = bVar2;
        while (bVar5.d() >= i7 / 2) {
            if (bVar5.e()) {
                throw new v5.c("r_{i-1} was zero");
            }
            int iB = aVar.b(bVar5.c(bVar5.d()));
            v5.b bVarA3 = bVar2;
            while (bVarA2.d() >= bVar5.d() && !bVarA2.e()) {
                int iD = bVarA2.d() - bVar5.d();
                int iC2 = aVar.c(bVarA2.c(bVarA2.d()), iB);
                bVarA3 = bVarA3.a(aVar.a(iD, iC2));
                bVarA2 = bVarA2.a(bVar5.h(iD, iC2));
            }
            v5.b bVarA4 = bVarA3.g(bVar3).a(bVar6);
            if (bVarA2.d() >= bVar5.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            v5.b bVar7 = bVarA2;
            bVarA2 = bVar5;
            bVar5 = bVar7;
            bVar6 = bVar3;
            bVar3 = bVarA4;
        }
        int iC3 = bVar3.c(0);
        if (iC3 == 0) {
            throw new v5.c("sigmaTilde(0) was zero");
        }
        int iB2 = aVar.b(iC3);
        v5.b[] bVarArr = {bVar3.f(iB2), bVar5.f(iB2)};
        v5.b bVar8 = bVarArr[0];
        v5.b bVar9 = bVarArr[1];
        int iD2 = bVar8.d();
        if (iD2 == 1) {
            iArr3 = new int[]{bVar8.c(1)};
        } else {
            int[] iArr6 = new int[iD2];
            int i17 = 0;
            for (int i18 = 1; i18 < aVar.f13620e && i17 < iD2; i18++) {
                if (bVar8.b(i18) == 0) {
                    iArr6[i17] = aVar.b(i18);
                    i17++;
                }
            }
            if (i17 != iD2) {
                throw new v5.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i19 = 0; i19 < length3; i19++) {
            int iB3 = aVar.b(iArr3[i19]);
            int iC4 = 1;
            for (int i20 = 0; i20 < length3; i20++) {
                if (i19 != i20) {
                    int iC5 = aVar.c(iArr3[i20], iB3);
                    iC4 = aVar.c(iC4, (iC5 & 1) == 0 ? iC5 | 1 : iC5 & (-2));
                }
            }
            int iC6 = aVar.c(bVar9.b(iB3), aVar.b(iC4));
            iArr7[i19] = iC6;
            if (aVar.f13622g != 0) {
                iArr7[i19] = aVar.c(iC6, iB3);
            }
        }
        for (int i21 = 0; i21 < iArr3.length; i21++) {
            int length4 = iArr.length - 1;
            int i22 = iArr3[i21];
            if (i22 == 0) {
                throw new IllegalArgumentException();
            }
            int i23 = length4 - aVar.f13617b[i22];
            if (i23 < 0) {
                throw new v5.c("Bad error location");
            }
            iArr[i23] = iArr[i23] ^ iArr7[i21];
        }
    }

    public Object W(nc.e eVar, rc.k kVar) {
        i9.l.e(eVar, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f7772b).get(eVar);
        Object obj = map != null ? map.get(kVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public v.w X(int i7) {
        switch (this.f7771a) {
            case 23:
                return ((v.x[]) this.f7772b)[i7];
            case 24:
                return (v.x) this.f7772b;
            default:
                return (v.w) this.f7772b;
        }
    }

    public void Y() {
        ((p4.k) this.f7772b).f10206f.J();
    }

    public void Z(View view, int i7, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f7772b).notifyViewVisibilityChanged(view, i7, z10);
        }
    }

    @Override // v.x0
    public boolean a() {
        ((da.a) this.f7772b).getClass();
        return false;
    }

    public boolean a0(q2.h0 h0Var) {
        if (!h0Var.I()) {
            n2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((z1) this.f7772b).remove(h0Var);
    }

    @Override // o.x
    public void b(o.m mVar, boolean z10) {
        if (mVar instanceof o.e0) {
            ((o.e0) mVar).f9133z.k().c(false);
        }
        o.x xVar = ((p.k) this.f7772b).f9802e;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    public void b0() {
        s0.f fVar;
        r0.f fVar2 = (r0.f) this.f7772b;
        if (fVar2 == null) {
            c0.b.d("ToolbarRequester is not initialized.");
            throw new cc.s();
        }
        if (fVar2.f11129n) {
            cc.o1 o1Var = fVar2.f11086u;
            if ((o1Var == null || !o1Var.b()) && (fVar = (s0.f) q2.f.i(fVar2, s0.g.f12535b)) != null) {
                fVar2.f11086u = cc.b0.s(fVar2.m0(), null, new b1.f(fVar2, fVar, (y8.c) null, 9), 1);
            }
        }
    }

    @Override // x9.s
    public x9.t build() {
        return (pb.c) this.f7772b;
    }

    @Override // x9.s
    public x9.s c(y9.h hVar) {
        i9.l.e(hVar, "additionalAnnotations");
        return this;
    }

    @Override // p.g2
    public void d(o.m mVar, MenuItem menuItem) {
        ((o.g) this.f7772b).f9141f.removeCallbacksAndMessages(mVar);
    }

    @Override // x9.s
    public x9.s e(nb.w wVar) {
        i9.l.e(wVar, "type");
        return this;
    }

    @Override // x9.s
    public x9.s f(List list) {
        return this;
    }

    @Override // wb.a
    public Iterable g(Object obj) {
        w9.l lVar = (w9.l) this.f7772b;
        Collection collectionM = ((x9.e) obj).t().m();
        i9.l.d(collectionM, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionM.iterator();
        while (it.hasNext()) {
            x9.h hVarL = ((nb.w) it.next()).D0().l();
            x9.e eVarF = null;
            x9.h hVarA = hVarL != null ? hVarL.a() : null;
            x9.e eVar = hVarA instanceof x9.e ? (x9.e) hVarA : null;
            if (eVar != null && (eVarF = lVar.f(eVar)) == null) {
                eVarF = eVar;
            }
            if (eVarF != null) {
                arrayList.add(eVarF);
            }
        }
        return arrayList;
    }

    @Override // x9.m
    public Object h(aa.h hVar, Object obj) {
        return null;
    }

    @Override // x9.s
    public x9.s i(x9.x xVar) {
        return this;
    }

    @Override // x9.s
    public x9.s j(x9.k kVar) {
        i9.l.e(kVar, "owner");
        return this;
    }

    @Override // x9.s
    public x9.s k(int i7) {
        a2.f.M(i7, "kind");
        return this;
    }

    @Override // x9.m
    public Object l(x9.t tVar, Object obj) {
        return new r9.g0((r9.e0) this.f7772b, tVar);
    }

    @Override // mb.m
    public void lock() {
        ((ReentrantLock) this.f7772b).lock();
    }

    @Override // x9.s
    public x9.s m(ga.o oVar) {
        i9.l.e(oVar, "visibility");
        return this;
    }

    @Override // x9.s
    public x9.s n() {
        return this;
    }

    @Override // x9.m
    public Object o(aa.h0 h0Var, Object obj) {
        return null;
    }

    @Override // x9.m
    public Object p(aa.a0 a0Var, Object obj) {
        return null;
    }

    @Override // o.k
    public boolean q(o.m mVar, MenuItem menuItem) {
        p.n nVar = ((ActionMenuView) this.f7772b).f699z;
        if (nVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((x2) nVar).f9969a.G.f13c).iterator();
        while (it.hasNext()) {
            if (((p4.q) it.next()).f10222a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.x0
    public long r(v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f7772b).r(pVar, pVar2, pVar3);
    }

    @Override // v.x0
    public v.p s(v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f7772b).s(pVar, pVar2, pVar3);
    }

    @Override // x9.s
    public x9.s t() {
        return this;
    }

    public String toString() {
        switch (this.f7771a) {
            case 13:
                StringBuilder sb2 = new StringBuilder();
                ka.q qVar = (ka.q) this.f7772b;
                sb2.append(qVar);
                sb2.append(": ");
                sb2.append(((Map) k9.a.z(qVar.f7471i, ka.q.f7468m[0])).keySet());
                return sb2.toString();
            case 14:
            default:
                return super.toString();
            case 15:
                return ((z1) this.f7772b).toString();
        }
    }

    @Override // x9.s
    public x9.s u() {
        return this;
    }

    @Override // mb.m
    public void unlock() {
        ((ReentrantLock) this.f7772b).unlock();
    }

    @Override // x9.s
    public x9.s v() {
        return this;
    }

    @Override // x9.m
    public Object w(aa.l lVar, Object obj) {
        return null;
    }

    @Override // x9.s
    public x9.s x(aa.a0 a0Var) {
        return this;
    }

    @Override // x9.m
    public Object y(aa.e0 e0Var, Object obj) {
        return null;
    }

    @Override // p.g2
    public void z(o.m mVar, o.o oVar) {
        o.g gVar = (o.g) this.f7772b;
        Handler handler = gVar.f9141f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f9143h;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (mVar == ((o.f) arrayList.get(i7)).f9135b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        handler.postAtTime(new e4.v0(this, i10 < arrayList.size() ? (o.f) arrayList.get(i10) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }
}
