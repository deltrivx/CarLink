package q3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.i0;
import androidx.lifecycle.t;
import c1.a1;
import cc.b0;
import com.baidu.carlifevehicle.R;
import e4.e0;
import e4.l0;
import e4.o1;
import e4.s1;
import java.util.LinkedHashMap;
import k2.c0;
import k2.d0;
import n3.r;
import o2.d1;
import q2.h0;
import q2.q1;
import q2.r1;
import q2.z0;
import r2.d3;
import r2.j0;
import r2.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ViewGroup implements e4.m, f1.j, r1, e4.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.d f10896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f10898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.a f10899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h9.a f10901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h9.a f10902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r1.p f10903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h9.k f10904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n3.c f10905j;
    public h9.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f10906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a5.g f10907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f10908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s1 f10910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f10911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f10912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h9.k f10913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f10914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4.n f10917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h0 f10919y;

    public i(Context context, f1.q qVar, int i7, j2.d dVar, View view, q1 q1Var) {
        super(context);
        this.f10896a = dVar;
        this.f10897b = view;
        this.f10898c = q1Var;
        LinkedHashMap linkedHashMap = d3.f11215a;
        setTag(R.id.androidx_compose_ui_view_composition_context, qVar);
        int i10 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        q qVar2 = (q) this;
        l0.l(this, new a(qVar2, i10));
        e0.i(this, this);
        this.f10899d = g.f10892d;
        this.f10901f = g.f10891c;
        this.f10902g = g.f10890b;
        this.f10903h = r1.m.f11116a;
        this.f10905j = i2.c.h();
        int i11 = 2;
        this.f10908n = new int[2];
        this.f10909o = 0L;
        int i12 = 1;
        this.f10911q = new h(qVar2, i12);
        this.f10912r = new h(qVar2, i10);
        this.f10914t = new int[2];
        this.f10915u = Integer.MIN_VALUE;
        this.f10916v = Integer.MIN_VALUE;
        this.f10917w = new e4.n(i10);
        h0 h0Var = new h0(3);
        h0Var.f10679n = qVar2;
        r1.p pVarA = ((z0) androidx.compose.ui.input.nestedscroll.a.a(dVar)).a(new AppendedSemanticsElement(b.f10873d, true));
        c0 c0Var = new c0();
        c0Var.f7193a = new d0(qVar2, i10);
        aa.a aVar = new aa.a();
        aa.a aVar2 = c0Var.f7194b;
        if (aVar2 != null) {
            aVar2.f309b = null;
        }
        c0Var.f7194b = aVar;
        aVar.f309b = c0Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(aVar);
        r1.p pVarD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(pVarA.a(c0Var), new e(qVar2, h0Var, qVar2)), new c(qVar2, h0Var, i11));
        h0Var.d0(this.f10903h.a(pVarD));
        int i13 = 5;
        this.f10904i = new a1(i13, h0Var, pVarD);
        h0Var.Z(this.f10905j);
        this.k = new b2.a(i13, h0Var);
        h0Var.L = new c(qVar2, h0Var, i10);
        h0Var.M = new d0(qVar2, i12);
        h0Var.c0(new d(qVar2, h0Var, i10));
        this.f10919y = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q2.s1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            n2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((u) this.f10898c).getSnapshotObserver();
    }

    public static final int k(q qVar, int i7, int i10, int i11) {
        if (i11 >= 0 || i7 == i10) {
            return View.MeasureSpec.makeMeasureSpec(r.m(i11, i7, i10), 1073741824);
        }
        if (i11 != -2 || i10 == Integer.MAX_VALUE) {
            return (i11 != -1 || i10 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static x3.b l(x3.b bVar, int i7, int i10, int i11, int i12) {
        int i13 = bVar.f14563a - i7;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = bVar.f14564b - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f14565c - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f14566d - i12;
        return x3.b.b(i13, i14, i15, i16 >= 0 ? i16 : 0);
    }

    @Override // e4.l
    public final void a(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12, int i13) {
        if (this.f10897b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i7 * f10)) << 32) | (((long) Float.floatToRawIntBits(i10 * f10)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i11 * f10)) << 32) | (((long) Float.floatToRawIntBits(i12 * f10)) & 4294967295L);
            int i14 = i13 == 0 ? 1 : 2;
            j2.g gVar = this.f10896a.f6901a;
            j2.g gVar2 = null;
            if (gVar != null && gVar.f11129n) {
                gVar2 = (j2.g) q2.f.j(gVar);
            }
            if (gVar2 != null) {
                gVar2.f0(jFloatToRawIntBits, jFloatToRawIntBits2, i14);
            }
        }
    }

    @Override // f1.j
    public final void b() {
        this.f10902g.invoke();
    }

    @Override // f1.j
    public final void c() {
        this.f10901f.invoke();
        removeAllViewsInLayout();
    }

    @Override // e4.o
    public final s1 d(View view, s1 s1Var) {
        this.f10910p = new s1(s1Var);
        return m(s1Var);
    }

    @Override // e4.l
    public final void e(int i7, int i10, int i11, int[] iArr) {
        if (this.f10897b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i10 * f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(i7 * f10)) << 32);
            int i12 = i11 == 0 ? 1 : 2;
            j2.g gVar = this.f10896a.f6901a;
            j2.g gVar2 = null;
            if (gVar != null && gVar.f11129n) {
                gVar2 = (j2.g) q2.f.j(gVar);
            }
            long jG = gVar2 != null ? gVar2.G(i12, jFloatToRawIntBits) : 0L;
            iArr[0] = j0.h(Float.intBitsToFloat((int) (jG >> 32)));
            iArr[1] = j0.h(Float.intBitsToFloat((int) (jG & 4294967295L)));
        }
    }

    @Override // e4.l
    public final boolean f(View view, View view2, int i7, int i10) {
        return ((i7 & 2) == 0 && (i7 & 1) == 0) ? false : true;
    }

    @Override // e4.l
    public final void g(View view, View view2, int i7, int i10) {
        e4.n nVar = this.f10917w;
        if (i10 == 1) {
            nVar.f4381c = i7;
        } else {
            nVar.f4380b = i7;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f10914t;
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], getWidth() + i7, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final n3.c getDensity() {
        return this.f10905j;
    }

    public final View getInteropView() {
        return this.f10897b;
    }

    public final h0 getLayoutNode() {
        return this.f10919y;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f10897b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final t getLifecycleOwner() {
        return this.f10906l;
    }

    public final r1.p getModifier() {
        return this.f10903h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        e4.n nVar = this.f10917w;
        return nVar.f4381c | nVar.f4380b;
    }

    public final h9.k getOnDensityChanged$ui_release() {
        return this.k;
    }

    public final h9.k getOnModifierChanged$ui_release() {
        return this.f10904i;
    }

    public final h9.k getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f10913s;
    }

    public final h9.a getRelease() {
        return this.f10902g;
    }

    public final h9.a getReset() {
        return this.f10901f;
    }

    public final a5.g getSavedStateRegistryOwner() {
        return this.f10907m;
    }

    public final h9.a getUpdate() {
        return this.f10899d;
    }

    public final View getView() {
        return this.f10897b;
    }

    @Override // e4.l
    public final void h(View view, int i7) {
        e4.n nVar = this.f10917w;
        if (i7 == 1) {
            nVar.f4381c = 0;
        } else {
            nVar.f4380b = 0;
        }
    }

    @Override // e4.m
    public final void i(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        if (this.f10897b.isNestedScrollingEnabled()) {
            float f10 = i7;
            float f11 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10 * f11)) << 32) | (((long) Float.floatToRawIntBits(i10 * f11)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i11 * f11)) << 32) | (((long) Float.floatToRawIntBits(i12 * f11)) & 4294967295L);
            int i14 = i13 == 0 ? 1 : 2;
            j2.g gVar = this.f10896a.f6901a;
            j2.g gVar2 = null;
            if (gVar != null && gVar.f11129n) {
                gVar2 = (j2.g) q2.f.j(gVar);
            }
            j2.g gVar3 = gVar2;
            long jF0 = gVar3 != null ? gVar3.f0(jFloatToRawIntBits, jFloatToRawIntBits2, i14) : 0L;
            iArr[0] = j0.h(Float.intBitsToFloat((int) (jF0 >> 32)));
            iArr[1] = j0.h(Float.intBitsToFloat((int) (jF0 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f10918x) {
            this.f10919y.C();
            return null;
        }
        this.f10897b.postOnAnimation(new com.baidu.carlife.sdk.internal.a(this.f10912r, 3));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f10897b.isNestedScrollingEnabled();
    }

    public final s1 m(s1 s1Var) {
        o1 o1Var = s1Var.f4398a;
        x3.b bVarG = o1Var.g(-1);
        x3.b bVar = x3.b.f14562e;
        if (!bVarG.equals(bVar) || !o1Var.h(-9).equals(bVar) || o1Var.f() != null) {
            q2.t tVar = this.f10919y.E.f10614c;
            if (tVar.O.f11129n) {
                long jO = o9.e0.O(tVar.E(0L));
                int i7 = (int) (jO >> 32);
                if (i7 < 0) {
                    i7 = 0;
                }
                int i10 = (int) (jO & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long jL = d1.g(tVar).l();
                int i11 = (int) (jL & 4294967295L);
                long j5 = tVar.f9437c;
                long jO2 = o9.e0.O(tVar.E((((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32)));
                int i12 = ((int) (jL >> 32)) - ((int) (jO2 >> 32));
                if (i12 < 0) {
                    i12 = 0;
                }
                int i13 = i11 - ((int) (jO2 & 4294967295L));
                int i14 = i13 < 0 ? 0 : i13;
                if (i7 != 0 || i10 != 0 || i12 != 0 || i14 != 0) {
                    return s1Var.f4398a.n(i7, i10, i12, i14);
                }
            }
        }
        return s1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10911q.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f10918x) {
            this.f10919y.C();
            return;
        }
        this.f10897b.postOnAnimation(new com.baidu.carlife.sdk.internal.a(this.f10912r, 3));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[Catch: all -> 0x0096, LOOP:1: B:12:0x0035->B:23:0x007b, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:6:0x0016, B:24:0x0080, B:26:0x0088, B:31:0x0098, B:28:0x008d, B:9:0x0029, B:12:0x0035, B:14:0x004a, B:16:0x0056, B:18:0x0060, B:20:0x0070, B:23:0x007b, B:32:0x009c), top: B:37:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[EDGE_INSN: B:44:0x0080->B:24:0x0080 BREAK  A[LOOP:1: B:12:0x0035->B:23:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i7;
        char c10;
        super.onDetachedFromWindow();
        p1.u uVar = getSnapshotObserver().f10794a;
        synchronized (uVar.f10094g) {
            try {
                h1.e eVar = uVar.f10093f;
                int i10 = eVar.f6423c;
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    p1.t tVar = (p1.t) eVar.f6421a[i11];
                    s.c0 c0Var = (s.c0) tVar.f10082f.k(this);
                    if (c0Var == null) {
                        i7 = i11;
                    } else {
                        Object[] objArr = c0Var.f12398b;
                        int[] iArr = c0Var.f12399c;
                        long[] jArr = c0Var.f12397a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j5 = jArr[i13];
                                i7 = i11;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i13 != length) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i11 = i7;
                                    }
                                } else {
                                    int i14 = 8;
                                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        if ((j5 & 255) < 128) {
                                            int i17 = (i13 << 3) + i16;
                                            c10 = '\b';
                                            Object obj = objArr[i17];
                                            int i18 = iArr[i17];
                                            tVar.d(this, obj);
                                        } else {
                                            c10 = '\b';
                                        }
                                        j5 >>= c10;
                                        i16++;
                                        i14 = 8;
                                    }
                                    if (i15 != i14) {
                                        break;
                                    }
                                    if (i13 != length) {
                                        break;
                                    }
                                    i13++;
                                    i11 = i7;
                                }
                            }
                        } else {
                            i7 = i11;
                        }
                    }
                    if (!tVar.f10082f.j()) {
                        i12++;
                    } else if (i12 > 0) {
                        Object[] objArr2 = eVar.f6421a;
                        objArr2[i7 - i12] = objArr2[i7];
                    }
                    i11 = i7 + 1;
                }
                int i19 = i10 - i12;
                u8.l.t0(i19, i10, null, eVar.f6421a);
                eVar.f6423c = i19;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f10897b.layout(0, 0, i11 - i7, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = this.f10897b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i7, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f10915u = i7;
        this.f10916v = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f10897b.isNestedScrollingEnabled()) {
            return false;
        }
        b0.s(this.f10896a.c(), null, new f(z10, this, n3.u.d(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f10897b.isNestedScrollingEnabled()) {
            return false;
        }
        b0.s(this.f10896a.c(), null, new k2.j0(this, n3.u.d(f10 * (-1.0f), f11 * (-1.0f)), null, 1), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        if (Build.VERSION.SDK_INT >= 23 || i7 != 0) {
            return;
        }
        this.f10919y.C();
    }

    @Override // q2.r1
    public final boolean p() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        h9.k kVar = this.f10913s;
        if (kVar != null) {
            kVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(n3.c cVar) {
        if (cVar != this.f10905j) {
            this.f10905j = cVar;
            h9.k kVar = this.k;
            if (kVar != null) {
                kVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(t tVar) {
        if (tVar != this.f10906l) {
            this.f10906l = tVar;
            i0.h(this, tVar);
        }
    }

    public final void setModifier(r1.p pVar) {
        if (pVar != this.f10903h) {
            this.f10903h = pVar;
            h9.k kVar = this.f10904i;
            if (kVar != null) {
                kVar.invoke(pVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(h9.k kVar) {
        this.k = kVar;
    }

    public final void setOnModifierChanged$ui_release(h9.k kVar) {
        this.f10904i = kVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(h9.k kVar) {
        this.f10913s = kVar;
    }

    public final void setRelease(h9.a aVar) {
        this.f10902g = aVar;
    }

    public final void setReset(h9.a aVar) {
        this.f10901f = aVar;
    }

    public final void setSavedStateRegistryOwner(a5.g gVar) {
        if (gVar != this.f10907m) {
            this.f10907m = gVar;
            setTag(R.id.view_tree_saved_state_registry_owner, gVar);
        }
    }

    public final void setUpdate(h9.a aVar) {
        this.f10899d = aVar;
        this.f10900e = true;
        this.f10911q.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
