package a8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import f1.l2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171c;

    public /* synthetic */ m(int i7, int i10, Object obj, Object obj2) {
        this.f169a = i10;
        this.f170b = obj;
        this.f171c = obj2;
    }

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.f169a = i7;
        this.f170b = obj;
        this.f171c = obj2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        b3.q0 q0Var;
        switch (this.f169a) {
            case 0:
                ((Integer) obj2).getClass();
                ((g0) this.f170b).e((h9.n) this.f171c, (f1.s) obj, f1.b.y(7));
                return t8.z.f12851a;
            case 1:
                f1.b1 b1Var = (f1.b1) this.f170b;
                f1.h1 h1Var = (f1.h1) this.f171c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                int iIntValue = ((Integer) obj2).intValue();
                b1Var.setValue(bool);
                h1Var.g(iIntValue);
                return t8.z.f12851a;
            case 2:
                ((Integer) obj2).getClass();
                ((c8.n) this.f170b).a((List) this.f171c, (f1.s) obj, f1.b.y(7));
                return t8.z.f12851a;
            case 3:
                ((Integer) obj2).getClass();
                ((c8.f0) this.f170b).c((List) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 4:
                ((Integer) obj2).getClass();
                ((e8.w) this.f170b).d((List) this.f171c, (f1.s) obj, f1.b.y(1));
                return t8.z.f12851a;
            case 5:
                n1.i iVar = (n1.i) this.f170b;
                l2 l2Var = (l2) this.f171c;
                int iIntValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof f1.j) {
                    iVar.f8720f.b((f1.j) obj2);
                } else if (obj2 instanceof f1.e2) {
                    f1.e2 e2Var = (f1.e2) obj2;
                    if (!(e2Var.f4944a instanceof f1.p)) {
                        f1.t.g(l2Var, iIntValue2, obj2);
                        iVar.e(e2Var);
                    }
                } else if (obj2 instanceof f1.w1) {
                    f1.t.g(l2Var, iIntValue2, obj2);
                    ((f1.w1) obj2).d();
                }
                return t8.z.f12851a;
            case 6:
                ((Integer) obj2).getClass();
                ((f8.i) this.f170b).c((List) this.f171c, true, (f1.s) obj, f1.b.y(519));
                return t8.z.f12851a;
            case 7:
                g0.a aVar = (g0.a) this.f170b;
                d0.e eVar = (d0.e) this.f171c;
                n3.c cVar = (n3.c) obj;
                n3.a aVar2 = (n3.a) obj2;
                if (n3.a.h(aVar2.f8730a) == Integer.MAX_VALUE) {
                    c0.b.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = n3.a.h(aVar2.f8730a);
                int iA0 = cVar.a0(eVar.a());
                int i7 = aVar.f5622a;
                int i10 = iH - ((i7 - 1) * iA0);
                int i11 = i10 / i7;
                int i12 = i10 % i7;
                ArrayList arrayList = new ArrayList(i7);
                int i13 = 0;
                while (i13 < i7) {
                    arrayList.add(Integer.valueOf((i13 < i12 ? 1 : 0) + i11));
                    i13++;
                }
                int[] iArrI0 = u8.p.I0(arrayList);
                int[] iArr = new int[iArrI0.length];
                eVar.c(cVar, iH, iArrI0, n3.o.f8749a, iArr);
                return new android.support.v4.media.session.r(8, iArrI0, iArr);
            case 8:
                ((Integer) obj2).getClass();
                ((g8.d) this.f170b).b((g8.i) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 9:
                ((Integer) obj2).getClass();
                ((g8.d) this.f170b).c((List) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 10:
                return ((f0.m) this.f171c).a(new h0.x((h0.t) this.f170b, (o2.i1) obj), ((n3.a) obj2).f8730a);
            case 11:
                ((Integer) obj2).getClass();
                l0.q0.c((w0.w0) this.f170b, (n1.c) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 12:
                ((Integer) obj2).getClass();
                i2.c.e((m5.l) this.f170b, (h9.k) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 13:
                ((Integer) obj2).getClass();
                ((m7.i) this.f170b).c((List) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 14:
                ((Integer) obj2).getClass();
                ((o7.g) this.f170b).c((List) this.f171c, (f1.s) obj, f1.b.y(1));
                return t8.z.f12851a;
            case 15:
                ((Integer) obj2).getClass();
                q0.k.a((s0.b) this.f170b, (o0.c) this.f171c, (f1.s) obj, f1.b.y(1));
                return t8.z.f12851a;
            case 16:
                ((Integer) obj2).getClass();
                ((q0.p) this.f170b).a((Drawable) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
            case 17:
                w0.t1 t1Var = (w0.t1) this.f170b;
                cc.y yVar = (cc.y) this.f171c;
                n0.a aVar3 = (n0.a) obj;
                Context context = (Context) obj2;
                boolean zBooleanValue = ((Boolean) t1Var.f13949l.getValue()).booleanValue();
                b3.h hVarL = t1Var.l();
                String str = hVarL != null ? hVarL.f1353b : null;
                b3.q0 q0Var2 = t1Var.f13959v;
                if (q0Var2 != null) {
                    long j5 = q0Var2.f1430a;
                    g3.q qVar = t1Var.f13940b;
                    q0Var = new b3.q0(b3.g0.b(qVar.b((int) (j5 >> 32)), qVar.b((int) (j5 & 4294967295L))));
                } else {
                    q0Var = null;
                }
                w0.v.a(aVar3, context, zBooleanValue, str, q0Var, t1Var.f13947i, new u0(t1Var, yVar, context, 12));
                return t8.z.f12851a;
            case 18:
                ((Integer) obj2).getClass();
                ((y.e) this.f170b).a((y.c) this.f171c, (f1.s) obj, f1.b.y(1));
                return t8.z.f12851a;
            default:
                ((Integer) obj2).getClass();
                ((z7.f) this.f170b).b((List) this.f171c, (f1.s) obj, f1.b.y(49));
                return t8.z.f12851a;
        }
    }
}
