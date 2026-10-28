package r;

import androidx.lifecycle.s;
import androidx.lifecycle.u;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f11065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f11066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f11067d;

    public c(s sVar, u uVar) {
        this.f11064a = sVar;
        this.f11065b = uVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11064a.equals(cVar.f11064a) && this.f11065b.equals(cVar.f11065b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11064a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11065b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f11064a.hashCode() ^ this.f11065b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f11064a + "=" + this.f11065b;
    }
}
