package o1;

import f1.h0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f9272c;

    public c(d dVar, Object obj, i iVar) {
        this.f9270a = dVar;
        this.f9271b = obj;
        this.f9272c = iVar;
    }

    @Override // f1.h0
    public final void a() {
        d dVar = this.f9270a;
        s.h0 h0Var = dVar.f9275b;
        Object obj = this.f9271b;
        Object objK = h0Var.k(obj);
        i iVar = this.f9272c;
        if (objK == iVar) {
            Map map = dVar.f9274a;
            Map mapB = iVar.b();
            if (mapB.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapB);
            }
        }
    }
}
