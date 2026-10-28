package b4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1472a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1474c;

    public b(int i7, LinkedBlockingQueue linkedBlockingQueue) {
        this.f1473b = i7;
        this.f1474c = linkedBlockingQueue;
    }

    public b(List list, int i7, Throwable th) {
        k9.a.l(list, "initCallbacks cannot be null");
        this.f1474c = new ArrayList(list);
        this.f1473b = i7;
    }

    public b(wb.b bVar, int i7) {
        this.f1474c = bVar;
        this.f1473b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.f1472a) {
            case 0:
                d3.e eVar = (d3.e) ((wb.b) this.f1474c).f14284a;
                if (eVar != null) {
                    eVar.getClass();
                }
                break;
            case 1:
                for (int i7 = 0; i7 < this.f1473b && (runnable = (Runnable) ((LinkedBlockingQueue) this.f1474c).poll()) != null; i7++) {
                    runnable.run();
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f1474c;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f1473b != 1) {
                    while (i10 < size) {
                        ((l4.h) arrayList.get(i10)).a();
                        i10++;
                    }
                } else {
                    while (i10 < size) {
                        ((l4.h) arrayList.get(i10)).b();
                        i10++;
                    }
                }
                break;
        }
    }
}
