package y1;

import android.content.Context;
import android.os.Build;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f14884f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2.u f14885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14886b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2.c f14887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f14889e;

    public e(r2.u uVar) {
        this.f14885a = uVar;
        d dVar = new d(this);
        this.f14889e = dVar;
        if (uVar.isAttachedToWindow()) {
            Context context = uVar.getContext();
            if (!this.f14888d) {
                context.getApplicationContext().registerComponentCallbacks(dVar);
                this.f14888d = true;
            }
        }
        uVar.addOnAttachStateChangeListener(new o.e(5, this));
    }

    @Override // y1.v
    public final void a(b2.c cVar) {
        synchronized (this.f14886b) {
            if (!cVar.f1214s) {
                cVar.f1214s = true;
                cVar.b();
            }
        }
    }

    @Override // y1.v
    public final b2.c b() {
        b2.e jVar;
        b2.c cVar;
        synchronized (this.f14886b) {
            try {
                r2.u uVar = this.f14885a;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    uVar.getUniqueDrawingId();
                }
                if (i7 >= 29) {
                    jVar = new b2.h();
                } else if (!f14884f || i7 < 23) {
                    jVar = new b2.j(c(this.f14885a));
                } else {
                    try {
                        jVar = new b2.f(this.f14885a, new p(), new a2.c());
                    } catch (Throwable unused) {
                        f14884f = false;
                        jVar = new b2.j(c(this.f14885a));
                    }
                }
                cVar = new b2.c(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final c2.a c(r2.u uVar) {
        c2.c cVar = this.f14887c;
        if (cVar != null) {
            return cVar;
        }
        c2.c cVar2 = new c2.c(uVar.getContext());
        cVar2.setClipChildren(false);
        cVar2.setClipToPadding(false);
        cVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        uVar.addView(cVar2, -1);
        this.f14887c = cVar2;
        return cVar2;
    }
}
