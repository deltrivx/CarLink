package b4;

import java.util.ArrayList;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1494b;

    public /* synthetic */ i(int i7, Object obj) {
        this.f1493a = i7;
        this.f1494b = obj;
    }

    @Override // d4.a
    public final void accept(Object obj) {
        switch (this.f1493a) {
            case 0:
                j jVar = (j) obj;
                if (jVar == null) {
                    jVar = new j(-3);
                }
                ((u0.k) this.f1494b).c1(jVar);
                return;
            default:
                j jVar2 = (j) obj;
                synchronized (k.f1499c) {
                    try {
                        q0 q0Var = k.f1500d;
                        ArrayList arrayList = (ArrayList) q0Var.get((String) this.f1494b);
                        if (arrayList == null) {
                            return;
                        }
                        q0Var.remove((String) this.f1494b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((d4.a) arrayList.get(i7)).accept(jVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
