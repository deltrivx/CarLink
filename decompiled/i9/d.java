package i9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements o9.b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient o9.b f6671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f6673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6676f;

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f6672b = obj;
        this.f6673c = cls;
        this.f6674d = str;
        this.f6675e = str2;
        this.f6676f = z10;
    }

    public abstract o9.b e();

    public final o9.e f() {
        Class cls = this.f6673c;
        if (cls == null) {
            return null;
        }
        return this.f6676f ? y.f6689a.c(cls) : y.f6689a.b(cls);
    }

    @Override // o9.b
    public final String getName() {
        return this.f6674d;
    }
}
