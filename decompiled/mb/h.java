package mb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class h implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f8619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f8620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f8621c;

    public h(k kVar, h9.a aVar) {
        if (kVar == null) {
            e(0);
            throw null;
        }
        this.f8621c = j.f8622a;
        this.f8619a = kVar;
        this.f8620b = aVar;
    }

    public static /* synthetic */ void e(int i7) {
        String str = (i7 == 2 || i7 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 == 2 || i7 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i7 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i7 != 2 && i7 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public void f(Object obj) {
    }

    public e6.h g(boolean z10) {
        e6.h hVarD = this.f8619a.d(null, "in a lazy value");
        if (hVarD != null) {
            return hVarD;
        }
        e(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // h9.a
    public Object invoke() throws Throwable {
        Object objInvoke;
        e6.h hVarG;
        j jVar = j.f8624c;
        j jVar2 = j.f8623b;
        Object obj = this.f8621c;
        if (!(obj instanceof j)) {
            wb.l.k(obj);
            return obj;
        }
        this.f8619a.f8628a.lock();
        try {
            Object obj2 = this.f8621c;
            if (!(obj2 instanceof j)) {
                wb.l.k(obj2);
                this.f8619a.f8628a.unlock();
                return obj2;
            }
            if (obj2 == jVar2) {
                this.f8621c = jVar;
                e6.h hVarG2 = g(true);
                if (!hVarG2.f4442b) {
                    objInvoke = hVarG2.f4443c;
                } else if (obj2 == jVar) {
                    hVarG = g(false);
                    if (hVarG.f4442b) {
                        this.f8621c = jVar2;
                        try {
                            objInvoke = this.f8620b.invoke();
                            f(objInvoke);
                            this.f8621c = objInvoke;
                        } catch (Throwable th) {
                            if (wb.l.i(th)) {
                                this.f8621c = j.f8622a;
                                throw th;
                            }
                            if (this.f8621c == jVar2) {
                                this.f8621c = new wb.k(th);
                            }
                            this.f8619a.f8629b.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = hVarG.f4443c;
                    }
                } else {
                    this.f8621c = jVar2;
                    objInvoke = this.f8620b.invoke();
                    f(objInvoke);
                    this.f8621c = objInvoke;
                }
            } else if (obj2 == jVar) {
                hVarG = g(false);
                if (hVarG.f4442b) {
                    objInvoke = hVarG.f4443c;
                } else {
                    this.f8621c = jVar2;
                    objInvoke = this.f8620b.invoke();
                    f(objInvoke);
                    this.f8621c = objInvoke;
                }
            } else {
                this.f8621c = jVar2;
                objInvoke = this.f8620b.invoke();
                f(objInvoke);
                this.f8621c = objInvoke;
            }
            this.f8619a.f8628a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.f8619a.f8628a.unlock();
            throw th2;
        }
    }
}
