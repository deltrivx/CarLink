package l4;

import android.os.Build;
import java.util.ArrayList;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f7999c;

    public e(f fVar) {
        this.f7999c = fVar;
    }

    @Override // k9.a
    public final void F(Throwable th) {
        this.f7999c.f8000a.f(th);
    }

    @Override // k9.a
    public final void G(da.a aVar) {
        f fVar = this.f7999c;
        fVar.f8002c = aVar;
        da.a aVar2 = fVar.f8002c;
        j jVar = fVar.f8000a;
        fVar.f8001b = new a2.b(aVar2, jVar.f8010g, jVar.f8012i, Build.VERSION.SDK_INT >= 34 ? n.a() : e0.A());
        j jVar2 = fVar.f8000a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f8004a.writeLock().lock();
        try {
            jVar2.f8006c = 1;
            arrayList.addAll(jVar2.f8005b);
            jVar2.f8005b.clear();
            jVar2.f8004a.writeLock().unlock();
            jVar2.f8007d.post(new b4.b(arrayList, jVar2.f8006c, null));
        } catch (Throwable th) {
            jVar2.f8004a.writeLock().unlock();
            throw th;
        }
    }
}
