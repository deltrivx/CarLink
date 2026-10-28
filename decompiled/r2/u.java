package r2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import r1.o;
import r2.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ViewGroup implements q2.q1, q2.x1, k2.j, androidx.lifecycle.e, q2.o1 {
    public static Class O0;
    public static Method P0;
    public static Method Q0;
    public static final s.d0 R0 = new s.d0();
    public static n8.k S0;
    public static Method T0;
    public boolean A;
    public long A0;
    public final k2.k B;
    public final u0.k B0;
    public final b1.q C;
    public final s.d0 C0;
    public h9.k D;
    public float D0;
    public final da.a E;
    public float E0;
    public final s1.c F;
    public final com.tencent.bugly.proguard.c0 F0;
    public boolean G;
    public final androidx.lifecycle.z G0;
    public final h H;
    public boolean H0;
    public final g I;
    public final s I0;
    public final q2.s1 J;
    public final a1 J0;
    public boolean K;
    public boolean K0;
    public w0 L;
    public final wb.b L0;
    public o1 M;
    public View M0;
    public n3.a N;
    public final q N0;
    public boolean O;
    public final q2.w0 P;
    public long Q;
    public final int[] R;
    public final float[] S;
    public final float[] T;
    public final float[] U;
    public long V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.j0 f11450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.k1 f11451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f11452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11453f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f11454f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1.j f11455g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f11456g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y8.h f11457h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final f1.k1 f11458h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1.a f11459i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final f1.f0 f11460i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f11461j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public h9.k f11462j0;
    public final y1.p k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final i f11463k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0 f11464l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final j f11465l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o2.q f11466m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final k f11467m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q2.h0 f11468n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final g3.z f11469n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s.w f11470o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final g3.x f11471o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z2.a f11472p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference f11473p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f11474q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final k1 f11475q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y2.o f11476r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final u1 f11477r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f11478s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final f1.k1 f11479s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t1.c f11480t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f11481t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f11482u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final f1.k1 f11483u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y1.e f11484v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final g2.b f11485v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s1.l f11486w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final h2.c f11487w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f11488x;
    public final p2.c x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f11489y;
    public final q0 y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11490z;
    public MotionEvent z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v33, types: [r2.i] */
    /* JADX WARN: Type inference failed for: r1v34, types: [r2.j] */
    /* JADX WARN: Type inference failed for: r1v35, types: [r2.k] */
    public u(Context context, y8.h hVar) {
        s1.c cVar;
        n3.o oVar;
        super(context);
        final u uVar = this;
        uVar.f11448a = 9205357640488583168L;
        int i7 = 1;
        uVar.f11449b = true;
        uVar.f11450c = new q2.j0();
        n3.e eVarE = a.a.e(context);
        f1.w0 w0Var = f1.w0.f5185d;
        uVar.f11451d = new f1.k1(eVarE, w0Var);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        boolean z10 = i10 >= 35;
        uVar.f11453f = z10;
        y2.d dVar = new y2.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        q2.z0 z0Var = new q2.z0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f964a.hashCode();
            }

            @Override // q2.z0
            public final o i() {
                z0 z0Var2 = new z0();
                z0Var2.f11523o = this.f964a;
                return z0Var2;
            }

            @Override // q2.z0
            public final void j(o oVar2) {
                ((z0) oVar2).f11523o = this.f964a;
            }
        };
        uVar.f11455g = new w1.j(uVar, uVar);
        uVar.f11457h = hVar;
        uVar.f11459i = new u1.a();
        uVar.f11461j = new w1();
        r1.p pVarA = androidx.compose.ui.input.key.a.a(r1.m.f11116a, new p(uVar, i11));
        r1.p pVarA2 = androidx.compose.ui.input.rotary.a.a();
        uVar.k = new y1.p();
        uVar.f11464l = new v0(ViewConfiguration.get(context));
        o2.q qVar = new o2.q();
        uVar.f11466m = qVar;
        q2.h0 h0Var = new q2.h0(3);
        h0Var.c0(o2.a1.f9290b);
        h0Var.Z(uVar.getDensity());
        h0Var.e0(uVar.getViewConfiguration());
        h0Var.d0(ob.a.g((q2.z0) androidx.compose.ui.layout.b.b(qVar), emptySemanticsElement).a(pVarA2).a(pVarA).a(((w1.j) uVar.getFocusOwner()).f14046e).a(uVar.m30getDragAndDropManager().f13038c).a(z0Var));
        uVar.f11468n = h0Var;
        s.w wVar = s.l.f12468a;
        uVar.f11470o = new s.w();
        uVar.getLayoutNodes();
        uVar.f11472p = new z2.a();
        uVar.f11474q = uVar;
        uVar.f11476r = new y2.o(uVar.getRoot(), dVar, uVar.getLayoutNodes());
        b0 b0Var = new b0(uVar);
        uVar.f11478s = b0Var;
        uVar.f11480t = new t1.c(uVar, new c.k0(0, uVar, j0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 3));
        f fVar = new f();
        Object systemService = context.getSystemService("accessibility");
        i9.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        uVar.f11482u = fVar;
        uVar.f11484v = new y1.e(uVar);
        uVar.f11486w = new s1.l();
        uVar.f11488x = new ArrayList();
        uVar.B = new k2.k();
        q2.h0 root = uVar.getRoot();
        b1.q qVar2 = new b1.q();
        qVar2.f1182b = root;
        qVar2.f1183c = new k2.e(root.E.f10614c);
        qVar2.f1184d = new a2.d(29);
        qVar2.f1185e = new q2.r();
        uVar.C = qVar2;
        uVar.D = n.f11336b;
        uVar.E = l() ? new da.a(uVar, uVar.getAutofillTree()) : null;
        if (l()) {
            AutofillManager autofillManagerG = k8.b.g(context.getSystemService(k8.b.m()));
            if (autofillManagerG == null) {
                throw ob.a.o("Autofill service could not be located.");
            }
            uVar = this;
            cVar = new s1.c(new l0.o0(19, autofillManagerG), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            cVar = null;
        }
        uVar.F = cVar;
        uVar.H = new h(context);
        uVar.I = new g(uVar.getClipboardManager());
        uVar.J = new q2.s1(new p(uVar, i7));
        uVar.P = new q2.w0(uVar.getRoot());
        long j5 = Integer.MAX_VALUE;
        uVar.Q = (j5 & 4294967295L) | (j5 << 32);
        uVar.R = new int[]{0, 0};
        float[] fArrA = y1.a0.a();
        uVar.S = fArrA;
        uVar.T = y1.a0.a();
        uVar.U = y1.a0.a();
        uVar.V = -1L;
        uVar.f11454f0 = 9187343241974906880L;
        uVar.f11456g0 = true;
        uVar.f11458h0 = f1.b.s(null);
        uVar.f11460i0 = f1.b.o(new s(uVar, i7));
        uVar.f11463k0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: r2.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f11263a.P();
            }
        };
        uVar.f11465l0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: r2.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f11267a.P();
            }
        };
        uVar.f11467m0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: r2.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                this.f11291a.f11487w0.f6436a.setValue(new h2.a(z11 ? 1 : 2));
            }
        };
        g3.z zVar = new g3.z(uVar.getView(), uVar);
        uVar.f11469n0 = zVar;
        uVar.f11471o0 = new g3.x(zVar);
        uVar.f11473p0 = new AtomicReference(null);
        uVar.f11475q0 = new k1(uVar.getTextInputService());
        uVar.f11477r0 = new u1();
        uVar.f11479s0 = new f1.k1(i2.c.w(context), w0Var);
        uVar.f11481t0 = i10 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        n3.o oVar2 = n3.o.f8749a;
        if (layoutDirection != 0) {
            oVar = layoutDirection != 1 ? null : n3.o.f8750b;
        } else {
            oVar = oVar2;
        }
        uVar.f11483u0 = f1.b.s(oVar != null ? oVar : oVar2);
        uVar.f11485v0 = new g2.b(uVar, 0);
        uVar.f11487w0 = new h2.c(uVar.isInTouchMode() ? 1 : 2);
        uVar.x0 = new p2.c(uVar);
        q0 q0Var = new q0();
        new n4.e(new b1.a(15, q0Var));
        uVar.y0 = q0Var;
        uVar.B0 = new u0.k(23);
        uVar.C0 = new s.d0();
        uVar.F0 = new com.tencent.bugly.proguard.c0(8, uVar);
        uVar.G0 = new androidx.lifecycle.z(21, uVar);
        uVar.I0 = new s(uVar, 0);
        uVar.J0 = i10 < 29 ? new b1(fArrA) : new c1();
        uVar.addOnAttachStateChangeListener(uVar.f11480t);
        uVar.setWillNotDraw(false);
        uVar.setFocusable(true);
        if (i10 >= 26) {
            i0.f11264a.a(uVar, 1, false);
        }
        uVar.setFocusableInTouchMode(true);
        uVar.setClipChildren(false);
        e4.l0.j(uVar, b0Var);
        uVar.setOnDragListener(uVar.m30getDragAndDropManager());
        uVar.getRoot().d(uVar);
        if (i10 >= 29) {
            d0.f11211a.a(uVar);
        }
        if (z10) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            uVar.f11452e = view;
            uVar.addView(view, -1);
        }
        uVar.L0 = i10 >= 31 ? new wb.b(1) : null;
        uVar.N0 = new q(uVar);
    }

    public static final void f(u uVar, int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        b0 b0Var = uVar.f11478s;
        if (i9.l.a(str, b0Var.G)) {
            int iD2 = b0Var.E.d(i7);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!i9.l.a(str, b0Var.H) || (iD = b0Var.F.d(i7)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @t8.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @t8.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l get_viewTreeOwners() {
        return (l) this.f11458h0.getValue();
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof u) {
                ((u) childAt).B();
            } else if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt);
            }
        }
    }

    public static long n(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j5 = size;
        return j5 | (j5 << 32);
    }

    public static View o(View view, int i7) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (i9.l.a(declaredMethod.invoke(view, null), Integer.valueOf(i7))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View viewO = o(viewGroup.getChildAt(i10), i7);
                    if (viewO != null) {
                        return viewO;
                    }
                }
            }
        }
        return null;
    }

    public static void r(q2.h0 h0Var) {
        h0Var.D();
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            r((q2.h0) objArr[i10]);
        }
    }

    private void setDensity(n3.c cVar) {
        this.f11451d.setValue(cVar);
    }

    private void setFontFamilyResolver(f3.d dVar) {
        this.f11479s0.setValue(dVar);
    }

    private void setLayoutDirection(n3.o oVar) {
        this.f11483u0.setValue(oVar);
    }

    private final void set_viewTreeOwners(l lVar) {
        this.f11458h0.setValue(lVar);
    }

    public static boolean t(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 1; i7 < pointerCount; i7++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i7)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i7)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !y1.f11515a.a(motionEvent, i7));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    public final void A(q2.p1 p1Var, boolean z10) {
        ArrayList arrayList = this.f11488x;
        if (!z10) {
            if (this.f11490z) {
                return;
            }
            arrayList.remove(p1Var);
            ArrayList arrayList2 = this.f11489y;
            if (arrayList2 != null) {
                arrayList2.remove(p1Var);
                return;
            }
            return;
        }
        if (!this.f11490z) {
            arrayList.add(p1Var);
            return;
        }
        ArrayList arrayList3 = this.f11489y;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f11489y = arrayList3;
        }
        arrayList3.add(p1Var);
    }

    public final void B() {
        s1.c cVar;
        if (this.G) {
            p1.u uVar = getSnapshotObserver().f10794a;
            synchronized (uVar.f10094g) {
                try {
                    h1.e eVar = uVar.f10093f;
                    int i7 = eVar.f6423c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        p1.t tVar = (p1.t) eVar.f6421a[i11];
                        tVar.e();
                        if (!tVar.f10082f.j()) {
                            i10++;
                        } else if (i10 > 0) {
                            Object[] objArr = eVar.f6421a;
                            objArr[i11 - i10] = objArr[i11];
                        }
                    }
                    int i12 = i7 - i10;
                    Arrays.fill(eVar.f6421a, i12, i7, (Object) null);
                    eVar.f6423c = i12;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.G = false;
        }
        w0 w0Var = this.L;
        if (w0Var != null) {
            m(w0Var);
        }
        if (l() && (cVar = this.F) != null) {
            s.x xVar = cVar.f12547h;
            if (xVar.f12514d == 0 && cVar.f12548i) {
                ((AutofillManager) cVar.f12540a.f7772b).commit();
                cVar.f12548i = false;
            }
            if (xVar.f12514d != 0) {
                cVar.f12548i = true;
            }
        }
        while (this.C0.h() && this.C0.e(0) != null) {
            int i13 = this.C0.f12408b;
            for (int i14 = 0; i14 < i13; i14++) {
                h9.a aVar = (h9.a) this.C0.e(i14);
                s.d0 d0Var = this.C0;
                if (i14 < 0 || i14 >= d0Var.f12408b) {
                    d0Var.m(i14);
                    throw null;
                }
                Object[] objArr2 = d0Var.f12407a;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.C0.k(0, i13);
        }
    }

    public final void C(q2.h0 h0Var) {
        b0 b0Var = this.f11478s;
        b0Var.A = true;
        if (b0Var.q()) {
            b0Var.r(h0Var);
        }
        t1.c cVar = this.f11480t;
        cVar.f12739g = true;
        if (cVar.l()) {
            cVar.f12740h.x(t8.z.f12851a);
        }
    }

    public final void D(q2.h0 h0Var, boolean z10, boolean z11, boolean z12) {
        q2.h0 h0VarV;
        q2.h0 h0VarV2;
        q2.w0 w0Var = this.P;
        if (!z10) {
            if (w0Var.p(h0Var, z11) && z12) {
                K(h0Var);
                return;
            }
            return;
        }
        a2.b bVar = w0Var.f10838b;
        q2.h0 h0Var2 = h0Var.f10673g;
        q2.l0 l0Var = h0Var.F;
        if (h0Var2 == null) {
            n2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = l0Var.f10732d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new cc.s();
                }
                if (!l0Var.f10733e || z11) {
                    l0Var.f10733e = true;
                    l0Var.f10743p.f10862t = true;
                    if (h0Var.P) {
                        return;
                    }
                    if ((i9.l.a(h0Var.K(), Boolean.TRUE) || q2.w0.h(h0Var)) && ((h0VarV = h0Var.v()) == null || !h0VarV.F.f10733e)) {
                        bVar.q(h0Var, q2.u.f10805a);
                    } else if ((h0Var.J() || q2.w0.i(h0Var)) && ((h0VarV2 = h0Var.v()) == null || !h0VarV2.r())) {
                        bVar.q(h0Var, q2.u.f10807c);
                    }
                    if (w0Var.f10840d || !z12) {
                        return;
                    }
                    K(h0Var);
                    return;
                }
                return;
            }
        }
        w0Var.f10844h.b(new q2.v0(h0Var, true, z11));
    }

    public final void E(q2.h0 h0Var, boolean z10, boolean z11) {
        q2.l0 l0Var = h0Var.F;
        q2.u uVar = q2.u.f10808d;
        q2.w0 w0Var = this.P;
        if (!z10) {
            w0Var.getClass();
            int iOrdinal = l0Var.f10732d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new cc.s();
            }
            q2.h0 h0VarV = h0Var.v();
            boolean z12 = h0VarV == null || h0VarV.J();
            if (!z11) {
                if (h0Var.r()) {
                    return;
                }
                if (h0Var.q() && h0Var.J() == z12 && h0Var.J() == l0Var.f10743p.f10861s) {
                    return;
                }
            }
            q2.y0 y0Var = l0Var.f10743p;
            y0Var.f10863u = true;
            y0Var.f10864v = true;
            if (!h0Var.P && y0Var.f10861s && z12) {
                if ((h0VarV == null || !h0VarV.q()) && (h0VarV == null || !h0VarV.r())) {
                    w0Var.f10838b.q(h0Var, uVar);
                }
                if (w0Var.f10840d) {
                    return;
                }
                K(null);
                return;
            }
            return;
        }
        a2.b bVar = w0Var.f10838b;
        int iOrdinal2 = l0Var.f10732d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new cc.s();
                }
            }
        }
        if ((l0Var.f10733e || l0Var.f10734f) && !z11) {
            return;
        }
        l0Var.f10734f = true;
        l0Var.f10735g = true;
        q2.y0 y0Var2 = l0Var.f10743p;
        y0Var2.f10863u = true;
        y0Var2.f10864v = true;
        if (h0Var.P) {
            return;
        }
        q2.h0 h0VarV2 = h0Var.v();
        if (i9.l.a(h0Var.K(), Boolean.TRUE) && ((h0VarV2 == null || !h0VarV2.F.f10733e) && (h0VarV2 == null || !h0VarV2.F.f10734f))) {
            bVar.q(h0Var, q2.u.f10806b);
        } else if (h0Var.J() && ((h0VarV2 == null || !h0VarV2.q()) && (h0VarV2 == null || !h0VarV2.r()))) {
            bVar.q(h0Var, uVar);
        }
        if (w0Var.f10840d) {
            return;
        }
        K(null);
    }

    public final void F() {
        b0 b0Var = this.f11478s;
        b0Var.A = true;
        if (b0Var.q() && !b0Var.L) {
            b0Var.L = true;
            b0Var.f11176l.post(b0Var.N);
        }
        t1.c cVar = this.f11480t;
        cVar.f12739g = true;
        if (!cVar.l() || cVar.f12745n) {
            return;
        }
        cVar.f12745n = true;
        cVar.f12741i.post(cVar.f12746o);
    }

    public final void G() {
        if (this.W) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.V) {
            this.V = jCurrentAnimationTimeMillis;
            a1 a1Var = this.J0;
            float[] fArr = this.T;
            a1Var.a(this, fArr);
            j0.p(fArr, this.U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.R;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f11454f0 = (((long) Float.floatToRawIntBits(f10 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f11 - iArr[1])) & 4294967295L);
        }
    }

    public final void H(MotionEvent motionEvent) {
        this.V = AnimationUtils.currentAnimationTimeMillis();
        a1 a1Var = this.J0;
        float[] fArr = this.T;
        a1Var.a(this, fArr);
        j0.p(fArr, this.U);
        float x8 = motionEvent.getX();
        float y5 = motionEvent.getY();
        long jB = y1.a0.b((((long) Float.floatToRawIntBits(x8)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.f11454f0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean I(q2.p1 p1Var) {
        u0.k kVar;
        h1.e eVar;
        Reference referencePoll;
        boolean z10 = this.M == null || s2.f11406v || Build.VERSION.SDK_INT >= 23;
        if (z10) {
            do {
                kVar = this.B0;
                ReferenceQueue referenceQueue = (ReferenceQueue) kVar.f12991c;
                eVar = (h1.e) kVar.f12990b;
                referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    eVar.k(referencePoll);
                }
            } while (referencePoll != null);
            eVar.b(new WeakReference(p1Var, (ReferenceQueue) kVar.f12991c));
        }
        this.f11488x.remove(p1Var);
        return z10;
    }

    public final boolean J() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void K(q2.h0 h0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (h0Var != null) {
            while (h0Var != null && h0Var.s() == q2.f0.f10638a) {
                if (!this.O) {
                    q2.h0 h0VarV = h0Var.v();
                    if (h0VarV == null) {
                        break;
                    }
                    long j5 = h0VarV.E.f10614c.f9438d;
                    if (n3.a.f(j5) && n3.a.e(j5)) {
                        break;
                    }
                }
                h0Var = h0Var.v();
            }
            if (h0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long L(long j5) {
        G();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (this.f11454f0 >> 32));
        return y1.a0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (this.f11454f0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.U);
    }

    public final int M(MotionEvent motionEvent) {
        Object obj;
        if (this.K0) {
            this.K0 = false;
            int metaState = motionEvent.getMetaState();
            this.f11461j.getClass();
            v2.f11500a.setValue(new k2.e0(metaState));
        }
        k2.k kVar = this.B;
        android.support.v4.media.session.r rVarA = kVar.a(motionEvent, this);
        b1.q qVar = this.C;
        if (rVarA == null) {
            if (!qVar.f1181a) {
                ((s.q) ((a2.d) qVar.f1184d).f20b).b();
                ((k2.e) qVar.f1183c).f();
            }
            return 0;
        }
        List list = (List) rVarA.f604b;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i7 = size - 1;
            obj = list.get(size);
            if (((k2.x) obj).f7299e) {
                break;
            }
            if (i7 < 0) {
                obj = null;
                break;
            }
            size = i7;
        }
        k2.x xVar = (k2.x) obj;
        if (xVar != null) {
            this.f11448a = xVar.f7298d;
        }
        int iF = qVar.f(rVarA, this, u(motionEvent));
        rVarA.f605c = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iF & 1) != 0) {
            return iF;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        kVar.f7231c.delete(pointerId);
        kVar.f7230b.delete(pointerId);
        return iF;
    }

    public final void N(MotionEvent motionEvent, int i7, long j5, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i7 != 9 && i7 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            float f10 = pointerCoords.x;
            long jX = x((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jX >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jX & 4294967295L));
            i12++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j5 : motionEvent.getDownTime(), j5, i7, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        android.support.v4.media.session.r rVarA = this.B.a(motionEventObtain, this);
        i9.l.b(rVarA);
        this.C.f(rVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void O(h9.n nVar, a9.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i7 = tVar.f11425c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                tVar.f11425c = i7 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f11423a;
        int i10 = tVar.f11425c;
        if (i10 == 0) {
            t8.a.e(obj);
            p pVar = new p(this, 2);
            tVar.f11425c = 1;
            if (cc.b0.g(new fc.i(pVar, this.f11473p0, nVar, null), tVar) == z8.a.f15774a) {
                return;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final void P() {
        boolean z10;
        boolean z11;
        int[] iArr = this.R;
        getLocationOnScreen(iArr);
        long j5 = this.Q;
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        int i11 = iArr[0];
        if (i7 == i11 && i10 == iArr[1] && this.V >= 0) {
            z10 = false;
        } else {
            this.Q = (((long) i11) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i7 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE) {
                z10 = false;
            } else {
                getRoot().F.f10743p.g0();
                z10 = true;
            }
        }
        G();
        View rootView = this.M0;
        if (rootView == null) {
            rootView = getRootView();
            this.M0 = rootView;
        }
        z2.a rectManager = getRectManager();
        long j10 = this.Q;
        long jO = o9.e0.O(this.f11454f0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.T;
        int iE = n3.u.e(fArr);
        z2.b bVar = rectManager.f15695b;
        if ((iE & 2) != 0) {
            fArr = null;
        }
        if (n3.j.a(jO, bVar.f15706c)) {
            z11 = false;
        } else {
            bVar.f15706c = jO;
            z11 = true;
        }
        if (!n3.j.a(j10, bVar.f15707d)) {
            bVar.f15707d = j10;
            z11 = true;
        }
        if (fArr != null) {
            z11 = true;
        }
        long j11 = (((long) height) & 4294967295L) | (((long) width) << 32);
        if (j11 != bVar.f15708e) {
            bVar.f15708e = j11;
            z11 = true;
        }
        rectManager.f15698e = z11 || rectManager.f15698e;
        this.P.a(z10);
        getRectManager().a();
    }

    public final void Q(float f10) {
        if (this.f11453f) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.D0) || f10 > this.D0) {
                    this.D0 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.E0) || f10 < this.E0) {
                    this.E0 = f10;
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void a(androidx.lifecycle.t tVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(j0.n());
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        i9.l.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i10) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i7;
        layoutParamsGenerateDefaultLayoutParams.height = i10;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        y2.j jVarX;
        h9.k kVar;
        if (l()) {
            s1.c cVar = this.F;
            if (cVar != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    int iKeyAt = sparseArray.keyAt(i7);
                    AutofillValue autofillValueH = k8.b.h(sparseArray.get(iKeyAt));
                    if (autofillValueH.isText()) {
                        q2.h0 h0Var = (q2.h0) cVar.f12541b.f15028c.b(iKeyAt);
                        if (h0Var != null && (jVarX = h0Var.x()) != null) {
                            Object objG = jVarX.f15011a.g(y2.i.f14992g);
                            if (objG == null) {
                                objG = null;
                            }
                            y2.a aVar = (y2.a) objG;
                            if (aVar != null && (kVar = (h9.k) aVar.f14970b) != null) {
                            }
                        }
                    } else if (autofillValueH.isDate()) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueH.isList()) {
                        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueH.isToggle()) {
                        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            da.a aVar2 = this.E;
            if (aVar2 != null) {
                s1.l lVar = (s1.l) aVar2.f3848c;
                if (lVar.f12551a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    int iKeyAt2 = sparseArray.keyAt(i10);
                    AutofillValue autofillValueH2 = k8.b.h(sparseArray.get(iKeyAt2));
                    if (autofillValueH2.isText()) {
                        autofillValueH2.getTextValue().toString();
                        if (lVar.f12551a.get(Integer.valueOf(iKeyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (autofillValueH2.isDate()) {
                            throw new cc.a0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueH2.isList()) {
                            throw new cc.a0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueH2.isToggle()) {
                            throw new cc.a0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void b(androidx.lifecycle.t tVar) {
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f11478s.h(this.f11448a, i7, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.f11478s.h(this.f11448a, i7, true);
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void d(androidx.lifecycle.t tVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            r(getRoot());
        }
        y(true);
        p1.l.k().m();
        this.f11490z = true;
        y1.p pVar = this.k;
        y1.b bVar = pVar.f14945a;
        Canvas canvas2 = bVar.f14875a;
        bVar.f14875a = canvas;
        getRoot().i(bVar, null);
        pVar.f14945a.f14875a = canvas2;
        ArrayList arrayList = this.f11488x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((q2.p1) arrayList.get(i7)).k();
            }
        }
        if (s2.f11406v) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f11490z = false;
        ArrayList arrayList2 = this.f11489y;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f11453f) {
            y0.a(this, this.D0);
            View view = this.f11452e;
            if (view == null) {
                i9.l.j("frameRateCategoryView");
                throw null;
            }
            y0.a(view, this.E0);
            if (!Float.isNaN(this.E0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.D0 = Float.NaN;
            this.E0 = Float.NaN;
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        q2.d1 d1Var;
        m2.a aVar;
        int size;
        q2.d1 d1Var2;
        r1.o oVarF;
        q2.d1 d1Var3;
        if (this.H0) {
            androidx.lifecycle.z zVar = this.G0;
            removeCallbacks(zVar);
            if (motionEvent.getActionMasked() == 8) {
                this.H0 = false;
            } else {
                zVar.run();
            }
        }
        if (t(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x8 = motionEvent.getX();
                float y5 = motionEvent.getY();
                Float.floatToRawIntBits(x8);
                Float.floatToRawIntBits(y5);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                w1.j jVar = (w1.j) getFocusOwner();
                if (jVar.f14045d.f14040e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    w1.s sVarG = w1.f.g(jVar.f14044c);
                    if (sVarG != null) {
                        if (!sVarG.f11117a.f11129n) {
                            n2.a.b("visitAncestors called on an unattached node");
                        }
                        r1.o oVar = sVarG.f11117a;
                        q2.h0 h0VarV = q2.f.v(sVarG);
                        while (h0VarV != null) {
                            if ((h0VarV.E.f10617f.f11120d & 2097152) != 0) {
                                while (oVar != null) {
                                    if ((oVar.f11119c & 2097152) != 0) {
                                        r1.o oVarF2 = oVar;
                                        h1.e eVar = null;
                                        while (oVarF2 != null) {
                                            if ((oVarF2.f11119c & 2097152) != 0 && (oVarF2 instanceof q2.m)) {
                                                int i7 = 0;
                                                for (r1.o oVar2 = ((q2.m) oVarF2).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                                    if ((oVar2.f11119c & 2097152) != 0) {
                                                        i7++;
                                                        if (i7 == 1) {
                                                            oVarF2 = oVar2;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new h1.e(new r1.o[16]);
                                                            }
                                                            if (oVarF2 != null) {
                                                                eVar.b(oVarF2);
                                                                oVarF2 = null;
                                                            }
                                                            eVar.b(oVar2);
                                                        }
                                                    }
                                                }
                                                if (i7 == 1) {
                                                }
                                            }
                                            oVarF2 = q2.f.f(eVar);
                                        }
                                    }
                                    oVar = oVar.f11121e;
                                }
                            }
                            h0VarV = h0VarV.v();
                            oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (q(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = e4.m0.f4377a;
            e4.k.d(viewConfiguration);
        } else {
            e4.m0.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i10 >= 26) {
            e4.k.c(viewConfiguration);
        } else {
            e4.m0.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        w1.i focusOwner = getFocusOwner();
        k2.d dVar = new k2.d(4, this, motionEvent);
        w1.j jVar2 = (w1.j) focusOwner;
        if (jVar2.f14045d.f14040e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        w1.s sVarG2 = w1.f.g(jVar2.f14044c);
        if (sVarG2 != null) {
            if (!sVarG2.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar3 = sVarG2.f11117a;
            q2.h0 h0VarV2 = q2.f.v(sVarG2);
            loop0: while (true) {
                if (h0VarV2 == null) {
                    oVarF = null;
                    break;
                }
                if ((h0VarV2.E.f10617f.f11120d & 16384) != 0) {
                    while (oVar3 != null) {
                        if ((oVar3.f11119c & 16384) != 0) {
                            oVarF = oVar3;
                            h1.e eVar2 = null;
                            while (oVarF != null) {
                                if (oVarF instanceof m2.a) {
                                    break loop0;
                                }
                                if ((oVarF.f11119c & 16384) != 0 && (oVarF instanceof q2.m)) {
                                    int i11 = 0;
                                    for (r1.o oVar4 = ((q2.m) oVarF).f10746p; oVar4 != null; oVar4 = oVar4.f11122f) {
                                        if ((oVar4.f11119c & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                oVarF = oVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar2.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar2.b(oVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar2);
                            }
                        }
                        oVar3 = oVar3.f11121e;
                    }
                }
                h0VarV2 = h0VarV2.v();
                oVar3 = (h0VarV2 == null || (d1Var3 = h0VarV2.E) == null) ? null : d1Var3.f10616e;
            }
            aVar = (m2.a) oVarF;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            m2.a aVar2 = aVar;
            if (!aVar2.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar5 = aVar2.f11117a.f11121e;
            q2.h0 h0VarV3 = q2.f.v(aVar);
            ArrayList arrayList = null;
            while (h0VarV3 != null) {
                if ((h0VarV3.E.f10617f.f11120d & 16384) != 0) {
                    while (oVar5 != null) {
                        if ((oVar5.f11119c & 16384) != 0) {
                            r1.o oVarF3 = oVar5;
                            h1.e eVar3 = null;
                            while (oVarF3 != null) {
                                if (oVarF3 instanceof m2.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(oVarF3);
                                } else if ((oVarF3.f11119c & 16384) != 0 && (oVarF3 instanceof q2.m)) {
                                    int i12 = 0;
                                    for (r1.o oVar6 = ((q2.m) oVarF3).f10746p; oVar6 != null; oVar6 = oVar6.f11122f) {
                                        if ((oVar6.f11119c & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                oVarF3 = oVar6;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF3 != null) {
                                                    eVar3.b(oVarF3);
                                                    oVarF3 = null;
                                                }
                                                eVar3.b(oVar6);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                oVarF3 = q2.f.f(eVar3);
                            }
                        }
                        oVar5 = oVar5.f11121e;
                    }
                }
                h0VarV3 = h0VarV3.v();
                oVar5 = (h0VarV3 == null || (d1Var2 = h0VarV3.E) == null) ? null : d1Var2.f10616e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i13 = size - 1;
                    ((m2.a) arrayList.get(size)).getClass();
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
            }
            r1.o oVarF4 = aVar2.f11117a;
            h1.e eVar4 = null;
            while (oVarF4 != null) {
                if (oVarF4 instanceof m2.a) {
                } else if ((oVarF4.f11119c & 16384) != 0 && (oVarF4 instanceof q2.m)) {
                    int i14 = 0;
                    for (r1.o oVar7 = ((q2.m) oVarF4).f10746p; oVar7 != null; oVar7 = oVar7.f11122f) {
                        if ((oVar7.f11119c & 16384) != 0) {
                            i14++;
                            if (i14 == 1) {
                                oVarF4 = oVar7;
                            } else {
                                if (eVar4 == null) {
                                    eVar4 = new h1.e(new r1.o[16]);
                                }
                                if (oVarF4 != null) {
                                    eVar4.b(oVarF4);
                                    oVarF4 = null;
                                }
                                eVar4.b(oVar7);
                            }
                        }
                    }
                    if (i14 == 1) {
                    }
                }
                oVarF4 = q2.f.f(eVar4);
            }
            if (!((Boolean) dVar.invoke()).booleanValue()) {
                r1.o oVarF5 = aVar2.f11117a;
                h1.e eVar5 = null;
                while (oVarF5 != null) {
                    if (oVarF5 instanceof m2.a) {
                    } else if ((oVarF5.f11119c & 16384) != 0 && (oVarF5 instanceof q2.m)) {
                        int i15 = 0;
                        for (r1.o oVar8 = ((q2.m) oVarF5).f10746p; oVar8 != null; oVar8 = oVar8.f11122f) {
                            if ((oVar8.f11119c & 16384) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    oVarF5 = oVar8;
                                } else {
                                    if (eVar5 == null) {
                                        eVar5 = new h1.e(new r1.o[16]);
                                    }
                                    if (oVarF5 != null) {
                                        eVar5.b(oVarF5);
                                        oVarF5 = null;
                                    }
                                    eVar5.b(oVar8);
                                }
                            }
                        }
                        if (i15 == 1) {
                        }
                    }
                    oVarF5 = q2.f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        n nVar = ((m2.a) arrayList.get(i16)).f8400o;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10 = this.H0;
        androidx.lifecycle.z zVar = this.G0;
        if (z10) {
            removeCallbacks(zVar);
            zVar.run();
        }
        if (!t(motionEvent) && isAttachedToWindow()) {
            b0 b0Var = this.f11478s;
            u uVar = b0Var.f11169d;
            AccessibilityManager accessibilityManager = b0Var.f11172g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x8 = motionEvent.getX();
                    float y5 = motionEvent.getY();
                    uVar.y(true);
                    q2.r rVar = new q2.r();
                    q2.h0 root = uVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x8)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
                    q2.d1 d1Var = root.E;
                    q2.h1 h1Var = d1Var.f10615d;
                    y1.i0 i0Var = q2.h1.J;
                    d1Var.f10615d.L0(q2.h1.N, h1Var.D0(jFloatToRawIntBits), rVar, 1, true);
                    int iA = n3.l.A(rVar);
                    while (true) {
                        if (-1 < iA) {
                            Object objE = rVar.f10785a.e(iA);
                            i9.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                            q2.h0 h0VarV = q2.f.v((r1.o) objE);
                            if (uVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(h0VarV) == null) {
                                if (h0VarV.E.d(8)) {
                                    int iV = b0Var.v(h0VarV.f10668b);
                                    y2.m mVarA = y2.p.a(h0VarV, false);
                                    if (y2.p.f(mVarA)) {
                                        if (!mVarA.k().f15011a.c(y2.r.f15074z)) {
                                            i7 = iV;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iA--;
                            }
                        }
                        i7 = Integer.MIN_VALUE;
                        break;
                    }
                    uVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i10 = b0Var.f11170e;
                    if (i10 != i7) {
                        b0Var.f11170e = i7;
                        b0.z(b0Var, i7, 128, null, 12);
                        b0.z(b0Var, i10, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i11 = b0Var.f11170e;
                    if (i11 == Integer.MIN_VALUE) {
                        uVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i11 != Integer.MIN_VALUE) {
                        b0Var.f11170e = Integer.MIN_VALUE;
                        b0.z(b0Var, Integer.MIN_VALUE, 128, null, 12);
                        b0.z(b0Var, i11, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && u(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.z0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.z0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.H0 = true;
                        postDelayed(zVar, 8L);
                        return false;
                    }
                } else if ((q(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (v(motionEvent)) {
                if ((q(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((w1.j) getFocusOwner()).d(keyEvent, new k2.d(3, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f11461j.getClass();
        v2.f11500a.setValue(new k2.e0(metaState));
        return ((w1.j) getFocusOwner()).d(keyEvent, w1.h.f14041a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        q2.d1 d1Var;
        if (isFocused()) {
            w1.j jVar = (w1.j) getFocusOwner();
            if (jVar.f14045d.f14040e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                w1.s sVarG = w1.f.g(jVar.f14044c);
                if (sVarG != null) {
                    if (!sVarG.f11117a.f11129n) {
                        n2.a.b("visitAncestors called on an unattached node");
                    }
                    r1.o oVar = sVarG.f11117a;
                    q2.h0 h0VarV = q2.f.v(sVarG);
                    while (h0VarV != null) {
                        if ((h0VarV.E.f10617f.f11120d & 131072) != 0) {
                            while (oVar != null) {
                                if ((oVar.f11119c & 131072) != 0) {
                                    r1.o oVarF = oVar;
                                    h1.e eVar = null;
                                    while (oVarF != null) {
                                        if ((oVarF.f11119c & 131072) != 0 && (oVarF instanceof q2.m)) {
                                            int i7 = 0;
                                            for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                                if ((oVar2.f11119c & 131072) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        oVarF = oVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new h1.e(new r1.o[16]);
                                                        }
                                                        if (oVarF != null) {
                                                            eVar.b(oVarF);
                                                            oVarF = null;
                                                        }
                                                        eVar.b(oVar2);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        oVarF = q2.f.f(eVar);
                                    }
                                }
                                oVar = oVar.f11121e;
                            }
                        }
                        h0VarV = h0VarV.v();
                        oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        int i7 = Build.VERSION.SDK_INT;
        if (23 > i7 || i7 >= 28) {
            super.dispatchProvideStructure(viewStructure);
        } else {
            c0.f11204a.a(viewStructure, getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.H0) {
            androidx.lifecycle.z zVar = this.G0;
            removeCallbacks(zVar);
            MotionEvent motionEvent2 = this.z0;
            i9.l.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.H0 = false;
            } else {
                zVar.run();
            }
        }
        if (!t(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || v(motionEvent))) {
            int iQ = q(motionEvent);
            if ((iQ & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iQ & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void e(androidx.lifecycle.t tVar) {
    }

    public final View findViewByAccessibilityIdTraversal(int i7) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return o(this, i7);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i7));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        x1.c cVarD;
        if (view == null || this.P.f10839c) {
            return super.focusSearch(view, i7);
        }
        Object obj = q1.f11372f.get();
        i9.l.b(obj);
        View viewB = ((q1) obj).b(i7, view, this);
        if (view == this) {
            w1.s sVarG = w1.f.g(((w1.j) getFocusOwner()).f14044c);
            cVarD = sVarG != null ? w1.f.j(sVarG) : null;
            if (cVarD == null) {
                cVarD = w1.f.d(view, this);
            }
        } else {
            cVarD = w1.f.d(view, this);
        }
        w1.d dVarD = w1.f.D(i7);
        int i10 = dVarD != null ? dVarD.f14034a : 6;
        i9.x xVar = new i9.x();
        if (((w1.j) getFocusOwner()).e(i10, cVarD, new j2.h(xVar, 2)) != null) {
            Object obj2 = xVar.f6688a;
            if (obj2 != null) {
                if (viewB != null) {
                    if (i10 == 1 || i10 == 2) {
                        return super.focusSearch(view, i7);
                    }
                    if (w1.f.o(w1.f.j((w1.s) obj2), w1.f.d(viewB, this), cVarD, i10)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void g(androidx.lifecycle.t tVar) {
    }

    public f getAccessibilityManager() {
        return this.f11482u;
    }

    public final w0 getAndroidViewsHandler$ui_release() {
        if (this.L == null) {
            w0 w0Var = new w0(getContext());
            this.L = w0Var;
            addView(w0Var, -1);
            requestLayout();
        }
        w0 w0Var2 = this.L;
        i9.l.b(w0Var2);
        return w0Var2;
    }

    public s1.f getAutofill() {
        return this.E;
    }

    public s1.k getAutofillManager() {
        return this.F;
    }

    public s1.l getAutofillTree() {
        return this.f11486w;
    }

    public g getClipboard() {
        return this.I;
    }

    public h getClipboardManager() {
        return this.H;
    }

    public final h9.k getConfigurationChangeObserver() {
        return this.D;
    }

    public final t1.c getContentCaptureManager$ui_release() {
        return this.f11480t;
    }

    public y8.h getCoroutineContext() {
        return this.f11457h;
    }

    public n3.c getDensity() {
        return (n3.c) this.f11451d.getValue();
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public u1.a m30getDragAndDropManager() {
        return this.f11459i;
    }

    public x1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            w1.s sVarG = w1.f.g(((w1.j) getFocusOwner()).f14044c);
            if (sVarG != null) {
                return w1.f.j(sVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return w1.f.d(viewFindFocus, this);
        }
        return null;
    }

    public w1.i getFocusOwner() {
        return this.f11455g;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        x1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f14523a);
            rect.top = Math.round(embeddedViewFocusRect.f14524b);
            rect.right = Math.round(embeddedViewFocusRect.f14525c);
            rect.bottom = Math.round(embeddedViewFocusRect.f14526d);
            return;
        }
        if (i9.l.a(((w1.j) getFocusOwner()).e(6, null, n.f11337c), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public f3.d getFontFamilyResolver() {
        return (f3.d) this.f11479s0.getValue();
    }

    public f3.c getFontLoader() {
        return this.f11477r0;
    }

    public y1.v getGraphicsContext() {
        return this.f11484v;
    }

    public g2.a getHapticFeedBack() {
        return this.f11485v0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.P.f10838b.M();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public h2.b getInputModeManager() {
        return this.f11487w0;
    }

    public final o2.q getInsetsListener() {
        return this.f11466m;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.V;
    }

    @Override // android.view.View, android.view.ViewParent
    public n3.o getLayoutDirection() {
        return (n3.o) this.f11483u0.getValue();
    }

    public s.w getLayoutNodes() {
        return this.f11470o;
    }

    public long getMeasureIteration() {
        q2.w0 w0Var = this.P;
        if (!w0Var.f10839c) {
            n2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return w0Var.f10843g;
    }

    public p2.c getModifierLocalManager() {
        return this.x0;
    }

    public u getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public o2.u0 getPlacementScope() {
        int i7 = o2.x0.f9445b;
        return new o2.j0(1, this);
    }

    public k2.t getPointerIconService() {
        return this.N0;
    }

    public z2.a getRectManager() {
        return this.f11472p;
    }

    public q2.h0 getRoot() {
        return this.f11468n;
    }

    public q2.x1 getRootForTest() {
        return this.f11474q;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        wb.b bVar;
        if (Build.VERSION.SDK_INT < 31 || (bVar = this.L0) == null) {
            return false;
        }
        return ((Boolean) ((f1.k1) bVar.f14284a).getValue()).booleanValue();
    }

    public y2.o getSemanticsOwner() {
        return this.f11476r;
    }

    public q2.j0 getSharedDrawScope() {
        return this.f11450c;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? x0.f11506a.a(this) : this.K;
    }

    public q2.s1 getSnapshotObserver() {
        return this.J;
    }

    public n2 getSoftwareKeyboardController() {
        return this.f11475q0;
    }

    public g3.x getTextInputService() {
        return this.f11471o0;
    }

    public o2 getTextToolbar() {
        return this.y0;
    }

    public final q2.w1 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public View getView() {
        return this;
    }

    public r2 getViewConfiguration() {
        return this.f11464l;
    }

    public final l getViewTreeOwners() {
        return (l) this.f11460i0.getValue();
    }

    public u2 getWindowInfo() {
        return this.f11461j;
    }

    public final s1.c get_autofillManager$ui_release() {
        return this.F;
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void h(androidx.lifecycle.t tVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.v vVarG;
        androidx.lifecycle.t tVar;
        da.a aVar;
        super.onAttachedToWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            setShowLayoutBounds(j0.n());
        }
        this.f11466m.onViewAttachedToWindow(this);
        int i10 = 1;
        if (i7 > 28) {
            if (S0 == null) {
                n8.k kVar = new n8.k(i10);
                S0 = kVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (O0 == null) {
                        O0 = Class.forName("android.os.SystemProperties");
                    }
                    if (Q0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = O0;
                        Q0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = Q0;
                    if (method != null) {
                        method.invoke(null, kVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            s.d0 d0Var = R0;
            synchronized (d0Var) {
                d0Var.a(this);
            }
        }
        this.f11461j.f11504a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f11461j.getClass();
        this.f11461j.getClass();
        s(getRoot());
        r(getRoot());
        getSnapshotObserver().f10794a.d();
        if (l() && (aVar = this.E) != null) {
            s1.j jVar = s1.j.f12550a;
            jVar.getClass();
            ((AutofillManager) aVar.f3849d).registerCallback(s1.i.h(jVar));
        }
        androidx.lifecycle.t tVarE = androidx.lifecycle.i0.e(this);
        a5.g gVarE = g5.a.E(this);
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (tVarE != null && gVarE != null && (tVarE != (tVar = viewTreeOwners.f11318a) || gVarE != tVar))) {
            if (tVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (gVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (vVarG = viewTreeOwners.f11318a.g()) != null) {
                vVarG.f(this);
            }
            tVarE.g().a(this);
            l lVar = new l(tVarE, gVarE);
            set_viewTreeOwners(lVar);
            h9.k kVar2 = this.f11462j0;
            if (kVar2 != null) {
                kVar2.invoke(lVar);
            }
            this.f11462j0 = null;
        }
        this.f11487w0.f6436a.setValue(new h2.a(isInTouchMode() ? 1 : 2));
        l viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.v vVarG2 = viewTreeOwners2 != null ? viewTreeOwners2.f11318a.g() : null;
        if (vVarG2 == null) {
            throw ob.a.o("No lifecycle owner exists");
        }
        vVarG2.a(this);
        vVarG2.a(this.f11480t);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f11463k0);
        getViewTreeObserver().addOnScrollChangedListener(this.f11465l0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f11467m0);
        if (Build.VERSION.SDK_INT >= 31) {
            f0.f11221a.b(this);
        }
        s1.c cVar = this.F;
        if (cVar != null) {
            ((w1.j) getFocusOwner()).f14048g.a(cVar);
            getSemanticsOwner().f15029d.a(cVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        r1.r rVar = (r1.r) this.f11473p0.get();
        p0 p0Var = (p0) (rVar != null ? rVar.f11131b : null);
        if (p0Var == null) {
            return this.f11469n0.f5902d;
        }
        r1.r rVar2 = (r1.r) p0Var.f11362d.get();
        v1 v1Var = (v1) (rVar2 != null ? rVar2.f11131b : null);
        return v1Var != null && (v1Var.f11499e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(a.a.e(getContext()));
        this.f11461j.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f11481t0) {
            this.f11481t0 = i7 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(i2.c.w(getContext()));
        }
        this.D.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection mVar;
        int i7;
        r1.r rVar = (r1.r) this.f11473p0.get();
        p0 p0Var = (p0) (rVar != null ? rVar.f11131b : null);
        if (p0Var == null) {
            g3.z zVar = this.f11469n0;
            if (zVar.f5902d) {
                g3.k kVar = zVar.f5906h;
                g3.w wVar = zVar.f5905g;
                int i10 = kVar.f5870e;
                boolean z10 = kVar.f5866a;
                if (i10 == 1) {
                    i7 = z10 ? 6 : 0;
                } else if (i10 == 0) {
                    i7 = 1;
                } else if (i10 == 2) {
                    i7 = 2;
                } else if (i10 == 6) {
                    i7 = 5;
                } else if (i10 == 5) {
                    i7 = 7;
                } else if (i10 == 3) {
                    i7 = 3;
                } else if (i10 == 4) {
                    i7 = 4;
                } else {
                    if (i10 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i7;
                int i11 = kVar.f5869d;
                if (i11 == 1) {
                    editorInfo.inputType = 1;
                } else if (i11 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i7;
                } else if (i11 == 3) {
                    editorInfo.inputType = 2;
                } else if (i11 == 4) {
                    editorInfo.inputType = 3;
                } else if (i11 == 5) {
                    editorInfo.inputType = 17;
                } else if (i11 == 6) {
                    editorInfo.inputType = 33;
                } else if (i11 == 7) {
                    editorInfo.inputType = 129;
                } else if (i11 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i11 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z10) {
                    int i12 = editorInfo.inputType;
                    if ((i12 & 1) == 1) {
                        editorInfo.inputType = i12 | 131072;
                        if (i10 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i13 = editorInfo.inputType;
                if ((i13 & 1) == 1) {
                    int i14 = kVar.f5867b;
                    if (i14 == 1) {
                        editorInfo.inputType = i13 | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                    } else if (i14 == 2) {
                        editorInfo.inputType = i13 | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
                    } else if (i14 == 3) {
                        editorInfo.inputType = i13 | 16384;
                    }
                    if (kVar.f5868c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j5 = wVar.f5890b;
                int i15 = b3.q0.f1429c;
                editorInfo.initialSelStart = (int) (j5 >> 32);
                editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
                g4.d.a(editorInfo, wVar.f5889a.f1353b);
                editorInfo.imeOptions |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
                if (l4.j.d()) {
                    l4.j.a().i(editorInfo);
                }
                g3.s sVar = new g3.s(zVar.f5905g, new a2.d(20, zVar), zVar.f5906h.f5868c);
                zVar.f5907i.add(new WeakReference(sVar));
                return sVar;
            }
        } else {
            r1.r rVar2 = (r1.r) p0Var.f11362d.get();
            v1 v1Var = (v1) (rVar2 != null ? rVar2.f11131b : null);
            if (v1Var != null) {
                synchronized (v1Var.f11497c) {
                    if (v1Var.f11499e) {
                        return null;
                    }
                    u0.q qVarA = v1Var.f11495a.a(editorInfo);
                    b2.a aVar = new b2.a(12, v1Var);
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 34) {
                        mVar = new g3.o(qVarA, aVar);
                    } else if (i16 >= 25) {
                        mVar = new g3.n(qVarA, aVar);
                    } else {
                        mVar = i16 >= 24 ? new g3.m(qVarA, aVar) : new g3.l(qVarA, aVar);
                    }
                    v1Var.f11498d.b(new q2.e2(mVar));
                    return mVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        y2.m mVar;
        String strA;
        t1.c cVar = this.f11480t;
        cVar.getClass();
        for (long j5 : jArr) {
            y2.n nVar = (y2.n) cVar.k().b((int) j5);
            if (nVar != null && (mVar = nVar.f15024a) != null) {
                c3.c.q();
                ViewTranslationRequest.Builder builderM = c3.c.m(cVar.f12733a.getAutofillId(), mVar.f15023g);
                Object objG = mVar.f15020d.f15011a.g(y2.r.A);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = p3.a.a(list, "\n", null, 62)) != null) {
                    builderM.setValue("android:text", TranslationRequestValue.forText(new b3.h(strA)));
                    consumer.accept(builderM.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        da.a aVar;
        super.onDetachedFromWindow();
        this.f11466m.onViewDetachedFromWindow(this);
        if (this.f11453f) {
            View view = this.f11452e;
            if (view == null) {
                i9.l.j("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 28) {
            s.d0 d0Var = R0;
            synchronized (d0Var) {
                d0Var.i(this);
            }
        }
        p1.u uVar = getSnapshotObserver().f10794a;
        g4.e eVar = uVar.f10095h;
        if (eVar != null) {
            eVar.a();
        }
        uVar.a();
        this.f11461j.getClass();
        l viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.v vVarG = viewTreeOwners != null ? viewTreeOwners.f11318a.g() : null;
        if (vVarG == null) {
            throw ob.a.o("No lifecycle owner exists");
        }
        vVarG.f(this.f11480t);
        vVarG.f(this);
        if (l() && (aVar = this.E) != null) {
            s1.j jVar = s1.j.f12550a;
            jVar.getClass();
            ((AutofillManager) aVar.f3849d).unregisterCallback(s1.i.h(jVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f11463k0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f11465l0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f11467m0);
        if (i7 >= 31) {
            f0.f11221a.a(this);
        }
        s1.c cVar = this.F;
        if (cVar != null) {
            getSemanticsOwner().f15029d.i(cVar);
            ((w1.j) getFocusOwner()).f14048g.i(cVar);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        super.onFocusChanged(z10, i7, rect);
        if (z10 || hasFocus()) {
            return;
        }
        w1.f.e(((w1.j) getFocusOwner()).f14044c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.V = 0L;
        this.P.j(this.I0);
        this.N = null;
        P();
        if (this.L != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i11 - i7, i12 - i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        q2.w0 w0Var = this.P;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                s(getRoot());
            }
            long jN = n(i7);
            long jN2 = n(i10);
            long jC = g5.a.C((int) (jN >>> 32), (int) (jN & 4294967295L), (int) (jN2 >>> 32), (int) (4294967295L & jN2));
            n3.a aVar = this.N;
            if (aVar == null) {
                this.N = new n3.a(jC);
                this.O = false;
            } else if (!n3.a.b(aVar.f8730a, jC)) {
                this.O = true;
            }
            w0Var.q(jC);
            w0Var.l();
            setMeasuredDimension(getRoot().F.f10743p.f9435a, getRoot().F.f10743p.f9436b);
            if (this.L != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().F.f10743p.f9435a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().F.f10743p.f9436b, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        if (!l() || viewStructure == null) {
            return;
        }
        s1.c cVar = this.F;
        if (cVar != null) {
            q2.h0 h0Var = cVar.f12541b.f15026a;
            AutofillId autofillId = cVar.f12546g;
            String str = cVar.f12544e;
            z2.a aVar = cVar.f12543d;
            n4.h.d0(viewStructure, h0Var, autofillId, str, aVar);
            Object[] objArr = s.m0.f12471a;
            s.d0 d0Var = new s.d0(2);
            d0Var.a(h0Var);
            d0Var.a(viewStructure);
            while (d0Var.h()) {
                Object objJ = d0Var.j(d0Var.f12408b - 1);
                i9.l.c(objJ, "null cannot be cast to non-null type android.view.ViewStructure");
                ViewStructure viewStructureM = i4.j.m(objJ);
                Object objJ2 = d0Var.j(d0Var.f12408b - 1);
                i9.l.c(objJ2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                h1.b bVar = (h1.b) ((q2.h0) objJ2).n();
                int i10 = ((h1.e) bVar.f6413b).f6423c;
                for (int i11 = 0; i11 < i10; i11++) {
                    q2.h0 h0Var2 = (q2.h0) bVar.get(i11);
                    if (!h0Var2.P && h0Var2.I() && h0Var2.J()) {
                        y2.j jVarX = h0Var2.x();
                        if (jVarX != null) {
                            s.h0 h0Var3 = jVarX.f15011a;
                            if (h0Var3.b(y2.i.f14992g) || h0Var3.b(y2.r.f15065q) || h0Var3.b(y2.r.f15066r)) {
                                ViewStructure viewStructureNewChild = viewStructureM.newChild(viewStructureM.addChildCount(1));
                                n4.h.d0(viewStructureNewChild, h0Var2, cVar.f12546g, str, aVar);
                                d0Var.a(h0Var2);
                                d0Var.a(viewStructureNewChild);
                            } else {
                                d0Var.a(h0Var2);
                                d0Var.a(viewStructureM);
                            }
                        } else {
                            d0Var.a(h0Var2);
                            d0Var.a(viewStructureM);
                        }
                    }
                }
            }
        }
        da.a aVar2 = this.E;
        if (aVar2 != null) {
            s1.l lVar = (s1.l) aVar2.f3848c;
            LinkedHashMap linkedHashMap = lVar.f12551a;
            LinkedHashMap linkedHashMap2 = lVar.f12551a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId((AutofillId) aVar2.f3850e, iIntValue);
                viewStructureNewChild2.setId(iIntValue, ((u) aVar2.f3847b).getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        k2.s sVar;
        int toolType = motionEvent.getToolType(i7);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (sVar = ((q) getPointerIconService()).f11370a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i7);
        }
        Context context = getContext();
        return sVar instanceof k2.a ? PointerIcon.getSystemIcon(context, ((k2.a) sVar).f7182b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        n3.o oVar;
        if (this.f11449b) {
            n3.o oVar2 = n3.o.f8749a;
            if (i7 != 0) {
                oVar = i7 != 1 ? null : n3.o.f8750b;
            } else {
                oVar = oVar2;
            }
            if (oVar != null) {
                oVar2 = oVar;
            }
            setLayoutDirection(oVar2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        wb.b bVar;
        if (Build.VERSION.SDK_INT >= 31 && (bVar = this.L0) != null) {
            y2.o semanticsOwner = getSemanticsOwner();
            y8.h coroutineContext = getCoroutineContext();
            h1.e eVar = new h1.e(new x2.h[16]);
            n3.n.Q0(semanticsOwner.a(), 0, new x2.g(1, 8, h1.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            u8.l.J0(eVar.f6421a, new w0.c1(1, new h9.k[]{x2.b.f14544c, x2.b.f14545d}), 0, eVar.f6423c);
            int i7 = eVar.f6423c;
            x2.h hVar = (x2.h) (i7 == 0 ? null : eVar.f6421a[i7 - 1]);
            if (hVar != null) {
                n3.k kVar = hVar.f14559c;
                x2.c cVar = new x2.c(hVar.f14557a, kVar, cc.b0.a(coroutineContext), bVar, this);
                q2.h1 h1Var = hVar.f14560d;
                x1.c cVarH = o2.d1.g(h1Var).h(h1Var, true);
                long j5 = (((long) kVar.f8741a) << 32) | (((long) kVar.f8742b) & 4294967295L);
                ScrollCaptureTarget scrollCaptureTargetB = x2.f.b(this, y1.h0.y(n3.l.Q(cVarH)), new Point((int) (j5 >> 32), (int) (j5 & 4294967295L)), cVar);
                scrollCaptureTargetB.setScrollBounds(y1.h0.y(kVar));
                consumer.accept(scrollCaptureTargetB);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        t1.c cVar = this.f11480t;
        cVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (i9.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            n4.h.z(cVar, longSparseArray);
        } else {
            cVar.f12733a.post(new c.n(5, cVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zN;
        this.f11461j.f11504a.setValue(Boolean.valueOf(z10));
        this.K0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zN = j0.n())) {
            return;
        }
        setShowLayoutBounds(zN);
        r(getRoot());
    }

    public final void p(q2.h0 h0Var, boolean z10) {
        this.P.f(h0Var, z10);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int q(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        u uVar;
        removeCallbacks(this.F0);
        try {
            H(motionEvent);
            this.W = true;
            y(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.z0;
                boolean z10 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                b1.q qVar = this.C;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!qVar.f1181a) {
                                ((s.q) ((a2.d) qVar.f1184d).f20b).b();
                                ((k2.e) qVar.f1183c).f();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z10) {
                            motionEvent2 = motionEvent3;
                        } else {
                            N(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked2 == 3 || actionMasked2 == 9 || !u(motionEvent)) {
                    uVar = this;
                } else {
                    uVar = this;
                    uVar.N(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = uVar.z0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = uVar.z0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    k2.k kVar = uVar.B;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            kVar.f7231c.delete(pointerId);
                            kVar.f7230b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = uVar.z0;
                        float x8 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = uVar.z0;
                        boolean z12 = (x8 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = uVar.z0;
                        boolean z13 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                kVar.f7231c.delete(pointerId);
                                kVar.f7230b.delete(pointerId);
                            }
                            k2.e eVar = (k2.e) qVar.f1183c;
                            if (eVar.f7204c) {
                                eVar.f7204c = true;
                            } else {
                                ((k2.m) eVar.f7208g).f7252a.h();
                            }
                        }
                    }
                }
                uVar.z0 = MotionEvent.obtainNoHistory(motionEvent);
                int iM = M(motionEvent);
                Trace.endSection();
                uVar.W = false;
                return iM;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.W = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((w1.j) getFocusOwner()).f14044c.C0().a()) {
            return super.requestFocus(i7, rect);
        }
        w1.d dVarD = w1.f.D(i7);
        int i10 = dVarD != null ? dVarD.f14034a : 7;
        return i9.l.a(((w1.j) getFocusOwner()).e(i10, rect != null ? y1.h0.E(rect) : null, new r(i10, 0)), Boolean.TRUE);
    }

    public final void s(q2.h0 h0Var) {
        this.P.p(h0Var, false);
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            s((q2.h0) objArr[i10]);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j5) {
        this.f11478s.f11173h = j5;
    }

    public final void setConfigurationChangeObserver(h9.k kVar) {
        this.D = kVar;
    }

    public final void setContentCaptureManager$ui_release(t1.c cVar) {
        this.f11480t = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(y8.h hVar) {
        this.f11457h = hVar;
        r1.o oVar = getRoot().E.f10617f;
        if (oVar instanceof k2.m0) {
            ((k2.m0) oVar).C0();
        }
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitSubtreeIf called on an unattached node");
        }
        h1.e eVar = new h1.e(new r1.o[16]);
        r1.o oVar2 = oVar.f11117a;
        r1.o oVar3 = oVar2.f11122f;
        if (oVar3 == null) {
            q2.f.b(eVar, oVar2);
        } else {
            eVar.b(oVar3);
        }
        while (true) {
            int i7 = eVar.f6423c;
            if (i7 == 0) {
                return;
            }
            r1.o oVar4 = (r1.o) eVar.l(i7 - 1);
            if ((oVar4.f11120d & 16) != 0) {
                for (r1.o oVar5 = oVar4; oVar5 != null; oVar5 = oVar5.f11122f) {
                    if ((oVar5.f11119c & 16) != 0) {
                        ?? F = oVar5;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof q2.v1) {
                                q2.v1 v1Var = (q2.v1) F;
                                if (v1Var instanceof k2.m0) {
                                    ((k2.m0) v1Var).C0();
                                }
                            } else if ((F.f11119c & 16) != 0 && (F instanceof q2.m)) {
                                r1.o oVar6 = ((q2.m) F).f10746p;
                                int i10 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (oVar6 != null) {
                                    if ((oVar6.f11119c & 16) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            eVar2 = eVar2;
                                            F = oVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h1.e(new r1.o[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(oVar6);
                                        }
                                    }
                                    oVar6 = oVar6.f11122f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = q2.f.f(eVar2);
                        }
                    }
                }
            }
            q2.f.b(eVar, oVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j5) {
        this.V = j5;
    }

    public final void setOnViewTreeOwnersAvailable(h9.k kVar) {
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            kVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f11462j0 = kVar;
    }

    public void setShowLayoutBounds(boolean z10) {
        this.K = z10;
    }

    public void setUncaughtExceptionHandler(q2.w1 w1Var) {
        this.P.getClass();
    }

    public final void setUncaughtExceptionHandler$ui_release(q2.w1 w1Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean u(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y5 = motionEvent.getY();
        return 0.0f <= x8 && x8 <= ((float) getWidth()) && 0.0f <= y5 && y5 <= ((float) getHeight());
    }

    public final boolean v(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.z0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void w(float[] fArr) {
        G();
        y1.a0.e(fArr, this.T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f11454f0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f11454f0 & 4294967295L));
        float[] fArr2 = this.S;
        y1.a0.d(fArr2);
        y1.a0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        j0.t(fArr, fArr2);
    }

    public final long x(long j5) {
        G();
        long jB = y1.a0.b(j5, this.T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f11454f0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f11454f0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void y(boolean z10) {
        s sVar;
        q2.w0 w0Var = this.P;
        if (w0Var.f10838b.M() || ((h1.e) w0Var.f10841e.f12990b).f6423c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    sVar = this.I0;
                } finally {
                    Trace.endSection();
                }
            } else {
                sVar = null;
            }
            if (w0Var.j(sVar)) {
                requestLayout();
            }
            w0Var.a(false);
            if (this.A) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.A = false;
            }
        }
    }

    public final void z(q2.h0 h0Var, long j5) {
        q2.w0 w0Var = this.P;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            w0Var.k(h0Var, j5);
            if (!w0Var.f10838b.M()) {
                w0Var.a(false);
                if (this.A) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.A = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }
}
