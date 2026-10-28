package mb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile u0.k f8614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa.a f8615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, aa.e eVar, aa.a aVar) {
        super(kVar, eVar);
        this.f8615e = aVar;
        if (kVar == null) {
            h(0);
            throw null;
        }
        this.f8614d = null;
    }

    public static /* synthetic */ void e(int i7) {
        String str = i7 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i7 != 2 ? 2 : 3];
        if (i7 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i7 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i7 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void h(int i7) {
        String str = i7 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 2 ? 3 : 2];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i7 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // mb.h
    public final void f(Object obj) {
        this.f8614d = new u0.k(obj);
        try {
            if (obj == null) {
                e(2);
                throw null;
            }
            this.f8615e.invoke(obj);
            this.f8614d = null;
        } catch (Throwable th) {
            this.f8614d = null;
            throw th;
        }
    }

    @Override // mb.h
    public final e6.h g(boolean z10) {
        return new e6.h(new nb.e(n3.l.I(pb.l.f10418d)), 2, false);
    }

    @Override // mb.h, h9.a
    public final Object invoke() throws Throwable {
        Object objInvoke;
        u0.k kVar = this.f8614d;
        if (kVar == null || ((Thread) kVar.f12990b) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) kVar.f12990b) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = kVar.f12991c;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        h(2);
        throw null;
    }
}
