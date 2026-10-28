package xa;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f14793b = h.f14788c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14794c;

    public final void d(k kVar) {
        z zVar;
        if (!this.f14794c) {
            this.f14793b = this.f14793b.clone();
            this.f14794c = true;
        }
        h hVar = this.f14793b;
        h hVar2 = kVar.f14795a;
        hVar.getClass();
        int i7 = 0;
        while (true) {
            zVar = hVar2.f14789a;
            if (i7 >= zVar.f14842b.size()) {
                break;
            }
            hVar.g((Map.Entry) zVar.f14842b.get(i7));
            i7++;
        }
        Iterator it = zVar.c().iterator();
        while (it.hasNext()) {
            hVar.g((Map.Entry) it.next());
        }
    }
}
