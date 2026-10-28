package kc;

import cc.l0;
import h9.o;
import hc.q;
import hc.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f7509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a9.i f7511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f7512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f7513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7514h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f7515i;

    public c(e eVar, Object obj, o oVar, o oVar2, s sVar, a9.i iVar, o oVar3) {
        this.f7515i = eVar;
        this.f7507a = obj;
        this.f7508b = oVar;
        this.f7509c = oVar2;
        this.f7510d = sVar;
        this.f7511e = iVar;
        this.f7512f = oVar3;
    }

    public final void a() {
        Object obj = this.f7513g;
        if (obj instanceof q) {
            ((q) obj).h(this.f7514h, this.f7515i.f7521a);
            return;
        }
        l0 l0Var = obj instanceof l0 ? (l0) obj : null;
        if (l0Var != null) {
            l0Var.a();
        }
    }
}
