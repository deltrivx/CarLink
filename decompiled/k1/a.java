package k1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7146c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f7144a = i7;
        this.f7145b = obj;
        this.f7146c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f7144a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && i9.l.a(entry.getKey(), this.f7145b) && i9.l.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f7144a) {
            case 0:
                break;
        }
        return this.f7145b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f7144a) {
            case 0:
                break;
        }
        return this.f7146c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f7144a) {
            case 0:
                Object obj = this.f7145b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f7144a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f7144a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f7145b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
