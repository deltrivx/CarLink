package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1067a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1067a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
