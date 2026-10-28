package v;

import f1.k1;
import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f13386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f13387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f13388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13391f;

    public /* synthetic */ k(w0 w0Var, Object obj, p pVar, int i7) {
        this(w0Var, obj, (i7 & 4) != 0 ? null : pVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public k(w0 w0Var, Object obj, p pVar, long j5, long j10, boolean z10) {
        p pVarF;
        this.f13386a = w0Var;
        this.f13387b = f1.b.s(obj);
        if (pVar != null) {
            pVarF = d.f(pVar);
        } else {
            pVarF = (p) w0Var.f13471a.invoke(obj);
            pVarF.d();
        }
        this.f13388c = pVarF;
        this.f13389d = j5;
        this.f13390e = j10;
        this.f13391f = z10;
    }

    @Override // f1.w2
    public final Object getValue() {
        return this.f13387b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f13387b.getValue() + ", velocity=" + this.f13386a.f13472b.invoke(this.f13388c) + ", isRunning=" + this.f13391f + ", lastFrameTimeNanos=" + this.f13389d + ", finishedTimeNanos=" + this.f13390e + ')';
    }
}
