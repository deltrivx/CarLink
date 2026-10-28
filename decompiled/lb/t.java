package lb;

import aa.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.i3;
import ra.s0;
import ra.w0;
import ra.x0;
import x9.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends aa.d {
    public final jb.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0 f8367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f8368m;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(jb.k kVar, x0 x0Var, int i7) {
        nb.x0 x0Var2;
        jb.i iVar = kVar.f7043a;
        mb.k kVar2 = iVar.f7018a;
        x9.k kVar3 = kVar.f7045c;
        wa.e eVarG = i2.c.G(kVar.f7044b, x0Var.f12259e);
        w0 w0Var = x0Var.f12261g;
        i9.l.d(w0Var, "getVariance(...)");
        int iOrdinal = w0Var.ordinal();
        if (iOrdinal == 0) {
            x0Var2 = nb.x0.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            x0Var2 = nb.x0.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                throw new cc.s();
            }
            x0Var2 = nb.x0.INVARIANT;
        }
        nb.x0 x0Var3 = x0Var2;
        super(kVar2, kVar3, y9.g.f15129a, eVarG, x0Var3, x0Var.f12260f, i7, o0.f14732c);
        this.k = kVar;
        this.f8367l = x0Var;
        this.f8368m = new a(iVar.f7018a, new aa.e(18, this));
    }

    @Override // aa.l
    public final List D0() {
        jb.k kVar = this.k;
        f0 f0Var = kVar.f7046d;
        x0 x0Var = this.f8367l;
        i9.l.e(x0Var, "<this>");
        List list = x0Var.f12262h;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = x0Var.f12263i;
            i9.l.d(list2, "getUpperBoundIdList(...)");
            ArrayList arrayList = new ArrayList(u8.q.a0(list2, 10));
            for (Integer num : list2) {
                i9.l.b(num);
                arrayList.add(f0Var.a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return n3.l.I(db.e.e(this).n());
        }
        i3 i3Var = kVar.f7050h;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(i3Var.l((s0) it.next()));
        }
        return arrayList2;
    }

    @Override // h0.a0, y9.a
    public final y9.h getAnnotations() {
        return this.f8368m;
    }
}
