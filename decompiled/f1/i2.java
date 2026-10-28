package f1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Iterable, j9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4986b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4989e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4992h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap f4994j;
    public s.w k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4985a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f4987c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4990f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f4993i = new ArrayList();

    public final int c(a aVar) {
        if (this.f4991g) {
            t.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            r1.a("Anchor refers to a group that was removed");
        }
        return aVar.f4875a;
    }

    public final void d() {
        this.f4994j = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this, 0, this.f4986b);
    }

    public final h2 k() {
        if (this.f4991g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f4989e++;
        return new h2(this);
    }

    public final l2 m() {
        if (this.f4991g) {
            t.c("Cannot start a writer when another writer is pending");
        }
        if (this.f4989e > 0) {
            t.c("Cannot start a writer when a reader is pending");
        }
        this.f4991g = true;
        this.f4992h++;
        return new l2(this);
    }

    public final boolean n(a aVar) {
        int iE;
        return aVar.a() && (iE = k2.e(this.f4993i, aVar.f4875a, this.f4986b)) >= 0 && i9.l.a(this.f4993i.get(iE), aVar);
    }

    public final n0 o(int i7) {
        int i10;
        ArrayList arrayList;
        int iE;
        HashMap map = this.f4994j;
        if (map != null) {
            if (this.f4991g) {
                t.c("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i7 < 0 || i7 >= (i10 = this.f4986b) || (iE = k2.e((arrayList = this.f4993i), i7, i10)) < 0) ? null : (a) arrayList.get(iE);
            if (aVar != null) {
                return (n0) map.get(aVar);
            }
        }
        return null;
    }
}
