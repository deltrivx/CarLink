package c5;

import a5.e;
import a5.g;
import android.os.Bundle;
import androidx.lifecycle.o;
import java.util.LinkedHashMap;
import kb.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2426b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f2430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2431g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f2427c = new d(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2428d = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2432h = true;

    public a(g gVar, e eVar) {
        this.f2425a = gVar;
        this.f2426b = eVar;
    }

    public final void a() {
        g gVar = this.f2425a;
        if (gVar.g().f1072c != o.f1057b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f2429e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f2426b.invoke();
        gVar.g().a(new c.e(2, this));
        this.f2429e = true;
    }
}
