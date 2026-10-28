package g1;

import f1.o0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.s f5763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f5764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5765c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5769g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5773l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f5766d = new o0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5767e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f5770h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5771i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5772j = -1;
    public int k = -1;

    public b(f1.s sVar, a aVar) {
        this.f5763a = sVar;
        this.f5764b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f5770h;
        if (arrayList.isEmpty()) {
            this.f5769g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i7 = this.f5769g;
        if (i7 > 0) {
            l0 l0Var = this.f5764b.f5761g;
            l0Var.a0(h0.f5787d);
            l0Var.f5798i[l0Var.f5799j - l0Var.f5796g[l0Var.f5797h - 1].f5792b] = i7;
            this.f5769g = 0;
        }
        ArrayList arrayList = this.f5770h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f5764b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.f5761g;
            l0Var2.a0(k.f5794d);
            k9.a.Q(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i7 = this.f5773l;
        if (i7 > 0) {
            int i10 = this.f5771i;
            if (i10 >= 0) {
                b();
                l0 l0Var = this.f5764b.f5761g;
                l0Var.a0(z.f5818d);
                int i11 = l0Var.f5799j - l0Var.f5796g[l0Var.f5797h - 1].f5792b;
                int[] iArr = l0Var.f5798i;
                iArr[i11] = i10;
                iArr[i11 + 1] = i7;
                this.f5771i = -1;
            } else {
                int i12 = this.k;
                int i13 = this.f5772j;
                b();
                l0 l0Var2 = this.f5764b.f5761g;
                l0Var2.a0(v.f5814d);
                int i14 = l0Var2.f5799j - l0Var2.f5796g[l0Var2.f5797h - 1].f5792b;
                int[] iArr2 = l0Var2.f5798i;
                iArr2[i14 + 1] = i12;
                iArr2[i14] = i13;
                iArr2[i14 + 2] = i7;
                this.f5772j = -1;
                this.k = -1;
            }
            this.f5773l = 0;
        }
    }

    public final void d(boolean z10) {
        f1.s sVar = this.f5763a;
        int i7 = z10 ? sVar.G.f4978i : sVar.G.f4976g;
        int i10 = i7 - this.f5768f;
        if (i10 < 0) {
            f1.t.c("Tried to seek backward");
        }
        if (i10 > 0) {
            l0 l0Var = this.f5764b.f5761g;
            l0Var.a0(d.f5778d);
            l0Var.f5798i[l0Var.f5799j - l0Var.f5796g[l0Var.f5797h - 1].f5792b] = i10;
            this.f5768f = i7;
        }
    }

    public final void e(int i7, int i10) {
        if (i10 > 0) {
            if (!(i7 >= 0)) {
                f1.t.c("Invalid remove index " + i7);
            }
            if (this.f5771i == i7) {
                this.f5773l += i10;
                return;
            }
            c();
            this.f5771i = i7;
            this.f5773l = i10;
        }
    }
}
