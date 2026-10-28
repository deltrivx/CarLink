package c;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import q2.d1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 extends i9.j implements h9.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i7, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i7, obj, cls, str, str2, i10, i11);
        this.f1744i = i12;
    }

    @Override // h9.a
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionA;
        d1 d1Var;
        switch (this.f1744i) {
            case 0:
                ((l0) this.f6672b).e();
                return t8.z.f12851a;
            case 1:
                ((l0) this.f6672b).e();
                return t8.z.f12851a;
            case 2:
                return ((s0.e) this.f6672b).K();
            case 3:
                View view = (View) this.f6672b;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30) {
                    e4.h.e(view);
                }
                if (i7 < 29 || (contentCaptureSessionA = u2.a.a(view)) == null) {
                    return null;
                }
                return new android.support.v4.media.session.r(25, contentCaptureSessionA, view);
            case 4:
                w1.g gVar = (w1.g) this.f6672b;
                s.i0 i0Var = gVar.f14038c;
                s.i0 i0Var2 = gVar.f14039d;
                w1.j jVar = gVar.f14036a;
                w1.s sVar = jVar.f14049h;
                w1.r rVar = w1.r.f14072d;
                if (sVar == null) {
                    Object[] objArr = i0Var2.f12445b;
                    long[] jArr = i0Var2.f12444a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j5 = jArr[i10];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j5 & 255) < 128) {
                                        ((w1.e) objArr[(i10 << 3) + i12]).r(rVar);
                                    }
                                    j5 >>= 8;
                                }
                                if (i11 == 8) {
                                }
                            }
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    }
                } else if (sVar.f11129n) {
                    if (i0Var.c(sVar)) {
                        sVar.D0();
                    }
                    w1.r rVarC0 = sVar.C0();
                    if (!sVar.f11117a.f11129n) {
                        n2.a.b("visitAncestors called on an unattached node");
                    }
                    r1.o oVar = sVar.f11117a;
                    q2.h0 h0VarV = q2.f.v(sVar);
                    int i13 = 0;
                    while (h0VarV != null) {
                        if ((h0VarV.E.f10617f.f11120d & 5120) != 0) {
                            while (oVar != null) {
                                int i14 = oVar.f11119c;
                                if ((i14 & 5120) != 0) {
                                    if ((i14 & 1024) != 0) {
                                        i13++;
                                    }
                                    if ((oVar instanceof w1.e) && i0Var2.c(oVar)) {
                                        if (i13 <= 1) {
                                            ((w1.e) oVar).r(rVarC0);
                                        } else {
                                            ((w1.e) oVar).r(w1.r.f14070b);
                                        }
                                        i0Var2.l(oVar);
                                    }
                                }
                                oVar = oVar.f11121e;
                            }
                        }
                        h0VarV = h0VarV.v();
                        oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
                    }
                    Object[] objArr2 = i0Var2.f12445b;
                    long[] jArr2 = i0Var2.f12444a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j10 = jArr2[i15];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j10 & 255) < 128) {
                                        ((w1.e) objArr2[(i15 << 3) + i17]).r(rVar);
                                    }
                                    j10 >>= 8;
                                }
                                if (i16 == 8) {
                                }
                            }
                            if (i15 != length2) {
                                i15++;
                            }
                        }
                    }
                }
                if (jVar.f14049h == null || jVar.f14044c.C0() == rVar) {
                    jVar.c();
                }
                i0Var.b();
                i0Var2.b();
                gVar.f14040e = false;
                return t8.z.f12851a;
            default:
                return Boolean.valueOf(((x.c0) this.f6672b).f14336v.E0(7));
        }
    }
}
