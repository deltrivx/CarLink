package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.o f2656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f2658e;

    public q(Object obj, i iVar, h9.o oVar, Object obj2, Throwable th) {
        this.f2654a = obj;
        this.f2655b = iVar;
        this.f2656c = oVar;
        this.f2657d = obj2;
        this.f2658e = th;
    }

    public /* synthetic */ q(Object obj, i iVar, h9.o oVar, Throwable th, int i7) {
        this(obj, (i7 & 2) != 0 ? null : iVar, (i7 & 4) != 0 ? null : oVar, (Object) null, (i7 & 16) != 0 ? null : th);
    }

    public static q a(q qVar, i iVar, Throwable th, int i7) {
        Object obj = qVar.f2654a;
        if ((i7 & 2) != 0) {
            iVar = qVar.f2655b;
        }
        i iVar2 = iVar;
        h9.o oVar = qVar.f2656c;
        Object obj2 = qVar.f2657d;
        if ((i7 & 16) != 0) {
            th = qVar.f2658e;
        }
        return new q(obj, iVar2, oVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i9.l.a(this.f2654a, qVar.f2654a) && i9.l.a(this.f2655b, qVar.f2655b) && i9.l.a(this.f2656c, qVar.f2656c) && i9.l.a(this.f2657d, qVar.f2657d) && i9.l.a(this.f2658e, qVar.f2658e);
    }

    public final int hashCode() {
        Object obj = this.f2654a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f2655b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h9.o oVar = this.f2656c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Object obj2 = this.f2657d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2658e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2654a + ", cancelHandler=" + this.f2655b + ", onCancellation=" + this.f2656c + ", idempotentResume=" + this.f2657d + ", cancelCause=" + this.f2658e + ')';
    }
}
