package c8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import cc.a1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e8.z0;
import f1.c2;
import f1.g1;
import f1.i0;
import f1.x1;
import h0.y0;
import java.util.List;
import java.util.concurrent.CancellationException;
import l0.q1;
import pc.l0;
import q2.d2;
import q2.h0;
import w0.m0;
import w0.n0;
import w0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2517b;

    public /* synthetic */ k(int i7, Object obj) {
        this.f2516a = i7;
        this.f2517b = obj;
    }

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.f2516a = i7;
        this.f2517b = obj;
    }

    private final Object e(Object obj) {
        p1.u uVar = (p1.u) this.f2517b;
        synchronized (uVar.f10094g) {
            p1.t tVar = uVar.f10096i;
            i9.l.b(tVar);
            Object obj2 = tVar.f10078b;
            i9.l.b(obj2);
            int i7 = tVar.f10080d;
            s.c0 c0Var = tVar.f10079c;
            if (c0Var == null) {
                c0Var = new s.c0();
                tVar.f10079c = c0Var;
                tVar.f10082f.m(obj2, c0Var);
            }
            tVar.c(obj, i7, obj2, c0Var);
        }
        return t8.z.f12851a;
    }

    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, nc.e] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        f0.o oVar;
        g0.n nVar;
        String strConcat;
        StringBuilder sb2;
        int i7;
        List listL;
        int i10 = 2;
        int i11 = 4;
        float f10 = 0.0f;
        f0.o oVar2 = null;
        g0.n nVar2 = null;
        int i12 = 0;
        boolean z10 = true;
        switch (this.f2516a) {
            case 0:
                p1.p pVar = (p1.p) this.f2517b;
                f0.g gVar = (f0.g) obj;
                i9.l.e(gVar, "$this$LazyColumn");
                gVar.f4770b.a(pVar.size(), new f0.f(new l(0, pVar), new n1.c(new m(pVar), 802480018, true)));
                return t8.z.f12851a;
            case 1:
                e8.q qVar = (e8.q) this.f2517b;
                i9.l.e((i0) obj, "$this$DisposableEffect");
                return new e8.p(i12, qVar);
            case 2:
                z0 z0Var = (z0) this.f2517b;
                i9.l.e((i0) obj, "$this$DisposableEffect");
                return new e8.p(z10 ? 1 : 0, z0Var);
            case 3:
                f0.l lVar = (f0.l) this.f2517b;
                return lVar.w0(((Integer) obj).intValue(), lVar.f4786d);
            case 4:
                f0.u uVar = (f0.u) this.f2517b;
                float f11 = -((Float) obj).floatValue();
                if ((f11 >= 0.0f || uVar.d()) && (f11 <= 0.0f || uVar.b())) {
                    if (Math.abs(uVar.f4859h) > 0.5f) {
                        c0.b.c("entered drag with non-zero pending scroll");
                    }
                    uVar.f4855d = true;
                    float f12 = uVar.f4859h + f11;
                    uVar.f4859h = f12;
                    if (Math.abs(f12) > 0.5f) {
                        float f13 = uVar.f4859h;
                        int iRound = Math.round(f13);
                        f0.o oVarA = ((f0.o) uVar.f4857f.getValue()).a(iRound, !uVar.f4853b);
                        if (oVarA == null || (oVar = uVar.f4854c) == null) {
                            oVar2 = oVarA;
                        } else {
                            f0.o oVarA2 = oVar.a(iRound, true);
                            if (oVarA2 != null) {
                                uVar.f4854c = oVarA2;
                                oVar2 = oVarA;
                            }
                        }
                        if (oVar2 != null) {
                            uVar.f(oVar2, uVar.f4853b, true);
                            uVar.f4872v.setValue(t8.z.f12851a);
                            uVar.h(f13 - uVar.f4859h, oVar2);
                        } else {
                            h0 h0Var = uVar.k;
                            if (h0Var != null) {
                                h0Var.k();
                            }
                            uVar.h(f13 - uVar.f4859h, uVar.g());
                        }
                    }
                    if (Math.abs(uVar.f4859h) > 0.5f) {
                        f11 -= uVar.f4859h;
                        uVar.f4859h = 0.0f;
                    }
                    f10 = f11;
                }
                return Float.valueOf(-f10);
            case 5:
                ((f1.y) this.f2517b).z(obj);
                return t8.z.f12851a;
            case 6:
                c2 c2Var = (c2) this.f2517b;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (c2Var.f4904b) {
                    try {
                        a1 a1Var = c2Var.f4905c;
                        if (a1Var != null) {
                            fc.h0 h0Var2 = c2Var.f4921t;
                            x1 x1Var = x1.f5198b;
                            h0Var2.getClass();
                            h0Var2.j(null, x1Var);
                            a1Var.a(cancellationException);
                            c2Var.f4918q = null;
                            a1Var.t(new p(8, c2Var, th));
                        } else {
                            c2Var.f4906d = cancellationException;
                            fc.h0 h0Var3 = c2Var.f4921t;
                            x1 x1Var2 = x1.f5197a;
                            h0Var3.getClass();
                            h0Var3.j(null, x1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return t8.z.f12851a;
            case 7:
                s.i0 i0Var = (s.i0) this.f2517b;
                if (obj instanceof p1.a0) {
                    ((p1.a0) obj).e(4);
                }
                i0Var.a(obj);
                return t8.z.f12851a;
            case 8:
                f3.o oVar3 = (f3.o) obj;
                return ((f3.e) this.f2517b).a(new f3.o(null, oVar3.f5266b, oVar3.f5267c, oVar3.f5268d, oVar3.f5269e)).f5270a;
            case 9:
                return Integer.valueOf(((g0.s) this.f2517b).c(((Integer) obj).intValue()));
            case 10:
                g0.v vVar = (g0.v) this.f2517b;
                float f14 = -((Float) obj).floatValue();
                if ((f14 >= 0.0f || vVar.d()) && (f14 <= 0.0f || vVar.b())) {
                    if (Math.abs(vVar.f5744g) > 0.5f) {
                        c0.b.c("entered drag with non-zero pending scroll");
                    }
                    float f15 = vVar.f5744g + f14;
                    vVar.f5744g = f15;
                    if (Math.abs(f15) > 0.5f) {
                        float f16 = vVar.f5744g;
                        int iM = k9.a.M(f16);
                        g0.n nVarA = ((g0.n) vVar.f5742e.getValue()).a(iM, !vVar.f5739b);
                        if (nVarA == null || (nVar = vVar.f5740c) == null) {
                            nVar2 = nVarA;
                        } else {
                            g0.n nVarA2 = nVar.a(iM, true);
                            if (nVarA2 != null) {
                                vVar.f5740c = nVarA2;
                                nVar2 = nVarA;
                            }
                        }
                        if (nVar2 != null) {
                            vVar.f(nVar2, vVar.f5739b, true);
                            vVar.f5754r.setValue(t8.z.f12851a);
                            vVar.h(f16 - vVar.f5744g, nVar2);
                        } else {
                            h0 h0Var4 = vVar.f5747j;
                            if (h0Var4 != null) {
                                h0Var4.k();
                            }
                            vVar.h(f16 - vVar.f5744g, vVar.g());
                        }
                    }
                    if (Math.abs(vVar.f5744g) > 0.5f) {
                        f14 -= vVar.f5744g;
                        vVar.f5744g = 0.0f;
                    }
                    f10 = f14;
                }
                return Float.valueOf(-f10);
            case 11:
                g3.g gVar2 = (g3.g) obj;
                String str = ((g3.g) this.f2517b) == gVar2 ? " > " : "   ";
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                if (!(gVar2 instanceof g3.a)) {
                    if (gVar2 instanceof g3.u) {
                        sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                        g3.u uVar2 = (g3.u) gVar2;
                        sb2.append(uVar2.f5885a.f1353b.length());
                        sb2.append(", newCursorPosition=");
                        i7 = uVar2.f5886b;
                    } else if (gVar2 instanceof g3.t) {
                        strConcat = ((g3.t) gVar2).toString();
                    } else if (gVar2 instanceof g3.e) {
                        strConcat = ((g3.e) gVar2).toString();
                    } else if (gVar2 instanceof g3.f) {
                        strConcat = ((g3.f) gVar2).toString();
                    } else if (gVar2 instanceof g3.v) {
                        strConcat = ((g3.v) gVar2).toString();
                    } else if (gVar2 instanceof g3.i) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (gVar2 instanceof g3.d) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strL = i9.y.f6689a.b(gVar2.getClass()).l();
                        if (strL == null) {
                            strL = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strL);
                    }
                    sb3.append(strConcat);
                    return sb3.toString();
                }
                sb2 = new StringBuilder("CommitTextCommand(text.length=");
                g3.a aVar = (g3.a) gVar2;
                sb2.append(aVar.f5821a.f1353b.length());
                sb2.append(", newCursorPosition=");
                i7 = aVar.f5822b;
                strConcat = a2.f.H(sb2, i7, ')');
                sb3.append(strConcat);
                return sb3.toString();
            case 12:
                g8.i iVar = (g8.i) this.f2517b;
                Context context = (Context) obj;
                i9.l.e(context, "context");
                int i13 = iVar.f6030e;
                if (i13 == 2) {
                    i8.b bVar = new i8.b(context);
                    bVar.setEGLContextClientVersion(2);
                    bVar.setRenderer(bVar);
                    bVar.setRenderMode(0);
                    return bVar;
                }
                if (i13 == 1) {
                    i8.d dVar = new i8.d(context);
                    dVar.setSurfaceTextureListener(dVar);
                    return dVar;
                }
                i8.c cVar = new i8.c(context);
                cVar.getHolder().addCallback(cVar);
                return cVar;
            case 13:
                return new e8.p(i10, (h0.s) this.f2517b);
            case 14:
                return new e8.p(i11, (h0.d0) this.f2517b);
            case 15:
                o1.f fVar = (o1.f) this.f2517b;
                return Boolean.valueOf(fVar != null ? fVar.a(obj) : true);
            case 16:
                i9.x xVar = (i9.x) this.f2517b;
                d2 d2Var = (d2) obj;
                i9.l.c(d2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                h0.i0 i0Var2 = ((y0) d2Var).f6409o;
                List list = (List) xVar.f6688a;
                if (list != null) {
                    list.add(i0Var2);
                    listL = list;
                } else {
                    listL = n3.l.L(i0Var2);
                }
                xVar.f6688a = listL;
                return q2.c2.f10602b;
            case 17:
                ((y2.j) obj).n(o0.f13870c, new n0(l0.h0.f7651a, ((w0.q) this.f2517b).a(), m0.f13851b, true));
                return t8.z.f12851a;
            case 18:
                q1 q1Var = (q1) this.f2517b;
                float fFloatValue = ((Float) obj).floatValue();
                g1 g1Var = q1Var.f7803a;
                float f17 = g1Var.f() + fFloatValue;
                g1 g1Var2 = q1Var.f7804b;
                if (f17 > g1Var2.f()) {
                    fFloatValue = g1Var2.f() - g1Var.f();
                } else if (f17 < 0.0f) {
                    fFloatValue = -g1Var.f();
                }
                g1Var.g(g1Var.f() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 19:
                ((lc.c) this.f2517b).f(null);
                return t8.z.f12851a;
            case 20:
                ((m5.l) this.f2517b).b(((x1.b) obj).f14521a, true);
                return t8.z.f12851a;
            case 21:
                n7.f fVar2 = (n7.f) this.f2517b;
                byte[] bArr = (byte[]) obj;
                i9.l.e(bArr, "pcmBytes");
                fVar2.b(bArr, 0, bArr.length);
                return t8.z.f12851a;
            case 22:
                o1.f fVar3 = ((o1.d) this.f2517b).f9276c;
                return Boolean.valueOf(fVar3 != null ? fVar3.a(obj) : true);
            case 23:
                return e(obj);
            case 24:
                l0 l0Var = (l0) this.f2517b;
                nc.a aVar2 = (nc.a) obj;
                i9.l.e(aVar2, "$this$buildSerialDescriptor");
                l0Var.getClass();
                aVar2.f9062b = u8.w.f13122a;
                return t8.z.f12851a;
            case 25:
                ?? r8 = this.f2517b;
                int iIntValue = ((Integer) obj).intValue();
                return r8.l(iIntValue) + ": " + r8.n(iIntValue).h();
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                Drawable drawable = (Drawable) this.f2517b;
                a2.g gVar3 = (a2.g) obj;
                y1.o oVarZ = gVar3.W().z();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (gVar3.g() >> 32)), (int) Float.intBitsToFloat((int) (gVar3.g() & 4294967295L)));
                drawable.draw(y1.c.a(oVarZ));
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                r0.b bVar2 = (r0.b) this.f2517b;
                bVar2.f11076q.invoke((n0.a) obj, q2.f.i(bVar2, r2.n0.f11343b));
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                ((h9.k) obj).invoke((n0.a) this.f2517b);
                return t8.z.f12851a;
            default:
                k kVar = (k) this.f2517b;
                d2 d2Var2 = (d2) obj;
                if (!(d2Var2 instanceof r0.a)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                kVar.invoke(((r0.a) d2Var2).f11075o);
                return Boolean.TRUE;
        }
    }
}
