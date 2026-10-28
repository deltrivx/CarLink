package t8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h9.a f12836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f12837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12838c;

    public o(h9.a aVar) {
        i9.l.e(aVar, "initializer");
        this.f12836a = aVar;
        this.f12837b = w.f12848a;
        this.f12838c = this;
    }

    @Override // t8.h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f12837b;
        w wVar = w.f12848a;
        if (obj != wVar) {
            return obj;
        }
        synchronized (this.f12838c) {
            objInvoke = this.f12837b;
            if (objInvoke == wVar) {
                h9.a aVar = this.f12836a;
                i9.l.b(aVar);
                objInvoke = aVar.invoke();
                this.f12837b = objInvoke;
                this.f12836a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f12837b != w.f12848a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
