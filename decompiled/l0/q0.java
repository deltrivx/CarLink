package l0;

import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.w1;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f7799a = new m0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2.a f7800b = new k2.a(1022);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e4.n f7801c;

    static {
        int i7 = 0;
        f7801c = new e4.n(i7, i7, 3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void a(java.lang.String r29, r1.p r30, b3.r0 r31, int r32, boolean r33, int r34, int r35, f1.s r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.q0.a(java.lang.String, r1.p, b3.r0, int, boolean, int, int, f1.s, int, int):void");
    }

    public static final void b(final String str, final r1.p pVar, final b3.r0 r0Var, final int i7, final boolean z10, final int i10, final int i11, f1.s sVar, final int i12) {
        int i13;
        sVar.Y(-1186827822);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(pVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.f(r0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(null) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.d(i7) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar.g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= sVar.d(i10) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= sVar.d(i11) ? 8388608 : 4194304;
        }
        int i14 = i13 | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR;
        if (sVar.N(i14 & 1, (38347923 & i14) != 38347922)) {
            a(str, pVar, r0Var, i7, z10, i10, i11, sVar, i14 & 268435454, 512);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l0.k
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q0.b(str, pVar, r0Var, i7, z10, i10, i11, (f1.s) obj, f1.b.y(i12 | 1));
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final void c(w0.w0 w0Var, n1.c cVar, f1.s sVar, int i7) {
        sVar.Y(-954926513);
        int i10 = (sVar.h(w0Var) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            sVar.W(1647828491);
            y8.c cVar2 = null;
            n3.l.f(androidx.compose.foundation.text.contextmenu.modifier.a.c(androidx.compose.foundation.text.contextmenu.modifier.a.b(new w0.v0(w0Var, cVar2, 0)), w0Var.f13985g, new w0.v0(w0Var, cVar2, 1), null, new w0.e0(w0Var, 1)), cVar, sVar, 48);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 11, w0Var, cVar);
        }
    }

    public static final void d(w0.t1 t1Var, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        r1.p pVarC;
        sVar.Y(2080741862);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(t1Var) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            sVar.W(-1881943916);
            if (t1Var.j()) {
                y8.c cVar2 = null;
                pVarC = androidx.compose.foundation.text.contextmenu.modifier.a.c(androidx.compose.foundation.text.contextmenu.modifier.a.b(new w0.k1(t1Var, cVar2, 0)), t1Var.f13961x, new w0.k1(t1Var, cVar2, 1), new w0.l1(t1Var, cVar2, 0), new v(t1Var, 2));
            } else {
                pVarC = r1.m.f11116a;
            }
            n3.l.f(pVarC, cVar, sVar, i10 & 112);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 4, t1Var, cVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v12 w1.o
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void e(final g3.w r64, final h9.k r65, final r1.p r66, final b3.r0 r67, final b3.l0 r68, final h9.k r69, final b0.k r70, final y1.n0 r71, final boolean r72, final int r73, final int r74, final g3.k r75, final l0.r0 r76, final boolean r77, final n1.c r78, f1.s r79, final int r80, final int r81) {
        /*
            Method dump skipped, instruction units count: 2585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.q0.e(g3.w, h9.k, r1.p, b3.r0, b3.l0, h9.k, b0.k, y1.n0, boolean, int, int, g3.k, l0.r0, boolean, n1.c, f1.s, int, int):void");
    }

    public static final void f(r1.p pVar, w0.t1 t1Var, n1.c cVar, f1.s sVar, int i7) {
        sVar.Y(2036174316);
        int i10 = (sVar.f(pVar) ? 4 : 2) | i7 | (sVar.h(t1Var) ? 32 : 16);
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            o2.m0 m0VarD = d0.m.d(r1.c.f11092a, true);
            long j5 = sVar.T;
            int i11 = (int) ((j5 >>> 32) ^ j5);
            f1.q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, pVar);
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
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            d(t1Var, cVar, sVar, (i10 >> 3) & 126);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.l(pVar, t1Var, cVar, i7, 3);
        }
    }

    public static final void g(w0.t1 t1Var, boolean z10, f1.s sVar, int i7) {
        s1 s1VarD;
        sVar.Y(626339208);
        int i10 = (sVar.h(t1Var) ? 4 : 2) | i7 | (sVar.g(z10) ? 32 : 16);
        if (!sVar.N(i10 & 1, (i10 & 19) != 18)) {
            sVar.Q();
        } else if (z10) {
            sVar.W(1529773841);
            u0 u0Var = t1Var.f13942d;
            b3.o0 o0Var = null;
            if (u0Var != null && (s1VarD = u0Var.d()) != null) {
                b3.o0 o0Var2 = s1VarD.f7828a;
                u0 u0Var2 = t1Var.f13942d;
                if (!(u0Var2 != null ? u0Var2.f7862p : true)) {
                    o0Var = o0Var2;
                }
            }
            if (o0Var == null) {
                sVar.W(1530097387);
            } else {
                sVar.W(1530097388);
                if (b3.q0.c(t1Var.m().f5890b)) {
                    sVar.W(2110860558);
                    sVar.p(false);
                } else {
                    sVar.W(2109807302);
                    int iB = t1Var.f13940b.b((int) (t1Var.m().f5890b >> 32));
                    int iB2 = t1Var.f13940b.b((int) (t1Var.m().f5890b & 4294967295L));
                    m3.j jVarA = o0Var.a(iB);
                    m3.j jVarA2 = o0Var.a(Math.max(iB2 - 1, 0));
                    u0 u0Var3 = t1Var.f13942d;
                    if (u0Var3 == null || !((Boolean) u0Var3.f7859m.getValue()).booleanValue()) {
                        sVar.W(2110490542);
                        sVar.p(false);
                    } else {
                        sVar.W(2110225306);
                        w0.y0.g(true, jVarA, t1Var, sVar, ((i10 << 6) & 896) | 6);
                        sVar.p(false);
                    }
                    u0 u0Var4 = t1Var.f13942d;
                    if (u0Var4 == null || !((Boolean) u0Var4.f7860n.getValue()).booleanValue()) {
                        sVar.W(2110838734);
                        sVar.p(false);
                    } else {
                        sVar.W(2110574459);
                        w0.y0.g(false, jVarA2, t1Var, sVar, ((i10 << 6) & 896) | 6);
                        sVar.p(false);
                    }
                    sVar.p(false);
                }
                u0 u0Var5 = t1Var.f13942d;
                if (u0Var5 != null) {
                    f1.k1 k1Var = u0Var5.f7858l;
                    if (!i9.l.a(t1Var.f13957t.f5889a.f1353b, t1Var.m().f5889a.f1353b)) {
                        k1Var.setValue(Boolean.FALSE);
                    }
                    if (u0Var5.b()) {
                        if (((Boolean) k1Var.getValue()).booleanValue()) {
                            t1Var.q();
                        } else {
                            t1Var.n();
                        }
                    }
                }
            }
            sVar.p(false);
            sVar.p(false);
        } else {
            sVar.W(1989076778);
            sVar.p(false);
            t1Var.n();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new p(t1Var, z10, i7);
        }
    }

    public static final void h(w0.t1 t1Var, f1.s sVar, int i7) {
        b3.h hVarL;
        sVar.Y(-1436003720);
        int i10 = 2;
        int i11 = (sVar.h(t1Var) ? 4 : 2) | i7;
        int i12 = 0;
        if (sVar.N(i11 & 1, (i11 & 3) != 2)) {
            u0 u0Var = t1Var.f13942d;
            if (u0Var == null || !((Boolean) u0Var.f7861o.getValue()).booleanValue() || (hVarL = t1Var.l()) == null || hVarL.f1353b.length() <= 0) {
                sVar.W(-2111021718);
                sVar.p(false);
            } else {
                sVar.W(-2112330600);
                boolean zF = sVar.f(t1Var);
                Object objK = sVar.K();
                f1.w0 w0Var = f1.n.f5051a;
                if (zF || objK == w0Var) {
                    objK = new w0.n1(t1Var);
                    sVar.h0(objK);
                }
                b1 b1Var = (b1) objK;
                n3.c cVar = (n3.c) sVar.j(r2.j1.f11276h);
                g3.q qVar = t1Var.f13940b;
                long j5 = t1Var.m().f5890b;
                int i13 = b3.q0.f1429c;
                int iB = qVar.b((int) (j5 >> 32));
                u0 u0Var2 = t1Var.f13942d;
                s1 s1VarD = u0Var2 != null ? u0Var2.d() : null;
                i9.l.b(s1VarD);
                b3.o0 o0Var = s1VarD.f7828a;
                x1.c cVarC = o0Var.c(n3.r.m(iB, 0, o0Var.f1408a.f1393a.f1353b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((cVar.R(d1.f7626a) / 2) + cVarC.f14523a)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f14526d)) & 4294967295L);
                boolean zE = sVar.e(jFloatToRawIntBits);
                Object objK2 = sVar.K();
                if (zE || objK2 == w0Var) {
                    objK2 = new b0(jFloatToRawIntBits);
                    sVar.h0(objK2);
                }
                w0.q qVar2 = (w0.q) objK2;
                boolean zH = sVar.h(b1Var) | sVar.h(t1Var);
                Object objK3 = sVar.K();
                if (zH || objK3 == w0Var) {
                    objK3 = new e0(i12, b1Var, t1Var);
                    sVar.h0(objK3);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(b1Var, null, (PointerInputEventHandler) objK3, 6);
                boolean zE2 = sVar.e(jFloatToRawIntBits);
                Object objK4 = sVar.K();
                if (zE2 || objK4 == w0Var) {
                    objK4 = new fc.g(i10, jFloatToRawIntBits);
                    sVar.h0(objK4);
                }
                f.a(qVar2, y2.k.a(suspendPointerInputElement, (h9.k) objK4), 0L, sVar, 0);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 15, t1Var);
        }
    }

    public static final x1.c i(o2.u0 u0Var, int i7, g3.d0 d0Var, b3.o0 o0Var, boolean z10, int i10) {
        x1.c cVarC = o0Var != null ? o0Var.c(d0Var.f5853b.b(i7)) : x1.c.f14522e;
        float f10 = cVarC.f14523a;
        float f11 = d1.f7626a;
        u0Var.getClass();
        int iJ = a2.f.j(f11, u0Var);
        return x1.c.a(cVarC, z10 ? (i10 - f10) - iJ : f10, z10 ? i10 - f10 : iJ + f10, 0.0f, 10);
    }

    public static final boolean j(int i7, KeyEvent keyEvent) {
        return ((int) (i2.c.F(keyEvent) >> 32)) == i7;
    }

    public static final int k(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final Object l(k2.z zVar, b1 b1Var, y8.c cVar) {
        Object objG = cc.b0.g(new a8.e0(zVar, b1Var, null, 1), cVar);
        return objG == z8.a.f15774a ? objG : t8.z.f12851a;
    }

    public static final void m(u0 u0Var) {
        g3.c0 c0Var = u0Var.f7852e;
        if (c0Var != null) {
            u0Var.f7868v.invoke(g3.w.a((g3.w) u0Var.f7851d.f604b, null, 0L, 3));
            g3.x xVar = c0Var.f5850a;
            AtomicReference atomicReference = xVar.f5893b;
            while (!atomicReference.compareAndSet(c0Var, null)) {
                if (atomicReference.get() != c0Var) {
                }
            }
            xVar.f5892a.c();
        }
        u0Var.f7852e = null;
    }

    public static final g3.d0 n(b3.l0 l0Var, b3.h hVar) {
        l0Var.getClass();
        int length = hVar.f1353b.length();
        int length2 = hVar.f1353b.length();
        int iMin = Math.min(length, 100);
        for (int i7 = 0; i7 < iMin; i7++) {
            y(i7, length2, i7);
        }
        y(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i10 = 0; i10 < iMin2; i10++) {
            z(i10, length, i10);
        }
        z(length2, length, length2);
        return new g3.d0(hVar, new e4.n(hVar.f1353b.length(), hVar.f1353b.length(), 3));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a2.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static final int o(int i7, String str) {
        ?? r8;
        ?? r10;
        int spanEnd;
        l4.j jVarS = s();
        Integer num = null;
        if (jVarS != null) {
            if (!(jVarS.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            k9.a.l(str, "charSequence cannot be null");
            ?? r11 = jVarS.f8008e.f8001b;
            r11.getClass();
            if (i7 < 0 || i7 >= str.length()) {
                r10 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                l4.x[] xVarArr = (l4.x[]) spanned.getSpans(i7, i7 + 1, l4.x.class);
                if (xVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(xVarArr[0]);
                    r10 = str;
                } else {
                    ?? r12 = str;
                    spanEnd = ((l4.p) r11.S(r12, Math.max(0, i7 - 16), Math.min(str.length(), i7 + 16), Integer.MAX_VALUE, true, new l4.p(i7))).f8022c;
                    r10 = r12;
                }
            } else {
                ?? r13 = str;
                spanEnd = ((l4.p) r11.S(r13, Math.max(0, i7 - 16), Math.min(str.length(), i7 + 16), Integer.MAX_VALUE, true, new l4.p(i7))).f8022c;
                r10 = r13;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r8 = r10;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r8 = str;
        }
        if (num != null) {
            r8 = r10;
            return num.intValue();
        }
        r8 = r10;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r8);
        return characterInstance.following(i7);
    }

    public static final int p(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        while (i7 < length) {
            if (charSequence.charAt(i7) == '\n') {
                return i7;
            }
            i7++;
        }
        return charSequence.length();
    }

    public static final int q(CharSequence charSequence, int i7) {
        while (i7 > 0) {
            if (charSequence.charAt(i7 - 1) == '\n') {
                return i7;
            }
            i7--;
        }
        return 0;
    }

    public static final int r(int i7, String str) {
        l4.j jVarS = s();
        Integer num = null;
        if (jVarS != null) {
            Integer numValueOf = Integer.valueOf(jVarS.b(str, Math.max(0, i7 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i7);
    }

    public static final l4.j s() {
        if (!l4.j.d()) {
            return null;
        }
        l4.j jVarA = l4.j.a();
        if (jVarA.c() == 1) {
            return jVarA;
        }
        return null;
    }

    public static final float t(b3.o0 o0Var, int i7) {
        if (i7 < 0) {
            return 0.0f;
        }
        b3.n0 n0Var = o0Var.f1408a;
        b3.p pVar = o0Var.f1409b;
        if (n0Var.f1393a.f1353b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(pVar.d(i7), Math.min(pVar.f1415b - 1, pVar.f1419f - 1));
        if (i7 > pVar.c(iMin, false)) {
            return 0.0f;
        }
        pVar.m(iMin);
        ArrayList arrayList = pVar.f1421h;
        b3.s sVar = (b3.s) arrayList.get(b3.g0.e(iMin, arrayList));
        b3.b bVar = sVar.f1441a;
        int i10 = iMin - sVar.f1444d;
        c3.n nVar = bVar.f1310d;
        return nVar.e(i10) - nVar.g(i10);
    }

    public static final void u(u0 u0Var, g3.w wVar, g3.q qVar) {
        p1.f fVarH = n4.e.h();
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            s1 s1VarD = u0Var.d();
            if (s1VarD == null) {
                return;
            }
            g3.c0 c0Var = u0Var.f7852e;
            if (c0Var == null) {
                return;
            }
            o2.w wVarC = u0Var.c();
            if (wVarC == null) {
                return;
            }
            v(wVar, u0Var.f7848a, s1VarD.f7828a, wVarC, c0Var, u0Var.b(), qVar);
        } finally {
            n4.e.r(fVarH, fVarK, kVarE);
        }
    }

    public static void v(g3.w wVar, a1 a1Var, b3.o0 o0Var, o2.w wVar2, g3.c0 c0Var, boolean z10, g3.q qVar) {
        x1.c cVarB;
        if (z10) {
            int iB = qVar.b(b3.q0.e(wVar.f5890b));
            String str = e1.f7631a;
            if (iB < o0Var.f1408a.f1393a.f1353b.length()) {
                cVarB = o0Var.b(iB);
            } else {
                cVarB = iB != 0 ? o0Var.b(iB - 1) : new x1.c(0.0f, 0.0f, 1.0f, (int) (new n3.m(e1.a(a1Var.f7592b, a1Var.f7597g, a1Var.f7598h, e1.f7631a, 1)).f8746a & 4294967295L));
            }
            float f10 = cVarB.f14524b;
            float f11 = cVarB.f14523a;
            long jE = wVar2.E((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
            x1.c cVarC = n3.u.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jE & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jE >> 32)))) << 32), (((long) Float.floatToRawIntBits(cVarB.f14525c - f11)) << 32) | (((long) Float.floatToRawIntBits(cVarB.f14526d - f10)) & 4294967295L));
            if (i9.l.a((g3.c0) c0Var.f5850a.f5893b.get(), c0Var)) {
                c0Var.f5851b.e(cVarC);
            }
        }
    }

    public static final void w(g3.x xVar, u0 u0Var, g3.w wVar, g3.k kVar, g3.q qVar) {
        android.support.v4.media.session.r rVar = u0Var.f7851d;
        s sVar = u0Var.f7868v;
        s sVar2 = u0Var.f7869w;
        i9.x xVar2 = new i9.x();
        a8.u0 u0Var2 = new a8.u0(rVar, sVar, xVar2, 2);
        g3.r rVar2 = xVar.f5892a;
        rVar2.d(wVar, kVar, u0Var2, sVar2);
        g3.c0 c0Var = new g3.c0(xVar, rVar2);
        xVar.f5893b.set(c0Var);
        xVar2.f6688a = c0Var;
        u0Var.f7852e = c0Var;
        u(u0Var, wVar, qVar);
    }

    public static final void x(int i7, int i10) {
        if (i7 <= 0 || i10 <= 0) {
            c0.b.a("both minLines " + i7 + " and maxLines " + i10 + " must be greater than zero");
        }
        if (i7 <= i10) {
            return;
        }
        c0.b.a("minLines " + i7 + " must be less than or equal to maxLines " + i10);
    }

    public static final void y(int i7, int i10, int i11) {
        boolean z10 = false;
        if (i7 >= 0 && i7 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        c0.b.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i11 + " -> " + i7 + " is not in range of transformed text [0, " + i10 + ']');
    }

    public static final void z(int i7, int i10, int i11) {
        boolean z10 = false;
        if (i7 >= 0 && i7 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        c0.b.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i11 + " -> " + i7 + " is not in range of original text [0, " + i10 + ']');
    }
}
