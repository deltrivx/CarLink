package g0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5728i;

    public s(h hVar) {
        this.f5720a = hVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q(0, 0));
        this.f5721b = arrayList;
        this.f5725f = -1;
        this.f5726g = new ArrayList();
        this.f5727h = u8.w.f13122a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.f5728i))) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final b4.l b(int i7) {
        ?? r8;
        int i10 = this.f5728i;
        int i11 = i7 * i10;
        int iD = d() - i11;
        if (i10 > iD) {
            i10 = iD;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 == this.f5727h.size()) {
            r8 = this.f5727h;
        } else {
            ArrayList arrayList = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new b(1));
            }
            this.f5727h = arrayList;
            r8 = arrayList;
        }
        return new b4.l(i11, r8);
    }

    public final int c(int i7) {
        if (d() <= 0) {
            return 0;
        }
        if (i7 >= d()) {
            c0.b.a("ItemIndex > total count");
        }
        return i7 / this.f5728i;
    }

    public final int d() {
        return this.f5720a.f5645c.f5998b;
    }

    public final int e(int i7) {
        h0.i iVarC = this.f5720a.f5645c.c(i7);
        int i10 = i7 - iVarC.f6320a;
        return (int) ((b) ((f) iVarC.f6322c).f5639a.invoke(r.f5719a, Integer.valueOf(i10))).f5623a;
    }
}
