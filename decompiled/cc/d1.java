package cc;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i7, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i7, obj, cls, str, str2, i10, i11);
        this.f2609i = i12;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:12:0x0029->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0079 A[SYNTHETIC] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        g3.a aVar;
        l0.l0 l0VarA;
        Integer numValueOf;
        char c10;
        switch (this.f2609i) {
            case 0:
                ((e1) this.f6672b).l((Throwable) obj);
                return t8.z.f12851a;
            case 1:
                wa.e eVar = (wa.e) obj;
                i9.l.e(eVar, "p0");
                return ((ka.o) this.f6672b).N(eVar);
            case 2:
                wa.e eVar2 = (wa.e) obj;
                i9.l.e(eVar2, "p0");
                return ((ka.o) this.f6672b).O(eVar2);
            case 3:
                KeyEvent keyEvent = ((i2.b) obj).f6600a;
                l0.g1 g1Var = (l0.g1) this.f6672b;
                w0.x1 x1Var = g1Var.f7644f;
                boolean z10 = g1Var.f7642d;
                boolean z11 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    aVar = null;
                } else {
                    l0.f0 f0Var = g1Var.f7647i;
                    f0Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        f0Var.f7634a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = f0Var.f7634a;
                        if (num != null) {
                            f0Var.f7634a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        aVar = new g3.a(1, new StringBuilder().appendCodePoint(numValueOf.intValue()).toString());
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    if (z10) {
                        g1Var.a(n3.l.I(aVar));
                        x1Var.f14008a = null;
                    } else {
                        z11 = false;
                    }
                } else if (i2.c.K(keyEvent) != 2 || (l0VarA = g1Var.f7648j.a(keyEvent)) == null || (l0VarA.f7748a && !z10)) {
                    z11 = false;
                } else {
                    i9.t tVar = new i9.t();
                    tVar.f6684a = true;
                    a8.u0 u0Var = new a8.u0(l0VarA, g1Var, tVar, 3);
                    g3.w wVar = g1Var.f7641c;
                    w0.j1 j1Var = new w0.j1(wVar, g1Var.f7645g, g1Var.f7639a.d(), x1Var);
                    u0Var.invoke(j1Var);
                    if (!b3.q0.b(j1Var.f13820f, wVar.f5890b) || !i9.l.a(j1Var.f13821g, wVar.f5889a)) {
                        g1Var.k.invoke(g3.w.a(wVar, j1Var.f13821g, j1Var.f13820f, 4));
                    }
                    l0.t1 t1Var = g1Var.f7646h;
                    if (t1Var != null) {
                        t1Var.f7841e = true;
                    }
                    z11 = tVar.f6684a;
                }
                return Boolean.valueOf(z11);
            case 4:
                ob.g gVar = (ob.g) obj;
                i9.l.e(gVar, "p0");
                return new lb.g((lb.h) this.f6672b, gVar);
            case 5:
                long j5 = ((x1.b) obj).f14521a;
                r0.e eVar3 = (r0.e) this.f6672b;
                eVar3.getClass();
                s0.f fVar = (s0.f) q2.f.i(eVar3, s0.g.f12534a);
                if (fVar != null) {
                    b0.s(eVar3.m0(), null, new b1.f(eVar3, fVar, new r0.d(eVar3, j5), (y8.c) null, 8), 3);
                }
                return t8.z.f12851a;
            case 6:
                ((n0.a) this.f6672b).f8701b.a((h9.k) obj);
                return t8.z.f12851a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x.f fVar2 = (x.f) this.f6672b;
                s.a0 a0Var = fVar2.D;
                if (zBooleanValue) {
                    fVar2.I0();
                } else {
                    if (fVar2.f14349q != null) {
                        Object[] objArr = a0Var.f12382c;
                        long[] jArr = a0Var.f12380a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j10 = jArr[i7];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j10) < 128) {
                                            c10 = '\b';
                                            b0.s(fVar2.m0(), null, new x.d(fVar2, (b0.m) objArr[(i7 << 3) + i11], null, 0), 3);
                                        } else {
                                            c10 = '\b';
                                        }
                                        j10 >>= c10;
                                    }
                                    if (i10 == 8) {
                                        if (i7 != length) {
                                            i7++;
                                        }
                                    }
                                } else if (i7 != length) {
                                    i7++;
                                }
                            }
                        }
                    }
                    a0Var.a();
                    fVar2.J0();
                }
                return t8.z.f12851a;
        }
    }
}
