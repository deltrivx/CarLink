package p1;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Map.Entry, j9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f10108c;

    public x(y yVar) {
        this.f10108c = yVar;
        Map.Entry entry = yVar.f10112d;
        i9.l.b(entry);
        this.f10106a = entry.getKey();
        Map.Entry entry2 = yVar.f10112d;
        i9.l.b(entry2);
        this.f10107b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10106a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10107b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        y yVar = this.f10108c;
        if (yVar.f10109a.e().f10072d != yVar.f10111c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f10107b;
        yVar.f10109a.put(this.f10106a, obj);
        this.f10107b = obj;
        return obj2;
    }
}
