package w0;

import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import r2.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1.c f14012a = new x1.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static y1.f f14013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static y1.b f14014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a2.c f14015d;

    public static final void a(q qVar, r1.d dVar, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(-1090171650);
        if ((i7 & 6) == 0) {
            i10 = ((i7 & 8) == 0 ? sVar.f(qVar) : sVar.h(qVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(dVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(cVar) ? 256 : 128;
        }
        boolean z10 = true;
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            boolean z11 = (i10 & 112) == 32;
            if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !sVar.f(qVar))) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objK = sVar.K();
            if (z12 || objK == f1.n.f5051a) {
                objK = new m(dVar, qVar);
                sVar.h0(objK);
            }
            r3.l.a((m) objK, null, new r3.z(false, r3.a0.f11527a, false), cVar, sVar, ((i10 << 3) & 7168) | 384, 2);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h0.u(qVar, dVar, cVar, i7, 8);
        }
    }

    public static final void b(r1.p pVar, n1.c cVar, f1.s sVar, int i7) {
        n1.c cVar2;
        f1.s sVar2;
        sVar.Y(1949207773);
        int i10 = i7 | 6;
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(null);
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            z zVar = (z) b1Var.getValue();
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new f8.h(b1Var, 7);
                sVar.h0(objK2);
            }
            r1.m mVar = r1.m.f11116a;
            cVar2 = cVar;
            sVar2 = sVar;
            c(mVar, zVar, (h9.k) objK2, cVar2, sVar2, 3462);
            pVar = mVar;
        } else {
            cVar2 = cVar;
            sVar2 = sVar;
            sVar2.Q();
        }
        f1.w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new d0(pVar, cVar2, i7, 0);
        }
    }

    public static final void c(r1.p pVar, z zVar, h9.k kVar, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(-917932944);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(zVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(kVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = new n8.f(29);
                sVar.h0(objK);
            }
            d1 d1Var = (d1) o1.k.d(objArr, d1.f13761l, (h9.a) objK, sVar, 384);
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                objK2 = new w0(d1Var);
                sVar.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            Object obj2 = (r2.e1) sVar.j(r2.j1.f11274f);
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = f1.b.l(sVar);
                sVar.h0(objK3);
            }
            cc.y yVar = (cc.y) objK3;
            w0Var.f13983e = (g2.a) sVar.j(r2.j1.f11279l);
            boolean zF = sVar.f(yVar) | sVar.f(obj2);
            Object objK4 = sVar.K();
            if (zF || objK4 == obj) {
                objK4 = new c8.p(19, yVar, obj2);
                sVar.h0(objK4);
            }
            w0Var.f13984f = (h9.k) objK4;
            w0Var.f13982d = new c8.p(20, w0Var, kVar);
            w0Var.m(zVar);
            sVar.W(-82306500);
            w0Var.f14000w = v.b(x.f14005b, null, sVar, 54);
            w0Var.f13999v = yVar;
            sVar.p(false);
            l0.e0 e0Var = new l0.e0(2, w0Var, new f0(w0Var, 3));
            r1.p pVarA = r1.m.f11116a;
            r1.p pVarA2 = androidx.compose.ui.input.key.a.a(k2.h0.c(androidx.compose.foundation.a.f(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(androidx.compose.ui.layout.a.d(k2.h0.c(pVarA, t8.z.f12851a, e0Var), new e0(w0Var, 4)), w0Var.f13986h), new e0(w0Var, 5)), true, null), 8675309, new q7.g(3, new e0(w0Var, 6))), new aa.a(27, w0Var));
            if (w0Var.f() != null && w0Var.h()) {
                z zVarG = w0Var.g();
                if (!(zVarG != null ? i9.l.a(zVarG.f14018a, zVarG.f14019b) : true) && x.u0.a()) {
                    pVarA = r1.a.a(pVarA, new e8.r0(6, w0Var));
                }
            }
            f(pVar.a(androidx.compose.foundation.text.contextmenu.modifier.a.a(pVarA2.a(pVarA), new b3.a(24, w0Var))), n1.h.e(-1799563674, new h0(w0Var, d1Var, cVar), sVar), sVar, 48);
            boolean zH = sVar.h(w0Var);
            Object objK5 = sVar.K();
            if (zH || objK5 == obj) {
                objK5 = new e0(w0Var, 0);
                sVar.h0(objK5);
            }
            f1.b.c(w0Var, (h9.k) objK5, sVar);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c8.q(pVar, zVar, kVar, cVar, i7);
        }
    }

    public static final void d(final q qVar, final boolean z10, final m3.j jVar, final boolean z11, long j5, final float f10, final SuspendPointerInputElement suspendPointerInputElement, f1.s sVar, final int i7) {
        int i10;
        long j10;
        int i11;
        long j11;
        final boolean z12;
        sVar.Y(-466280168);
        if ((i7 & 6) == 0) {
            i10 = ((i7 & 8) == 0 ? sVar.f(qVar) : sVar.h(qVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.g(z10) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.d(jVar.ordinal()) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.g(z11) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((1572864 & i7) == 0) {
            i10 |= sVar.f(suspendPointerInputElement) ? 1048576 : 524288;
        }
        if (sVar.N(i10 & 1, (533651 & i10) != 533650)) {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                i11 = i10 & (-57345);
                j11 = 9205357640488583168L;
            } else {
                sVar.Q();
                i11 = i10 & (-57345);
                j11 = j5;
            }
            sVar.q();
            m3.j jVar2 = m3.j.f8417b;
            m3.j jVar3 = m3.j.f8416a;
            if (z10) {
                float f11 = o0.f13868a;
                z12 = (jVar == jVar3 && !z11) || (jVar == jVar2 && z11);
            } else {
                float f12 = o0.f13868a;
                z12 = !((jVar == jVar3 && !z11) || (jVar == jVar2 && z11));
            }
            r1.e eVar = z12 ? r1.a.f11090b : r1.a.f11089a;
            int i12 = i11 & 14;
            boolean zG = (i12 == 4 || ((i11 & 8) != 0 && sVar.h(qVar))) | ((i11 & 112) == 32) | sVar.g(z12);
            Object objK = sVar.K();
            if (zG || objK == f1.n.f5051a) {
                objK = new h9.k() { // from class: w0.a
                    @Override // h9.k
                    public final Object invoke(Object obj) {
                        y2.j jVar4 = (y2.j) obj;
                        long jA = qVar.a();
                        jVar4.n(o0.f13870c, new n0(z10 ? l0.h0.f7652b : l0.h0.f7653c, jA, z12 ? m0.f13850a : m0.f13852c, (9223372034707292159L & jA) != 9205357640488583168L));
                        return t8.z.f12851a;
                    }
                };
                sVar.h0(objK);
            }
            long j12 = j11;
            r1.e eVar2 = eVar;
            j10 = j12;
            a(qVar, eVar2, n1.h.e(1365123137, new f((r2) sVar.j(r2.j1.f11286s), j10, z12, y2.k.a(suspendPointerInputElement, (h9.k) objK), qVar), sVar), sVar, i12 | 384);
        } else {
            sVar.Q();
            j10 = j5;
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            final long j13 = j10;
            w1VarR.f5192d = new h9.n() { // from class: w0.b
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y0.d(qVar, z10, jVar, z11, j13, f10, suspendPointerInputElement, (f1.s) obj, f1.b.y(i7 | 1));
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final void e(r1.p pVar, h9.a aVar, boolean z10, f1.s sVar, int i7) {
        int i10;
        sVar.Y(2111672474);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i11 = i10 | (sVar.h(aVar) ? 32 : 16) | (sVar.g(z10) ? 256 : 128);
        if (sVar.N(i11 & 1, (i11 & 147) != 146)) {
            d0.c.a(sVar, r1.a.a(androidx.compose.foundation.layout.c.i(pVar, o0.f13868a, o0.f13869b), new i(aVar, z10)));
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c(pVar, aVar, z10, i7);
        }
    }

    public static final void f(r1.p pVar, n1.c cVar, f1.s sVar, int i7) {
        sVar.Y(-1854833411);
        int i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = g1.f13792a;
                sVar.h0(objK);
            }
            o2.m0 m0Var = (o2.m0) objK;
            long j5 = sVar.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
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
            f1.b.w(sVar, q2.i.f10708e, m0Var);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            cVar.invoke(sVar, 6);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new d0(pVar, cVar, i7, 1);
        }
    }

    public static final void g(boolean z10, m3.j jVar, t1 t1Var, f1.s sVar, int i7) {
        int i10;
        l0.s1 s1VarD;
        sVar.Y(-1344558920);
        if ((i7 & 6) == 0) {
            i10 = (sVar.g(z10) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(t1Var) ? 256 : 128;
        }
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            int i11 = i10 & 14;
            boolean zF = (i11 == 4) | sVar.f(t1Var);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (zF || objK == obj) {
                objK = new p1(t1Var, z10);
                sVar.h0(objK);
            }
            l0.b1 b1Var = (l0.b1) objK;
            boolean zH = sVar.h(t1Var) | (i11 == 4);
            Object objK2 = sVar.K();
            if (zH || objK2 == obj) {
                objK2 = new u1(t1Var, z10);
                sVar.h0(objK2);
            }
            q qVar = (q) objK2;
            boolean zG = b3.q0.g(t1Var.m().f5890b);
            int i12 = (int) (z10 ? t1Var.m().f5890b >> 32 : t1Var.m().f5890b & 4294967295L);
            l0.u0 u0Var = t1Var.f13942d;
            float fT = (u0Var == null || (s1VarD = u0Var.d()) == null) ? 0.0f : l0.q0.t(s1VarD.f7828a, i12);
            boolean zH2 = sVar.h(b1Var);
            Object objK3 = sVar.K();
            if (zH2 || objK3 == obj) {
                objK3 = new g0(b1Var, 1);
                sVar.h0(objK3);
            }
            d(qVar, z10, jVar, zG, 0L, fT, new SuspendPointerInputElement(b1Var, null, (PointerInputEventHandler) objK3, 6), sVar, (i10 << 3) & 1008);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c(z10, jVar, t1Var, i7);
        }
    }

    public static final z h(p0 p0Var, j jVar) {
        boolean z10 = p0Var.h() == k.f13824a;
        return new z(m(p0Var.j(), z10, true, p0Var.k(), jVar), m(p0Var.g(), z10, false, p0Var.f(), jVar), z10);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[LOOP:0: B:19:0x004a->B:23:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object i(k2.l0 r6, a9.a r7) {
        /*
            boolean r0 = r7 instanceof w0.j0
            if (r0 == 0) goto L13
            r0 = r7
            w0.j0 r0 = (w0.j0) r0
            int r1 = r0.f13814c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13814c = r1
            goto L18
        L13:
            w0.j0 r0 = new w0.j0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13813b
            int r1 = r0.f13814c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            k2.l0 r6 = r0.f13812a
            t8.a.e(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            t8.a.e(r7)
        L32:
            r0.f13812a = r6
            r0.f13814c = r2
            k2.o r7 = k2.o.f7270b
            java.lang.Object r7 = r6.b(r7, r0)
            z8.a r1 = z8.a.f15774a
            if (r7 != r1) goto L41
            return r1
        L41:
            k2.n r7 = (k2.n) r7
            java.lang.Object r1 = r7.f7264a
            int r3 = r1.size()
            r4 = 0
        L4a:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r1.get(r4)
            k2.v r5 = (k2.v) r5
            boolean r5 = k2.u.a(r5)
            if (r5 != 0) goto L59
            goto L32
        L59:
            int r4 = r4 + 1
            goto L4a
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.y0.i(k2.l0, a9.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public static final Object j(k2.l0 l0Var, n nVar, g7.l lVar, k2.n nVar2, a9.a aVar) {
        k0 k0Var;
        a0 a0Var;
        i9.t tVar;
        ?? r8;
        int size;
        k2.v vVar;
        k2.l0 l0Var2 = l0Var;
        n nVar3 = nVar;
        a0 a0Var2 = b0.f13737d;
        if (aVar instanceof k0) {
            k0Var = (k0) aVar;
            int i7 = k0Var.f13832e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                k0Var.f13832e = i7 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(aVar);
            }
        } else {
            k0Var = new k0(aVar);
        }
        Object objF = k0Var.f13831d;
        int i10 = k0Var.f13832e;
        int i11 = 0;
        if (i10 == 0) {
            t8.a.e(objF);
            r2 r2Var = (r2) lVar.f5999c;
            k2.v vVar2 = (k2.v) lVar.f6000d;
            k2.v vVar3 = (k2.v) nVar2.f7264a.get(0);
            if (vVar2 == null || vVar3.f7279b - vVar2.f7279b >= r2Var.a()) {
                lVar.f5998b = 1;
            } else {
                if (x1.b.c(x1.b.g(vVar2.f7280c, vVar3.f7280c)) < z.y.i(r2Var, vVar2.f7286i)) {
                    lVar.f5998b++;
                } else {
                    lVar.f5998b = 1;
                }
            }
            lVar.f6000d = vVar3;
            k2.v vVar4 = (k2.v) nVar2.f7264a.get(0);
            int i12 = lVar.f5998b;
            if (i12 != 1) {
                a0Var = i12 != 2 ? b0.f13739f : b0.f13738e;
            } else {
                a0Var = a0Var2;
            }
            if (nVar3.d(vVar4.f7280c, a0Var, i12)) {
                tVar = new i9.t();
                tVar.f6684a = !a0Var.equals(a0Var2);
                long j5 = vVar4.f7278a;
                a8.u0 u0Var = new a8.u0(nVar3, a0Var, tVar, 11);
                k0Var.f13828a = l0Var2;
                k0Var.f13829b = nVar3;
                k0Var.f13830c = tVar;
                k0Var.f13832e = 2;
                objF = z.y.f(l0Var2, j5, u0Var, k0Var);
                z8.a aVar2 = z8.a.f15774a;
                if (objF == aVar2) {
                    return aVar2;
                }
                if (((Boolean) objF).booleanValue()) {
                    r8 = l0Var2.f7251f.f7258s.f7264a;
                    size = r8.size();
                    while (i11 < size) {
                        vVar = (k2.v) r8.get(i11);
                        if (k2.u.b(vVar)) {
                            vVar.a();
                        }
                        i11++;
                    }
                }
                nVar3.a();
            }
        } else if (i10 == 1) {
            n nVar4 = k0Var.f13829b;
            k2.l0 l0Var3 = k0Var.f13828a;
            t8.a.e(objF);
            if (((Boolean) objF).booleanValue()) {
                ?? r10 = l0Var3.f7251f.f7258s.f7264a;
                int size2 = r10.size();
                while (i11 < size2) {
                    k2.v vVar5 = (k2.v) r10.get(i11);
                    if (k2.u.b(vVar5)) {
                        vVar5.a();
                    }
                    i11++;
                }
            }
            nVar4.a();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9.t tVar2 = k0Var.f13830c;
            nVar3 = k0Var.f13829b;
            k2.l0 l0Var4 = k0Var.f13828a;
            t8.a.e(objF);
            tVar = tVar2;
            l0Var2 = l0Var4;
            if (((Boolean) objF).booleanValue() && tVar.f6684a) {
                r8 = l0Var2.f7251f.f7258s.f7264a;
                size = r8.size();
                while (i11 < size) {
                    vVar = (k2.v) r8.get(i11);
                    if (k2.u.b(vVar)) {
                        vVar.a();
                    }
                    i11++;
                }
            }
            nVar3.a();
        }
        return t8.z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(k2.l0 r11, l0.b1 r12, k2.n r13, a9.a r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.y0.k(k2.l0, l0.b1, k2.n, a9.a):java.lang.Object");
    }

    public static final y l(final p0 p0Var, final w wVar, y yVar) {
        final int i7 = p0Var.a() ? wVar.f13975c : wVar.f13976d;
        int iK = p0Var.a() ? p0Var.k() : p0Var.f();
        int i10 = wVar.f13974b;
        b3.o0 o0Var = wVar.f13978f;
        int i11 = wVar.f13977e;
        if (iK != i10) {
            return wVar.a(i7);
        }
        l8.u uVar = new l8.u(i7, 1, wVar);
        t8.i iVar = t8.i.f12828b;
        final t8.h hVarC = t8.a.c(iVar, uVar);
        final int i12 = p0Var.a() ? wVar.f13976d : wVar.f13975c;
        t8.h hVarC2 = t8.a.c(iVar, new h9.a() { // from class: w0.c0
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t8.h] */
            @Override // h9.a
            public final Object invoke() {
                int iIntValue = ((Number) hVarC.getValue()).intValue();
                p0 p0Var2 = p0Var;
                boolean zA = p0Var2.a();
                boolean z10 = p0Var2.h() == k.f13824a;
                w wVar2 = wVar;
                b3.o0 o0Var2 = wVar2.f13978f;
                int i13 = i7;
                long j5 = o0Var2.j(i13);
                b3.o0 o0Var3 = wVar2.f13978f;
                b3.p pVar = o0Var3.f1409b;
                int i14 = b3.q0.f1429c;
                int iG = (int) (j5 >> 32);
                int iD = pVar.d(iG);
                int i15 = pVar.f1419f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i15 ? o0Var3.g(i15 - 1) : o0Var3.g(iIntValue);
                }
                int iC = (int) (j5 & 4294967295L);
                if (pVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i15 ? pVar.c(i15 - 1, false) : pVar.c(iIntValue, false);
                }
                int i16 = i12;
                if (iG == i16) {
                    return wVar2.a(iC);
                }
                if (iC == i16) {
                    return wVar2.a(iG);
                }
                if (!(zA ^ z10) ? i13 >= iG : i13 > iC) {
                    iG = iC;
                }
                return wVar2.a(iG);
            }
        });
        if (wVar.f13973a != yVar.f14011c) {
            return (y) hVarC2.getValue();
        }
        if (i7 == i11) {
            return yVar;
        }
        if (((Number) hVarC.getValue()).intValue() != o0Var.f1409b.d(i11)) {
            return (y) hVarC2.getValue();
        }
        int i13 = yVar.f14010b;
        long j5 = o0Var.j(i13);
        boolean zA = p0Var.a();
        if (i11 != -1) {
            if (i7 != i11) {
                if (((zA ? 1 : 0) ^ (wVar.b() != k.f13824a ? 0 : 1)) == 0) {
                }
            }
            return wVar.a(i7);
        }
        int i14 = b3.q0.f1429c;
        return (i13 == ((int) (j5 >> 32)) || i13 == ((int) (j5 & 4294967295L))) ? (y) hVarC2.getValue() : wVar.a(i7);
    }

    public static final y m(w wVar, boolean z10, boolean z11, int i7, j jVar) {
        long j5;
        int i10 = z11 ? wVar.f13975c : wVar.f13976d;
        if (i7 != wVar.f13974b) {
            return wVar.a(i10);
        }
        long jA = jVar.a(wVar, i10);
        if (z10 ^ z11) {
            int i11 = b3.q0.f1429c;
            j5 = jA >> 32;
        } else {
            int i12 = b3.q0.f1429c;
            j5 = 4294967295L & jA;
        }
        return wVar.a((int) j5);
    }

    public static final l n(l lVar, l lVar2, q0 q0Var, long j5, y yVar) {
        if (yVar == null) {
            return x(lVar, lVar2);
        }
        int iCompare = q0Var.f13888f.compare(Long.valueOf(yVar.f14011c), Long.valueOf(j5));
        if (iCompare < 0) {
            return l.f13836a;
        }
        return iCompare > 0 ? l.f13838c : l.f13837b;
    }

    public static final y o(y yVar, w wVar, int i7) {
        return new y(wVar.f13978f.a(i7), i7, yVar.f14011c);
    }

    public static final boolean p(x1.c cVar, long j5) {
        float f10 = cVar.f14523a;
        float f11 = cVar.f14525c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        if (f10 > fIntBitsToFloat || fIntBitsToFloat > f11) {
            return false;
        }
        float f12 = cVar.f14524b;
        float f13 = cVar.f14526d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return f12 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final y1.f q(v1.c cVar, float f10) {
        int iCeil = ((int) Math.ceil(f10)) * 2;
        y1.f fVarF = f14013b;
        y1.b bVarA = f14014c;
        a2.c cVar2 = f14015d;
        if (fVarF == null || bVarA == null) {
            fVarF = y1.h0.f(iCeil, iCeil, 1);
            f14013b = fVarF;
            bVarA = y1.h0.a(fVarF);
            f14014c = bVarA;
        } else {
            Bitmap bitmap = fVarF.f14890a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                fVarF = y1.h0.f(iCeil, iCeil, 1);
                f14013b = fVarF;
                bVarA = y1.h0.a(fVarF);
                f14014c = bVarA;
            }
        }
        y1.f fVar = fVarF;
        y1.b bVar = bVarA;
        if (cVar2 == null) {
            cVar2 = new a2.c();
            f14015d = cVar2;
        }
        a2.c cVar3 = cVar2;
        a2.a aVar = cVar3.f15a;
        n3.o layoutDirection = cVar.f13592a.getLayoutDirection();
        Bitmap bitmap2 = fVar.f14890a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        n3.c cVar4 = aVar.f6a;
        n3.o oVar = aVar.f7b;
        y1.o oVar2 = aVar.f8c;
        long j5 = aVar.f9d;
        aVar.f6a = cVar;
        aVar.f7b = layoutDirection;
        aVar.f8c = bVar;
        aVar.f9d = jFloatToRawIntBits;
        bVar.h();
        a2.f.w(cVar3, y1.q.f14948b, 0L, cVar3.f16b.J(), 58);
        a2.f.w(cVar3, y1.h0.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), 120);
        a2.f.r(cVar3, y1.h0.d(4278190080L), f10, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), 120);
        bVar.r();
        aVar.f6a = cVar4;
        aVar.f7b = oVar;
        aVar.f8c = oVar2;
        aVar.f9d = j5;
        return fVar;
    }

    public static final long r(w0 w0Var, long j5, y yVar) {
        o2.w wVar;
        long jB;
        long j10;
        b3.p pVar;
        int iD;
        float fL;
        b3.p pVar2;
        int iD2;
        b3.p pVar3;
        int iD3;
        float fB;
        b3.p pVar4;
        int iD4;
        p pVarD = w0Var.d(yVar);
        if (pVarD == null || (wVar = w0Var.f13989l) == null) {
            return 9205357640488583168L;
        }
        v0.g gVar = pVarD.f13876c;
        o2.w wVarC = pVarD.c();
        if (wVarC == null) {
            return 9205357640488583168L;
        }
        int i7 = yVar.f14010b;
        b3.o0 o0Var = (b3.o0) gVar.invoke();
        if (i7 > (o0Var == null ? 0 : pVarD.b(o0Var))) {
            return 9205357640488583168L;
        }
        x1.b bVar = (x1.b) w0Var.f13996s.getValue();
        i9.l.b(bVar);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (wVarC.n(wVar, bVar.f14521a) >> 32));
        b3.o0 o0Var2 = (b3.o0) gVar.invoke();
        if (o0Var2 == null) {
            jB = b3.q0.f1428b;
        } else {
            b3.p pVar5 = o0Var2.f1409b;
            int iB = pVarD.b(o0Var2);
            if (iB < 1) {
                jB = b3.q0.f1428b;
            } else {
                int iD5 = pVar5.d(n3.r.m(i7, 0, iB - 1));
                jB = b3.g0.b(o0Var2.g(iD5), pVar5.c(iD5, true));
            }
        }
        if (b3.q0.c(jB)) {
            b3.o0 o0Var3 = (b3.o0) gVar.invoke();
            fL = (o0Var3 != null && (iD4 = (pVar4 = o0Var3.f1409b).d(i7)) < pVar4.f1419f) ? o0Var3.e(iD4) : -1.0f;
            j10 = 4294967295L;
        } else {
            j10 = 4294967295L;
            int i10 = (int) (jB >> 32);
            b3.o0 o0Var4 = (b3.o0) gVar.invoke();
            float fE = (o0Var4 != null && (iD2 = (pVar2 = o0Var4.f1409b).d(i10)) < pVar2.f1419f) ? o0Var4.e(iD2) : -1.0f;
            int i11 = ((int) (jB & 4294967295L)) - 1;
            b3.o0 o0Var5 = (b3.o0) gVar.invoke();
            float f10 = (o0Var5 != null && (iD = (pVar = o0Var5.f1409b).d(i11)) < pVar.f1419f) ? o0Var5.f(iD) : -1.0f;
            fL = n3.r.l(fIntBitsToFloat, Math.min(fE, f10), Math.max(fE, f10));
        }
        if (fL == -1.0f) {
            return 9205357640488583168L;
        }
        if (!n3.m.a(j5, 0L) && Math.abs(fIntBitsToFloat - fL) > ((int) (j5 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        b3.o0 o0Var6 = (b3.o0) gVar.invoke();
        if (o0Var6 != null && (iD3 = (pVar3 = o0Var6.f1409b).d(i7)) < pVar3.f1419f) {
            float f11 = pVar3.f(iD3);
            fB = ((pVar3.b(iD3) - f11) / 2) + f11;
        } else {
            fB = -1.0f;
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        return wVar.n(wVarC, (((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fB)) & j10));
    }

    public static final int s(long j5, b3.o0 o0Var) {
        int i7 = (int) (4294967295L & j5);
        if (Float.intBitsToFloat(i7) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        b3.p pVar = o0Var.f1409b;
        return fIntBitsToFloat >= pVar.f1418e ? o0Var.f1408a.f1393a.f1353b.length() : pVar.g(j5);
    }

    public static final long t(b3.o0 o0Var, int i7, boolean z10, boolean z11) {
        b3.p pVar = o0Var.f1409b;
        long j5 = o0Var.f1410c;
        int iD = pVar.d(i7);
        if (iD >= pVar.f1419f) {
            return 9205357640488583168L;
        }
        boolean z12 = o0Var.a(((!z10 || z11) && (z10 || !z11)) ? Math.max(i7 + (-1), 0) : i7) == o0Var.h(i7);
        ArrayList arrayList = pVar.f1421h;
        pVar.l(i7);
        b3.s sVar = (b3.s) arrayList.get(i7 == ((b3.h) pVar.f1414a.f1433b).f1353b.length() ? n3.l.A(arrayList) : b3.g0.d(i7, arrayList));
        b3.b bVar = sVar.f1441a;
        int iD2 = sVar.d(i7);
        c3.n nVar = bVar.f1310d;
        return (((long) Float.floatToRawIntBits(n3.r.l(z12 ? nVar.h(iD2, false) : nVar.i(iD2, false), 0.0f, (int) (j5 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(n3.r.l(pVar.b(iD), 0.0f, (int) (j5 & 4294967295L)))) & 4294967295L);
    }

    public static final m3.j u(b3.o0 o0Var, int i7) {
        b3.n0 n0Var = o0Var.f1408a;
        b3.p pVar = o0Var.f1409b;
        if (n0Var.f1393a.f1353b.length() != 0) {
            int iD = pVar.d(i7);
            if ((i7 != 0 && iD == pVar.d(i7 - 1)) || (i7 != n0Var.f1393a.f1353b.length() && iD == pVar.d(i7 + 1))) {
                return o0Var.a(i7);
            }
        }
        return o0Var.h(i7);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean v(k2.n nVar) {
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((k2.v) r8.get(i7)).f7286i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean w(t1 t1Var, boolean z10) {
        o2.w wVarC;
        l0.u0 u0Var = t1Var.f13942d;
        if (u0Var == null || (wVarC = u0Var.c()) == null) {
            return false;
        }
        return p(y(wVarC), t1Var.k(z10));
    }

    public static final l x(l lVar, l lVar2) {
        int iOrdinal = lVar2.ordinal();
        l lVar3 = l.f13836a;
        if (iOrdinal != 0) {
            l lVar4 = l.f13838c;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return lVar4;
                }
                throw new cc.s();
            }
            int iOrdinal2 = lVar.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return l.f13837b;
                }
                if (iOrdinal2 == 2) {
                    return lVar4;
                }
                throw new cc.s();
            }
        }
        return lVar3;
    }

    public static final x1.c y(o2.w wVar) {
        x1.c cVarE = o2.d1.e(wVar);
        long jV = wVar.v(cVarE.d());
        float f10 = cVarE.f14525c;
        float f11 = cVarE.f14526d;
        long jV2 = wVar.v((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        return new x1.c(Float.intBitsToFloat((int) (jV >> 32)), Float.intBitsToFloat((int) (jV & 4294967295L)), Float.intBitsToFloat((int) (jV2 >> 32)), Float.intBitsToFloat((int) (jV2 & 4294967295L)));
    }
}
