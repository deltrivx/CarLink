package l4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.g f8030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kb.d f8031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8032d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f8033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f8034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f8035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k9.a f8036h;

    public r(Context context, b4.g gVar) {
        k9.a.l(context, "Context cannot be null");
        this.f8029a = context.getApplicationContext();
        this.f8030b = gVar;
        this.f8031c = s.f8037d;
    }

    @Override // l4.i
    public final void K(k9.a aVar) {
        synchronized (this.f8032d) {
            this.f8036h = aVar;
        }
        b();
    }

    public final void a() {
        synchronized (this.f8032d) {
            try {
                this.f8036h = null;
                Handler handler = this.f8033e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f8033e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f8035g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f8034f = null;
                this.f8035g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f8032d) {
            try {
                if (this.f8036h == null) {
                    return;
                }
                if (this.f8034f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f8035g = threadPoolExecutor;
                    this.f8034f = threadPoolExecutor;
                }
                this.f8034f.execute(new androidx.lifecycle.z(15, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b4.m c() {
        try {
            kb.d dVar = this.f8031c;
            Context context = this.f8029a;
            b4.g gVar = this.f8030b;
            dVar.getClass();
            Object[] objArr = {gVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            b4.l lVarA = b4.f.a(context, Collections.unmodifiableList(arrayList));
            int i7 = lVarA.f1501a;
            if (i7 != 0) {
                throw new RuntimeException(a2.f.F("fetchFonts failed (", ")", i7));
            }
            b4.m[] mVarArr = (b4.m[]) lVarA.f1502b.get(0);
            if (mVarArr == null || mVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return mVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
