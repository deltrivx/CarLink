package tb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nb.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f12893a;

    public static String c(a aVar, int i7, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i7 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder("Type: ");
        sb3.append(aVar.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h0.f8997b.f12990b;
        sb4.append("[\n");
        ArrayList arrayList = new ArrayList(u8.q.a0(aVar, 10));
        int i10 = 0;
        for (Object obj : aVar) {
            int i11 = i10 + 1;
            Object obj2 = null;
            if (i10 < 0) {
                n3.l.Y();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i10) {
                    obj2 = obj3;
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) obj2) + '[' + i10 + "]: " + obj);
            sb4.append('\n');
            arrayList.add(sb4);
            i10 = i11;
        }
        sb2.append("Content: " + a2.f.I(sb4, "]", '\n'));
        sb2.append('\n');
        return sb2.toString();
    }

    public final boolean isEmpty() {
        return this.f12893a.c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12893a.iterator();
    }
}
