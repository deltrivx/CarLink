package i2;

import a8.x1;
import aa.s0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b3.q0;
import c1.u2;
import c1.y;
import c1.y2;
import c1.z2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.muyetuge.carlifevehicle.application.MainApplication;
import e2.f;
import e2.i0;
import e2.o;
import e2.v;
import f1.b0;
import f1.b1;
import f1.l2;
import f1.q1;
import f1.w1;
import f1.x2;
import g0.g;
import ga.h0;
import i9.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.g0;
import l0.t0;
import m7.j;
import n3.n;
import n3.r;
import n3.u;
import nb.a0;
import nb.f0;
import nb.l0;
import nb.n0;
import nb.p0;
import nb.r0;
import nb.s;
import nb.u0;
import nb.w;
import nb.w0;
import nb.x0;
import o2.m0;
import o9.e0;
import ob.h;
import r1.m;
import r1.p;
import r2.j1;
import t8.z;
import u8.q;
import u9.i;
import x9.j0;
import x9.k;
import x9.k0;
import x9.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f6601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f6602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f6603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f6604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f6605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f6606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f6607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f6608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f6609i;

    public static Context A() {
        MainApplication mainApplication = MainApplication.f2914a;
        if (mainApplication == null) {
            l.j("instance");
            throw null;
        }
        Context applicationContext = mainApplication.getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static j B() {
        return (j) j.f8591o.getValue();
    }

    public static final Rect C(int i7, int i10, TextPaint textPaint, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i7 - 1, i10, MetricAffectingSpan.class) != i10) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i7 < i10) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i7, i10, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i7, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    i9.b bVarH = l.h(metricAffectingSpanArr);
                    while (bVarH.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) bVarH.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i7, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i7, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i7 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i7, i10, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i7, i10, rect3);
        return rect3;
    }

    public static final wa.b D(ta.f fVar, int i7) {
        l.e(fVar, "<this>");
        return u.z(fVar.I(i7), fVar.p0(i7));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String E(t tVar) {
        wa.e eVar;
        x9.c cVarH = i.A(tVar) ? H(tVar) : null;
        if (cVarH != null) {
            x9.c cVarK = db.e.k(cVarH);
            if (cVarK instanceof k0) {
                i.A(cVarK);
                x9.c cVarB = db.e.b(db.e.k(cVarK), ga.d.f6055d);
                if (cVarB != null && (eVar = (wa.e) ga.f.f6071a.get(db.e.g(cVarB))) != null) {
                    return eVar.b();
                }
            } else if (cVarK instanceof s0) {
                int i7 = ga.c.f6047l;
                LinkedHashMap linkedHashMap = h0.f6090i;
                String strZ = n.Z((s0) cVarK);
                wa.e eVar2 = strZ == null ? null : (wa.e) linkedHashMap.get(strZ);
                if (eVar2 != null) {
                    return eVar2.b();
                }
            }
        }
        return null;
    }

    public static final long F(KeyEvent keyEvent) {
        return k(keyEvent.getKeyCode());
    }

    public static final wa.e G(ta.f fVar, int i7) {
        l.e(fVar, "<this>");
        return wa.e.d(fVar.getString(i7));
    }

    public static final x9.c H(x9.c cVar) {
        l.e(cVar, "<this>");
        if (!h0.f6091j.contains(cVar.getName()) && !ga.f.f6074d.contains(db.e.k(cVar).getName())) {
            return null;
        }
        if ((cVar instanceof k0) || (cVar instanceof j0)) {
            return db.e.b(cVar, ga.d.f6057f);
        }
        if (cVar instanceof s0) {
            return db.e.b(cVar, ga.d.f6058g);
        }
        return null;
    }

    public static final x9.c I(x9.c cVar) {
        l.e(cVar, "<this>");
        x9.c cVarH = H(cVar);
        if (cVarH != null) {
            return cVarH;
        }
        int i7 = ga.e.f6066l;
        wa.e name = cVar.getName();
        l.d(name, "getName(...)");
        if (ga.e.b(name)) {
            return db.e.b(cVar, ga.d.f6059h);
        }
        return null;
    }

    public static final int J(int i7, int i10, int i11) {
        if (i11 > 0) {
            if (i7 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i7 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i10) {
                int i15 = -i11;
                int i16 = i7 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        }
        return i10;
    }

    public static final int K(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean L(x9.e eVar, x9.c cVar) {
        l.e(eVar, "<this>");
        l.e(cVar, "specialCallableDescriptor");
        k kVarL = cVar.l();
        l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        a0 a0VarN = ((x9.e) kVarL).n();
        l.d(a0VarN, "getDefaultType(...)");
        for (x9.e eVarJ = za.d.j(eVar); eVarJ != null; eVarJ = za.d.j(eVarJ)) {
            if (!(eVarJ instanceof ia.c)) {
                a0 a0VarN2 = eVarJ.n();
                if (a0VarN2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                w0 w0VarG = null;
                arrayDeque.add(new ob.n(a0VarN2, null));
                nb.k0 k0VarD0 = a0VarN.D0();
                while (!arrayDeque.isEmpty()) {
                    ob.n nVar = (ob.n) arrayDeque.poll();
                    w wVarG = nVar.f9658a;
                    nb.k0 k0VarD1 = wVarG.D0();
                    if (k0VarD1 == null) {
                        h.a(3);
                        throw null;
                    }
                    if (k0VarD0 == null) {
                        h.a(4);
                        throw null;
                    }
                    if (k0VarD1.equals(k0VarD0)) {
                        boolean zE0 = wVarG.E0();
                        for (ob.n nVar2 = nVar.f9659b; nVar2 != null; nVar2 = nVar2.f9659b) {
                            w wVar = nVar2.f9658a;
                            List listB0 = wVar.B0();
                            x0 x0Var = x0.INVARIANT;
                            nb.d dVar = l0.f9017b;
                            if (listB0 != null && listB0.isEmpty()) {
                                wVarG = new r0(dVar.g(wVar.D0(), wVar.B0())).g(wVarG, x0Var);
                                break;
                            }
                            Iterator it = listB0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    wVarG = new r0(dVar.g(wVar.D0(), wVar.B0())).g(wVarG, x0Var);
                                    break;
                                }
                                if (((n0) it.next()).a() != x0Var) {
                                    wVarG = (w) u.j(new r0(T(dVar.g(wVar.D0(), wVar.B0()))).g(wVarG, x0Var)).f12713b;
                                    break;
                                }
                            }
                            zE0 = zE0 || wVar.E0();
                        }
                        nb.k0 k0VarD2 = wVarG.D0();
                        if (k0VarD2 == null) {
                            h.a(3);
                            throw null;
                        }
                        if (k0VarD2.equals(k0VarD0)) {
                            w0VarG = u0.g(wVarG, zE0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + h.n(k0VarD2) + ", \n\nsupertype: " + h.n(k0VarD0) + " \n" + k0VarD2.equals(k0VarD0));
                    }
                    for (w wVar2 : k0VarD1.m()) {
                        l.b(wVar2);
                        arrayDeque.add(new ob.n(wVar2, nVar));
                    }
                }
                if (w0VarG != null) {
                    return !i.A(eVarJ);
                }
            }
        }
        return false;
    }

    public static int M(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        if (i7 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a2.f.E(i7, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final boolean N(k0 k0Var) {
        l.e(k0Var, "<this>");
        return k0Var.b() == null;
    }

    public static boolean O(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean P(m7.a aVar, int i7) {
        if (i7 != 4) {
            return i7 != 5 ? aVar.b().f8598g : aVar.b().f8600i;
        }
        return aVar.b().f8599h;
    }

    public static final void Q(l2 l2Var, f1.c cVar, int i7) {
        while (true) {
            int i10 = l2Var.f5038v;
            if (i7 > i10 && i7 < l2Var.f5037u) {
                return;
            }
            if (i10 == 0 && i7 == 0) {
                return;
            }
            l2Var.L();
            if (l2Var.x(l2Var.f5038v)) {
                cVar.k();
            }
            l2Var.j();
        }
    }

    public static final String R(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT];
        int i7 = bufferedReader.read(cArr);
        while (i7 >= 0) {
            stringWriter.write(cArr, 0, i7);
            i7 = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        l.d(string, "toString(...)");
        return string;
    }

    public static final ExtractedText S(g3.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f5889a.f1353b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j5 = wVar.f5890b;
        extractedText.selectionStart = q0.f(j5);
        extractedText.selectionEnd = q0.e(j5);
        extractedText.flags = !zb.j.s0(wVar.f5889a.f1353b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static p0 T(p0 p0Var) {
        if (!(p0Var instanceof s)) {
            return new ab.d(p0Var, 0);
        }
        s sVar = (s) p0Var;
        x9.r0[] r0VarArr = sVar.f9030b;
        ArrayList<t8.j> arrayListN0 = u8.l.N0(sVar.f9031c, r0VarArr);
        ArrayList arrayList = new ArrayList(q.a0(arrayListN0, 10));
        for (t8.j jVar : arrayListN0) {
            arrayList.add(v((n0) jVar.f12830a, (x9.r0) jVar.f12831b));
        }
        return new s(r0VarArr, (n0[]) arrayList.toArray(new n0[0]), true);
    }

    public static final void a(final p pVar, final m5.l lVar, float f10, float f11, long j5, float f12, long j10, float f13, f7.q qVar, long j11, long j12, float f14, f1.s sVar, final int i7) {
        int i10;
        final float f15;
        long j13;
        long j14;
        float f16;
        float f17;
        f7.q qVar2;
        int i11;
        float f18;
        long j15;
        long j16;
        final f7.q qVar3;
        final float f19;
        final long j17;
        final long j18;
        final float f20;
        final long j19;
        final float f21;
        final long j20;
        final float f22;
        final float f23;
        l.e(lVar, "controller");
        sVar.Y(1811431584);
        if ((i7 & 14) == 0) {
            i10 = i7 | (sVar.f(pVar) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 112) == 0) {
            i10 |= sVar.f(lVar) ? 32 : 16;
        }
        int i12 = i10 | 383348096;
        if ((1533916891 & i12) == 306783378 && sVar.z()) {
            sVar.Q();
            f23 = f10;
            f22 = f11;
            j20 = j5;
            f21 = f12;
            j19 = j10;
            f20 = f13;
            qVar3 = qVar;
            j17 = j11;
            j18 = j12;
            f19 = f14;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                f15 = 6;
                j13 = y1.q.f14950d;
                j14 = y1.q.f14951e;
                f7.q qVarH = y1.h0.h();
                qVarH.k(j14);
                f16 = 1.0f;
                qVarH.i(1.0f);
                f11 = 5;
                f17 = 12;
                qVar2 = qVarH;
                i11 = i12 & (-1879048193);
                f18 = 12;
                j15 = m5.q.f8517a;
                j16 = m5.q.f8518b;
            } else {
                sVar.Q();
                f15 = f10;
                j13 = j5;
                f17 = f12;
                j14 = j10;
                f16 = f13;
                qVar2 = qVar;
                j15 = j11;
                f18 = f14;
                i11 = i12 & (-1879048193);
                j16 = j12;
            }
            sVar.q();
            final f7.q qVarL = e0.l(((n3.c) sVar.j(j1.f11276h)).R(f18), j15, j16);
            long j21 = j16;
            sVar.X(1502936351);
            int i13 = i11 & 112;
            boolean z10 = i13 == 32;
            Object objK = sVar.K();
            if (z10 || objK == f1.n.f5051a) {
                objK = new m5.a(lVar, 0);
                sVar.h0(objK);
            }
            sVar.p(false);
            f1.b.h((h9.a) objK, sVar);
            float f24 = f18;
            h9.n nVar = new h9.n() { // from class: m5.b
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    y1.o oVar = (y1.o) obj;
                    i9.l.e(oVar, "$this$Slider");
                    j.b(oVar, ((n3.m) obj2).f8746a, f15, qVarL);
                    return z.f12851a;
                }
            };
            float f25 = f15;
            long j22 = j13;
            long j23 = j14;
            float f26 = f16;
            float f27 = f11;
            float f28 = f17;
            g5.a.d(pVar, lVar, f25, f27, j22, f28, j23, f26, qVar2, nVar, new t0(11), m5.d.f8453i, m5.e.f8454b, new t0(12), sVar, (i11 & 14) | 1074003968 | i13 | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024), 221574, 0);
            qVar3 = qVar2;
            f19 = f24;
            j17 = j15;
            j18 = j21;
            f20 = f26;
            j19 = j23;
            f21 = f28;
            j20 = j22;
            f22 = f27;
            f23 = f25;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: m5.c
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l lVar2 = lVar;
                    i9.l.e(lVar2, "$controller");
                    int iY = f1.b.y(i7 | 1);
                    i2.c.a(pVar, lVar2, f23, f22, j20, f21, j19, f20, qVar3, j17, j18, f19, (f1.s) obj, iY);
                    return z.f12851a;
                }
            };
        }
    }

    public static final void b(int i7, f1.s sVar) {
        f1.s sVar2;
        sVar.Y(1308662879);
        if (i7 == 0 && sVar.z()) {
            sVar.Q();
            sVar2 = sVar;
        } else {
            f fVarB = n4.h.f8782b;
            if (fVarB == null) {
                e2.e eVar = new e2.e("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = i0.f4202a;
                y1.n0 n0Var = new y1.n0(y1.q.f14948b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new o(7.41f, 15.41f));
                arrayList.add(new e2.n(12.0f, 10.83f));
                arrayList.add(new v(4.59f, 4.58f));
                arrayList.add(new e2.n(18.0f, 14.0f));
                arrayList.add(new v(-6.0f, -6.0f));
                arrayList.add(new v(-6.0f, 6.0f));
                arrayList.add(e2.k.f4210c);
                e2.e.a(eVar, arrayList, n0Var);
                fVarB = eVar.b();
                n4.h.f8782b = fVarB;
            }
            f fVar = fVarB;
            sVar2 = sVar;
            c1.k0.b(fVar, null, n3.l.P(androidx.compose.foundation.layout.c.h(m.f11116a, g5.a.n(24, sVar)), 90.0f), ((c1.w) sVar.j(y.f2319a)).A, sVar2, 48, 0);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new g(i7, 9);
        }
    }

    public static ec.h c(int i7, int i10, ec.a aVar) {
        if ((i10 & 1) != 0) {
            i7 = 0;
        }
        int i11 = i10 & 2;
        ec.a aVar2 = ec.a.f4685a;
        if (i11 != 0) {
            aVar = aVar2;
        }
        if (i7 == -2) {
            if (aVar != aVar2) {
                return new ec.s(1, aVar);
            }
            ec.l.a0.getClass();
            return new ec.h(ec.k.f4730b);
        }
        if (i7 == -1) {
            if (aVar == aVar2) {
                return new ec.s(1, ec.a.f4686b);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == 0) {
            return aVar == aVar2 ? new ec.h(0) : new ec.s(1, aVar);
        }
        if (i7 != Integer.MAX_VALUE) {
            return aVar == aVar2 ? new ec.h(i7) : new ec.s(i7, aVar);
        }
        return new ec.h(Integer.MAX_VALUE);
    }

    public static final void d(String str, f1.s sVar, int i7) {
        l.e(str, "color");
        sVar.Y(397173385);
        if ((((sVar.f(str) ? 4 : 2) | i7) & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            p pVarO = n4.h.o(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.k(m.f11116a, 50), 30), k0.e.a(6));
            m0 m0VarD = d0.m.d(r1.c.f11092a, false);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            p pVarC = r1.a.c(sVar, pVarO);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            FillElement fillElement = androidx.compose.foundation.layout.c.f822c;
            sVar.W(1849434622);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new t0(8);
                sVar.h0(objK);
            }
            sVar.p(false);
            u.a(54, sVar, (h9.k) objK, fillElement);
            d0.m.a(androidx.compose.foundation.a.b(fillElement, y1.h0.c(Color.parseColor(str)), y1.h0.f14898a), sVar, 0);
            sVar.p(true);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.f(str, i7, 0);
        }
    }

    public static final void e(m5.l lVar, h9.k kVar, f1.s sVar, int i7) {
        m5.l lVar2 = lVar;
        f1.s sVar2 = sVar;
        l.e(lVar2, "controller");
        sVar2.Y(-419951776);
        int i10 = i7 | (sVar2.f(lVar2) ? 4 : 2);
        if ((i10 & 19) == 18 && sVar2.z()) {
            sVar2.Q();
        } else {
            r1.g gVar = r1.c.k;
            FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
            p pVarJ = androidx.compose.foundation.layout.a.j(fillElement, 0.0f, g5.a.n(14, sVar2), 1);
            d0.n0 n0VarA = d0.l0.a(d0.h.f3566a, gVar, sVar2, 48);
            long j5 = sVar2.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar2.l();
            p pVarC = r1.a.c(sVar2, pVarJ);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            q2.h hVar = q2.i.f10708e;
            f1.b.w(sVar2, hVar, n0VarA);
            q2.h hVar2 = q2.i.f10707d;
            f1.b.w(sVar2, hVar2, q1VarL);
            q2.h hVar3 = q2.i.f10709f;
            if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar2, i11, hVar3);
            }
            q2.h hVar4 = q2.i.f10706c;
            f1.b.w(sVar2, hVar4, pVarC);
            p pVarC2 = androidx.compose.foundation.layout.a.c(a2.f.Q(), 1.0f);
            sVar2.W(5004770);
            Object objK = sVar2.K();
            if (objK == f1.n.f5051a) {
                objK = new a8.j0(kVar, 8);
                sVar2.h0(objK);
            }
            sVar2.p(false);
            int i12 = (i10 << 3) & 112;
            e0.a(pVarC2, lVar2, false, (h9.k) objK, sVar2, i12);
            p pVarK = androidx.compose.foundation.layout.a.k(a2.f.Q(), g5.a.n(16, sVar2), 0.0f, 0.0f, 0.0f, 14);
            d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar2, 0);
            long j10 = sVar2.T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL2 = sVar2.l();
            p pVarC3 = r1.a.c(sVar2, pVarK);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar, sVarA);
            f1.b.w(sVar2, hVar2, q1VarL2);
            if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i13))) {
                ob.a.w(i13, sVar2, i13, hVar3);
            }
            f1.b.w(sVar2, hVar4, pVarC3);
            int i14 = i12 | 6;
            a(androidx.compose.foundation.layout.a.c(fillElement, 3.2f), lVar, 0.0f, 0.0f, 0L, 0.0f, 0L, 0.0f, null, 0L, 0L, 0.0f, sVar, i14);
            float fN = g5.a.n(16, sVar);
            m mVar = m.f11116a;
            d0.c.a(sVar, androidx.compose.foundation.layout.c.b(mVar, fN));
            a.a.d(androidx.compose.foundation.layout.a.c(fillElement, 3.2f), lVar, 0.0f, 0.0f, 0L, 0.0f, 0L, 0.0f, null, sVar, i14);
            d0.c.a(sVar, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(16, sVar)));
            lVar2 = lVar;
            k9.a.a(n4.h.o(androidx.compose.foundation.layout.a.c(fillElement, 3.2f), k0.e.a(6)), lVar2, 0L, 0L, 0L, 0.0f, sVar, i12);
            sVar2 = sVar;
            sVar2.p(true);
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 12, lVar2, kVar);
        }
    }

    public static final void f(final p pVar, final m5.l lVar, final boolean z10, final h9.k kVar, final h9.k kVar2, final h9.k kVar3, final h9.n nVar, f1.s sVar, final int i7) {
        int i10;
        l.e(pVar, "modifier");
        l.e(lVar, "controller");
        l.e(kVar3, "setup");
        l.e(nVar, "draw");
        sVar.Y(-1444864183);
        if ((i7 & 14) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 112) == 0) {
            i10 |= sVar.f(lVar) ? 32 : 16;
        }
        if ((i7 & 7168) == 0) {
            i10 |= sVar.h(null) ? 2048 : 1024;
        }
        if ((i7 & 57344) == 0) {
            i10 |= sVar.g(z10) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((i7 & 458752) == 0) {
            i10 |= sVar.h(kVar) ? 131072 : 65536;
        }
        if ((i7 & 3670016) == 0) {
            i10 |= sVar.h(kVar2) ? 1048576 : 524288;
        }
        if ((i7 & 29360128) == 0) {
            i10 |= sVar.h(kVar3) ? 8388608 : 4194304;
        }
        if ((i7 & 234881024) == 0) {
            i10 |= sVar.h(nVar) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        sVar.S();
        if ((i7 & 1) != 0 && !sVar.x()) {
            sVar.Q();
        }
        sVar.q();
        sVar.X(-1602609214);
        Object objK = sVar.K();
        f1.w0 w0Var = f1.n.f5051a;
        if (objK == w0Var) {
            objK = f1.b.s(Boolean.FALSE);
            sVar.h0(objK);
        }
        b1 b1Var = (b1) objK;
        sVar.p(false);
        Long l10 = (Long) lVar.k.getValue();
        sVar.X(-1602604173);
        int i11 = i10 & 112;
        boolean zF = (i11 == 32) | sVar.f(l10) | ((i10 & 458752) == 131072);
        Object objK2 = sVar.K();
        if (zF || objK2 == w0Var) {
            objK2 = new a8.u0(lVar, l10, kVar, 4);
            sVar.h0(objK2);
        }
        sVar.p(false);
        f1.b.d(lVar, l10, (h9.k) objK2, sVar);
        p pVarE = androidx.compose.ui.layout.a.e(pVar, new a8.z(kVar2, lVar, kVar3, b1Var));
        sVar.X(-1602584849);
        boolean z11 = i11 == 32;
        Object objK3 = sVar.K();
        if (z11 || objK3 == w0Var) {
            objK3 = new m5.o(lVar, null, 0);
            sVar.h0(objK3);
        }
        sVar.p(false);
        p pVarA = pVarE.a(new SuspendPointerInputElement(z.f12851a, null, new g0((h9.n) objK3), 6));
        sVar.X(-1602580420);
        boolean z12 = i11 == 32;
        Object objK4 = sVar.K();
        if (z12 || objK4 == w0Var) {
            objK4 = new m5.o(lVar, null, 1);
            sVar.h0(objK4);
        }
        sVar.p(false);
        p pVarA2 = pVarA.a(new SuspendPointerInputElement(z.f12851a, null, new g0((h9.n) objK4), 6));
        sVar.X(-1602575779);
        boolean z13 = ((i10 & 234881024) == 67108864) | (i11 == 32) | ((((i10 & 57344) ^ 24576) > 16384 && sVar.g(z10)) || (i10 & 24576) == 16384) | ((i10 & 7168) == 2048);
        Object objK5 = sVar.K();
        if (z13 || objK5 == w0Var) {
            objK5 = new h9.k() { // from class: m5.m
                @Override // h9.k
                public final Object invoke(Object obj) {
                    a2.g gVar = (a2.g) obj;
                    l lVar2 = lVar;
                    i9.l.e(lVar2, "$controller");
                    h9.n nVar2 = nVar;
                    i9.l.e(nVar2, "$draw");
                    i9.l.e(gVar, "$this$Canvas");
                    y1.o oVarZ = gVar.W().z();
                    oVarZ.h();
                    oVarZ.l(0.0f, 0.0f, x1.e.d(gVar.g()), x1.e.b(gVar.g()), 1);
                    nVar2.invoke(oVarZ, new x1.e(gVar.g()));
                    oVarZ.r();
                    long j5 = ((x1.b) lVar2.f8485d.getValue()).f14521a;
                    float fR = gVar.R(lVar2.f8492l);
                    f7.q qVar = lVar2.f8493m;
                    if (z10) {
                        oVarZ.g(fR, j5, qVar);
                    }
                    lVar2.f8497q.f();
                    return z.f12851a;
                }
            };
            sVar.h0(objK5);
        }
        sVar.p(false);
        u.a(0, sVar, (h9.k) objK5, pVarA2);
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: m5.n
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r1.p pVar2 = pVar;
                    i9.l.e(pVar2, "$modifier");
                    l lVar2 = lVar;
                    i9.l.e(lVar2, "$controller");
                    h9.k kVar4 = kVar3;
                    i9.l.e(kVar4, "$setup");
                    h9.n nVar2 = nVar;
                    i9.l.e(nVar2, "$draw");
                    i2.c.f(pVar2, lVar2, z10, kVar, kVar2, kVar4, nVar2, (f1.s) obj, f1.b.y(i7 | 1));
                    return z.f12851a;
                }
            };
        }
    }

    public static final void g(List list, t8.j jVar, boolean z10, h9.k kVar, f1.s sVar, int i7, int i10) {
        boolean z11;
        int i11;
        List list2;
        boolean z12;
        sVar.Y(-974651015);
        int i12 = i10 & 4;
        if (i12 != 0) {
            i11 = i7 | 384;
            z11 = z10;
        } else if ((i7 & 384) == 0) {
            z11 = z10;
            i11 = (sVar.g(z11) ? 256 : 128) | i7;
        } else {
            z11 = z10;
            i11 = i7;
        }
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            list2 = list;
            z12 = z11;
        } else {
            boolean z13 = i12 != 0 ? true : z11;
            sVar.X(1631745107);
            sVar.X(773894976);
            sVar.X(-492369756);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                b0 b0Var = new b0(f1.b.l(sVar));
                sVar.h0(b0Var);
                objK = b0Var;
            }
            sVar.p(false);
            cc.y yVar = ((b0) objK).f4888a;
            sVar.p(false);
            sVar.X(1776161880);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new m5.l(yVar);
                sVar.h0(objK2);
            }
            m5.l lVar = (m5.l) objK2;
            sVar.p(false);
            sVar.p(false);
            sVar.W(1849434622);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                t8.o oVar = n8.d.f8898a;
                objK3 = f1.b.s(n8.d.d((String) jVar.f12830a, (String) jVar.f12831b));
                sVar.h0(objK3);
            }
            b1 b1Var = (b1) objK3;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s((String) b1Var.getValue());
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            b1 b1Var3 = (b1) objC2;
            sVar.p(false);
            int i13 = 12;
            list2 = list;
            n1.c cVarE = n1.h.e(1754198690, new a8.y(i13, list2), sVar);
            n1.c cVarE2 = n1.h.e(1461812865, new a8.w(b1Var, 27), sVar);
            sVar.W(5004770);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new f0.k(b1Var3, i13);
                sVar.h0(objK4);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, z13, (h9.a) objK4, sVar, (i11 & 896) | 3126, 0);
            l8.n.a(((Boolean) b1Var3.getValue()).booleanValue(), null, 0L, false, 0, null, n1.h.e(1863162290, new a8.w(b1Var3, 28), sVar), n1.h.e(53258705, new x1(jVar, kVar, b1Var, b1Var3), sVar), n1.h.e(-1756644880, new a8.s(jVar, kVar, b1Var2, b1Var, b1Var3), sVar), n1.h.e(330933090, new l8.h(lVar, b1Var2, 1), sVar), sVar, 918552576, 126);
            z12 = z13;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.g(list2, jVar, z12, kVar, i7, i10, 0);
        }
    }

    public static n3.d h() {
        return new n3.d(1.0f, 1.0f);
    }

    public static final void i(int i7, f1.s sVar) {
        f1.s sVar2;
        sVar.Y(-2078216108);
        if (i7 == 0 && sVar.z()) {
            sVar.Q();
            sVar2 = sVar;
        } else {
            f fVarB = r.f8756a;
            if (fVarB == null) {
                e2.e eVar = new e2.e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = i0.f4202a;
                y1.n0 n0Var = new y1.n0(y1.q.f14948b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new o(7.0f, 10.0f));
                arrayList.add(new v(5.0f, 5.0f));
                arrayList.add(new v(5.0f, -5.0f));
                arrayList.add(e2.k.f4210c);
                e2.e.a(eVar, arrayList, n0Var);
                fVarB = eVar.b();
                r.f8756a = fVarB;
            }
            f fVar = fVarB;
            sVar2 = sVar;
            c1.k0.b(fVar, "下拉箭头", androidx.compose.foundation.layout.c.h(m.f11116a, g5.a.n(24, sVar)), ((c1.w) sVar.j(y.f2319a)).A, sVar2, 48, 0);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new g(i7, 8);
        }
    }

    public static final void j(List list, f1.s sVar, int i7) {
        int i10;
        f1.s sVar2 = sVar;
        sVar2.Y(-1452430333);
        if ((i7 & 6) == 0) {
            i10 = i7 | (sVar2.h(list) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i10 & 3) == 2 && sVar2.z()) {
            sVar2.Q();
        } else {
            float fN = g5.a.n(10, sVar2);
            m mVar = m.f11116a;
            d0.c.a(sVar2, androidx.compose.foundation.layout.c.b(mVar, fN));
            sVar2.W(78825368);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                d0.c.a(sVar2, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(5, sVar2)));
                u2.b("※ " + str, null, ((c1.w) sVar2.j(y.f2319a)).A, r.K(g5.a.n(18, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131058);
                sVar2 = sVar;
                mVar = mVar;
            }
            sVar2.p(false);
            d0.c.a(sVar2, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(10, sVar2)));
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l0.b(i7, 2, list);
        }
    }

    public static final long k(int i7) {
        long j5 = (((long) i7) << 32) | (((long) 0) & 4294967295L);
        int i10 = a.f6599p;
        return j5;
    }

    public static final void l(final String str, long j5, long j10, final h9.a aVar, f1.s sVar, final int i7, final int i10) {
        int i11;
        boolean z10;
        final long j11;
        final long j12;
        l.e(aVar, "onClick");
        sVar.Y(-1347779111);
        if ((i7 & 6) == 0) {
            i11 = (sVar.f(str) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        long j13 = j5;
        long j14 = j10;
        int i12 = i11 | (((i10 & 2) == 0 && sVar.e(j13)) ? 32 : 16) | (((i10 & 4) == 0 && sVar.e(j14)) ? 256 : 128);
        if ((i7 & 3072) == 0) {
            i12 |= sVar.h(aVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            j11 = j13;
            j12 = j14;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                if ((i10 & 2) != 0) {
                    j13 = ((c1.w) sVar.j(y.f2319a)).f2225a;
                    i12 &= -113;
                }
                if ((i10 & 4) != 0) {
                    j14 = ((c1.w) sVar.j(y.f2319a)).f2226b;
                    i12 &= -897;
                }
            } else {
                sVar.Q();
                if ((i10 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i10 & 4) != 0) {
                    i12 &= -897;
                }
            }
            sVar.q();
            View view = (View) sVar.j(r2.n0.f11347f);
            r1.h hVar = r1.c.f11096e;
            k0.d dVarA = k0.e.a(g5.a.n(32, sVar));
            p pVarF = m.f11116a;
            p pVarM = androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(pVarF, j13, dVarA), g5.a.n(32, sVar), g5.a.n(12, sVar)), g5.a.n(24, sVar)), 2);
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar = (b0.k) objK;
            sVar.p(false);
            sVar.W(-1633490746);
            boolean zH = sVar.h(view) | ((i12 & 7168) == 2048);
            Object objK2 = sVar.K();
            if (zH || objK2 == obj) {
                objK2 = new l8.g0(view, aVar, 1);
                sVar.h0(objK2);
            }
            sVar.p(false);
            p pVarC = androidx.compose.foundation.a.c(pVarM, kVar, null, false, (h9.a) objK2, 28);
            m0 m0VarD = d0.m.d(hVar, false);
            long j15 = sVar.T;
            int i13 = (int) (j15 ^ (j15 >>> 32));
            q1 q1VarL = sVar.l();
            p pVarC2 = r1.a.c(sVar, pVarC);
            q2.j.f10719d0.getClass();
            h9.a aVar2 = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar2);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar2 = q2.i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i13))) {
                ob.a.w(i13, sVar, i13, hVar2);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            long jK = r.K(g5.a.n(18, sVar), 4294967296L);
            long jK2 = r.K(g5.a.n(24, sVar), 4294967296L);
            p pVarB = androidx.compose.foundation.layout.c.b(pVarF, g5.a.n(24, sVar));
            sVar.W(-1959743363);
            if (Build.VERSION.SDK_INT <= 28) {
                z10 = true;
                pVarF = androidx.compose.foundation.layout.a.f(0.0f, -g5.a.n(1, sVar), 1);
            } else {
                z10 = true;
            }
            sVar.p(false);
            int i14 = i12 & 910;
            long j16 = j14;
            j11 = j13;
            u2.b(str, pVarB.a(pVarF), j16, jK, null, 0L, new m3.k(3), jK2, 0, false, 0, 0, null, sVar, i14, 0, 129520);
            sVar.p(z10);
            j12 = j16;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l8.i0
                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    i2.c.l(str, j11, j12, aVar, (f1.s) obj2, f1.b.y(i7 | 1), i10);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final void m(String str, h9.a aVar, f1.s sVar, int i7, int i10) {
        int i11;
        h9.a aVar2;
        int i12;
        h9.a aVar3;
        l.e(str, "text");
        sVar.Y(-1675569918);
        if ((i7 & 6) == 0) {
            i11 = i7 | (sVar.f(str) ? 4 : 2);
        } else {
            i11 = i7;
        }
        int i13 = i10 & 2;
        if (i13 != 0) {
            i12 = i11 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i12 = i11 | (sVar.h(aVar2) ? 32 : 16);
        }
        if ((i12 & 19) == 18 && sVar.z()) {
            sVar.Q();
            aVar3 = aVar2;
        } else {
            h9.a aVar4 = i13 != 0 ? null : aVar2;
            b3.r0 r0Var = ((y2) sVar.j(z2.f2365a)).f2356j;
            long j5 = ((c1.w) sVar.j(y.f2319a)).f2238o;
            long jK = r.K(g5.a.n(20, sVar), 4294967296L);
            sVar.W(390054511);
            p pVarC = m.f11116a;
            if (aVar4 != null) {
                sVar.W(1849434622);
                Object objK = sVar.K();
                f1.w0 w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                b0.k kVar = (b0.k) objK;
                sVar.p(false);
                sVar.W(5004770);
                boolean z10 = (i12 & 112) == 32;
                Object objK2 = sVar.K();
                if (z10 || objK2 == w0Var) {
                    objK2 = new l8.y(aVar4, 2);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                pVarC = androidx.compose.foundation.a.c(pVarC, kVar, null, false, (h9.a) objK2, 28);
            }
            sVar.p(false);
            u2.b(str, pVarC, j5, jK, null, 0L, null, 0L, 0, false, 0, 0, r0Var, sVar, i12 & 14, 0, 65520);
            aVar3 = aVar4;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.a(str, aVar3, i7, i10, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x021d  */
    /* JADX WARN: Code duplicated, block: B:79:0x023a  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void n(final String str, final h9.a aVar, f fVar, long j5, float f10, int i7, int i10, f1.s sVar, final int i11, final int i12) {
        final f fVar2;
        int i13;
        float f11;
        float f12;
        long j10;
        int i14;
        int i15;
        View view;
        Object objK;
        f1.w0 w0Var;
        boolean zH;
        Object objK2;
        m mVar;
        int i16;
        q2.a0 a0Var;
        q2.h hVar;
        f fVar3;
        long j11;
        int i17;
        f fVar4;
        long j12;
        z zVar;
        int i18;
        int i19;
        boolean z10;
        final int i20;
        final long j13;
        final int i21;
        final float f13;
        w1 w1VarR;
        f1.s sVar2 = sVar;
        l.e(aVar, "onClick");
        sVar2.Y(1179428822);
        int i22 = i12 & 4;
        if (i22 != 0) {
            i13 = i11 | 384;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i13 = (sVar2.f(fVar2) ? 256 : 128) | i11;
        }
        int i23 = i13 | 1024;
        int i24 = i12 & 16;
        if (i24 == 0) {
            if ((i11 & 24576) == 0) {
                f11 = f10;
                i23 |= sVar2.c(f11) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            }
            if (((i23 | 1769472) & 599187) == 599186 || !sVar2.z()) {
                sVar2.S();
                if ((i11 & 1) != 0 || sVar2.x()) {
                    if (i22 != 0) {
                        fVar2 = null;
                    }
                    long j14 = ((c1.w) sVar2.j(y.f2319a)).f2238o;
                    if (i24 != 0) {
                        f12 = 0.0f;
                    } else {
                        f12 = f11;
                    }
                    j10 = j14;
                    i14 = 34;
                    i15 = 24;
                } else {
                    sVar2.Q();
                    j10 = j5;
                    i14 = i7;
                    i15 = i10;
                    f12 = f11;
                }
                sVar2.q();
                view = (View) sVar2.j(r2.n0.f11347f);
                sVar2.W(1849434622);
                objK = sVar2.K();
                w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = ob.a.m(sVar2);
                }
                b0.k kVar = (b0.k) objK;
                sVar2.p(false);
                sVar2.W(-1633490746);
                zH = sVar2.h(view);
                objK2 = sVar2.K();
                if (zH || objK2 == w0Var) {
                    objK2 = new l8.g0(view, aVar, 0);
                    sVar2.h0(objK2);
                }
                sVar2.p(false);
                mVar = m.f11116a;
                p pVarC = androidx.compose.foundation.a.c(mVar, kVar, null, false, (h9.a) objK2, 28);
                r1.h hVar2 = r1.c.f11092a;
                m0 m0VarD = d0.m.d(hVar2, false);
                long j15 = sVar2.T;
                i16 = (int) (j15 ^ (j15 >>> 32));
                q1 q1VarL = sVar2.l();
                p pVarC2 = r1.a.c(sVar2, pVarC);
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var);
                } else {
                    sVar2.k0();
                }
                q2.h hVar3 = q2.i.f10708e;
                f1.b.w(sVar2, hVar3, m0VarD);
                q2.h hVar4 = q2.i.f10707d;
                f1.b.w(sVar2, hVar4, q1VarL);
                hVar = q2.i.f10709f;
                if (sVar2.S) {
                    fVar3 = fVar2;
                } else {
                    fVar3 = fVar2;
                    if (!l.a(sVar2.K(), Integer.valueOf(i16))) {
                    }
                    q2.h hVar5 = q2.i.f10706c;
                    f1.b.w(sVar2, hVar5, pVarC2);
                    p pVarH = androidx.compose.foundation.layout.a.h(mVar, g5.a.n(16, sVar2));
                    m0 m0VarD2 = d0.m.d(hVar2, false);
                    j11 = j10;
                    long j16 = sVar2.T;
                    i17 = (int) (j16 ^ (j16 >>> 32));
                    q1 q1VarL2 = sVar2.l();
                    p pVarC3 = r1.a.c(sVar2, pVarH);
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, hVar3, m0VarD2);
                    f1.b.w(sVar2, hVar4, q1VarL2);
                    if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i17))) {
                        ob.a.w(i17, sVar2, i17, hVar);
                    }
                    f1.b.w(sVar2, hVar5, pVarC3);
                    sVar2.W(880872347);
                    if (fVar3 == null) {
                        fVar4 = fVar3;
                        j12 = j11;
                        zVar = null;
                    } else {
                        f fVar5 = fVar3;
                        c1.k0.b(fVar5, str, n3.l.P(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(i14, sVar2)), f12), j11, sVar2, 48, 0);
                        fVar4 = fVar5;
                        j12 = j11;
                        zVar = z.f12851a;
                    }
                    sVar2.p(false);
                    sVar2.W(880872226);
                    if (zVar == null) {
                        i18 = i14;
                        i19 = i15;
                        z10 = false;
                        u2.b(str, null, j12, r.K(g5.a.n(i15, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131058);
                        sVar2 = sVar2;
                    } else {
                        i18 = i14;
                        i19 = i15;
                        z10 = false;
                    }
                    sVar2.p(z10);
                    sVar2.p(true);
                    sVar2.p(true);
                    fVar2 = fVar4;
                    i20 = i19;
                    j13 = j12;
                    i21 = i18;
                    f13 = f12;
                }
                ob.a.w(i16, sVar2, i16, hVar);
                q2.h hVar6 = q2.i.f10706c;
                f1.b.w(sVar2, hVar6, pVarC2);
                p pVarH2 = androidx.compose.foundation.layout.a.h(mVar, g5.a.n(16, sVar2));
                m0 m0VarD3 = d0.m.d(hVar2, false);
                j11 = j10;
                long j17 = sVar2.T;
                i17 = (int) (j17 ^ (j17 >>> 32));
                q1 q1VarL3 = sVar2.l();
                p pVarC4 = r1.a.c(sVar2, pVarH2);
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, hVar3, m0VarD3);
                f1.b.w(sVar2, hVar4, q1VarL3);
                if (sVar2.S) {
                    ob.a.w(i17, sVar2, i17, hVar);
                } else {
                    ob.a.w(i17, sVar2, i17, hVar);
                }
                f1.b.w(sVar2, hVar6, pVarC4);
                sVar2.W(880872347);
                if (fVar3 == null) {
                    fVar4 = fVar3;
                    j12 = j11;
                    zVar = null;
                } else {
                    f fVar6 = fVar3;
                    c1.k0.b(fVar6, str, n3.l.P(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(i14, sVar2)), f12), j11, sVar2, 48, 0);
                    fVar4 = fVar6;
                    j12 = j11;
                    zVar = z.f12851a;
                }
                sVar2.p(false);
                sVar2.W(880872226);
                if (zVar == null) {
                    i18 = i14;
                    i19 = i15;
                    z10 = false;
                    u2.b(str, null, j12, r.K(g5.a.n(i15, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131058);
                    sVar2 = sVar2;
                } else {
                    i18 = i14;
                    i19 = i15;
                    z10 = false;
                }
                sVar2.p(z10);
                sVar2.p(true);
                sVar2.p(true);
                fVar2 = fVar4;
                i20 = i19;
                j13 = j12;
                i21 = i18;
                f13 = f12;
            } else {
                sVar2.Q();
                i21 = i7;
                i20 = i10;
                f13 = f11;
                j13 = j5;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.h0
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i2.c.n(str, aVar, fVar2, j13, f13, i21, i20, (f1.s) obj, f1.b.y(i11 | 1), i12);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i23 = i13 | 25600;
        f11 = f10;
        if (((i23 | 1769472) & 599187) == 599186) {
            sVar2.S();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    fVar2 = null;
                }
                long j18 = ((c1.w) sVar2.j(y.f2319a)).f2238o;
                if (i24 != 0) {
                    f12 = 0.0f;
                } else {
                    f12 = f11;
                }
                j10 = j18;
                i14 = 34;
                i15 = 24;
            } else {
                if (i22 != 0) {
                    fVar2 = null;
                }
                long j19 = ((c1.w) sVar2.j(y.f2319a)).f2238o;
                if (i24 != 0) {
                    f12 = 0.0f;
                } else {
                    f12 = f11;
                }
                j10 = j19;
                i14 = 34;
                i15 = 24;
            }
            sVar2.q();
            view = (View) sVar2.j(r2.n0.f11347f);
            sVar2.W(1849434622);
            objK = sVar2.K();
            w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = ob.a.m(sVar2);
            }
            b0.k kVar2 = (b0.k) objK;
            sVar2.p(false);
            sVar2.W(-1633490746);
            zH = sVar2.h(view);
            objK2 = sVar2.K();
            if (zH) {
                objK2 = new l8.g0(view, aVar, 0);
                sVar2.h0(objK2);
            } else {
                objK2 = new l8.g0(view, aVar, 0);
                sVar2.h0(objK2);
            }
            sVar2.p(false);
            mVar = m.f11116a;
            p pVarC5 = androidx.compose.foundation.a.c(mVar, kVar2, null, false, (h9.a) objK2, 28);
            r1.h hVar7 = r1.c.f11092a;
            m0 m0VarD4 = d0.m.d(hVar7, false);
            long j110 = sVar2.T;
            i16 = (int) (j110 ^ (j110 >>> 32));
            q1 q1VarL4 = sVar2.l();
            p pVarC6 = r1.a.c(sVar2, pVarC5);
            q2.j.f10719d0.getClass();
            a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            q2.h hVar8 = q2.i.f10708e;
            f1.b.w(sVar2, hVar8, m0VarD4);
            q2.h hVar9 = q2.i.f10707d;
            f1.b.w(sVar2, hVar9, q1VarL4);
            hVar = q2.i.f10709f;
            if (sVar2.S) {
                fVar3 = fVar2;
                if (!l.a(sVar2.K(), Integer.valueOf(i16))) {
                }
                q2.h hVar10 = q2.i.f10706c;
                f1.b.w(sVar2, hVar10, pVarC6);
                p pVarH3 = androidx.compose.foundation.layout.a.h(mVar, g5.a.n(16, sVar2));
                m0 m0VarD5 = d0.m.d(hVar7, false);
                j11 = j10;
                long j111 = sVar2.T;
                i17 = (int) (j111 ^ (j111 >>> 32));
                q1 q1VarL5 = sVar2.l();
                p pVarC7 = r1.a.c(sVar2, pVarH3);
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, hVar8, m0VarD5);
                f1.b.w(sVar2, hVar9, q1VarL5);
                if (sVar2.S) {
                    ob.a.w(i17, sVar2, i17, hVar);
                } else {
                    ob.a.w(i17, sVar2, i17, hVar);
                }
                f1.b.w(sVar2, hVar10, pVarC7);
                sVar2.W(880872347);
                if (fVar3 == null) {
                    fVar4 = fVar3;
                    j12 = j11;
                    zVar = null;
                } else {
                    f fVar7 = fVar3;
                    c1.k0.b(fVar7, str, n3.l.P(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(i14, sVar2)), f12), j11, sVar2, 48, 0);
                    fVar4 = fVar7;
                    j12 = j11;
                    zVar = z.f12851a;
                }
                sVar2.p(false);
                sVar2.W(880872226);
                if (zVar == null) {
                    i18 = i14;
                    i19 = i15;
                    z10 = false;
                    u2.b(str, null, j12, r.K(g5.a.n(i15, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131058);
                    sVar2 = sVar2;
                } else {
                    i18 = i14;
                    i19 = i15;
                    z10 = false;
                }
                sVar2.p(z10);
                sVar2.p(true);
                sVar2.p(true);
                fVar2 = fVar4;
                i20 = i19;
                j13 = j12;
                i21 = i18;
                f13 = f12;
            } else {
                fVar3 = fVar2;
            }
            ob.a.w(i16, sVar2, i16, hVar);
            q2.h hVar11 = q2.i.f10706c;
            f1.b.w(sVar2, hVar11, pVarC6);
            p pVarH4 = androidx.compose.foundation.layout.a.h(mVar, g5.a.n(16, sVar2));
            m0 m0VarD6 = d0.m.d(hVar7, false);
            j11 = j10;
            long j112 = sVar2.T;
            i17 = (int) (j112 ^ (j112 >>> 32));
            q1 q1VarL6 = sVar2.l();
            p pVarC8 = r1.a.c(sVar2, pVarH4);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar8, m0VarD6);
            f1.b.w(sVar2, hVar9, q1VarL6);
            if (sVar2.S) {
                ob.a.w(i17, sVar2, i17, hVar);
            } else {
                ob.a.w(i17, sVar2, i17, hVar);
            }
            f1.b.w(sVar2, hVar11, pVarC8);
            sVar2.W(880872347);
            if (fVar3 == null) {
                fVar4 = fVar3;
                j12 = j11;
                zVar = null;
            } else {
                f fVar8 = fVar3;
                c1.k0.b(fVar8, str, n3.l.P(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(i14, sVar2)), f12), j11, sVar2, 48, 0);
                fVar4 = fVar8;
                j12 = j11;
                zVar = z.f12851a;
            }
            sVar2.p(false);
            sVar2.W(880872226);
            if (zVar == null) {
                i18 = i14;
                i19 = i15;
                z10 = false;
                u2.b(str, null, j12, r.K(g5.a.n(i15, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131058);
                sVar2 = sVar2;
            } else {
                i18 = i14;
                i19 = i15;
                z10 = false;
            }
            sVar2.p(z10);
            sVar2.p(true);
            sVar2.p(true);
            fVar2 = fVar4;
            i20 = i19;
            j13 = j12;
            i21 = i18;
            f13 = f12;
        } else {
            sVar2.S();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    fVar2 = null;
                }
                long j113 = ((c1.w) sVar2.j(y.f2319a)).f2238o;
                if (i24 != 0) {
                    f12 = 0.0f;
                } else {
                    f12 = f11;
                }
                j10 = j113;
                i14 = 34;
                i15 = 24;
            } else {
                if (i22 != 0) {
                    fVar2 = null;
                }
                long j114 = ((c1.w) sVar2.j(y.f2319a)).f2238o;
                if (i24 != 0) {
                    f12 = 0.0f;
                } else {
                    f12 = f11;
                }
                j10 = j114;
                i14 = 34;
                i15 = 24;
            }
            sVar2.q();
            view = (View) sVar2.j(r2.n0.f11347f);
            sVar2.W(1849434622);
            objK = sVar2.K();
            w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = ob.a.m(sVar2);
            }
            b0.k kVar3 = (b0.k) objK;
            sVar2.p(false);
            sVar2.W(-1633490746);
            zH = sVar2.h(view);
            objK2 = sVar2.K();
            if (zH) {
                objK2 = new l8.g0(view, aVar, 0);
                sVar2.h0(objK2);
            } else {
                objK2 = new l8.g0(view, aVar, 0);
                sVar2.h0(objK2);
            }
            sVar2.p(false);
            mVar = m.f11116a;
            p pVarC9 = androidx.compose.foundation.a.c(mVar, kVar3, null, false, (h9.a) objK2, 28);
            r1.h hVar12 = r1.c.f11092a;
            m0 m0VarD7 = d0.m.d(hVar12, false);
            long j115 = sVar2.T;
            i16 = (int) (j115 ^ (j115 >>> 32));
            q1 q1VarL7 = sVar2.l();
            p pVarC10 = r1.a.c(sVar2, pVarC9);
            q2.j.f10719d0.getClass();
            a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            q2.h hVar13 = q2.i.f10708e;
            f1.b.w(sVar2, hVar13, m0VarD7);
            q2.h hVar14 = q2.i.f10707d;
            f1.b.w(sVar2, hVar14, q1VarL7);
            hVar = q2.i.f10709f;
            if (sVar2.S) {
                fVar3 = fVar2;
                if (!l.a(sVar2.K(), Integer.valueOf(i16))) {
                }
                q2.h hVar15 = q2.i.f10706c;
                f1.b.w(sVar2, hVar15, pVarC10);
                p pVarH5 = androidx.compose.foundation.layout.a.h(mVar, g5.a.n(16, sVar2));
                m0 m0VarD8 = d0.m.d(hVar12, false);
                j11 = j10;
                long j116 = sVar2.T;
                i17 = (int) (j116 ^ (j116 >>> 32));
                q1 q1VarL8 = sVar2.l();
                p pVarC11 = r1.a.c(sVar2, pVarH5);
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, hVar13, m0VarD8);
                f1.b.w(sVar2, hVar14, q1VarL8);
                if (sVar2.S) {
                    ob.a.w(i17, sVar2, i17, hVar);
                } else {
                    ob.a.w(i17, sVar2, i17, hVar);
                }
                f1.b.w(sVar2, hVar15, pVarC11);
                sVar2.W(880872347);
                if (fVar3 == null) {
                    fVar4 = fVar3;
                    j12 = j11;
                    zVar = null;
                } else {
                    f fVar9 = fVar3;
                    c1.k0.b(fVar9, str, n3.l.P(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(i14, sVar2)), f12), j11, sVar2, 48, 0);
                    fVar4 = fVar9;
                    j12 = j11;
                    zVar = z.f12851a;
                }
                sVar2.p(false);
                sVar2.W(880872226);
                if (zVar == null) {
                    i18 = i14;
                    i19 = i15;
                    z10 = false;
                    u2.b(str, null, j12, r.K(g5.a.n(i15, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131058);
                    sVar2 = sVar2;
                } else {
                    i18 = i14;
                    i19 = i15;
                    z10 = false;
                }
                sVar2.p(z10);
                sVar2.p(true);
                sVar2.p(true);
                fVar2 = fVar4;
                i20 = i19;
                j13 = j12;
                i21 = i18;
                f13 = f12;
            } else {
                fVar3 = fVar2;
            }
            ob.a.w(i16, sVar2, i16, hVar);
            q2.h hVar16 = q2.i.f10706c;
            f1.b.w(sVar2, hVar16, pVarC10);
            p pVarH6 = androidx.compose.foundation.layout.a.h(mVar, g5.a.n(16, sVar2));
            m0 m0VarD9 = d0.m.d(hVar12, false);
            j11 = j10;
            long j117 = sVar2.T;
            i17 = (int) (j117 ^ (j117 >>> 32));
            q1 q1VarL9 = sVar2.l();
            p pVarC12 = r1.a.c(sVar2, pVarH6);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar13, m0VarD9);
            f1.b.w(sVar2, hVar14, q1VarL9);
            if (sVar2.S) {
                ob.a.w(i17, sVar2, i17, hVar);
            } else {
                ob.a.w(i17, sVar2, i17, hVar);
            }
            f1.b.w(sVar2, hVar16, pVarC12);
            sVar2.W(880872347);
            if (fVar3 == null) {
                fVar4 = fVar3;
                j12 = j11;
                zVar = null;
            } else {
                f fVar10 = fVar3;
                c1.k0.b(fVar10, str, n3.l.P(androidx.compose.foundation.layout.c.h(mVar, g5.a.n(i14, sVar2)), f12), j11, sVar2, 48, 0);
                fVar4 = fVar10;
                j12 = j11;
                zVar = z.f12851a;
            }
            sVar2.p(false);
            sVar2.W(880872226);
            if (zVar == null) {
                i18 = i14;
                i19 = i15;
                z10 = false;
                u2.b(str, null, j12, r.K(g5.a.n(i15, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 6, 0, 131058);
                sVar2 = sVar2;
            } else {
                i18 = i14;
                i19 = i15;
                z10 = false;
            }
            sVar2.p(z10);
            sVar2.p(true);
            sVar2.p(true);
            fVar2 = fVar4;
            i20 = i19;
            j13 = j12;
            i21 = i18;
            f13 = f12;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l8.h0
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i2.c.n(str, aVar, fVar2, j13, f13, i21, i20, (f1.s) obj, f1.b.y(i11 | 1), i12);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final void o(String str, h9.a aVar, f1.s sVar, int i7) {
        int i10;
        l.e(aVar, "onClick");
        sVar.Y(293723851);
        if ((i7 & 48) == 0) {
            i10 = (sVar.h(aVar) ? 32 : 16) | i7;
        } else {
            i10 = i7;
        }
        if ((i10 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            x2 x2Var = y.f2319a;
            long j5 = ((c1.w) sVar.j(x2Var)).f2232h;
            long j10 = ((c1.w) sVar.j(x2Var)).f2233i;
            sVar.W(5004770);
            boolean z10 = (i10 & 112) == 32;
            Object objK = sVar.K();
            if (z10 || objK == f1.n.f5051a) {
                objK = new l8.y(aVar, 1);
                sVar.h0(objK);
            }
            sVar.p(false);
            l(str, j5, j10, (h9.a) objK, sVar, 6, 0);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 5, str, aVar);
        }
    }

    public static final void p(String str, f1.s sVar, int i7) {
        int i10;
        l.e(str, "text");
        sVar.Y(-1854873326);
        if ((i7 & 6) == 0) {
            i10 = i7 | (sVar.f(str) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i10 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            d0.c.a(sVar, androidx.compose.foundation.layout.c.b(m.f11116a, g5.a.n(5, sVar)));
            u2.b(str, null, ((c1.w) sVar.j(y.f2319a)).A, r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, ((y2) sVar.j(z2.f2365a)).k, sVar, i10 & 14, 0, 65522);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l0.b(i7, 1, str);
        }
    }

    public static final void q(String str, f1.s sVar, int i7) {
        f1.s sVar2 = sVar;
        sVar2.Y(879036625);
        int i10 = i7 | (sVar2.f(str) ? 4 : 2);
        if ((i10 & 3) == 2 && sVar2.z()) {
            sVar2.Q();
        } else {
            p pVarK = androidx.compose.foundation.layout.a.k(m.f11116a, g5.a.n(16, sVar2), g5.a.n(16, sVar2), 0.0f, g5.a.n(10, sVar2), 4);
            d0.n0 n0VarA = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar2, 0);
            long j5 = sVar2.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar2.l();
            p pVarC = r1.a.c(sVar2, pVarK);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, q2.i.f10708e, n0VarA);
            f1.b.w(sVar2, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar2, i11, hVar);
            }
            f1.b.w(sVar2, q2.i.f10706c, pVarC);
            u2.b(str, null, ((c1.w) sVar2.j(y.f2319a)).f2238o, r.K(g5.a.n(20, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, ((y2) sVar2.j(z2.f2365a)).f2354h, sVar, i10 & 14, 0, 65522);
            sVar2 = sVar;
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.f(str, i7, 1);
        }
    }

    public static final wa.c r(String str, wa.c cVar) {
        return cVar.a(wa.e.e(str));
    }

    public static int s(m7.a aVar, int i7) {
        if (i7 != 4) {
            return i7 != 5 ? aVar.b().f8601j : aVar.b().f8602l;
        }
        return aVar.b().k;
    }

    public static gb.o t(Collection collection, String str) {
        gb.o aVar;
        l.e(str, "message");
        l.e(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(q.a0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((w) it.next()).U());
        }
        wb.g gVarS = n4.h.S(arrayList);
        int i7 = gVarS.f14291a;
        if (i7 != 0) {
            aVar = i7 != 1 ? new gb.a(str, (gb.o[]) gVarS.toArray(new gb.o[0])) : (gb.o) gVarS.get(0);
        } else {
            aVar = gb.n.f6198b;
        }
        return gVarS.f14291a <= 1 ? aVar : new gb.k(aVar);
    }

    public static l4.s u(Context context) {
        ProviderInfo providerInfo;
        b4.g gVar;
        ApplicationInfo applicationInfo;
        kb.d cVar = Build.VERSION.SDK_INT >= 28 ? new l4.c(24) : new kb.d(24);
        PackageManager packageManager = context.getPackageManager();
        k9.a.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            gVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrH = cVar.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrH) {
                    arrayList.add(signature.toByteArray());
                }
                gVar = new b4.g(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
                gVar = null;
            }
        }
        if (gVar == null) {
            return null;
        }
        return new l4.s(new l4.r(context, gVar));
    }

    public static final n0 v(n0 n0Var, x9.r0 r0Var) {
        if (r0Var == null || n0Var.a() == x0.INVARIANT) {
            return n0Var;
        }
        if (r0Var.I() != n0Var.a()) {
            ab.c cVar = new ab.c(n0Var);
            nb.h0.f8997b.getClass();
            return new f0(new ab.a(n0Var, cVar, false, nb.h0.f8998c));
        }
        if (!n0Var.c()) {
            return new f0(n0Var.b());
        }
        mb.b bVar = mb.k.f8627e;
        l.d(bVar, "NO_LOCKS");
        return new f0(new nb.y(bVar, new aa.e(5, n0Var)));
    }

    public static final f3.e w(Context context) {
        kb.d dVar = new kb.d(15);
        context.getApplicationContext();
        return new f3.e(dVar, new f3.a(Build.VERSION.SDK_INT >= 31 ? f3.l.f5262a.a(context) : 0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    public static final da.e x(Annotation[] annotationArr, wa.c cVar) {
        l.e(annotationArr, "<this>");
        l.e(cVar, "fqName");
        for (Annotation annotation : annotationArr) {
            if (l.a(da.d.a(g5.a.L(g5.a.G(annotation))).a(), cVar)) {
                if (annotation != null) {
                    return new da.e(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new da.e(annotation);
        }
        return null;
    }

    public static void y(Object obj) {
        LongSparseArray longSparseArray;
        if (!f6605e) {
            try {
                f6604d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            f6605e = true;
        }
        Class cls = f6604d;
        if (cls == null) {
            return;
        }
        if (!f6607g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6606f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f6607g = true;
        }
        Field field = f6606f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static final ArrayList z(Annotation[] annotationArr) {
        l.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new da.e(annotation));
        }
        return arrayList;
    }

    public abstract void U(byte[] bArr, int i7, int i10);
}
