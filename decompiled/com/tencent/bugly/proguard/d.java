package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class d extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected HashMap<String, byte[]> f3401e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, Object> f3403g = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    k f3402f = new k();

    private void c(String str, Object obj) {
        this.f3403g.put(str, obj);
    }

    public final void a(String str) {
        this.f3458c = str;
    }

    @Override // com.tencent.bugly.proguard.n0
    public <T> void a(String str, T t2) {
        if (this.f3401e == null) {
            super.a(str, t2);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t2 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t2 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        l lVar = new l();
        lVar.a(this.f3458c);
        lVar.a(t2, 0);
        this.f3401e.put(str, n.a(lVar.f3448a));
    }

    @Override // com.tencent.bugly.proguard.n0
    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (Exception unused) {
            this.f3402f.a(bArr);
            this.f3402f.a(this.f3458c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f3401e = this.f3402f.a((Map) map, 0, false);
        }
    }

    public byte[] a() {
        if (this.f3401e != null) {
            l lVar = new l(0);
            lVar.a(this.f3458c);
            lVar.a((Map) this.f3401e, 0);
            return n.a(lVar.f3448a);
        }
        l lVar2 = new l(0);
        lVar2.a(this.f3458c);
        lVar2.a((Map) this.f3456a, 0);
        return n.a(lVar2.f3448a);
    }

    public final <T> T b(String str, T t2) {
        HashMap<String, byte[]> map = this.f3401e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f3403g.containsKey(str)) {
                return (T) this.f3403g.get(str);
            }
            try {
                this.f3402f.a(this.f3401e.get(str));
                this.f3402f.a(this.f3458c);
                T t4 = (T) this.f3402f.a((Object) t2, 0, true);
                if (t4 == null) {
                    return t4;
                }
                c(str, t4);
                return t4;
            } catch (Exception e7) {
                throw new b(e7);
            }
        }
        if (!this.f3456a.containsKey(str)) {
            return null;
        }
        if (this.f3403g.containsKey(str)) {
            return (T) this.f3403g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f3456a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f3402f.a(value);
            this.f3402f.a(this.f3458c);
            T t10 = (T) this.f3402f.a((Object) t2, 0, true);
            c(str, t10);
            return t10;
        } catch (Exception e10) {
            throw new b(e10);
        }
    }

    public void b() {
        this.f3401e = new HashMap<>();
    }
}
