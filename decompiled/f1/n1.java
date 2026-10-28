package f1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f5053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f5055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.n f5056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.b f5058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f5060h = new AtomicReference(o1.f5070c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s.i0 f5061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1.i f5062j;
    public final a2.b k;

    public n1(y yVar, v vVar, s sVar, s.k0 k0Var, h9.n nVar, boolean z10, a2.b bVar, Object obj) {
        this.f5053a = yVar;
        this.f5054b = vVar;
        this.f5055c = sVar;
        this.f5056d = nVar;
        this.f5057e = z10;
        this.f5058f = bVar;
        this.f5059g = obj;
        s.i0 i0Var = s.p0.f12478a;
        i9.l.c(i0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f5061i = i0Var;
        n1.i iVar = new n1.i();
        iVar.g(k0Var, sVar.y());
        this.f5062j = iVar;
        this.k = new a2.b(bVar.f14d);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f5060h;
        try {
            switch (((o1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    o1 o1Var = o1.f5073f;
                    o1 o1Var2 = o1.f5074g;
                    while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                        if (atomicReference.get() != o1Var) {
                            r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new cc.s();
            }
        } catch (Exception e7) {
            atomicReference.set(o1.f5068a);
            throw e7;
        }
    }

    public final void b() {
        synchronized (this.f5059g) {
            try {
                this.k.R(this.f5058f, this.f5062j);
                this.f5062j.c();
                this.f5062j.d();
                this.f5062j.b();
                this.f5053a.f5219q = null;
            } catch (Throwable th) {
                this.f5062j.b();
                this.f5053a.f5219q = null;
                throw th;
            }
        }
    }

    public final boolean c() {
        return ((o1) this.f5060h.get()).compareTo(o1.f5073f) >= 0;
    }

    public final void d() {
        o1 o1Var;
        o1 o1Var2;
        boolean z10;
        while (true) {
            AtomicReference atomicReference = this.f5060h;
            o1Var = o1.f5071d;
            o1Var2 = o1.f5073f;
            if (atomicReference.compareAndSet(o1Var, o1Var2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != o1Var) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
    }

    public final void e() {
        o1 o1Var;
        boolean z10;
        AtomicReference atomicReference = this.f5060h;
        Object obj = atomicReference.get();
        o1 o1Var2 = o1.f5071d;
        if (obj == o1Var2) {
            return;
        }
        while (true) {
            o1Var = o1.f5073f;
            if (atomicReference.compareAndSet(o1Var, o1Var2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != o1Var) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:23:0x0071, B:29:0x0099, B:31:0x00a1, B:26:0x0078, B:28:0x007e, B:33:0x00a7, B:35:0x00ad, B:38:0x00b4, B:39:0x00cf, B:19:0x0048, B:21:0x004e, B:43:0x00d8, B:46:0x00e7, B:47:0x00ea, B:48:0x00ec, B:54:0x0114, B:56:0x011c, B:51:0x00f3, B:53:0x00f9, B:61:0x0127, B:62:0x012a, B:63:0x012b, B:64:0x0132, B:65:0x0133, B:66:0x013a, B:44:0x00dd, B:22:0x0069), top: B:73:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:23:0x0071, B:29:0x0099, B:31:0x00a1, B:26:0x0078, B:28:0x007e, B:33:0x00a7, B:35:0x00ad, B:38:0x00b4, B:39:0x00cf, B:19:0x0048, B:21:0x004e, B:43:0x00d8, B:46:0x00e7, B:47:0x00ea, B:48:0x00ec, B:54:0x0114, B:56:0x011c, B:51:0x00f3, B:53:0x00f9, B:61:0x0127, B:62:0x012a, B:63:0x012b, B:64:0x0132, B:65:0x0133, B:66:0x013a, B:44:0x00dd, B:22:0x0069), top: B:73:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:23:0x0071, B:29:0x0099, B:31:0x00a1, B:26:0x0078, B:28:0x007e, B:33:0x00a7, B:35:0x00ad, B:38:0x00b4, B:39:0x00cf, B:19:0x0048, B:21:0x004e, B:43:0x00d8, B:46:0x00e7, B:47:0x00ea, B:48:0x00ec, B:54:0x0114, B:56:0x011c, B:51:0x00f3, B:53:0x00f9, B:61:0x0127, B:62:0x012a, B:63:0x012b, B:64:0x0132, B:65:0x0133, B:66:0x013a, B:44:0x00dd, B:22:0x0069), top: B:73:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:1: B:23:0x0071->B:79:?, LOOP_END, SYNTHETIC] */
    public final boolean f(b3.l0 l0Var) throws Exception {
        o1 o1Var = o1.f5072e;
        AtomicReference atomicReference = this.f5060h;
        try {
            int iOrdinal = ((o1) atomicReference.get()).ordinal();
            o1 o1Var2 = o1.f5071d;
            y yVar = this.f5053a;
            v vVar = this.f5054b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    s sVar = this.f5055c;
                    boolean z10 = this.f5057e;
                    if (z10) {
                        sVar.f5130z = 100;
                        sVar.f5129y = true;
                    }
                    try {
                        this.f5061i = vVar.b(yVar, l0Var, this.f5056d);
                        if (z10) {
                            sVar.s();
                        }
                        o1 o1Var3 = o1.f5070c;
                        while (!atomicReference.compareAndSet(o1Var3, o1Var2)) {
                            if (atomicReference.get() != o1Var3) {
                                r1.b("Unexpected state change from: " + o1Var3 + " to: " + o1Var2 + '.');
                                if (this.f5061i.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.f5061i.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z10) {
                            sVar.s();
                        }
                        throw th;
                    }
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(o1Var2, o1Var)) {
                            if (atomicReference.get() != o1Var2) {
                                r1.b("Unexpected state change from: " + o1Var2 + " to: " + o1Var + '.');
                                this.f5061i = vVar.m(yVar, l0Var, this.f5061i);
                                while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                                    if (atomicReference.get() != o1Var) {
                                        r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                                        if (this.f5061i.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.f5061i.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.f5061i = vVar.m(yVar, l0Var, this.f5061i);
                        while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                            if (atomicReference.get() != o1Var) {
                                r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                                if (this.f5061i.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.f5061i.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                            if (atomicReference.get() != o1Var) {
                                r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                case 4:
                    t.d("Recursive call to resume()");
                    throw new cc.s();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new cc.s();
            }
        } catch (Exception e7) {
            atomicReference.set(o1.f5068a);
            throw e7;
        }
    }
}
