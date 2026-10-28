package jb;

import aa.f0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.f f7084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f7085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f7086c;

    public w(ta.f fVar, f0 f0Var, n0 n0Var) {
        this.f7084a = fVar;
        this.f7085b = f0Var;
        this.f7086c = n0Var;
    }

    public abstract wa.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
