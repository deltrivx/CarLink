package f1;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class e implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4936d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i7) {
        this.f4933a = i7;
        this.f4934b = obj;
        this.f4935c = obj2;
        this.f4936d = obj3;
    }

    public static /* synthetic */ void e(int i7) {
        String str = (i7 == 3 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 3 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "map";
        } else if (i7 == 2) {
            objArr[0] = "compute";
        } else if (i7 == 3 || i7 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i7 != 3 && i7 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + mb.j.f8623b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((mb.k) this.f4934b));
        mb.k.e(assertionError);
        return assertionError;
    }

    public AssertionError g(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((mb.k) this.f4934b));
        mb.k.e(assertionError);
        return assertionError;
    }

    public AssertionError h(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((mb.k) this.f4934b), th);
        mb.k.e(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:11:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003d, B:23:0x0048, B:24:0x004b, B:26:0x004e, B:28:0x0054, B:30:0x0058, B:31:0x005b, B:32:0x005e, B:34:0x0061, B:48:0x0085, B:52:0x0091, B:53:0x0095, B:54:0x0096, B:55:0x0098, B:60:0x00a1, B:62:0x00ac, B:63:0x00b0, B:64:0x00b1, B:65:0x00b4, B:67:0x00b8, B:68:0x00bb, B:70:0x00bd, B:71:0x00c1, B:57:0x009a, B:58:0x009e, B:37:0x0068, B:41:0x0077, B:45:0x007f, B:46:0x0083, B:50:0x008b, B:66:0x00b5), top: B:83:0x0028, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:11:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003d, B:23:0x0048, B:24:0x004b, B:26:0x004e, B:28:0x0054, B:30:0x0058, B:31:0x005b, B:32:0x005e, B:34:0x0061, B:48:0x0085, B:52:0x0091, B:53:0x0095, B:54:0x0096, B:55:0x0098, B:60:0x00a1, B:62:0x00ac, B:63:0x00b0, B:64:0x00b1, B:65:0x00b4, B:67:0x00b8, B:68:0x00bb, B:70:0x00bd, B:71:0x00c1, B:57:0x009a, B:58:0x009e, B:37:0x0068, B:41:0x0077, B:45:0x007f, B:46:0x0083, B:50:0x008b, B:66:0x00b5), top: B:83:0x0028, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:11:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003d, B:23:0x0048, B:24:0x004b, B:26:0x004e, B:28:0x0054, B:30:0x0058, B:31:0x005b, B:32:0x005e, B:34:0x0061, B:48:0x0085, B:52:0x0091, B:53:0x0095, B:54:0x0096, B:55:0x0098, B:60:0x00a1, B:62:0x00ac, B:63:0x00b0, B:64:0x00b1, B:65:0x00b4, B:67:0x00b8, B:68:0x00bb, B:70:0x00bd, B:71:0x00c1, B:57:0x009a, B:58:0x009e, B:37:0x0068, B:41:0x0077, B:45:0x007f, B:46:0x0083, B:50:0x008b, B:66:0x00b5), top: B:83:0x0028, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:11:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003d, B:23:0x0048, B:24:0x004b, B:26:0x004e, B:28:0x0054, B:30:0x0058, B:31:0x005b, B:32:0x005e, B:34:0x0061, B:48:0x0085, B:52:0x0091, B:53:0x0095, B:54:0x0096, B:55:0x0098, B:60:0x00a1, B:62:0x00ac, B:63:0x00b0, B:64:0x00b1, B:65:0x00b4, B:67:0x00b8, B:68:0x00bb, B:70:0x00bd, B:71:0x00c1, B:57:0x009a, B:58:0x009e, B:37:0x0068, B:41:0x0077, B:45:0x007f, B:46:0x0083, B:50:0x008b, B:66:0x00b5), top: B:83:0x0028, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:11:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003d, B:23:0x0048, B:24:0x004b, B:26:0x004e, B:28:0x0054, B:30:0x0058, B:31:0x005b, B:32:0x005e, B:34:0x0061, B:48:0x0085, B:52:0x0091, B:53:0x0095, B:54:0x0096, B:55:0x0098, B:60:0x00a1, B:62:0x00ac, B:63:0x00b0, B:64:0x00b1, B:65:0x00b4, B:67:0x00b8, B:68:0x00bb, B:70:0x00bd, B:71:0x00c1, B:57:0x009a, B:58:0x009e, B:37:0x0068, B:41:0x0077, B:45:0x007f, B:46:0x0083, B:50:0x008b, B:66:0x00b5), top: B:83:0x0028, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:37:0x0068, B:41:0x0077, B:45:0x007f, B:46:0x0083), top: B:84:0x0068, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // h9.k
    public Object invoke(Object obj) throws Throwable {
        int i7;
        Object objPut;
        e6.h hVarD;
        switch (this.f4933a) {
            case 0:
                d dVar = (d) this.f4934b;
                dVar.f4926a = null;
                dVar.f4927b = null;
                n1.a aVar = ((f) this.f4935c).f4949d;
                int i10 = ((i9.v) this.f4936d).f6686a;
                do {
                    i7 = aVar.get();
                } while (!aVar.compareAndSet(i7, ((i7 >>> 27) & 15) == i10 ? i7 - 1 : i7));
                return t8.z.f12851a;
            default:
                mb.k kVar = (mb.k) this.f4934b;
                mb.a aVar2 = kVar.f8629b;
                mb.m mVar = kVar.f8628a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f4935c;
                Object obj2 = concurrentHashMap.get(obj);
                Object obj3 = wb.l.f14300a;
                AssertionError assertionErrorG = null;
                mb.j jVar = mb.j.f8623b;
                if (obj2 != null && obj2 != jVar) {
                    wb.l.k(obj2);
                    if (obj2 == obj3) {
                        return null;
                    }
                    return obj2;
                }
                mVar.lock();
                try {
                    Object objInvoke = concurrentHashMap.get(obj);
                    mb.j jVar2 = mb.j.f8624c;
                    if (objInvoke == jVar) {
                        e6.h hVarD2 = kVar.d(obj, "");
                        if (hVarD2 == null) {
                            e(3);
                            throw null;
                        }
                        if (hVarD2.f4442b) {
                            objInvoke = jVar2;
                            if (objInvoke != jVar2) {
                                hVarD = kVar.d(obj, "");
                                if (hVarD != null) {
                                    e(3);
                                    throw null;
                                }
                                if (!hVarD.f4442b) {
                                    objInvoke = hVarD.f4443c;
                                } else {
                                    if (objInvoke != null) {
                                        concurrentHashMap.put(obj, jVar);
                                        objInvoke = ((h9.k) this.f4936d).invoke(obj);
                                        if (objInvoke == null) {
                                            obj3 = objInvoke;
                                        }
                                        objPut = concurrentHashMap.put(obj, obj3);
                                        if (objPut == jVar) {
                                            assertionErrorG = g(obj, objPut);
                                            throw assertionErrorG;
                                        }
                                        mVar.unlock();
                                        throw th;
                                    }
                                    wb.l.k(objInvoke);
                                    if (objInvoke == obj3) {
                                        objInvoke = null;
                                    }
                                }
                            } else {
                                if (objInvoke != null) {
                                    concurrentHashMap.put(obj, jVar);
                                    objInvoke = ((h9.k) this.f4936d).invoke(obj);
                                    if (objInvoke == null) {
                                        obj3 = objInvoke;
                                    }
                                    objPut = concurrentHashMap.put(obj, obj3);
                                    if (objPut == jVar) {
                                        assertionErrorG = g(obj, objPut);
                                        throw assertionErrorG;
                                    }
                                    mVar.unlock();
                                    throw th;
                                }
                                wb.l.k(objInvoke);
                                if (objInvoke == obj3) {
                                    objInvoke = null;
                                }
                            }
                        } else {
                            objInvoke = hVarD2.f4443c;
                        }
                    } else if (objInvoke != jVar2) {
                        hVarD = kVar.d(obj, "");
                        if (hVarD != null) {
                            e(3);
                            throw null;
                        }
                        if (!hVarD.f4442b) {
                            objInvoke = hVarD.f4443c;
                        } else {
                            if (objInvoke != null) {
                                concurrentHashMap.put(obj, jVar);
                                objInvoke = ((h9.k) this.f4936d).invoke(obj);
                                if (objInvoke == null) {
                                    obj3 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj3);
                                if (objPut == jVar) {
                                    assertionErrorG = g(obj, objPut);
                                    throw assertionErrorG;
                                }
                                mVar.unlock();
                                throw th;
                            }
                            wb.l.k(objInvoke);
                            if (objInvoke == obj3) {
                                objInvoke = null;
                            }
                        }
                    } else {
                        if (objInvoke != null) {
                            try {
                                concurrentHashMap.put(obj, jVar);
                                objInvoke = ((h9.k) this.f4936d).invoke(obj);
                                if (objInvoke == null) {
                                    obj3 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj3);
                                if (objPut == jVar) {
                                    assertionErrorG = g(obj, objPut);
                                    throw assertionErrorG;
                                }
                            } catch (Throwable th) {
                                if (wb.l.i(th)) {
                                    try {
                                        Object objRemove = concurrentHashMap.remove(obj);
                                        if (objRemove != jVar) {
                                            throw f(obj, objRemove);
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        throw h(obj, th2);
                                    }
                                }
                                if (th != assertionErrorG) {
                                    Object objPut2 = concurrentHashMap.put(obj, new wb.k(th));
                                    if (objPut2 != jVar) {
                                        throw g(obj, objPut2);
                                    }
                                    aVar2.getClass();
                                    throw th;
                                }
                                try {
                                    concurrentHashMap.remove(obj);
                                    aVar2.getClass();
                                    throw th;
                                } catch (Throwable th3) {
                                    throw h(obj, th3);
                                }
                            }
                            mVar.unlock();
                            throw th;
                        }
                        wb.l.k(objInvoke);
                        if (objInvoke == obj3) {
                            objInvoke = null;
                        }
                    }
                    mVar.unlock();
                    return objInvoke;
                } catch (Throwable th4) {
                    mVar.unlock();
                    throw th4;
                }
        }
    }
}
