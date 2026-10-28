package w0;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.y f13862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f13867f;

    public o(s.y yVar, List list, int i7, int i10, boolean z10, z zVar) {
        this.f13862a = yVar;
        this.f13863b = list;
        this.f13864c = i7;
        this.f13865d = i10;
        this.f13866e = z10;
        this.f13867f = zVar;
        if (list.size() > 1) {
            return;
        }
        c0.b.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void n(s.a0 a0Var, z zVar, w wVar, int i7, int i10) {
        z zVar2;
        if (zVar.f14020c) {
            zVar2 = new z(wVar.a(i10), wVar.a(i7), i10 > i7);
        } else {
            zVar2 = new z(wVar.a(i7), wVar.a(i10), i7 > i10);
        }
        if (i7 > i10) {
            c0.b.c("minOffset should be less than or equal to maxOffset: " + zVar2);
        }
        long j5 = wVar.f13973a;
        int iC = a0Var.c(j5);
        Object[] objArr = a0Var.f12382c;
        Object obj = objArr[iC];
        a0Var.f12381b[iC] = j5;
        objArr[iC] = zVar2;
    }

    @Override // w0.p0
    public final boolean a() {
        return this.f13866e;
    }

    @Override // w0.p0
    public final w b() {
        return this.f13866e ? j() : g();
    }

    @Override // w0.p0
    public final z c() {
        return this.f13867f;
    }

    @Override // w0.p0
    public final w d() {
        return h() == k.f13824a ? g() : j();
    }

    @Override // w0.p0
    public final s.a0 e(z zVar) {
        y yVar = zVar.f14018a;
        boolean z10 = zVar.f14020c;
        long j5 = yVar.f14011c;
        int i7 = yVar.f14010b;
        y yVar2 = zVar.f14019b;
        long j10 = yVar2.f14011c;
        int i10 = yVar2.f14010b;
        if (j5 != j10) {
            s.a0 a0Var = s.o.f12475a;
            s.a0 a0Var2 = new s.a0();
            n(a0Var2, zVar, d(), (z10 ? yVar2 : yVar).f14010b, d().f13978f.f1408a.f1393a.f1353b.length());
            i(new c8.p(this, a0Var2, zVar));
            if (!z10) {
                yVar = yVar2;
            }
            n(a0Var2, zVar, h() == k.f13824a ? j() : g(), 0, yVar.f14010b);
            return a0Var2;
        }
        if ((!z10 || i7 < i10) && (z10 || i7 > i10)) {
            c0.b.c("unexpectedly miss-crossed selection: " + zVar);
        }
        long j11 = yVar.f14011c;
        s.a0 a0Var3 = s.o.f12475a;
        s.a0 a0Var4 = new s.a0();
        a0Var4.h(j11, zVar);
        return a0Var4;
    }

    @Override // w0.p0
    public final int f() {
        return this.f13865d;
    }

    @Override // w0.p0
    public final w g() {
        return (w) this.f13863b.get(p(this.f13865d, false));
    }

    @Override // w0.p0
    public final k h() {
        int i7 = this.f13864c;
        int i10 = this.f13865d;
        if (i7 < i10) {
            return k.f13825b;
        }
        if (i7 > i10) {
            return k.f13824a;
        }
        return ((w) this.f13863b.get(i7 / 2)).b();
    }

    @Override // w0.p0
    public final void i(h9.k kVar) {
        int iO = o(d().f13973a);
        int iO2 = o((h() == k.f13824a ? j() : g()).f13973a);
        int i7 = iO + 1;
        if (i7 >= iO2) {
            return;
        }
        while (i7 < iO2) {
            kVar.invoke(this.f13863b.get(i7));
            i7++;
        }
    }

    @Override // w0.p0
    public final w j() {
        return (w) this.f13863b.get(p(this.f13864c, true));
    }

    @Override // w0.p0
    public final int k() {
        return this.f13864c;
    }

    @Override // w0.p0
    public final int l() {
        return this.f13863b.size();
    }

    @Override // w0.p0
    public final boolean m(p0 p0Var) {
        if (this.f13867f != null && p0Var != null && (p0Var instanceof o)) {
            o oVar = (o) p0Var;
            List list = oVar.f13863b;
            if (this.f13866e == oVar.f13866e && this.f13864c == oVar.f13864c && this.f13865d == oVar.f13865d) {
                List list2 = this.f13863b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        w wVar = (w) list2.get(i7);
                        w wVar2 = (w) list.get(i7);
                        if (wVar.f13973a != wVar2.f13973a || wVar.f13975c != wVar2.f13975c || wVar.f13976d != wVar2.f13976d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final int o(long j5) {
        try {
            return this.f13862a.c(j5);
        } catch (NoSuchElementException e7) {
            throw new IllegalStateException("Invalid selectableId: " + j5, e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i7, boolean z10) {
        int iOrdinal = h().ordinal();
        boolean z11 = z10;
        if (iOrdinal == 0) {
            z11 = !z10 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new cc.s();
            }
        }
        return (i7 - (!z11)) / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.f13866e);
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb2.append((this.f13864c + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((this.f13865d + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(h());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        List list = this.f13863b;
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            w wVar = (w) list.get(i7);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i7++;
            sb4.append(i7);
            sb4.append(" -> ");
            sb4.append(wVar);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String string = sb3.toString();
        i9.l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }
}
