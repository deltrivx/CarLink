package yb;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends u8.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f15258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.k f15259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f15260e;

    public b(Iterator it, h9.k kVar) {
        i9.l.e(it, "source");
        this.f15258c = it;
        this.f15259d = kVar;
        this.f15260e = new HashSet();
    }

    @Override // u8.b
    public final void a() {
        Object next;
        do {
            Iterator it = this.f15258c;
            if (!it.hasNext()) {
                this.f13101a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f15260e.add(this.f15259d.invoke(next)));
        this.f13102b = next;
        this.f13101a = 1;
    }
}
