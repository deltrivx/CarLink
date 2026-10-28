package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4.a f1062a = new v4.a();

    public final void a() {
        v4.a aVar = this.f1062a;
        if (aVar != null && !aVar.f13608d) {
            aVar.f13608d = true;
            synchronized (aVar.f13605a) {
                try {
                    Iterator it = aVar.f13606b.values().iterator();
                    while (it.hasNext()) {
                        v4.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f13607c.iterator();
                    while (it2.hasNext()) {
                        v4.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f13607c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
