package k1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends u8.i implements i1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f7170b;

    public /* synthetic */ j(c cVar, int i7) {
        this.f7169a = i7;
        this.f7170b = cVar;
    }

    @Override // u8.a
    public final int c() {
        switch (this.f7169a) {
            case 0:
                c cVar = this.f7170b;
                cVar.getClass();
                return cVar.f7151b;
            default:
                c cVar2 = this.f7170b;
                cVar2.getClass();
                return cVar2.f7151b;
        }
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f7169a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    c cVar = this.f7170b;
                    Object obj2 = cVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && cVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f7170b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7169a) {
            case 0:
                m mVar = this.f7170b.f7150a;
                n[] nVarArr = new n[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    nVarArr[i7] = new o(0);
                }
                return new k(mVar, nVarArr);
            default:
                m mVar2 = this.f7170b.f7150a;
                n[] nVarArr2 = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr2[i10] = new o(1);
                }
                return new k(mVar2, nVarArr2);
        }
    }
}
