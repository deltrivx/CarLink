package q3;

import android.view.View;
import android.view.ViewGroup;
import e4.b1;
import e4.s1;
import e4.t0;
import java.util.List;
import o2.d1;
import o9.e0;
import q2.t;
import r3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f10870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i7) {
        super(1);
        this.f10869c = i7;
        this.f10870d = viewGroup;
    }

    @Override // e4.t0
    public final s1 c(s1 s1Var, List list) {
        switch (this.f10869c) {
            case 0:
                return ((q) this.f10870d).m(s1Var);
            default:
                r rVar = (r) this.f10870d;
                if (rVar.f11581l) {
                    return s1Var;
                }
                View childAt = rVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, rVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, rVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? s1Var : s1Var.f4398a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // e4.t0
    public final android.support.v4.media.session.r e(b1 b1Var, android.support.v4.media.session.r rVar) {
        switch (this.f10869c) {
            case 0:
                t tVar = ((q) this.f10870d).f10919y.E.f10614c;
                if (!tVar.O.f11129n) {
                    return rVar;
                }
                long jO = e0.O(tVar.E(0L));
                int i7 = (int) (jO >> 32);
                if (i7 < 0) {
                    i7 = 0;
                }
                int i10 = (int) (jO & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long jL = d1.g(tVar).l();
                int i11 = (int) (jL & 4294967295L);
                long j5 = tVar.f9437c;
                long jO2 = e0.O(tVar.E((((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32)));
                int i12 = ((int) (jL >> 32)) - ((int) (jO2 >> 32));
                if (i12 < 0) {
                    i12 = 0;
                }
                int i13 = i11 - ((int) (jO2 & 4294967295L));
                int i14 = i13 < 0 ? 0 : i13;
                if (i7 == 0 && i10 == 0 && i12 == 0 && i14 == 0) {
                    return rVar;
                }
                return new android.support.v4.media.session.r(5, i.l((x3.b) rVar.f604b, i7, i10, i12, i14), i.l((x3.b) rVar.f605c, i7, i10, i12, i14));
            default:
                r rVar2 = (r) this.f10870d;
                if (rVar2.f11581l) {
                    return rVar;
                }
                View childAt = rVar2.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, rVar2.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, rVar2.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return rVar;
                }
                x3.b bVarB = x3.b.b(iMax, iMax2, iMax3, iMax4);
                int i15 = bVarB.f14563a;
                x3.b bVar = (x3.b) rVar.f604b;
                int i16 = bVarB.f14564b;
                int i17 = bVarB.f14565c;
                int i18 = bVarB.f14566d;
                return new android.support.v4.media.session.r(5, s1.a(bVar, i15, i16, i17, i18), s1.a((x3.b) rVar.f605c, i15, i16, i17, i18));
        }
    }
}
