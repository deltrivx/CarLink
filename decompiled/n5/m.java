package n5;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o[] f8841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f8843e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public m(String str, byte[] bArr, o[] oVarArr, a aVar, int i7) {
        this.f8839a = str;
        this.f8840b = bArr;
        this.f8841c = oVarArr;
        this.f8842d = aVar;
        this.f8843e = null;
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.f8843e;
            if (map2 == null) {
                this.f8843e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(n nVar, Object obj) {
        if (this.f8843e == null) {
            this.f8843e = new EnumMap(n.class);
        }
        this.f8843e.put(nVar, obj);
    }

    public final String toString() {
        return this.f8839a;
    }
}
