package i9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f6661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6664e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6666g;

    public a(int i7, int i10, Class cls, Object obj, String str, String str2) {
        this.f6660a = obj;
        this.f6661b = cls;
        this.f6662c = str;
        this.f6663d = str2;
        this.f6665f = i7;
        this.f6666g = i10 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6664e == aVar.f6664e && this.f6665f == aVar.f6665f && this.f6666g == aVar.f6666g && l.a(this.f6660a, aVar.f6660a) && this.f6661b.equals(aVar.f6661b) && this.f6662c.equals(aVar.f6662c) && this.f6663d.equals(aVar.f6663d);
    }

    @Override // i9.i
    public final int getArity() {
        return this.f6665f;
    }

    public final int hashCode() {
        Object obj = this.f6660a;
        return ((((ob.a.l(this.f6663d, ob.a.l(this.f6662c, (this.f6661b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31), 31) + (this.f6664e ? 1231 : 1237)) * 31) + this.f6665f) * 31) + this.f6666g;
    }

    public final String toString() {
        return y.f6689a.h(this);
    }
}
