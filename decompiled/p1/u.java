package p1;

import f1.r1;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f10088a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10090c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g4.e f10095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f10096i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10089b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b3.a f10091d = new b3.a(19, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c8.k f10092e = new c8.k(23, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1.e f10093f = new h1.e(new t[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10094g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10097j = -1;

    public u(h9.k kVar) {
        this.f10088a = kVar;
    }

    public final void a() {
        synchronized (this.f10094g) {
            h1.e eVar = this.f10093f;
            Object[] objArr = eVar.f6421a;
            int i7 = eVar.f6423c;
            for (int i10 = 0; i10 < i7; i10++) {
                t tVar = (t) objArr[i10];
                tVar.f10081e.a();
                tVar.f10082f.a();
                tVar.k.a();
                tVar.f10087l.clear();
            }
        }
    }

    public final boolean b() {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.f10094g) {
            z10 = this.f10090c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f10089b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        f1.t.d("Unexpected notification");
                        throw new cc.s();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.f10094g) {
                h1.e eVar = this.f10093f;
                Object[] objArr = eVar.f6421a;
                int i7 = eVar.f6423c;
                for (int i10 = 0; i10 < i7; i10++) {
                    z11 = ((t) objArr[i10]).b(set) || z11;
                }
            }
        }
    }

    public final void c(Object obj, h9.k kVar, h9.a aVar) {
        Object obj2;
        t tVar;
        synchronized (this.f10094g) {
            h1.e eVar = this.f10093f;
            Object[] objArr = eVar.f6421a;
            int i7 = eVar.f6423c;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i10];
                if (((t) obj2).f10077a == kVar) {
                    break;
                } else {
                    i10++;
                }
            }
            tVar = (t) obj2;
            if (tVar == null) {
                i9.l.c(kVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                i9.b0.d(1, kVar);
                tVar = new t(kVar);
                eVar.b(tVar);
            }
        }
        t tVar2 = this.f10096i;
        long j5 = this.f10097j;
        if (j5 != -1 && j5 != n1.h.b()) {
            r1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j5 + "), currentThread={id=" + n1.h.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f10096i = tVar;
            this.f10097j = n1.h.b();
            tVar.a(obj, this.f10092e, aVar);
        } finally {
            this.f10096i = tVar2;
            this.f10097j = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        b3.a aVar = this.f10091d;
        l.f(l.f10055a);
        synchronized (l.f10057c) {
            l.f10062h = u8.p.y0(l.f10062h, aVar);
        }
        this.f10095h = new g4.e(aVar);
    }
}
