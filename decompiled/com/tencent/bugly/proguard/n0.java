package com.tencent.bugly.proguard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HashMap<String, HashMap<String, byte[]>> f3456a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HashMap<String, Object> f3457b = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f3460e = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f3458c = "GBK";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    k f3459d = new k();

    public void a(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (obj == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (obj instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        l lVar = new l();
        lVar.a(this.f3458c);
        lVar.a(obj, 0);
        byte[] bArrA = n.a(lVar.f3448a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            if (obj.getClass().isArray()) {
                if (!obj.getClass().getComponentType().toString().equals("byte")) {
                    throw new IllegalArgumentException("only byte[] is supported");
                }
                if (Array.getLength(obj) <= 0) {
                    arrayList.add("Array");
                    arrayList.add("?");
                    map.put(a.a(arrayList), bArrA);
                    this.f3460e.remove(str);
                    this.f3456a.put(str, map);
                    return;
                }
                arrayList.add("java.util.List");
                obj = Array.get(obj, 0);
            } else {
                if (obj instanceof Array) {
                    throw new IllegalArgumentException("can not support Array, please use List");
                }
                if (!(obj instanceof List)) {
                    if (obj instanceof Map) {
                        arrayList.add("java.util.Map");
                        Map map2 = (Map) obj;
                        if (map2.size() > 0) {
                            Object next = map2.keySet().iterator().next();
                            obj = map2.get(next);
                            arrayList.add(next.getClass().getName());
                        } else {
                            arrayList.add("?");
                            arrayList.add("?");
                        }
                    } else {
                        arrayList.add(obj.getClass().getName());
                    }
                    map.put(a.a(arrayList), bArrA);
                    this.f3460e.remove(str);
                    this.f3456a.put(str, map);
                    return;
                }
                arrayList.add("java.util.List");
                List list = (List) obj;
                if (list.size() <= 0) {
                    arrayList.add("?");
                    map.put(a.a(arrayList), bArrA);
                    this.f3460e.remove(str);
                    this.f3456a.put(str, map);
                    return;
                }
                obj = list.get(0);
            }
        }
    }

    public void a(byte[] bArr) {
        this.f3459d.a(bArr);
        this.f3459d.a(this.f3458c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f3456a = this.f3459d.a((Map) map, 0, false);
    }
}
