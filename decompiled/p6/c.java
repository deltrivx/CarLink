package p6;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.z;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10297g;

    public c(q6.a aVar) {
        super(aVar);
        this.f10297g = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q6.b] */
    @Override // p6.a
    public final void c(int i7) {
        Bundle arguments = this.f10295e.getArguments();
        if (i7 != (arguments == null ? 0 : arguments.getInt("request_code"))) {
            return;
        }
        int i10 = this.f10297g;
        if (i10 > 0) {
            this.f10297g = i10 - 1;
            return;
        }
        ArrayList arrayList = u6.c.f13072a;
        synchronized (u6.c.class) {
            u6.c.f13072a.remove(Integer.valueOf(i7));
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c7.a, java.lang.Object] */
    @Override // p6.a
    public final void g(Activity activity, ArrayList arrayList, int i7) {
        g5.a.o0(activity, this.f10295e, d7.a.k(activity, arrayList, false), i7, new z(19, this));
        u6.b.a(arrayList);
    }
}
