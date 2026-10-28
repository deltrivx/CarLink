package t8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12833c = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h9.a f12834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f12835b;

    @Override // t8.h
    public final Object getValue() {
        Object obj = this.f12835b;
        w wVar = w.f12848a;
        if (obj != wVar) {
            return obj;
        }
        h9.a aVar = this.f12834a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12833c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != wVar) {
                }
            }
            this.f12834a = null;
            return objInvoke;
        }
        return this.f12835b;
    }

    public final String toString() {
        return this.f12835b != w.f12848a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
