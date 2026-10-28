package n3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.lifecycle.o0;
import b3.q0;
import f1.w1;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nb.f0;
import nb.k0;
import nb.n0;
import nb.u0;
import nb.w;
import nb.x0;
import p.f3;
import p.h3;
import r9.e0;
import r9.g1;
import r9.l1;
import r9.v1;
import r9.x1;
import s9.a0;
import s9.v;
import s9.x;
import s9.y;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e2.f f8764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e2.f f8765c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8766a;

    public u() {
        this.f8766a = 23;
        new ConcurrentHashMap();
    }

    public /* synthetic */ u(int i7) {
        this.f8766a = i7;
    }

    public static y8.f A(y8.f fVar, y8.g gVar) {
        i9.l.e(gVar, "key");
        if (i9.l.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final Object B(g1 g1Var) {
        l1 l1VarP = g1Var.p();
        return n.W(l1VarP.f11712f, l1VarP.j());
    }

    public static final String[] C(s1.o oVar) {
        i9.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((s1.e) oVar).f12549b.toArray(new String[0]);
    }

    public static final boolean D(x9.e eVar) {
        LinkedHashSet linkedHashSet = u9.d.f13133a;
        if (!za.d.l(eVar)) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = u9.d.f13133a;
        wa.b bVarF = db.e.f(eVar);
        return u8.p.g0(linkedHashSet2, bVarF != null ? bVarF.e() : null);
    }

    public static yb.k E(h9.n nVar) {
        yb.k kVar = new yb.k();
        kVar.f15280c = n4.h.x(nVar, kVar, kVar);
        return kVar;
    }

    public static y8.h F(y8.f fVar, y8.g gVar) {
        i9.l.e(gVar, "key");
        return i9.l.a(fVar.getKey(), gVar) ? y8.i.f15108a : fVar;
    }

    public static y8.h G(y8.f fVar, y8.h hVar) {
        i9.l.e(hVar, "context");
        return hVar == y8.i.f15108a ? fVar : (y8.h) hVar.q(new g0.g(16), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    public static final w H(w wVar, ArrayList arrayList) {
        f0 f0Var;
        wVar.B0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.d dVar = (sb.d) it.next();
            dVar.getClass();
            w wVar2 = dVar.f12717c;
            w wVar3 = dVar.f12716b;
            r0 r0Var = dVar.f12715a;
            ob.e.f9637a.b(wVar3, wVar2);
            if (i9.l.a(wVar3, wVar2)) {
                f0Var = new f0(wVar3);
            } else {
                x0 x0VarI = r0Var.I();
                x0 x0Var = x0.IN_VARIANCE;
                if (x0VarI == x0Var) {
                    f0Var = new f0(wVar3);
                } else {
                    boolean zF = u9.i.F(wVar3);
                    x0 x0Var2 = x0.OUT_VARIANCE;
                    x0 x0Var3 = x0.INVARIANT;
                    if (zF && r0Var.I() != x0Var) {
                        if (x0Var2 == r0Var.I()) {
                            x0Var2 = x0Var3;
                        }
                        f0Var = new f0(wVar2, x0Var2);
                    } else {
                        if (wVar2 == null) {
                            u9.i.a(140);
                            throw null;
                        }
                        if (u9.i.y(wVar2) && wVar2.E0()) {
                            if (x0Var == r0Var.I()) {
                                x0Var = x0Var3;
                            }
                            f0Var = new f0(wVar3, x0Var);
                        } else {
                            if (x0Var2 == r0Var.I()) {
                                x0Var2 = x0Var3;
                            }
                            f0Var = new f0(wVar2, x0Var2);
                        }
                    }
                }
            }
            arrayList2.add(f0Var);
        }
        return nb.c.p(wVar, arrayList2, null, 6);
    }

    public static void I(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            f3.a(view, charSequence);
            return;
        }
        h3 h3Var = h3.k;
        if (h3Var != null && h3Var.f9768a == view) {
            h3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new h3(view, charSequence);
            return;
        }
        h3 h3Var2 = h3.f9767l;
        if (h3Var2 != null && h3Var2.f9768a == view) {
            h3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final t8.s J(String str) {
        int i7;
        l.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (i9.l.f(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i7 = 0;
        }
        int i11 = 119304647;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                if (i11 != 119304647) {
                    return null;
                }
                i11 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i13 = i10 * 10;
            int i14 = iDigit + i13;
            if (Integer.compare(i14 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i7++;
            i10 = i14;
        }
        return new t8.s(i10);
    }

    public static final t8.u K(String str) {
        int i7;
        i9.l.e(str, "<this>");
        int i10 = 10;
        l.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        char c10 = 1;
        if (i9.l.f(cCharAt, 48) >= 0) {
            i7 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i7 = 1;
        }
        long j5 = 10;
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), i10);
            if (iDigit < 0) {
                return null;
            }
            int i11 = length;
            long j12 = j10 ^ Long.MIN_VALUE;
            int i12 = i7;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) <= 0) {
                j5 = j5;
            } else {
                if (j11 != 512409557603043100L) {
                    return null;
                }
                if (j5 < 0) {
                    j11 = Long.MAX_VALUE < (j5 ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j13 = (Long.MAX_VALUE / j5) << c10;
                    j11 = j13 + ((long) ((((-1) - (j13 * j5)) ^ Long.MIN_VALUE) >= (j5 ^ Long.MIN_VALUE) ? 1 : 0));
                }
                if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j14 = j10 * j5;
            long j15 = (((long) iDigit) & 4294967295L) + j14;
            if (Long.compare(j15 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i7 = i12 + 1;
            j10 = j15;
            length = i11;
            j5 = j5;
            i10 = 10;
            c10 = 1;
        }
        return new t8.u(j10);
    }

    public static wa.b L(wa.c cVar) {
        i9.l.e(cVar, "topLevelFqName");
        return new wa.b(cVar.b(), cVar.f14240a.f());
    }

    public static final void a(int i7, f1.s sVar, h9.k kVar, r1.p pVar) {
        int i10;
        sVar.Y(-932836462);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(kVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            d0.c.a(sVar, androidx.compose.ui.draw.a.a(pVar, kVar));
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 8, pVar, kVar);
        }
    }

    public static final s1.e b(String str) {
        return new s1.e(r.W(str));
    }

    public static final x1.c c(long j5, long j10) {
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        return new x1.c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10));
    }

    public static final long d(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final int e(float[] fArr) {
        int i7 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i10 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i7 = 1;
        }
        return (i10 << 1) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, t8.h] */
    public static final s9.g f(g1 g1Var, boolean z10) {
        r9.k kVar;
        Method method;
        s9.g rVar;
        ua.c cVar;
        s9.g tVar;
        if (e0.f11673a.a(g1Var.p().f11711e)) {
            return a0.f12650a;
        }
        wa.b bVar = v1.f11778a;
        r rVarB = v1.b(g1Var.p().j());
        int i7 = 2;
        boolean z11 = false;
        if (rVarB instanceof r9.n) {
            r9.n nVar = (r9.n) rVarB;
            ta.f fVar = nVar.f11722j;
            ua.e eVar = nVar.f11721i;
            int i10 = 4;
            if (z10) {
                if ((eVar.f13256b & 4) == 4) {
                    cVar = eVar.f13259e;
                } else {
                    cVar = null;
                }
            } else if ((eVar.f13256b & 8) == 8) {
                cVar = eVar.f13260f;
            } else {
                cVar = null;
            }
            Method methodD = cVar != null ? g1Var.p().f11709c.d(fVar.getString(cVar.f13244c), fVar.getString(cVar.f13245d)) : null;
            if (methodD != null) {
                if (!Modifier.isStatic(methodD.getModifiers())) {
                    tVar = g1Var.m() ? new s9.r(methodD, B(g1Var)) : new v(methodD);
                } else if (g1Var.p().j().getAnnotations().i(x1.f11793a)) {
                    tVar = g1Var.m() ? new s9.s(methodD, z11, i10) : new v(methodD, true, i10, 1 == true ? 1 : 0);
                } else {
                    tVar = g1Var.m() ? new s9.t(methodD, false, B(g1Var)) : new v(methodD, z11, 6, i7);
                }
                rVar = tVar;
            } else if (za.f.e(g1Var.p().j()) && i9.l.a(g1Var.p().j().d(), x9.o.f14720d)) {
                Class clsL0 = n.L0(g1Var.p().j().l());
                if (clsL0 == null) {
                    throw new cc.a0(2, "Underlying property of inline class " + g1Var.p() + " should have a field");
                }
                Method methodP0 = n.p0(clsL0, g1Var.p().j());
                rVar = g1Var.m() ? new x(methodP0, B(g1Var)) : new y(methodP0, l.I(methodP0.getDeclaringClass()));
            } else {
                Field field = (Field) g1Var.p().f11713g.getValue();
                if (field == null) {
                    throw new cc.a0(2, "No accessors or field is found for property " + g1Var.p());
                }
                rVar = o(g1Var, z10, field);
            }
        } else if (rVarB instanceof r9.l) {
            rVar = o(g1Var, z10, ((r9.l) rVarB).f11706g);
        } else {
            if (!(rVarB instanceof r9.m)) {
                if (!(rVarB instanceof r9.o)) {
                    throw new cc.s();
                }
                if (z10) {
                    kVar = ((r9.o) rVarB).f11731g;
                } else {
                    kVar = ((r9.o) rVarB).f11732h;
                    if (kVar == null) {
                        throw new cc.a0(2, "No setter found for property " + g1Var.p());
                    }
                }
                e0 e0Var = g1Var.p().f11709c;
                va.e eVar2 = kVar.f11701c;
                Method methodD2 = e0Var.d(eVar2.f13712d, eVar2.f13713e);
                if (methodD2 != null) {
                    Modifier.isStatic(methodD2.getModifiers());
                    return g1Var.m() ? new s9.r(methodD2, B(g1Var)) : new v(methodD2);
                }
                throw new cc.a0(2, "No accessor found for property " + g1Var.p());
            }
            if (z10) {
                method = ((r9.m) rVarB).f11715g;
            } else {
                r9.m mVar = (r9.m) rVarB;
                method = mVar.f11716h;
                if (method == null) {
                    throw new cc.a0(2, "No source found for setter of Java method property: " + mVar.f11715g);
                }
            }
            rVar = g1Var.m() ? new s9.r(method, B(g1Var)) : new v(method);
        }
        return n.c0(rVar, g1Var.n(), false);
    }

    public static final ExtractedText g(g3.w wVar) {
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

    public static final void h(rc.s sVar) {
        i9.l.e(sVar, "<this>");
        if ((sVar instanceof rc.s ? sVar : null) != null) {
            return;
        }
        throw new IllegalStateException(ob.a.p(i9.y.f6689a, sVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final r1.p i(r1.p pVar, float f10) {
        return f10 == 1.0f ? pVar : androidx.compose.ui.graphics.a.b(pVar, f10, 0.0f, null, 520187);
    }

    public static final sb.a j(w wVar) {
        sb.d dVar;
        sb.d dVar2;
        i9.l.e(wVar, "type");
        if (nb.c.k(wVar)) {
            sb.a aVarJ = j(nb.c.l(wVar));
            sb.a aVarJ2 = j(nb.c.D(wVar));
            return new sb.a(nb.c.h(nb.c.e(nb.c.l((w) aVarJ.f12712a), nb.c.D((w) aVarJ2.f12712a)), wVar), nb.c.h(nb.c.e(nb.c.l((w) aVarJ.f12713b), nb.c.D((w) aVarJ2.f12713b)), wVar));
        }
        k0 k0VarD0 = wVar.D0();
        boolean z10 = true;
        if (wVar.D0() instanceof ab.b) {
            i9.l.c(k0VarD0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            n0 n0VarA = ((ab.b) k0VarD0).a();
            w wVarB = n0VarA.b();
            i9.l.d(wVarB, "getType(...)");
            w wVarH = u0.h(wVarB, wVar.E0());
            int iOrdinal = n0VarA.a().ordinal();
            if (iOrdinal == 1) {
                return new sb.a(wVarH, n.l0(wVar).p());
            }
            if (iOrdinal == 2) {
                return new sb.a(u0.h(n.l0(wVar).o(), wVar.E0()), wVarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + n0VarA);
        }
        if (wVar.B0().isEmpty() || wVar.B0().size() != k0VarD0.n().size()) {
            return new sb.a(wVar, wVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listB0 = wVar.B0();
        List listN = k0VarD0.n();
        i9.l.d(listN, "getParameters(...)");
        for (t8.j jVar : u8.p.O0(listB0, listN)) {
            n0 n0Var = (n0) jVar.f12830a;
            r0 r0Var = (r0) jVar.f12831b;
            i9.l.b(r0Var);
            x0 x0VarI = r0Var.I();
            if (x0VarI == null) {
                nb.r0.a(35);
                throw null;
            }
            if (n0Var == null) {
                nb.r0.a(36);
                throw null;
            }
            nb.r0 r0Var2 = nb.r0.f9028b;
            int iOrdinal2 = (n0Var.c() ? x0.OUT_VARIANCE : nb.r0.b(x0VarI, n0Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                w wVarB2 = n0Var.b();
                i9.l.d(wVarB2, "getType(...)");
                w wVarB3 = n0Var.b();
                i9.l.d(wVarB3, "getType(...)");
                dVar2 = new sb.d(r0Var, wVarB2, wVarB3);
            } else if (iOrdinal2 == 1) {
                w wVarB4 = n0Var.b();
                i9.l.d(wVarB4, "getType(...)");
                nb.a0 a0VarP = db.e.e(r0Var).p();
                i9.l.d(a0VarP, "getNullableAnyType(...)");
                dVar2 = new sb.d(r0Var, wVarB4, a0VarP);
            } else {
                if (iOrdinal2 != 2) {
                    throw new cc.s();
                }
                nb.a0 a0VarO = db.e.e(r0Var).o();
                w wVarB5 = n0Var.b();
                i9.l.d(wVarB5, "getType(...)");
                dVar2 = new sb.d(r0Var, a0VarO, wVarB5);
            }
            if (n0Var.c()) {
                arrayList.add(dVar2);
                arrayList2.add(dVar2);
            } else {
                sb.a aVarJ3 = j(dVar2.f12716b);
                w wVar2 = (w) aVarJ3.f12712a;
                w wVar3 = (w) aVarJ3.f12713b;
                sb.a aVarJ4 = j(dVar2.f12717c);
                w wVar4 = (w) aVarJ4.f12712a;
                w wVar5 = (w) aVarJ4.f12713b;
                r0 r0Var3 = dVar2.f12715a;
                sb.d dVar3 = new sb.d(r0Var3, wVar3, wVar4);
                sb.d dVar4 = new sb.d(r0Var3, wVar2, wVar5);
                arrayList.add(dVar3);
                arrayList2.add(dVar4);
            }
        }
        if (arrayList.isEmpty()) {
            z10 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            dVar = (sb.d) it.next();
            dVar.getClass();
        } while (ob.e.f9637a.b(dVar.f12716b, dVar.f12717c));
        return new sb.a(z10 ? n.l0(wVar).o() : H(wVar, arrayList), H(wVar, arrayList2));
    }

    public static final qc.h k(oc.b bVar) {
        i9.l.e(bVar, "<this>");
        qc.h hVar = bVar instanceof qc.h ? (qc.h) bVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException(ob.a.p(i9.y.f6689a, bVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static final nc.f m(String str, n4.h hVar, nc.e[] eVarArr, h9.k kVar) {
        i9.l.e(str, "serialName");
        if (zb.j.B0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (hVar.equals(nc.i.f9090c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        nc.a aVar = new nc.a(str);
        kVar.invoke(aVar);
        return new nc.f(str, hVar, aVar.f9063c.size(), u8.l.L0(eVarArr), aVar);
    }

    public static void n(int i7, int i10, int i11) {
        if (i7 >= 0 && i10 <= i11) {
            if (i7 > i10) {
                throw new IllegalArgumentException(a2.f.D(i7, i10, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i10 + ", size: " + i11);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    public static final s9.w o(g1 g1Var, boolean z10, Field field) {
        boolean z11;
        x9.k0 k0VarP = g1Var.p().j();
        x9.k kVarL = k0VarP.l();
        i9.l.d(kVarL, "getContainingDeclaration(...)");
        boolean z12 = true;
        if (za.d.l(kVarL)) {
            x9.k kVarL2 = kVarL.l();
            if ((za.d.n(kVarL2, x9.f.f14702b) || za.d.n(kVarL2, x9.f.f14705e)) && (!(k0VarP instanceof lb.q) || !va.g.d(((lb.q) k0VarP).A))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    z11 = false;
                    if (g1Var.p().j().getAnnotations().i(x1.f11793a)) {
                        if (z10) {
                        }
                    }
                    if (z10) {
                        if (g1Var.m()) {
                        }
                    }
                    if (g1Var.m()) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            z11 = false;
            if (g1Var.p().j().getAnnotations().i(x1.f11793a)) {
                return z10 ? new s9.l(field, z11, 2) : new s9.p(field, p(g1Var), z11, 2);
            }
            if (z10) {
                return g1Var.m() ? new s9.k(field, false) : new s9.l(field, z12, 1);
            }
            return g1Var.m() ? new s9.o(field, p(g1Var), false) : new s9.p(field, p(g1Var), z12, 1);
        }
        if (z10) {
            if (g1Var.m()) {
                return new s9.j(field, B(g1Var));
            }
            i9.l.e(field, "field");
            return new s9.l(field, z12, 0);
        }
        if (g1Var.m()) {
            return new s9.n(field, p(g1Var), B(g1Var));
        }
        boolean zP = p(g1Var);
        i9.l.e(field, "field");
        return new s9.p(field, zP, z12, 0);
    }

    public static final boolean p(g1 g1Var) {
        return !u0.e(g1Var.p().j().getType());
    }

    public static final Object q(Class cls, Map map, List list) {
        i9.l.e(cls, "annotationClass");
        i9.l.e(list, "methods");
        t8.o oVarD = t8.a.d(new aa.e(28, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new s9.d(cls, map, t8.a.d(new aa.j(16, cls, map)), oVarD, list));
        i9.l.c(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static o0 w(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            i9.l.b(objNewInstance);
            return (o0) objNewInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static final ca.c y(ca.b bVar, wa.b bVar2, ta.e eVar) {
        i9.l.e(bVar, "<this>");
        i9.l.e(bVar2, "classId");
        i9.l.e(eVar, "metadataVersion");
        l0.o0 o0VarA = bVar.a(bVar2, eVar);
        if (o0VarA != null) {
            return (ca.c) o0VarA.f7772b;
        }
        return null;
    }

    public static wa.b z(String str, boolean z10) {
        String strN0;
        i9.l.e(str, "string");
        int iZ0 = zb.j.z0(str, '`', 0, 6);
        if (iZ0 == -1) {
            iZ0 = str.length();
        }
        int iE0 = zb.j.E0(iZ0, 4, str, "/");
        String str2 = "";
        if (iE0 == -1) {
            strN0 = zb.q.n0(str, "`", "");
        } else {
            String strSubstring = str.substring(0, iE0);
            i9.l.d(strSubstring, "substring(...)");
            String strM0 = zb.q.m0(strSubstring, '/', '.');
            String strSubstring2 = str.substring(iE0 + 1);
            i9.l.d(strSubstring2, "substring(...)");
            strN0 = zb.q.n0(strSubstring2, "`", "");
            str2 = strM0;
        }
        return new wa.b(new wa.c(str2), new wa.c(strN0), z10);
    }

    public abstract String l();

    public abstract Typeface r(Context context, w3.e eVar, Resources resources, int i7);

    public abstract Typeface s(Context context, b4.m[] mVarArr, int i7);

    public Typeface t(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public String toString() {
        switch (this.f8766a) {
            case 18:
                return l();
            default:
                return super.toString();
        }
    }

    public Typeface u(Context context, InputStream inputStream) {
        File fileI = n4.h.I(context);
        if (fileI == null) {
            return null;
        }
        try {
            if (n4.h.w(fileI, inputStream)) {
                return Typeface.createFromFile(fileI.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileI.delete();
        }
    }

    public Typeface v(Context context, Resources resources, int i7, String str, int i10) {
        File fileI = n4.h.I(context);
        if (fileI == null) {
            return null;
        }
        try {
            if (n4.h.v(fileI, resources, i7)) {
                return Typeface.createFromFile(fileI.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileI.delete();
        }
    }

    public b4.m x(b4.m[] mVarArr, int i7) {
        new n4.e(23);
        int i10 = (i7 & 1) == 0 ? 400 : 700;
        boolean z10 = (i7 & 2) != 0;
        b4.m mVar = null;
        int i11 = Integer.MAX_VALUE;
        for (b4.m mVar2 : mVarArr) {
            int iAbs = (Math.abs(mVar2.f1505c - i10) * 2) + (mVar2.f1506d == z10 ? 0 : 1);
            if (mVar == null || i11 > iAbs) {
                mVar = mVar2;
                i11 = iAbs;
            }
        }
        return mVar;
    }
}
