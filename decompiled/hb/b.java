package hb;

import aa.r;
import h0.a0;
import nb.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f6493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(x9.b bVar, w wVar) {
        super(wVar);
        if (wVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f6493b = (r) bVar;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f6493b + "}";
    }
}
