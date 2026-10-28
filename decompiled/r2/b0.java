package r2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import com.tencent.bugly.BuglyStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends e4.b {
    public static final s.v Q;
    public boolean A;
    public y B;
    public s.w C;
    public final s.x D;
    public final s.u E;
    public final s.u F;
    public final String G;
    public final String H;
    public final a2.b I;
    public final s.w J;
    public m2 K;
    public boolean L;
    public final s.u M;
    public final androidx.lifecycle.z N;
    public final ArrayList O;
    public final a0 P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f11169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11170e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f11171f = new a0(this, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f11172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f11174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f11175j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f11176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f11177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f4.f f11180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f4.f f11181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s.w f11183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s.w f11184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s.r0 f11185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s.r0 f11186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f11188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s.g f11189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ec.h f11190z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        s.v vVar = s.j.f12449a;
        s.v vVar2 = new s.v(32);
        int i7 = vVar2.f12509b;
        if (i7 < 0) {
            t.a.d("");
            throw null;
        }
        int i10 = i7 + 32;
        int[] iArr2 = vVar2.f12508a;
        if (iArr2.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i10, (iArr2.length * 3) / 2));
            i9.l.d(iArrCopyOf, "copyOf(...)");
            vVar2.f12508a = iArrCopyOf;
        }
        int[] iArr3 = vVar2.f12508a;
        int i11 = vVar2.f12509b;
        if (i7 != i11) {
            u8.l.m0(i10, i7, i11, iArr3, iArr3);
        }
        u8.l.q0(i7, 0, 12, iArr, iArr3);
        vVar2.f12509b += 32;
        Q = vVar2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [r2.v] */
    /* JADX WARN: Type inference failed for: r3v4, types: [r2.w] */
    public b0(u uVar) {
        this.f11169d = uVar;
        Object systemService = uVar.getContext().getSystemService("accessibility");
        i9.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f11172g = accessibilityManager;
        this.f11173h = 100L;
        this.f11174i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: r2.v
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                b0 b0Var = this.f11493a;
                b0Var.k = z10 ? b0Var.f11172g.getEnabledAccessibilityServiceList(-1) : u8.w.f13122a;
            }
        };
        this.f11175j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: r2.w
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                b0 b0Var = this.f11501a;
                b0Var.k = b0Var.f11172g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f11176l = new Handler(Looper.getMainLooper());
        this.f11177m = new x(this);
        this.f11178n = Integer.MIN_VALUE;
        this.f11179o = Integer.MIN_VALUE;
        this.f11183s = new s.w();
        this.f11184t = new s.w();
        this.f11185u = new s.r0(0);
        this.f11186v = new s.r0(0);
        this.f11187w = -1;
        this.f11189y = new s.g(0);
        this.f11190z = i2.c.c(1, 6, null);
        this.A = true;
        s.w wVar = s.l.f12468a;
        i9.l.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = wVar;
        this.D = new s.x();
        this.E = new s.u();
        this.F = new s.u();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new a2.b(13);
        this.J = new s.w();
        y2.m mVarA = uVar.getSemanticsOwner().a();
        i9.l.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new m2(mVarA, wVar);
        int i7 = s.i.f12443a;
        this.M = new s.u();
        uVar.addOnAttachStateChangeListener(new o.e(2, this));
        this.N = new androidx.lifecycle.z(23, this);
        this.O = new ArrayList();
        this.P = new a0(this, 1);
    }

    public static Rect G(y1.h0 h0Var) {
        if (!(h0Var instanceof y1.c0) && !(h0Var instanceof y1.d0)) {
            return null;
        }
        x1.c cVarO = h0Var.o();
        return new Rect((int) cVarO.f14523a, (int) cVarO.f14524b, (int) cVarO.f14525c, (int) cVarO.f14526d);
    }

    public static float[] H(y1.h0 h0Var) {
        if (!(h0Var instanceof y1.d0)) {
            return null;
        }
        x1.d dVar = ((y1.d0) h0Var).f14882e;
        long j5 = dVar.f14534h;
        long j10 = dVar.f14533g;
        long j11 = dVar.f14532f;
        long j12 = dVar.f14531e;
        return new float[]{Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L))};
    }

    public static Region I(y1.h0 h0Var) {
        if (!(h0Var instanceof y1.b0)) {
            return null;
        }
        y1.b0 b0Var = (y1.b0) h0Var;
        x1.c cVarO = b0Var.o();
        Region region = new Region(new Rect((int) cVarO.f14523a, (int) cVarO.f14524b, (int) cVarO.f14525c, (int) cVarO.f14526d));
        Region region2 = new Region();
        y1.e0 e0Var = b0Var.f14878e;
        if (!(e0Var instanceof y1.h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((y1.h) e0Var).f14895a, region);
        return region2;
    }

    public static CharSequence J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int length = charSequence.length();
            int i7 = BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH;
            if (length > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH))) {
                    i7 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i7);
                i9.l.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String p(y2.m mVar) {
        b3.h hVar;
        if (mVar != null) {
            y2.j jVar = mVar.f15020d;
            s.h0 h0Var = jVar.f15011a;
            y2.u uVar = y2.r.f15050a;
            if (h0Var.c(uVar)) {
                return p3.a.a((List) jVar.k(uVar), ",", null, 62);
            }
            y2.u uVar2 = y2.r.E;
            if (h0Var.c(uVar2)) {
                Object objG = h0Var.g(uVar2);
                if (objG == null) {
                    objG = null;
                }
                b3.h hVar2 = (b3.h) objG;
                if (hVar2 != null) {
                    return hVar2.f1353b;
                }
            } else {
                Object objG2 = h0Var.g(y2.r.A);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (hVar = (b3.h) u8.p.m0(list)) != null) {
                    return hVar.f1353b;
                }
            }
        }
        return null;
    }

    public static final boolean s(y2.h hVar, float f10) {
        h9.a aVar = hVar.f14984a;
        if (f10 >= 0.0f || ((Number) aVar.invoke()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) aVar.invoke()).floatValue() < ((Number) hVar.f14985b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean t(y2.h hVar) {
        h9.a aVar = hVar.f14984a;
        if (((Number) aVar.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        ((Number) hVar.f14985b.invoke()).floatValue();
        return false;
    }

    public static final boolean u(y2.h hVar) {
        h9.a aVar = hVar.f14984a;
        if (((Number) aVar.invoke()).floatValue() < ((Number) hVar.f14985b.invoke()).floatValue()) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(b0 b0Var, int i7, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        b0Var.y(i7, i10, num, null);
    }

    public final void A(String str, int i7, int i10) {
        AccessibilityEvent accessibilityEventJ = j(v(i7), 32);
        accessibilityEventJ.setContentChangeTypes(i10);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i7) {
        y yVar = this.B;
        if (yVar != null) {
            y2.m mVar = yVar.f11509a;
            if (i7 != mVar.f15023g) {
                return;
            }
            if (SystemClock.uptimeMillis() - yVar.f11514f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(mVar.f15023g), 131072);
                accessibilityEventJ.setFromIndex(yVar.f11512d);
                accessibilityEventJ.setToIndex(yVar.f11513e);
                accessibilityEventJ.setAction(yVar.f11510b);
                accessibilityEventJ.setMovementGranularity(yVar.f11511c);
                accessibilityEventJ.getText().add(p(mVar));
                x(accessibilityEventJ);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:243:0x0506  */
    /* JADX WARN: Code duplicated, block: B:288:0x062e  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    public final void C(s.k kVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i7;
        int i10;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i11;
        int i12;
        Integer num2;
        y2.j jVar;
        y2.m mVar;
        int i13;
        boolean z10;
        boolean z11;
        s.h0 h0Var;
        q2.h0 h0Var2;
        int i14;
        y2.j jVar2;
        long j5;
        char c10;
        Integer num3;
        s.h0 h0Var3;
        int i15;
        l2 l2Var;
        boolean z12;
        y2.u uVar;
        l2 l2Var2;
        boolean z13;
        t8.e eVar;
        int i16;
        String str;
        int i17;
        int i18;
        int i19;
        Integer num4;
        AccessibilityEvent accessibilityEventL;
        String str2;
        s.k kVar2 = kVar;
        ArrayList arrayList3 = this.O;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = kVar2.f12462b;
        long[] jArr3 = kVar2.f12461a;
        int length = jArr3.length - 2;
        Integer num5 = 0;
        if (length < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j10 = jArr3[i20];
            int i21 = length;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i22 = 8;
                int i23 = 8 - ((~(i20 - i21)) >>> 31);
                long j11 = j10;
                int i24 = 0;
                while (i24 < i23) {
                    if ((j11 & 255) < 128) {
                        int i25 = iArr3[(i20 << 3) + i24];
                        m2 m2Var = (m2) this.J.b(i25);
                        if (m2Var == null) {
                            i10 = i24;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i11 = i23;
                            i12 = i20;
                            num2 = num5;
                        } else {
                            y2.j jVar3 = m2Var.f11334a;
                            s.h0 h0Var4 = jVar3.f15011a;
                            y2.n nVar = (y2.n) kVar2.b(i25);
                            y2.m mVar2 = nVar != null ? nVar.f15024a : null;
                            if (mVar2 == null) {
                                throw ob.a.o("no value for specified key");
                            }
                            q2.h0 h0Var5 = mVar2.f15019c;
                            y2.j jVar4 = mVar2.f15020d;
                            iArr2 = iArr3;
                            int i26 = mVar2.f15023g;
                            jArr2 = jArr3;
                            s.h0 h0Var6 = jVar4.f15011a;
                            i12 = i20;
                            Object[] objArr = h0Var6.f12438b;
                            Object[] objArr2 = h0Var6.f12439c;
                            long[] jArr4 = h0Var6.f12437a;
                            i10 = i24;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                q2.h0 h0Var7 = h0Var5;
                                i11 = i23;
                                int i27 = 0;
                                z10 = false;
                                while (true) {
                                    long j12 = jArr4[i27];
                                    mVar = mVar2;
                                    int i28 = i27;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                        int i30 = 0;
                                        while (i30 < i29) {
                                            if ((j12 & 255) < 128) {
                                                int i31 = (i28 << 3) + i30;
                                                Object obj = objArr[i31];
                                                i15 = length2;
                                                Object obj2 = objArr2[i31];
                                                jVar2 = jVar3;
                                                y2.u uVar2 = (y2.u) obj;
                                                j5 = j12;
                                                y2.u uVar3 = y2.r.f15068t;
                                                if (i9.l.a(uVar2, uVar3) || i9.l.a(uVar2, y2.r.f15069u)) {
                                                    int size = arrayList4.size();
                                                    int i32 = 0;
                                                    while (true) {
                                                        if (i32 >= size) {
                                                            l2Var = null;
                                                            break;
                                                        }
                                                        int i33 = size;
                                                        if (((l2) arrayList4.get(i32)).f11322a == i25) {
                                                            l2Var = (l2) arrayList4.get(i32);
                                                            break;
                                                        } else {
                                                            i32++;
                                                            size = i33;
                                                        }
                                                    }
                                                    if (l2Var != null) {
                                                        z12 = false;
                                                    } else {
                                                        l2Var = new l2(i25, arrayList3);
                                                        z12 = true;
                                                    }
                                                    arrayList3.add(l2Var);
                                                } else {
                                                    z12 = false;
                                                }
                                                if (z12) {
                                                    uVar = y2.r.f15053d;
                                                    if (i9.l.a(uVar2, uVar)) {
                                                        i9.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        str2 = (String) obj2;
                                                        if (h0Var4.c(uVar)) {
                                                            A(str2, i25, 8);
                                                        }
                                                        c10 = '\b';
                                                        num3 = num5;
                                                        h0Var3 = h0Var4;
                                                    } else if (!i9.l.a(uVar2, y2.r.f15051b) || i9.l.a(uVar2, y2.r.I)) {
                                                        i25 = i25;
                                                        arrayList4 = arrayList4;
                                                        i29 = i29;
                                                        h0Var7 = h0Var7;
                                                        num3 = num5;
                                                        h0Var3 = h0Var4;
                                                        i15 = i15;
                                                        c10 = '\b';
                                                        z(this, v(i25), 2048, 64, 8);
                                                        z(this, v(i25), 2048, num3, 8);
                                                    } else if (i9.l.a(uVar2, y2.r.f15052c)) {
                                                        c10 = '\b';
                                                        z(this, v(i25), 2048, 64, 8);
                                                        z(this, v(i25), 2048, num5, 8);
                                                        num3 = num5;
                                                        h0Var3 = h0Var4;
                                                    } else {
                                                        y2.u uVar4 = y2.r.H;
                                                        arrayList4 = arrayList4;
                                                        if (i9.l.a(uVar2, uVar4)) {
                                                            Object objG = h0Var6.g(y2.r.f15072x);
                                                            if (objG == null) {
                                                                objG = null;
                                                            }
                                                            y2.g gVar = (y2.g) objG;
                                                            if (gVar != null && gVar.f14983a == 4) {
                                                                Object objG2 = h0Var6.g(uVar4);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                if (i9.l.a(objG2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventJ = j(v(i25), 4);
                                                                    y2.m mVar3 = mVar;
                                                                    h0Var7 = h0Var7;
                                                                    y2.m mVar4 = new y2.m(mVar3.f15017a, true, h0Var7, jVar4);
                                                                    Object objG3 = mVar4.k().f15011a.g(y2.r.f15050a);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    List list = (List) objG3;
                                                                    mVar = mVar3;
                                                                    String strA = list != null ? p3.a.a(list, ",", null, 62) : null;
                                                                    Object objG4 = mVar4.k().f15011a.g(y2.r.A);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    List list2 = (List) objG4;
                                                                    String strA2 = list2 != null ? p3.a.a(list2, ",", null, 62) : null;
                                                                    if (strA != null) {
                                                                        accessibilityEventJ.setContentDescription(strA);
                                                                    }
                                                                    if (strA2 != null) {
                                                                        accessibilityEventJ.getText().add(strA2);
                                                                    }
                                                                    x(accessibilityEventJ);
                                                                } else {
                                                                    h0Var7 = h0Var7;
                                                                    z(this, v(i25), 2048, num5, 8);
                                                                }
                                                            } else {
                                                                h0Var7 = h0Var7;
                                                                z(this, v(i25), 2048, 64, 8);
                                                                z(this, v(i25), 2048, num5, 8);
                                                            }
                                                            num3 = num5;
                                                            i25 = i25;
                                                            h0Var3 = h0Var4;
                                                            i15 = i15;
                                                            c10 = '\b';
                                                        } else {
                                                            i29 = i29;
                                                            h0Var7 = h0Var7;
                                                            if (i9.l.a(uVar2, y2.r.f15050a)) {
                                                                int iV = v(i25);
                                                                i9.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                y(iV, 2048, 4, (List) obj2);
                                                                num3 = num5;
                                                                i25 = i25;
                                                                h0Var3 = h0Var4;
                                                            } else {
                                                                y2.u uVar5 = y2.r.E;
                                                                String str3 = "";
                                                                if (!i9.l.a(uVar2, uVar5)) {
                                                                    Integer num6 = num5;
                                                                    i25 = i25;
                                                                    h0Var3 = h0Var4;
                                                                    y2.u uVar6 = y2.r.F;
                                                                    if (i9.l.a(uVar2, uVar6)) {
                                                                        Object objG5 = h0Var6.g(uVar5);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        b3.h hVar = (b3.h) objG5;
                                                                        if (hVar != null && (str = hVar.f1353b) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j13 = ((b3.q0) jVar4.k(uVar6)).f1430a;
                                                                        num3 = num6;
                                                                        x(l(v(i25), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) (j13 & 4294967295L)), Integer.valueOf(str3.length()), J(str3)));
                                                                        B(i26);
                                                                    } else {
                                                                        i15 = i15;
                                                                        num3 = num6;
                                                                        if (i9.l.a(uVar2, uVar3) || i9.l.a(uVar2, y2.r.f15069u)) {
                                                                            r(h0Var7);
                                                                            int size2 = arrayList3.size();
                                                                            int i34 = 0;
                                                                            while (true) {
                                                                                if (i34 >= size2) {
                                                                                    l2Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((l2) arrayList3.get(i34)).f11322a == i25) {
                                                                                        l2Var2 = (l2) arrayList3.get(i34);
                                                                                        break;
                                                                                    }
                                                                                    i34++;
                                                                                }
                                                                            }
                                                                            i9.l.b(l2Var2);
                                                                            Object objG6 = h0Var6.g(uVar3);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            l2Var2.f11326e = (y2.h) objG6;
                                                                            Object objG7 = h0Var6.g(y2.r.f15069u);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            l2Var2.f11327f = (y2.h) objG7;
                                                                            if (l2Var2.f11323b.contains(l2Var2)) {
                                                                                this.f11169d.getSnapshotObserver().a(l2Var2, this.P, new k2.d(5, l2Var2, this));
                                                                            }
                                                                        } else if (i9.l.a(uVar2, y2.r.k)) {
                                                                            i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i16 = 8;
                                                                                x(j(v(i26), 8));
                                                                            } else {
                                                                                i16 = 8;
                                                                            }
                                                                            z(this, v(i26), 2048, num3, i16);
                                                                        } else {
                                                                            y2.u uVar7 = y2.i.f15007w;
                                                                            if (i9.l.a(uVar2, uVar7)) {
                                                                                List list3 = (List) jVar4.k(uVar7);
                                                                                Object objG8 = h0Var3.g(uVar7);
                                                                                if (objG8 == null) {
                                                                                    objG8 = null;
                                                                                }
                                                                                List list4 = (List) objG8;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(0).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(0).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    z10 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    z10 = true;
                                                                                }
                                                                            } else if (obj2 instanceof y2.a) {
                                                                                y2.a aVar = (y2.a) obj2;
                                                                                Object objG9 = h0Var3.g(uVar2);
                                                                                if (objG9 == null) {
                                                                                    objG9 = null;
                                                                                }
                                                                                if (aVar != objG9) {
                                                                                    if (objG9 instanceof y2.a) {
                                                                                        String str4 = aVar.f14969a;
                                                                                        y2.a aVar2 = (y2.a) objG9;
                                                                                        t8.e eVar2 = aVar2.f14970b;
                                                                                        z13 = i9.l.a(str4, aVar2.f14969a) && ((eVar = aVar.f14970b) != null || eVar2 == null) && (eVar == null || eVar2 != null);
                                                                                    }
                                                                                }
                                                                                if (z13) {
                                                                                    z10 = false;
                                                                                } else {
                                                                                    z10 = true;
                                                                                }
                                                                            } else {
                                                                                z10 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    c10 = '\b';
                                                                } else if (h0Var6.c(y2.i.f14995j)) {
                                                                    Object objG10 = h0Var4.g(uVar5);
                                                                    if (objG10 == null) {
                                                                        objG10 = null;
                                                                    }
                                                                    b3.h hVar2 = (b3.h) objG10;
                                                                    if (hVar2 == null) {
                                                                        hVar2 = "";
                                                                    }
                                                                    Object objG11 = h0Var6.g(uVar5);
                                                                    if (objG11 == null) {
                                                                        objG11 = null;
                                                                    }
                                                                    CharSequence charSequence = (b3.h) objG11;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceJ = J(charSequence);
                                                                    int length3 = hVar2.length();
                                                                    int length4 = charSequence.length();
                                                                    int i35 = length3 > length4 ? length4 : length3;
                                                                    Integer num7 = num5;
                                                                    int i36 = 0;
                                                                    while (true) {
                                                                        i17 = length3;
                                                                        if (i36 >= i35) {
                                                                            i18 = length4;
                                                                            break;
                                                                        }
                                                                        i18 = length4;
                                                                        if (hVar2.charAt(i36) != charSequence.charAt(i36)) {
                                                                            break;
                                                                        }
                                                                        i36++;
                                                                        length3 = i17;
                                                                        length4 = i18;
                                                                    }
                                                                    int i37 = 0;
                                                                    while (true) {
                                                                        if (i37 >= i35 - i36) {
                                                                            i19 = i37;
                                                                            break;
                                                                        }
                                                                        i19 = i37;
                                                                        if (hVar2.charAt((i17 - 1) - i37) != charSequence.charAt((i18 - 1) - i19)) {
                                                                            break;
                                                                        } else {
                                                                            i37 = i19 + 1;
                                                                        }
                                                                    }
                                                                    int i38 = (i17 - i19) - i36;
                                                                    int i39 = (i18 - i19) - i36;
                                                                    y2.u uVar8 = y2.r.J;
                                                                    boolean zC = h0Var4.c(uVar8);
                                                                    boolean zC2 = h0Var6.c(uVar8);
                                                                    boolean zC3 = h0Var4.c(y2.r.E);
                                                                    boolean z14 = zC3 && !zC && zC2;
                                                                    boolean z15 = zC3 && zC && !zC2;
                                                                    if (z14 || z15) {
                                                                        i25 = i25;
                                                                        num4 = num7;
                                                                        accessibilityEventL = l(v(i25), num4, num7, Integer.valueOf(i18), charSequenceJ);
                                                                    } else {
                                                                        accessibilityEventL = j(v(i25), 16);
                                                                        accessibilityEventL.setFromIndex(i36);
                                                                        accessibilityEventL.setRemovedCount(i38);
                                                                        accessibilityEventL.setAddedCount(i39);
                                                                        accessibilityEventL.setBeforeText(hVar2);
                                                                        accessibilityEventL.getText().add(charSequenceJ);
                                                                        i25 = i25;
                                                                        num4 = num7;
                                                                    }
                                                                    accessibilityEventL.setClassName("android.widget.EditText");
                                                                    x(accessibilityEventL);
                                                                    if (z14 || z15) {
                                                                        long j14 = ((b3.q0) jVar4.k(y2.r.F)).f1430a;
                                                                        accessibilityEventL.setFromIndex((int) (j14 >> 32));
                                                                        accessibilityEventL.setToIndex((int) (j14 & 4294967295L));
                                                                        x(accessibilityEventL);
                                                                    }
                                                                    i15 = i15;
                                                                    num3 = num4;
                                                                    h0Var3 = h0Var4;
                                                                } else {
                                                                    i25 = i25;
                                                                    c10 = '\b';
                                                                    z(this, v(i25), 2048, 2, 8);
                                                                    num3 = num5;
                                                                    h0Var3 = h0Var4;
                                                                }
                                                                c10 = '\b';
                                                            }
                                                            i15 = i15;
                                                            c10 = '\b';
                                                        }
                                                    }
                                                } else {
                                                    Object objG12 = h0Var4.g(uVar2);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (i9.l.a(obj2, objG12)) {
                                                        c10 = '\b';
                                                        num3 = num5;
                                                        h0Var3 = h0Var4;
                                                    } else {
                                                        uVar = y2.r.f15053d;
                                                        if (i9.l.a(uVar2, uVar)) {
                                                            i9.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            str2 = (String) obj2;
                                                            if (h0Var4.c(uVar)) {
                                                                A(str2, i25, 8);
                                                            }
                                                            c10 = '\b';
                                                            num3 = num5;
                                                            h0Var3 = h0Var4;
                                                        } else if (i9.l.a(uVar2, y2.r.f15051b)) {
                                                            i25 = i25;
                                                            arrayList4 = arrayList4;
                                                            i29 = i29;
                                                            h0Var7 = h0Var7;
                                                            num3 = num5;
                                                            h0Var3 = h0Var4;
                                                            i15 = i15;
                                                            c10 = '\b';
                                                            z(this, v(i25), 2048, 64, 8);
                                                            z(this, v(i25), 2048, num3, 8);
                                                        } else {
                                                            i25 = i25;
                                                            arrayList4 = arrayList4;
                                                            i29 = i29;
                                                            h0Var7 = h0Var7;
                                                            num3 = num5;
                                                            h0Var3 = h0Var4;
                                                            i15 = i15;
                                                            c10 = '\b';
                                                            z(this, v(i25), 2048, 64, 8);
                                                            z(this, v(i25), 2048, num3, 8);
                                                        }
                                                    }
                                                }
                                            } else {
                                                jVar2 = jVar3;
                                                arrayList4 = arrayList4;
                                                j5 = j12;
                                                i29 = i29;
                                                i30 = i30;
                                                h0Var7 = h0Var7;
                                                c10 = '\b';
                                                num3 = num5;
                                                i25 = i25;
                                                h0Var3 = h0Var4;
                                                i15 = length2;
                                            }
                                            i25 = i25;
                                            j12 = j5 >> c10;
                                            h0Var4 = h0Var3;
                                            h0Var7 = h0Var7;
                                            i29 = i29;
                                            jVar3 = jVar2;
                                            i30++;
                                            length2 = i15;
                                            num5 = num3;
                                            arrayList4 = arrayList4;
                                        }
                                        i13 = i25;
                                        jVar = jVar3;
                                        arrayList2 = arrayList4;
                                        h0Var2 = h0Var7;
                                        num2 = num5;
                                        i14 = length2;
                                        int i40 = i29;
                                        h0Var = h0Var4;
                                        if (i40 != 8) {
                                            break;
                                        }
                                    } else {
                                        i13 = i25;
                                        jVar = jVar3;
                                        h0Var = h0Var4;
                                        arrayList2 = arrayList4;
                                        h0Var2 = h0Var7;
                                        num2 = num5;
                                        i14 = length2;
                                    }
                                    if (i28 == i14) {
                                        break;
                                    }
                                    i25 = i13;
                                    h0Var4 = h0Var;
                                    h0Var7 = h0Var2;
                                    mVar2 = mVar;
                                    jVar3 = jVar;
                                    i27 = i28 + 1;
                                    length2 = i14;
                                    num5 = num2;
                                    arrayList4 = arrayList2;
                                }
                            } else {
                                jVar = jVar3;
                                arrayList2 = arrayList4;
                                i11 = i23;
                                mVar = mVar2;
                                num2 = num5;
                                i13 = i25;
                                z10 = false;
                            }
                            if (!z10) {
                                Iterator it = jVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z11 = false;
                                        break;
                                    } else {
                                        if (!mVar.k().f15011a.c((y2.u) ((Map.Entry) it.next()).getKey())) {
                                            z11 = true;
                                            break;
                                        }
                                    }
                                }
                                z10 = z11;
                            }
                            if (z10) {
                                i22 = 8;
                                z(this, v(i13), 2048, num2, 8);
                            } else {
                                i22 = 8;
                            }
                        }
                    } else {
                        i10 = i24;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i11 = i23;
                        i12 = i20;
                        num2 = num5;
                    }
                    j11 >>= i22;
                    i24 = i10 + 1;
                    kVar2 = kVar;
                    num5 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i20 = i12;
                    i23 = i11;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i41 = i20;
                num = num5;
                if (i23 != i22) {
                    return;
                } else {
                    i7 = i41;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                num = num5;
                i7 = i20;
            }
            if (i7 == i21) {
                return;
            }
            i20 = i7 + 1;
            kVar2 = kVar;
            length = i21;
            num5 = num;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
        }
    }

    public final void D(q2.h0 h0Var, s.x xVar) {
        y2.j jVarX;
        if (h0Var.I() && !this.f11169d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(h0Var)) {
            q2.h0 h0Var2 = null;
            if (!h0Var.E.d(8)) {
                h0Var = h0Var.v();
                while (true) {
                    if (h0Var == null) {
                        h0Var = null;
                        break;
                    } else if (h0Var.E.d(8)) {
                        break;
                    } else {
                        h0Var = h0Var.v();
                    }
                }
            }
            if (h0Var == null || (jVarX = h0Var.x()) == null) {
                return;
            }
            if (!jVarX.f15013c) {
                for (q2.h0 h0VarV = h0Var.v(); h0VarV != null; h0VarV = h0VarV.v()) {
                    y2.j jVarX2 = h0VarV.x();
                    if (jVarX2 != null && jVarX2.f15013c) {
                        h0Var2 = h0VarV;
                        break;
                    }
                }
                if (h0Var2 != null) {
                    h0Var = h0Var2;
                }
            }
            int i7 = h0Var.f10668b;
            if (xVar.a(i7)) {
                z(this, v(i7), 2048, 1, 8);
            }
        }
    }

    public final void E(q2.h0 h0Var) {
        if (h0Var.I() && !this.f11169d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(h0Var)) {
            int i7 = h0Var.f10668b;
            y2.h hVar = (y2.h) this.f11183s.b(i7);
            y2.h hVar2 = (y2.h) this.f11184t.b(i7);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i7, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
            if (hVar != null) {
                accessibilityEventJ.setScrollX((int) ((Number) hVar.f14984a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) hVar.f14985b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) hVar2.f14984a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) hVar2.f14985b.invoke()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(y2.m mVar, int i7, int i10, boolean z10) {
        String strP;
        y2.j jVar = mVar.f15020d;
        int i11 = mVar.f15023g;
        y2.u uVar = y2.i.f14994i;
        if (jVar.f15011a.c(uVar) && j0.a(mVar)) {
            h9.o oVar = (h9.o) ((y2.a) mVar.f15020d.k(uVar)).f14970b;
            if (oVar != null) {
                return ((Boolean) oVar.invoke(Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i7 != i10 || i10 != this.f11187w) && (strP = p(mVar)) != null) {
            if (i7 < 0 || i7 != i10 || i10 > strP.length()) {
                i7 = -1;
            }
            this.f11187w = i7;
            boolean z11 = strP.length() > 0;
            x(l(v(i11), z11 ? Integer.valueOf(this.f11187w) : null, z11 ? Integer.valueOf(this.f11187w) : null, z11 ? Integer.valueOf(strP.length()) : null, strP));
            B(i11);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void K() {
        long j5;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j12;
        char c11;
        int i7;
        m2 m2Var;
        s.x xVar = new s.x();
        s.x xVar2 = this.D;
        int[] iArr = xVar2.f12512b;
        long[] jArr3 = xVar2.f12511a;
        int length = jArr3.length - 2;
        s.w wVar = this.J;
        if (length >= 0) {
            int i10 = 0;
            j5 = 128;
            j10 = 255;
            while (true) {
                long j13 = jArr3[i10];
                j11 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j13 & 255) < 128) {
                            int i13 = iArr[(i10 << 3) + i12];
                            y2.n nVar = (y2.n) o().b(i13);
                            Object obj = null;
                            y2.m mVar = nVar != null ? nVar.f15024a : null;
                            if (mVar != null) {
                                if (!mVar.f15020d.f15011a.c(y2.r.f15053d)) {
                                    xVar.a(i13);
                                    m2Var = (m2) wVar.b(i13);
                                    if (m2Var != null) {
                                        Object objG = m2Var.f11334a.f15011a.g(y2.r.f15053d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    A(obj, i13, 32);
                                }
                            } else {
                                xVar.a(i13);
                                m2Var = (m2) wVar.b(i13);
                                if (m2Var != null) {
                                    Object objG2 = m2Var.f11334a.f15011a.g(y2.r.f15053d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                A(obj, i13, 32);
                            }
                        }
                        j13 >>= 8;
                    }
                    c10 = 7;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            j5 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
        }
        int[] iArr2 = xVar.f12512b;
        long[] jArr4 = xVar.f12511a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j14 = jArr4[i14];
                if ((((~j14) << c10) & j14 & j11) != j11) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j14 & j10) < j5) {
                            int i17 = iArr2[(i14 << 3) + i16];
                            int i18 = (-862048943) * i17;
                            int i19 = i18 ^ (i18 << 16);
                            int i20 = i19 & 127;
                            int i21 = xVar2.f12513c;
                            int i22 = (i19 >>> 7) & i21;
                            int i23 = 0;
                            c11 = '\b';
                            while (true) {
                                long[] jArr5 = xVar2.f12511a;
                                int i24 = i22 >> 3;
                                jArr2 = jArr4;
                                int i25 = (i22 & 7) << 3;
                                j12 = j14;
                                long j15 = (jArr5[i24] >>> i25) | ((jArr5[i24 + 1] << (64 - i25)) & ((-i25) >> 63));
                                int i26 = i21;
                                long j16 = (((long) i20) * 72340172838076673L) ^ j15;
                                long j17 = (j16 - 72340172838076673L) & (~j16) & j11;
                                while (j17 != 0) {
                                    int iNumberOfTrailingZeros = (i22 + (Long.numberOfTrailingZeros(j17) >> 3)) & i26;
                                    int i27 = i26;
                                    if (xVar2.f12512b[iNumberOfTrailingZeros] == i17) {
                                        i7 = iNumberOfTrailingZeros;
                                        break;
                                    } else {
                                        j17 &= j17 - 1;
                                        i26 = i27;
                                    }
                                }
                                int i28 = i26;
                                if ((j15 & ((~j15) << 6) & j11) != 0) {
                                    i7 = -1;
                                    break;
                                }
                                i23 += 8;
                                i22 = (i22 + i23) & i28;
                                jArr4 = jArr2;
                                i21 = i28;
                                j14 = j12;
                            }
                            if (i7 >= 0) {
                                xVar2.f(i7);
                            }
                        } else {
                            jArr2 = jArr4;
                            j12 = j14;
                            c11 = '\b';
                        }
                        j14 = j12 >> c11;
                        i16++;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                jArr4 = jArr;
            }
        }
        wVar.c();
        s.k kVarO = o();
        int[] iArr3 = kVarO.f12462b;
        Object[] objArr = kVarO.f12463c;
        long[] jArr6 = kVarO.f12461a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i29 = 0;
            while (true) {
                long j18 = jArr6[i29];
                if ((((~j18) << c10) & j18 & j11) != j11) {
                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i31 = 0; i31 < i30; i31++) {
                        if ((j18 & j10) < j5) {
                            int i32 = (i29 << 3) + i31;
                            int i33 = iArr3[i32];
                            y2.m mVar2 = ((y2.n) objArr[i32]).f15024a;
                            y2.j jVar = mVar2.f15020d;
                            y2.u uVar = y2.r.f15053d;
                            if (jVar.f15011a.c(uVar) && xVar2.a(i33)) {
                                A((String) mVar2.f15020d.k(uVar), i33, 16);
                            }
                            wVar.h(i33, new m2(mVar2, o()));
                        }
                        j18 >>= 8;
                    }
                    if (i30 != 8) {
                        break;
                    }
                }
                if (i29 == length3) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        this.K = new m2(this.f11169d.getSemanticsOwner().a(), o());
    }

    @Override // e4.b
    public final a2.d a(View view) {
        return this.f11177m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i7, f4.f fVar, String str, Bundle bundle) {
        y2.m mVar;
        Region regionI;
        float[] fArrH;
        Rect rectG;
        x1.c cVar;
        RectF rectF;
        x1.c cVarE;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f5287a;
        y2.n nVar = (y2.n) o().b(i7);
        if (nVar == null || (mVar = nVar.f15024a) == null) {
            return;
        }
        y2.j jVar = mVar.f15020d;
        s.h0 h0Var = jVar.f15011a;
        String strP = p(mVar);
        if (i9.l.a(str, this.G)) {
            int iD = this.E.d(i7);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (i9.l.a(str, this.H)) {
            int iD2 = this.F.d(i7);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        q2.h1 h1Var = null;
        if (h0Var.c(y2.i.f14986a) && bundle != null && i9.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i11 > 0 && i10 >= 0) {
                if (i10 < (strP != null ? strP.length() : Integer.MAX_VALUE)) {
                    b3.o0 o0VarO = j0.o(jVar);
                    if (o0VarO == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i12 < i11) {
                        int i13 = i10 + i12;
                        if (i13 >= o0VarO.f1408a.f1393a.f1353b.length()) {
                            arrayList.add(h1Var);
                            accessibilityNodeInfo = accessibilityNodeInfo;
                            i11 = i11;
                        } else {
                            x1.c cVarB = o0VarO.b(i13);
                            q2.h1 h1VarD = mVar.d();
                            long jE = 0;
                            if (h1VarD != null) {
                                if (!h1VarD.G0().f11129n) {
                                    h1VarD = h1Var;
                                }
                                if (h1VarD != null) {
                                    jE = h1VarD.E(0L);
                                }
                            }
                            x1.c cVarI = cVarB.i(jE);
                            x1.c cVarG = mVar.g();
                            if (cVarI.g(cVarG)) {
                                cVarE = cVarI.e(cVarG);
                            } else {
                                cVar = h1Var;
                            }
                            if (cVar != 0) {
                                cVar = cVarE;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar.f14524b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVar.f14523a)) << 32);
                                u uVar = this.f11169d;
                                long jX = uVar.x(jFloatToRawIntBits);
                                long jX2 = uVar.x((((long) Float.floatToRawIntBits(cVar.f14525c)) << 32) | (((long) Float.floatToRawIntBits(cVar.f14526d)) & 4294967295L));
                                int i14 = (int) (jX >> 32);
                                int i15 = (int) (jX2 >> 32);
                                int i16 = (int) (jX & 4294967295L);
                                int i17 = (int) (jX2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)));
                            } else {
                                cVar = cVarE;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i12++;
                        i11 = i11;
                        accessibilityNodeInfo = accessibilityNodeInfo;
                        h1Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        y2.u uVar2 = y2.r.f15073y;
        if (h0Var.c(uVar2) && bundle != null && i9.l.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = h0Var.g(uVar2);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (i9.l.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, mVar.f15023g);
            return;
        }
        if (i9.l.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = h0Var.g(y2.r.O);
            y1.l0 l0Var = (y1.l0) (objG2 == null ? null : objG2);
            if (l0Var != null) {
                y1.h0 h0VarK = k(l0Var, mVar);
                if (h0VarK instanceof y1.c0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(h0VarK));
                    return;
                } else if (h0VarK instanceof y1.d0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(h0VarK));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(h0VarK));
                    return;
                } else {
                    if (!(h0VarK instanceof y1.b0)) {
                        throw new cc.s();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(h0VarK));
                    return;
                }
            }
            return;
        }
        if (i9.l.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = h0Var.g(y2.r.O);
            y1.l0 l0Var2 = (y1.l0) (objG3 == null ? null : objG3);
            if (l0Var2 == null || (rectG = G(k(l0Var2, mVar))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
            return;
        }
        if (i9.l.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = h0Var.g(y2.r.O);
            y1.l0 l0Var3 = (y1.l0) (objG4 == null ? null : objG4);
            if (l0Var3 == null || (fArrH = H(k(l0Var3, mVar))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrH);
            return;
        }
        if (i9.l.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = h0Var.g(y2.r.O);
            y1.l0 l0Var4 = (y1.l0) (objG5 == null ? null : objG5);
            if (l0Var4 == null || (regionI = I(k(l0Var4, mVar))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionI);
        }
    }

    public final Rect f(y2.n nVar) {
        n3.k kVar = nVar.f15025b;
        float f10 = kVar.f8741a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(kVar.f8742b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        u uVar = this.f11169d;
        long jX = uVar.x(jFloatToRawIntBits);
        long jX2 = uVar.x((((long) Float.floatToRawIntBits(kVar.f8743c)) << 32) | (((long) Float.floatToRawIntBits(kVar.f8744d)) & 4294967295L));
        int i7 = (int) (jX >> 32);
        int i10 = (int) (jX2 >> 32);
        int i11 = (int) (jX & 4294967295L);
        int i12 = (int) (jX2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10))), (int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0037, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:39:0x00b8, B:41:0x00bc, B:43:0x00cb, B:47:0x00d8), top: B:55:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (cc.b0.h(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(a9.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.b0.g(a9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    public final boolean h(long j5, int i7, boolean z10) {
        y2.u uVar;
        char c10;
        if (!i9.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        s.k kVarO = o();
        if (x1.b.b(j5, 9205357640488583168L) || (((9223372034707292159L & j5) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            uVar = y2.r.f15069u;
        } else {
            if (z10) {
                throw new cc.s();
            }
            uVar = y2.r.f15068t;
        }
        Object[] objArr = kVarO.f12463c;
        long[] jArr = kVarO.f12461a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        y2.n nVar = (y2.n) objArr[(i10 << 3) + i12];
                        n3.k kVar = nVar.f15025b;
                        float f10 = kVar.f8741a;
                        c10 = '\b';
                        float f11 = kVar.f8742b;
                        float f12 = kVar.f8743c;
                        float f13 = kVar.f8744d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                        if ((fIntBitsToFloat2 < f13) & (fIntBitsToFloat >= f10) & (fIntBitsToFloat < f12) & (fIntBitsToFloat2 >= f11)) {
                            Object objG = nVar.f15024a.f15020d.f15011a.g(uVar);
                            if (objG == null) {
                                objG = null;
                            }
                            y2.h hVar = (y2.h) objG;
                            if (hVar != null) {
                                h9.a aVar = hVar.f14984a;
                                if (i7 < 0) {
                                    if (((Number) aVar.invoke()).floatValue() > 0.0f) {
                                        z11 = true;
                                    }
                                } else if (((Number) aVar.invoke()).floatValue() < ((Number) hVar.f14985b.invoke()).floatValue()) {
                                    z11 = true;
                                }
                            }
                        }
                    } else {
                        c10 = '\b';
                    }
                    j10 >>= c10;
                }
                if (i11 != 8) {
                    return z11;
                }
            }
            if (i10 == length) {
                return z11;
            }
            i10++;
        }
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.f11169d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(o());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent j(int i7, int i10) {
        y2.n nVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        u uVar = this.f11169d;
        accessibilityEventObtain.setPackageName(uVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(uVar, i7);
        if (q() && (nVar = (y2.n) o().b(i7)) != null) {
            y2.m mVar = nVar.f15024a;
            accessibilityEventObtain.setPassword(mVar.f15020d.f15011a.c(y2.r.J));
            Object objG = mVar.f15020d.f15011a.g(y2.r.f15062n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = i9.l.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                c.a.j(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    public final y1.h0 k(y1.l0 l0Var, y2.m mVar) {
        q2.h1 h1VarD = mVar.d();
        return l0Var.a(n3.n.M0(h1VarD != null ? h1VarD.f9437c : 0L), mVar.f15019c.f10690y, this.f11169d.getDensity());
    }

    public final AccessibilityEvent l(int i7, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i7, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int m(y2.m mVar) {
        y2.j jVar = mVar.f15020d;
        y2.j jVar2 = mVar.f15020d;
        y2.u uVar = y2.r.f15050a;
        if (!jVar.f15011a.c(y2.r.f15050a)) {
            y2.u uVar2 = y2.r.F;
            if (jVar2.f15011a.c(uVar2)) {
                return (int) (((b3.q0) jVar2.k(uVar2)).f1430a & 4294967295L);
            }
        }
        return this.f11187w;
    }

    public final int n(y2.m mVar) {
        y2.j jVar = mVar.f15020d;
        y2.j jVar2 = mVar.f15020d;
        y2.u uVar = y2.r.f15050a;
        if (!jVar.f15011a.c(y2.r.f15050a)) {
            y2.u uVar2 = y2.r.F;
            if (jVar2.f15011a.c(uVar2)) {
                return (int) (((b3.q0) jVar2.k(uVar2)).f1430a >> 32);
            }
        }
        return this.f11187w;
    }

    public final s.k o() {
        if (this.A) {
            this.A = false;
            u uVar = this.f11169d;
            this.C = y2.p.b(uVar.getSemanticsOwner());
            if (q()) {
                s.w wVar = this.C;
                Resources resources = uVar.getContext().getResources();
                s.u uVar2 = this.E;
                uVar2.a();
                s.u uVar3 = this.F;
                uVar3.a();
                y2.n nVar = (y2.n) wVar.b(-1);
                y2.m mVar = nVar != null ? nVar.f15024a : null;
                i9.l.b(mVar);
                ArrayList arrayListB = y2.v.b(mVar, new b2.a(6, wVar), new b2.a(7, resources), n3.l.I(mVar));
                int iA = n3.l.A(arrayListB);
                int i7 = 1;
                if (1 <= iA) {
                    while (true) {
                        int i10 = ((y2.m) arrayListB.get(i7 - 1)).f15023g;
                        int i11 = ((y2.m) arrayListB.get(i7)).f15023g;
                        uVar2.f(i10, i11);
                        uVar3.f(i11, i10);
                        if (i7 == iA) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean q() {
        return this.f11172g.isEnabled() && !this.k.isEmpty();
    }

    public final void r(q2.h0 h0Var) {
        if (this.f11189y.add(h0Var)) {
            this.f11190z.x(t8.z.f12851a);
        }
    }

    public final int v(int i7) {
        if (i7 == this.f11169d.getSemanticsOwner().a().f15023g) {
            return -1;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void w(y2.m mVar, m2 m2Var) {
        int[] iArr = s.m.f12470a;
        s.x xVar = new s.x();
        List listJ = y2.m.j(4, mVar);
        q2.h0 h0Var = mVar.f15019c;
        int size = listJ.size();
        for (int i7 = 0; i7 < size; i7++) {
            y2.m mVar2 = (y2.m) listJ.get(i7);
            s.k kVarO = o();
            int i10 = mVar2.f15023g;
            if (kVarO.a(i10)) {
                if (!m2Var.f11335b.b(i10)) {
                    r(h0Var);
                    return;
                }
                xVar.a(i10);
            }
        }
        s.x xVar2 = m2Var.f11335b;
        int[] iArr2 = xVar2.f12512b;
        long[] jArr = xVar2.f12511a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j5 = jArr[i11];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j5) < 128 && !xVar.b(iArr2[(i11 << 3) + i13])) {
                            r(h0Var);
                            return;
                        }
                        j5 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        List listJ2 = y2.m.j(4, mVar);
        int size2 = listJ2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            y2.m mVar3 = (y2.m) listJ2.get(i14);
            m2 m2Var2 = (m2) this.J.b(mVar3.f15023g);
            if (m2Var2 != null && o().a(mVar3.f15023g)) {
                w(mVar3, m2Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f11182r = true;
        }
        try {
            return ((Boolean) this.f11171f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f11182r = false;
        }
    }

    public final boolean y(int i7, int i10, Integer num, List list) {
        if (i7 == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i7, i10);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(p3.a.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
