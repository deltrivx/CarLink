package b3;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1403a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f1406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1407e;

    public /* synthetic */ o(long j5, float[] fArr, i9.v vVar, i9.u uVar) {
        this.f1404b = j5;
        this.f1405c = fArr;
        this.f1406d = vVar;
        this.f1407e = uVar;
    }

    public /* synthetic */ o(x1.c cVar, i9.x xVar, long j5, y1.k kVar) {
        this.f1405c = cVar;
        this.f1406d = xVar;
        this.f1404b = j5;
        this.f1407e = kVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        float[] fArr;
        long j5;
        int i7;
        float fA;
        float fA2;
        switch (this.f1403a) {
            case 0:
                float[] fArr2 = (float[]) this.f1405c;
                i9.v vVar = (i9.v) this.f1406d;
                i9.u uVar = (i9.u) this.f1407e;
                s sVar = (s) obj;
                int i10 = sVar.f1442b;
                b bVar = sVar.f1441a;
                int iE = sVar.f1443c;
                long j10 = this.f1404b;
                int iF = i10 > q0.f(j10) ? sVar.f1442b : q0.f(j10);
                if (iE >= q0.e(j10)) {
                    iE = q0.e(j10);
                }
                long jB = g0.b(sVar.d(iF), sVar.d(iE));
                int i11 = vVar.f6686a;
                c3.n nVar = bVar.f1310d;
                int iF2 = q0.f(jB);
                int iE2 = q0.e(jB);
                Layout layout = nVar.f2408f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    h3.a.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    h3.a.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    h3.a.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    h3.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i11 < (iE2 - iF2) * 4) {
                    h3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                c3.e eVar = new c3.e(nVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iF3 = nVar.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = nVar.g(lineForOffset);
                        float fE = nVar.e(lineForOffset);
                        j5 = jB;
                        boolean z10 = false;
                        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z11 || zIsRtlCharAt) {
                                if (z11 && zIsRtlCharAt) {
                                    z10 = false;
                                    float fA3 = eVar.a(iMax, false, false, false);
                                    i7 = iMin;
                                    fA = eVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i7 = iMin;
                                    z10 = false;
                                    if (z11 || !zIsRtlCharAt) {
                                        fA = eVar.a(iMax, false, false, false);
                                        fA2 = eVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = eVar.a(iMax, false, false, true);
                                        fA = eVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i11] = fA;
                                fArr[i11 + 1] = fG;
                                fArr[i11 + 2] = fA2;
                                fArr[i11 + 3] = fE;
                                i11 += 4;
                                iMax++;
                                iMin = i7;
                            } else {
                                fA = eVar.a(iMax, z10, z10, true);
                                i7 = iMin;
                                fA2 = eVar.a(iMax + 1, true, true, true);
                            }
                            z10 = false;
                            fArr[i11] = fA;
                            fArr[i11 + 1] = fG;
                            fArr[i11 + 2] = fA2;
                            fArr[i11 + 3] = fE;
                            i11 += 4;
                            iMax++;
                            iMin = i7;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            fArr2 = fArr;
                            jB = j5;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j5 = jB;
                }
                int iD = (q0.d(j5) * 4) + vVar.f6686a;
                for (int i12 = vVar.f6686a; i12 < iD; i12 += 4) {
                    int i13 = i12 + 1;
                    float f10 = fArr[i13];
                    float f11 = uVar.f6685a;
                    fArr[i13] = f10 + f11;
                    int i14 = i12 + 3;
                    fArr[i14] = fArr[i14] + f11;
                }
                vVar.f6686a = iD;
                uVar.f6685a = bVar.b() + uVar.f6685a;
                break;
            default:
                x1.c cVar = (x1.c) this.f1405c;
                i9.x xVar = (i9.x) this.f1406d;
                long j11 = this.f1404b;
                y1.k kVar = (y1.k) this.f1407e;
                q2.j0 j0Var = (q2.j0) obj;
                j0Var.b();
                float f12 = cVar.f14523a;
                float f13 = cVar.f14524b;
                a2.c cVar2 = j0Var.f10720a;
                ((a2.d) cVar2.f16b.f12b).B(f12, f13);
                try {
                    a2.f.s(j0Var, (y1.f) xVar.f6688a, j11, 0L, 0.0f, kVar, 0, 890);
                } finally {
                    ((a2.d) cVar2.f16b.f12b).B(-f12, -f13);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
