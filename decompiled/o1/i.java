package o1;

import android.os.Bundle;
import android.support.v4.media.session.r;
import androidx.lifecycle.v;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f, a5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f9282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.f f9283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f9284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f9285d;

    public i(g gVar) {
        this.f9282a = gVar;
        a5.f fVar = new a5.f(new c5.a(this, new a5.e(0, this)));
        this.f9283b = fVar;
        this.f9284c = new v(this, false);
        this.f9285d = fVar.f46b;
        Object objC = gVar.c("androidx.savedstate.SavedStateRegistry");
        fVar.a(objC instanceof Bundle ? (Bundle) objC : null);
        gVar.e("androidx.savedstate.SavedStateRegistry", new a5.e(18, this));
    }

    @Override // o1.f
    public final boolean a(Object obj) {
        return this.f9282a.a(obj);
    }

    @Override // o1.f
    public final Map b() {
        return this.f9282a.b();
    }

    @Override // o1.f
    public final Object c(String str) {
        return this.f9282a.c(str);
    }

    @Override // a5.g
    public final r d() {
        return this.f9285d;
    }

    @Override // o1.f
    public final e e(String str, h9.a aVar) {
        return this.f9282a.e(str, aVar);
    }

    @Override // androidx.lifecycle.t
    public final v g() {
        return this.f9284c;
    }
}
